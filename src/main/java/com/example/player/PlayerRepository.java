package com.example.player;

import com.example.player.Player;

import java.util.ArrayList;


public interface PlayerRepository{
    
    ArrayList<Player> getPlayers();
    Player getPlayerById(int playerId);
    Player addPlayer(Player player); 
    void deletePlayer(int playerId);
    Player updatePlayer(int playerId, Player player);
}