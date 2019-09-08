package com.dn.football_leagues_tables.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    @JsonProperty("player_name")
    private String name;
    @JsonProperty("player_number")
    private int playerNumber;
    @JsonProperty("player_country")
    private String playerCountry;
    @JsonProperty("player_type")
    private String playerType;
    @JsonProperty("player_age")
    private String playerAge;
    @JsonProperty("player_match_played")
    private int matchPlayed;
    @JsonProperty("player_goals")
    private int playerGoals;
    @JsonProperty("player_yellow_cards")
    private int playerYellowCards;
    @JsonProperty("player_red_cards")
    private int playerRedCards;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerCountry() {
        return playerCountry;
    }

    public void setPlayerCountry(String playerCountry) {
        this.playerCountry = playerCountry;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(String playerAge) {
        this.playerAge = playerAge;
    }

    public int getMatchPlayed() {
        return matchPlayed;
    }

    public void setMatchPlayed(int matchPlayed) {
        this.matchPlayed = matchPlayed;
    }

    public int getPlayerGoals() {
        return playerGoals;
    }

    public void setPlayerGoals(int playerGoals) {
        this.playerGoals = playerGoals;
    }

    public int getPlayerYellowCards() {
        return playerYellowCards;
    }

    public void setPlayerYellowCards(int playerYellowCards) {
        this.playerYellowCards = playerYellowCards;
    }

    public int getPlayerRedCards() {
        return playerRedCards;
    }

    public void setPlayerRedCards(int playerRedCards) {
        this.playerRedCards = playerRedCards;
    }
}
