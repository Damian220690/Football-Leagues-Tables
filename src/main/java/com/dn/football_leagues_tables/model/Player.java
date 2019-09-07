package com.dn.football_leagues_tables.model;

public class Player {
    private String name;
    private int playerNumber;
    private String playerCountry;
    private String playerType;
    private int playerAge;
    private int matchPlayed;
    private int playerGoals;
    private int playerYellowCards;
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

    public int getPlayerAge() {
        return playerAge;
    }

    public void setPlayerAge(int playerAge) {
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
