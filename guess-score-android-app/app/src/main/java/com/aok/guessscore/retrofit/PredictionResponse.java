package com.aok.guessscore.retrofit;

public class PredictionResponse {
    private String home_team;
    private String away_team;
    private int predicted_home_score;
    private int predicted_away_score;
    private String predicted_result;

    public String getHome_team() {
        return home_team;
    }

    public String getAway_team() {
        return away_team;
    }

    public int getPredicted_home_score() {
        return predicted_home_score;
    }

    public int getPredicted_away_score() {
        return predicted_away_score;
    }

    public String getPredicted_result() {
        return predicted_result;
    }
}