package com.aok.guessscore.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.DialogFragment;

import com.aok.guessscore.databinding.FragmentGuessResultBinding;

public class GuessResultFragment extends DialogFragment {

    private FragmentGuessResultBinding binding;

    public static GuessResultFragment newInstance(String homeTeamName, String awayTeamName,
                                                  int homeLogoResId, int awayLogoResId,
                                                  int homeScore, int awayScore) {
        GuessResultFragment fragment = new GuessResultFragment();
        Bundle args = new Bundle();
        args.putString("homeTeamName", homeTeamName);
        args.putString("awayTeamName", awayTeamName);
        args.putInt("homeLogoResId", homeLogoResId);
        args.putInt("awayLogoResId", awayLogoResId);
        args.putInt("homeScore", homeScore);
        args.putInt("awayScore", awayScore);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentGuessResultBinding.inflate(inflater, container, false);

        if (getArguments() != null) {
            String homeTeam = getArguments().getString("homeTeamName");
            String awayTeam = getArguments().getString("awayTeamName");
            int homeLogo = getArguments().getInt("homeLogoResId");
            int awayLogo = getArguments().getInt("awayLogoResId");
            int homeScore = getArguments().getInt("homeScore");
            int awayScore = getArguments().getInt("awayScore");

            binding.tvHomeTeamScore.setText(String.valueOf(homeScore));
            binding.tvAwayTeamScore.setText(String.valueOf(awayScore));
            binding.ivHomeTeam.setImageResource(homeLogo);
            binding.ivAwayTeam.setImageResource(awayLogo);
        }

        return binding.getRoot();
    }
}
