/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cricademy.model;

/**
 *
 * @author arpannepal
 * lmuId: 23048647
 */
public class AddPlayer {
    private String playerName; 
    private String playerAddress;
    private int playerValue;
    private String selectedGender; 
    private String selectedPlayerType; 
    private int playerAge; 
    private int runs; 
    private int wickets; 
    private String selectedPlayerStatus;
    private int playerId;
    
    public int getPlayerId(){
        return playerId;
    }

    public AddPlayer(String playerName, String playerAddress, int playerValue, String selectedGender, String selectedPlayerType, int playerAge, int runs, int wickets, String selectedPlayerStatus, int playerId) {
        this.playerName = playerName;
        this.playerAddress = playerAddress;
        this.playerValue = playerValue;
        this.selectedGender = selectedGender;
        this.selectedPlayerType = selectedPlayerType;
        this.playerAge = playerAge;
        this.runs = runs;
        this.wickets = wickets;
        this.selectedPlayerStatus = selectedPlayerStatus;
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerAddress() {
        return playerAddress;
    }

    public int getPlayerValue() {
        return playerValue;
    }

    public String getSelectedGender() {
        return selectedGender;
    }

    public String getSelectedPlayerType() {
        return selectedPlayerType;
    }

    public int getPlayerAge() {
        return playerAge;
    }

    public int getRuns() {
        return runs;
    }

    public int getWickets() {
        return wickets;
    }

    public String getSelectedPlayerStatus() {
        return selectedPlayerStatus;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerAddress(String playerAddress) {
        this.playerAddress = playerAddress;
    }

    public void setPlayerValue(int playerValue) {
        this.playerValue = playerValue;
    }

    public void setSelectedGender(String selectedGender) {
        this.selectedGender = selectedGender;
    }

    public void setSelectedPlayerType(String selectedPlayerType) {
        this.selectedPlayerType = selectedPlayerType;
    }

    public void setPlayerAge(int playerAge) {
        this.playerAge = playerAge;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    public void setSelectedPlayerStatus(String selectedPlayerStatus) {
        this.selectedPlayerStatus = selectedPlayerStatus;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    
    
    
}
