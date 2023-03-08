package com.example.player;

public class Player{
    private int playerId;
    private String playerName;
    private int jerseyNumber;
    private String role;

    Player(int playerId, String playerName, int jerseyNumber, String role){
        this.playerId = playerId;
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
        this.role = role;
    }

    public void setPlayerId(int playerId){
        this.playerId = playerId;
    }
    public int getPlayerId(){ //getter
        return this.playerId;
    }

    public void setPlayerName(String playerName){
        this.playerName = playerName;
    }
    public String getPlayerName(){ //getter
        return this.playerName;
    }

    public void setJerseyNumber(int jerseyNumber){
        this.jerseyNumber = jerseyNumber;
    }
    public int getJerseyNumber(){ //getter
        return this.jerseyNumber;
    }

    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){ //getter
        return this.role;
    }
}






