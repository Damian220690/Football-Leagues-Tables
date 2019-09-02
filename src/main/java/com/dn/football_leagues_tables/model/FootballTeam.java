package com.dn.football_leagues_tables.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FootballTeam {
    @JsonProperty("team_name")
    private String name;
    @JsonProperty("overall_league_position")
    private int leaguePosition;
    @JsonProperty("overall_league_PTS")
    private int leaguePoints;
    @JsonProperty("overall_league_payed")
    private int matchesPlayed;
    @JsonProperty("overall_league_W")
    private int matchesWon;
    @JsonProperty("overall_league_L")
    private int matchesLost;
    @JsonProperty("overall_league_D")
    private int drawnMatches;
    @JsonProperty("overall_league_GF")
    private int goalsScored;
    @JsonProperty("overall_league_GA")
    private int goalsLost;


    public FootballTeam(String name, int leaguePosition, int leaguePoints, int matchesPlayed, int matchesWon, int matchesLost, int drawnMatches, int goalsScored, int goalsLost) {
        this.name = name;
        this.leaguePosition = leaguePosition;
        this.leaguePoints = leaguePoints;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.drawnMatches = drawnMatches;
        this.goalsScored = goalsScored;
        this.goalsLost = goalsLost;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeaguePosition() {
        return leaguePosition;
    }

    public void setLeaguePosition(int leaguePosition) {
        this.leaguePosition = leaguePosition;
    }

    public int getLeaguePoints() {
        return leaguePoints;
    }

    public void setLeaguePoints(int leaguePoints) {
        this.leaguePoints = leaguePoints;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getMatchesLost() {
        return matchesLost;
    }

    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }

    public int getDrawnMatches() {
        return drawnMatches;
    }

    public void setDrawnMatches(int drawnMatches) {
        this.drawnMatches = drawnMatches;
    }

    public int getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(int goalsScored) {
        this.goalsScored = goalsScored;
    }

    public int getGoalsLost() {
        return goalsLost;
    }

    public void setGoalsLost(int goalsLost) {
        this.goalsLost = goalsLost;
    }
}
