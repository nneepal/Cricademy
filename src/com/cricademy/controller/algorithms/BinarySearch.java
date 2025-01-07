/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cricademy.controller.algorithms;

import com.cricademy.model.AddPlayer;
import java.util.List;

/**
 * Implements the Binary Search algorithm to find a player by their name
 * in a sorted list of players.
 * 
 * 
 * @author arpannepal
 * LMU ID 23048647
 */
public class BinarySearch {
    
    /**
     * Searches for a player in a sorted list by their name using the Binary
     * Search algorithm.
     *
     * @param searchValue The name of the player to search for.
     * @param playerList The sorted list of players.
     * @param left The starting index of the search range.
     * @param right The ending index of the search range.
     * @return The player object if found; otherwise, returns null.
     */
        public AddPlayer searchByPlayerName(String searchValue, List<AddPlayer> playerList,
            int left, int right) {

        
        if (right < left) {
            return null;
        }

        //Calculate the midpoint of the list
        int mid = (left + right) / 2;
        
        // Check if the middle player's name matches the search value.
        if (searchValue.toLowerCase().equals(playerList.get(mid).getPlayerName().toLowerCase())) {
            return playerList.get(mid);
        } 
        
        // If the search value is smaller than the mid player's name, search in the left side.
        else if (searchValue.compareToIgnoreCase(playerList.get(mid).getPlayerName()) < 0) {
            return searchByPlayerName(searchValue, playerList, left, mid - 1);
        } 
        
        // If the search value is greater than the mid player's name, search in the right side.
        else {
            return searchByPlayerName(searchValue, playerList, mid + 1, right);
        }

    }
}


