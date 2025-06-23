package com.aok.guessscore.data;

import com.aok.guessscore.R;
import com.aok.guessscore.models.Team;

import java.util.ArrayList;
import java.util.List;

public class TeamData {

    public static List<Team> getTeamList() {
        List<Team> teamList = new ArrayList<>();

        Team Arsenal = new Team();
        Arsenal.setTeamName("Arsenal FC");
        Arsenal.setLogo(R.drawable.arsenal);
        teamList.add(Arsenal);

        Team AstonVilla = new Team();
        AstonVilla.setTeamName("Aston Villa FC");
        AstonVilla.setLogo(R.drawable.aston_villa);
        teamList.add(AstonVilla);

        Team Bournemouth = new Team();
        Bournemouth.setTeamName("AFC Bournemouth");
        Bournemouth.setLogo(R.drawable.bournemouth);
        teamList.add(Bournemouth);

        Team Brentford = new Team();
        Brentford.setTeamName("Brentford FC");
        Brentford.setLogo(R.drawable.brentford);
        teamList.add(Brentford);

        Team Brighton = new Team();
        Brighton.setTeamName("Brighton & Hove Albion FC");
        Brighton.setLogo(R.drawable.brighton);
        teamList.add(Brighton);

        Team Chelsea = new Team();
        Chelsea.setTeamName("Chelsea FC");
        Chelsea.setLogo(R.drawable.chelsea);
        teamList.add(Chelsea);

        Team CrystalPalace = new Team();
        CrystalPalace.setTeamName("Crystal Palace FC");
        CrystalPalace.setLogo(R.drawable.crystal_palace);
        teamList.add(CrystalPalace);

        Team Everton = new Team();
        Everton.setTeamName("Everton FC");
        Everton.setLogo(R.drawable.everton);
        teamList.add(Everton);

        Team Fulham = new Team();
        Fulham.setTeamName("Fulham FC");
        Fulham.setLogo(R.drawable.fulham);
        teamList.add(Fulham);

        Team IpswichTown = new Team();
        IpswichTown.setTeamName("Ipswich Town FC");
        IpswichTown.setLogo(R.drawable.ipswich_town);
        teamList.add(IpswichTown);

        Team Leicester = new Team();
        Leicester.setTeamName("Leicester City FC");
        Leicester.setLogo(R.drawable.leicester_city);
        teamList.add(Leicester);

        Team Liverpool = new Team();
        Liverpool.setTeamName("Liverpool FC");
        Liverpool.setLogo(R.drawable.liverpool);
        teamList.add(Liverpool);

        Team ManchesterCity = new Team();
        ManchesterCity.setTeamName("Manchester City FC");
        ManchesterCity.setLogo(R.drawable.manchester_city);
        teamList.add(ManchesterCity);

        Team ManchesterUnited = new Team();
        ManchesterUnited.setTeamName("Manchester United FC");
        ManchesterUnited.setLogo(R.drawable.manchester_united);
        teamList.add(ManchesterUnited);

        Team Newcastle = new Team();
        Newcastle.setTeamName("Newcastle United FC");
        Newcastle.setLogo(R.drawable.newcastle);
        teamList.add(Newcastle);

        Team NotForrest = new Team();
        NotForrest.setTeamName("Nottingham Forrest FC");
        NotForrest.setLogo(R.drawable.nottingham_forest);
        teamList.add(NotForrest);

        Team Southampton = new Team();
        Southampton.setTeamName("Southampton FC");
        Southampton.setLogo(R.drawable.southampton);
        teamList.add(Southampton);

        Team Spurs = new Team();
        Spurs.setTeamName("Tottenham Hotspur FC");
        Spurs.setLogo(R.drawable.spurs);
        teamList.add(Spurs);

        Team WHUnited = new Team();
        WHUnited.setTeamName("West Ham United FC");
        WHUnited.setLogo(R.drawable.west_ham_united);
        teamList.add(WHUnited);

        Team Wolves = new Team();
        Wolves.setTeamName("Wolverhampton Wanderers FC");
        Wolves.setLogo(R.drawable.wolves);
        teamList.add(Wolves);

        return teamList;
    }
}
