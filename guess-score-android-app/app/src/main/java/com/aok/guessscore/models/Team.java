package com.aok.guessscore.models;

import com.aok.guessscore.data.TeamData;

import java.io.Serializable;

public class Team implements Serializable {

    private String teamName;
    private int logo;
    private TeamData data;
    public Team(){}

    public String getTeamName() {
        return teamName;
    }

    public String getTeamNameByIndex(int index){
        return this.teamName = data.getTeamList().get(index).getTeamName();
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }


}
