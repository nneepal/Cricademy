/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cricademy.controller.algorithms;

import com.cricademy.model.AddPlayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arpannepal
 * LMU ID 23048647
 */
public class MergeSort {
    
    /**
     * Implements the MergeSort algorithm to sort a list of players based on
     * their names. Allows sorting in both ascending and descending order.
     *
     * @param playerList The list of players to sort.
     * @param isDesc A flag indicating whether sorting should be in descending
     * order. If false, sorting will be in ascending order.
     * @return A sorted list of players based on their names.
     * @throws IllegalArgumentException if the input list is null or empty.
     */

    public List<AddPlayer> sortByPlayerName(List<AddPlayer> playerList, boolean isDesc) {
        if (playerList == null || playerList.isEmpty()) {
            throw new IllegalArgumentException("Bike list cannot be null or empty.");
        }

        return mergeSort(playerList, isDesc);
    }
    
    /**
     * Recursively splits the list into smaller sublists, sorts them, and merges
     * them back.
     *
     * @param playerList The list of players to sort.
     * @param isDesc A flag indicating the desired sort order.
     * @return A sorted list of players.
     */

    private List<AddPlayer> mergeSort(List<AddPlayer> playerList, boolean isDesc) {
        if (playerList.size() <= 1) {
            return playerList;
        }

        int mid = playerList.size() / 2;
        List<AddPlayer> left = new ArrayList<>(playerList.subList(0, mid));
        List<AddPlayer> right = new ArrayList<>(playerList.subList(mid, playerList.size()));

        // Recursively split and merge
        left = mergeSort(left, isDesc);
        right = mergeSort(right, isDesc);

        return merge(left, right, isDesc);
    }

    
    /**
     * Merges two sorted sublists into one sorted list.
     *
     * @param left The left sorted sublist.
     * @param right The right sorted sublist.
     * @param isDesc A flag indicating the desired sort order.
     * @return A merged and sorted list of players.
     */
    private List<AddPlayer> merge(List<AddPlayer> left, List<AddPlayer> right, boolean isDesc) {
        List<AddPlayer> merged = new ArrayList<>();
        int i = 0, j = 0;

        // Merge based on the model names
        while (i < left.size() && j < right.size()) {
            if (shouldPlaceLeft(left.get(i).getPlayerName(), right.get(j).getPlayerName(), isDesc)) {
                merged.add(left.get(i));
                i++;
            } else {
                merged.add(right.get(j));
                j++;
            }
        }

        // Add remaining elements
        while (i < left.size()) {
            merged.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            merged.add(right.get(j));
            j++;
        }

        return merged;
    }
    
    /**
     * Determines if the left player's name should appear before the right
     * player's name based on the specified sort order.
     *
     * @param leftPlayerName The name of the player from the left sublist.
     * @param rightPlayerName The name of the player from the right sublist.
     * @param isDesc A flag indicating the desired sort order.
     * @return true if the left player's name should come before the right
     * player's name, based on the specified sort order; false otherwise.
     */
    private boolean shouldPlaceLeft(String leftPlayerName, String rightPlayerName, boolean isDesc) {
        int comparison = leftPlayerName.compareToIgnoreCase(rightPlayerName);
        return isDesc ? comparison > 0 : comparison < 0;
    }
}
