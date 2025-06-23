package com.aok.guessscore.retrofit;

public class PredictionRequest {
    private String home_team;
    private String away_team;

    public PredictionRequest(String home_team, String away_team) {
        this.home_team = home_team;
        this.away_team = away_team;
    }

    public String getHome_team() {
        return home_team;
    }

    public String getAway_team() {
        return away_team;
    }
}

