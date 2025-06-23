package com.aok.guessscore.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.aok.guessscore.R;
import com.aok.guessscore.models.Team;

import java.util.List;

public class TeamSpinnerAdapter extends BaseAdapter {

    private Context context;
    private List<Team> teams;

    public TeamSpinnerAdapter(Context context, List<Team> teams) {
        this.context = context;
        this.teams = teams;
    }

    @Override
    public int getCount() {
        return teams != null ? teams.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_team_spinner, parent, false);

        TextView txtTeamName = view.findViewById(R.id.team_name);
        ImageView imgTeamLogo = view.findViewById(R.id.team_logo);

        txtTeamName.setText(teams.get(position).getTeamName());
        imgTeamLogo.setImageResource(teams.get(position).getLogo());

        return view;
    }
}
