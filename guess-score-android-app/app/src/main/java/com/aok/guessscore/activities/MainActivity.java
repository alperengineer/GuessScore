package com.aok.guessscore.activities;

import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.aok.guessscore.R;
import com.aok.guessscore.adapters.TeamSpinnerAdapter;
import com.aok.guessscore.data.TeamData;
import com.aok.guessscore.fragments.GuessResultFragment;
import com.aok.guessscore.models.Team;
import com.aok.guessscore.retrofit.ApiService;
import com.aok.guessscore.retrofit.PredictionRequest;
import com.aok.guessscore.retrofit.PredictionResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerHomeTeam, spinnerAwayTeam;
    private AppCompatButton btnGuess;
    private List<Team> teamList;
    private ApiService apiService;
    private String BASE_URL = "https://guessscoreapi-production.up.railway.app/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        spinnerHomeTeam = findViewById(R.id.spinner_team_home);
        spinnerAwayTeam = findViewById(R.id.spinner_team_away);
        btnGuess = findViewById(R.id.btn_guess);

        teamList = TeamData.getTeamList();
        TeamSpinnerAdapter teamSpinnerAdapter = new TeamSpinnerAdapter(this, teamList);
        spinnerHomeTeam.setAdapter(teamSpinnerAdapter);
        spinnerAwayTeam.setAdapter(teamSpinnerAdapter);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(ApiService.class);

        btnGuess.setOnClickListener(v -> guessScore());
    }

    private void guessScore() {
        Team homeTeam = teamList.get(spinnerHomeTeam.getSelectedItemPosition());
        Team awayTeam = teamList.get(spinnerAwayTeam.getSelectedItemPosition());

        PredictionRequest request = new PredictionRequest(homeTeam.getTeamName(), awayTeam.getTeamName());

        Call<PredictionResponse> call = apiService.getPrediction(request);
        call.enqueue(new Callback<PredictionResponse>() {
            @Override
            public void onResponse(Call<PredictionResponse> call, Response<PredictionResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    PredictionResponse prediction = response.body();

                    // Tahmin sonucunu göster
                    GuessResultFragment fragment = GuessResultFragment.newInstance(
                            homeTeam.getTeamName(),
                            awayTeam.getTeamName(),
                            homeTeam.getLogo(),
                            awayTeam.getLogo(),
                            prediction.getPredicted_home_score(),
                            prediction.getPredicted_away_score());
                    fragment.show(getSupportFragmentManager(), "guess_result");
                } else {
                    Toast.makeText(MainActivity.this, "Sunucudan tahmin alınamadı.", Toast.LENGTH_SHORT).show();
                    Log.e("HATA", "else içi");
                }
            }

            @Override
            public void onFailure(Call<PredictionResponse> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Hata: Bağlantı kurulamadı", Toast.LENGTH_SHORT).show();
                Log.e("HATA", "onFailure içi: " + t.getMessage());
            }
        });
    }
}
