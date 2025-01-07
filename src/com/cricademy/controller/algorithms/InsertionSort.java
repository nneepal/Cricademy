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
public class InsertionSort {

    List<AddPlayer> playerValueSortList;

    public InsertionSort() {
        playerValueSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of AddPlayer objects by their value in ascending or
     * descending order.
     *
     * @param playerList the list of AddPlayer objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<AddPlayer> sortByPlayerValue(List<AddPlayer> playerList, boolean isDesc) {
        this.playerValueSortList.clear();
        this.playerValueSortList.addAll(playerList);


        for (int i = 1; i < playerValueSortList.size(); i++) {
            AddPlayer currentPlayer = playerValueSortList.get(i);
            int j = i - 1;

            // Compare and shift the index based on the sort order
            while (j >= 0 && shouldInsert(currentPlayer.getPlayerValue(), playerValueSortList.get(j).getPlayerValue(), isDesc)) {
                playerValueSortList.set(j + 1, playerValueSortList.get(j));
                j--;
            }

            // Place the current player in the correct position
            playerValueSortList.set(j + 1, currentPlayer);
        }

        return playerValueSortList;
    }

    /**
     * Determines whether the current value should be inserted before the other
     * value based on sort order.
     *
     * @param current the current value
     * @param other the value to compare against
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should be inserted before the other;
     * false otherwise
     */
    private boolean shouldInsert(int current, int other, boolean isDesc) {
        return isDesc ? current > other : current < other;
    }

}
