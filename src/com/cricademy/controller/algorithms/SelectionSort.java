/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cricademy.controller.algorithms;

import com.cricademy.model.AddPlayer;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author arpannepal
 * LMU ID 23048647
 */
public class SelectionSort {
    List<AddPlayer> ageSortList;

    public SelectionSort() {
        ageSortList = new ArrayList<>();
    }

    /**
     * Sorts a list of AddPlayer objects by their Age in ascending or
     * descending order.
     *
     * @param playerList the list of AddPlayer objects to be sorted
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return the sorted list
     */
    public List<AddPlayer> sortByAge(List<AddPlayer> playerList, boolean isDesc) {
        this.ageSortList.clear();
        this.ageSortList.addAll(playerList);
        if (ageSortList == null || ageSortList.isEmpty()) {
            throw new IllegalArgumentException("Age list cannot be null or empty.");
        }

        for (int i = 0; i < ageSortList.size() - 1; i++) {
            int extremumIndex = findExtremumIndex(ageSortList, i, isDesc);
            if (i != extremumIndex) {
                swap(ageSortList, i, extremumIndex);
            }
        }

        return ageSortList;
    }

    /**
     * Finds the index of the extremum value (minimum or maximum) in the list
     * from the start index.
     *
     * @param ageSortList the list of AddPlayer objects
     * @param startIndex the index to start searching from
     * @param isDesc specifies whether to find the maximum (true) or minimum
     * (false)
     * @return the index of the extremum value
     */
    private int findExtremumIndex(List<AddPlayer> ageSortList, int startIndex, boolean isDesc) {
        int extremumIndex = startIndex;

        for (int j = startIndex + 1; j < ageSortList.size(); j++) {
            if (shouldSwap(ageSortList.get(j).getPlayerAge(), ageSortList.get(extremumIndex).getPlayerAge(), isDesc)) {
                extremumIndex = j;
            }
        }

        return extremumIndex;
    }

    /**
     * Determines whether the current value should replace the current extremum
     * based on sort order.
     *
     * @param current the current value
     * @param extremum the current extremum value
     * @param isDesc specifies the sort order (true for descending, false for
     * ascending)
     * @return true if the current value should replace the extremum; false
     * otherwise
     */
    private boolean shouldSwap(int current, int extremum, boolean isDesc) {
        return isDesc ? current > extremum : current < extremum;
    }

    /**
     * Swaps two elements in the list.
     *
     * @param ageSortList the list of AddPlayer objects
     * @param i the index of the first element
     * @param j the index of the second element
     */
    private void swap(List<AddPlayer> ageSortList, int i, int j) {
        AddPlayer temp = ageSortList.get(i);
        ageSortList.set(i, ageSortList.get(j));
        ageSortList.set(j, temp);
    }

}


