package com.dn.football_leagues_tables.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDetails {
    @JsonProperty("team_key")
    private int teamId;
    @JsonProperty("team_name")
    private String teamName;
    @JsonProperty("team_badge")
    private String teamBadge;
    @JsonProperty("players")
    private Player[] players;
    @JsonProperty("coaches")
    private Coach[] coaches;

    public TeamDetails() {
    }

    public TeamDetails(int teamId, String teamName, String teamBadge, Player[] players, Coach[] coaches) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.teamBadge = teamBadge;
        this.players = players;
        this.coaches = coaches;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamBadge() {
        return teamBadge;
    }

    public void setTeamBadge(String teamBadge) {
        this.teamBadge = teamBadge;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Coach[] getCoaches() {
        return coaches;
    }

    public void setCoaches(Coach[] coaches) {
        this.coaches = coaches;
    }
}
