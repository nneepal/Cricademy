/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cricademy.views;

import com.cricademy.controller.algorithms.BinarySearch;
import com.cricademy.controller.algorithms.InsertionSort;
import com.cricademy.controller.algorithms.MergeSort;
import com.cricademy.controller.algorithms.SelectionSort;
import com.cricademy.model.AddPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author arpannepal LmuId 23048647
 */
public class Admin extends javax.swing.JFrame {

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
        prePlayerData();
    }

    /* 
    linkedlist is created in order to store the players data
    linkedlist accepts the AddPlayer class a parameter
     */
    LinkedList<AddPlayer> playerList = new LinkedList<>();

    //method to get the parameters from the AddPlayer class
    public void addPlayer(AddPlayer player) {
        playerList.add(player);
        DefaultTableModel model = (DefaultTableModel) tblPlayerData.getModel();
        Object[] data = new Object[]{
            player.getPlayerId(), player.getPlayerName(), player.getPlayerAddress(),
            player.getSelectedPlayerType(), player.getPlayerValue(), player.getPlayerAge(), player.getSelectedPlayerStatus(), player.getSelectedGender(),
            player.getRuns(), player.getWickets()
        };
        model.addRow(data);
    }

    //checking if player with same Id is added more than one time in the system
    private boolean checkRepeatedId(AddPlayer player) {
        for (AddPlayer existingPlayer : playerList) {
            if (existingPlayer.getPlayerId() == player.getPlayerId()) {
                return true;
            }
        }
        return false;
    }

    private boolean removePlayer(int id, int selectedRow) {
        Iterator<AddPlayer> iterator = playerList.iterator();
        while (iterator.hasNext()) {
            AddPlayer player = iterator.next();
            if (player.getPlayerId() == id) {
                // Remove the player from the list
                iterator.remove();

                //using removeRow function from default table model to remove selected row
                DefaultTableModel model = (DefaultTableModel) tblPlayerData.getModel();
                model.removeRow(selectedRow);
                return true; // player deleted successfully
            }
        }
        return false; //player id didnot match
    }

    private void updatePlayer() {
        DefaultTableModel model = (DefaultTableModel) tblPlayerData.getModel();

        // Clear the table before loading new data
        model.setRowCount(0);

        // Iterate through the LinkedList and add each player to the table
        for (AddPlayer player : playerList) {
            model.addRow(new Object[]{
                player.getPlayerId(),
                player.getPlayerName(),
                player.getPlayerAddress(),
                player.getSelectedPlayerType(),
                player.getPlayerValue(),
                player.getPlayerAge(),
                player.getSelectedPlayerStatus(),
                player.getSelectedGender(),
                player.getRuns(),
                player.getWickets()
            });
        }
    }

    //adding players to the system that will load along with the program
    public void prePlayerData() {
        AddPlayer player1 = new AddPlayer("Arpan Nepal", "Jorpati", 500000, "Male", "All Rounder", 20, 670, 45, "Uncapped", 67);
        addPlayer(player1);

        AddPlayer player2 = new AddPlayer("Aashutosh Dhakal", "Mulpani", 400000, "Male", "Batsman", 21, 720, 3, "Uncapped", 21);
        addPlayer(player2);

        AddPlayer player3 = new AddPlayer("Piyush Karn", "Thamel", 300000, "Male", "Bowler", 18, 65, 98, "Uncapped", 45);
        addPlayer(player3);

        AddPlayer player4 = new AddPlayer("Santosh Lama", "Kapan", 200000, "Male", "All Rounder", 19, 500, 25, "Uncapped", 32);
        addPlayer(player4);

        AddPlayer player5 = new AddPlayer("Pranav Sharma", "Kamal Pokhari", 500000, "Male", "All Rounder", 18, 700, 40, "Capped", 8);
        addPlayer(player5);

        AddPlayer player6 = new AddPlayer("Prajwal Luitel", "Bhaktapur", 200000, "Male", "Batsman", 20, 450, 0, "Uncapped", 42);
        addPlayer(player6);

        AddPlayer player7 = new AddPlayer("Anish Shrestha", "Kalanki", 350000, "Male", "All Rounder", 20, 570, 25, "Capped", 30);
        addPlayer(player7);

        AddPlayer player8 = new AddPlayer("Gita Sharma", "Dharan", 200000, "Female", "All Rounder", 20, 375, 35, "Uncapped", 25);
        addPlayer(player8);
    }

    /**
     * Loads sorted player data into the table after sorting by age using the
     * Selection Sort algorithm.
     *
     * This method clears the existing table data and displays it again with the
     * sorted list of players.
     *
     * @param sortedData The list of AddPlayer objects, sorted by age, to be
     * displayed in the table.
     */
    private void loadSortedData(List<AddPlayer> sortedData) {
        DefaultTableModel model = (DefaultTableModel) tblPlayerData.getModel();

        // Clear the table before loading new data
        model.setRowCount(0);

        // Iterate through the LinkedList and add each member to the table
        for (AddPlayer player : sortedData) {
            model.addRow(new Object[]{
                player.getPlayerId(),
                player.getPlayerName(),
                player.getPlayerAddress(),
                player.getSelectedPlayerType(),
                player.getPlayerValue(),
                player.getPlayerAge(),
                player.getSelectedPlayerStatus(),
                player.getSelectedGender(),
                player.getRuns(),
                player.getWickets()
                
            });
        }
    }

        /**
         * This method is called from within the constructor to initialize the
         * form. WARNING: Do NOT modify this code. The content of this method is
         * always regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupPlayerStatus = new javax.swing.ButtonGroup();
        buttonGroupGender = new javax.swing.ButtonGroup();
        pnlAdminBackground = new javax.swing.JPanel();
        pnlAdminTitleBackground = new javax.swing.JPanel();
        lblAdminTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlayerData = new javax.swing.JTable();
        pnlAddPlayerBackground = new javax.swing.JPanel();
        txtFldAddress = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtFldAge = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtFldPlayerValue = new javax.swing.JTextField();
        lblPlayerValue = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        radioBtnFemale = new javax.swing.JRadioButton();
        txtFldRuns = new javax.swing.JTextField();
        lblRuns = new javax.swing.JLabel();
        lblWickets = new javax.swing.JLabel();
        txtFldWickets = new javax.swing.JTextField();
        lblPlayerType = new javax.swing.JLabel();
        comBoxPlayerType = new javax.swing.JComboBox<>();
        txtFldPlayerId = new javax.swing.JTextField();
        lblPlayerId = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        radioBtnCapped = new javax.swing.JRadioButton();
        radioBtnUncapped = new javax.swing.JRadioButton();
        lblPlayerName = new javax.swing.JLabel();
        txtFldPlayerName = new javax.swing.JTextField();
        pnlPlayerDataBackground = new javax.swing.JPanel();
        pnlLine = new javax.swing.JPanel();
        btnRemovePlayer = new javax.swing.JButton();
        btnAddPlayer1 = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtFldSearchPlayer = new javax.swing.JTextField();
        btnSearchPlayer = new javax.swing.JButton();
        comBoxSort = new javax.swing.JComboBox<>();
        comBoxSortType = new javax.swing.JComboBox<>();
        btnSort = new javax.swing.JButton();
        lblLogo = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        setResizable(false);

        pnlAdminBackground.setBackground(new java.awt.Color(254, 236, 195));
        pnlAdminBackground.setForeground(new java.awt.Color(255, 255, 255));
        pnlAdminBackground.setPreferredSize(new java.awt.Dimension(1000, 1000));
        pnlAdminBackground.setLayout(null);

        pnlAdminTitleBackground.setBackground(new java.awt.Color(124, 156, 171));

        lblAdminTitle.setBackground(new java.awt.Color(124, 156, 171));
        lblAdminTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        lblAdminTitle.setText("ADMIN DASHBOARD");

        javax.swing.GroupLayout pnlAdminTitleBackgroundLayout = new javax.swing.GroupLayout(pnlAdminTitleBackground);
        pnlAdminTitleBackground.setLayout(pnlAdminTitleBackgroundLayout);
        pnlAdminTitleBackgroundLayout.setHorizontalGroup(
            pnlAdminTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminTitleBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdminTitle)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        pnlAdminTitleBackgroundLayout.setVerticalGroup(
            pnlAdminTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdminTitleBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdminTitle)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pnlAdminBackground.add(pnlAdminTitleBackground);
        pnlAdminTitleBackground.setBounds(280, 60, 380, 60);

        tblPlayerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Player Name", "Address", "Player Type", "Player Value", "Age", "Status", "Gender", "Runs", "Wickets"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPlayerData);
        if (tblPlayerData.getColumnModel().getColumnCount() > 0) {
            tblPlayerData.getColumnModel().getColumn(0).setResizable(false);
            tblPlayerData.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        pnlAdminBackground.add(jScrollPane1);
        jScrollPane1.setBounds(30, 600, 930, 200);

        pnlAddPlayerBackground.setBackground(new java.awt.Color(232, 203, 177));

        txtFldAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldAddressActionPerformed(evt);
            }
        });

        lblAddress.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAddress.setText("Address:");

        lblAge.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblAge.setText("Age:");

        lblPlayerValue.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPlayerValue.setText("Player Value:");

        lblGender.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblGender.setText("Gender:");

        buttonGroupGender.add(radioBtnMale);
        radioBtnMale.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        radioBtnMale.setText("Male");
        radioBtnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnMaleActionPerformed(evt);
            }
        });

        buttonGroupGender.add(radioBtnFemale);
        radioBtnFemale.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        radioBtnFemale.setText("Female");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        lblRuns.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblRuns.setText("Runs:");

        lblWickets.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblWickets.setText("Wickets:");

        lblPlayerType.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPlayerType.setText("Player Type:");

        comBoxPlayerType.setBackground(new java.awt.Color(254, 236, 195));
        comBoxPlayerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Batsman", "Bowler", "All Rounder" }));
        comBoxPlayerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxPlayerTypeActionPerformed(evt);
            }
        });

        txtFldPlayerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldPlayerIdActionPerformed(evt);
            }
        });

        lblPlayerId.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPlayerId.setText("Player ID:");

        lblStatus.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblStatus.setText("Status:");

        buttonGroupPlayerStatus.add(radioBtnCapped);
        radioBtnCapped.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        radioBtnCapped.setText("Capped");

        buttonGroupPlayerStatus.add(radioBtnUncapped);
        radioBtnUncapped.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        radioBtnUncapped.setText("Uncapped");

        lblPlayerName.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPlayerName.setText("Players Name:");

        txtFldPlayerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldPlayerNameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAddPlayerBackgroundLayout = new javax.swing.GroupLayout(pnlAddPlayerBackground);
        pnlAddPlayerBackground.setLayout(pnlAddPlayerBackgroundLayout);
        pnlAddPlayerBackgroundLayout.setHorizontalGroup(
            pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFldPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAddPlayerBackgroundLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPlayerValue)
                            .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlayerType, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFldPlayerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxPlayerType, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioBtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)))
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblRuns)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFldRuns, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFldPlayerId, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddPlayerBackgroundLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                                .addComponent(lblPlayerId)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblWickets)
                                    .addComponent(lblStatus))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFldWickets)
                                    .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                                        .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioBtnCapped, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(radioBtnUncapped, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addGap(307, 307, 307))
        );
        pnlAddPlayerBackgroundLayout.setVerticalGroup(
            pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddPlayerBackgroundLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldPlayerId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFldPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge)
                    .addComponent(txtFldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFldRuns, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRuns)
                    .addComponent(txtFldPlayerValue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWickets)
                    .addComponent(txtFldWickets, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comBoxPlayerType, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPlayerType))
                .addGap(18, 18, 18)
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnCapped)
                    .addComponent(radioBtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStatus))
                .addGap(3, 3, 3)
                .addGroup(pnlAddPlayerBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioBtnUncapped)
                    .addComponent(radioBtnFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnlAdminBackground.add(pnlAddPlayerBackground);
        pnlAddPlayerBackground.setBounds(30, 190, 710, 310);

        pnlPlayerDataBackground.setBackground(new java.awt.Color(51, 58, 68));

        pnlLine.setBackground(new java.awt.Color(124, 156, 171));
        pnlLine.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnlLineLayout = new javax.swing.GroupLayout(pnlLine);
        pnlLine.setLayout(pnlLineLayout);
        pnlLineLayout.setHorizontalGroup(
            pnlLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 11, Short.MAX_VALUE)
        );
        pnlLineLayout.setVerticalGroup(
            pnlLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 310, Short.MAX_VALUE)
        );

        btnRemovePlayer.setBackground(new java.awt.Color(232, 95, 92));
        btnRemovePlayer.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnRemovePlayer.setForeground(new java.awt.Color(255, 255, 255));
        btnRemovePlayer.setText("Remove Player");
        btnRemovePlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePlayerActionPerformed(evt);
            }
        });

        btnAddPlayer1.setBackground(new java.awt.Color(124, 156, 171));
        btnAddPlayer1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnAddPlayer1.setForeground(new java.awt.Color(255, 255, 255));
        btnAddPlayer1.setText("Add Player");
        btnAddPlayer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPlayer1ActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(232, 203, 177));
        btnClear.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(254, 236, 195));
        btnUpdate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtFldSearchPlayer.setBackground(new java.awt.Color(254, 236, 195));
        txtFldSearchPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFldSearchPlayerActionPerformed(evt);
            }
        });

        btnSearchPlayer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cricademy/resource/search Icon.png"))); // NOI18N
        btnSearchPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchPlayerActionPerformed(evt);
            }
        });

        comBoxSort.setBackground(new java.awt.Color(254, 236, 195));
        comBoxSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sort By", "Player Name", "Age", "Player Value" }));
        comBoxSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxSortActionPerformed(evt);
            }
        });

        comBoxSortType.setBackground(new java.awt.Color(254, 236, 195));
        comBoxSortType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ascending", "Descending" }));
        comBoxSortType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comBoxSortTypeActionPerformed(evt);
            }
        });

        btnSort.setBackground(new java.awt.Color(124, 156, 171));
        btnSort.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        btnSort.setForeground(new java.awt.Color(255, 255, 255));
        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPlayerDataBackgroundLayout = new javax.swing.GroupLayout(pnlPlayerDataBackground);
        pnlPlayerDataBackground.setLayout(pnlPlayerDataBackgroundLayout);
        pnlPlayerDataBackgroundLayout.setHorizontalGroup(
            pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerDataBackgroundLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(txtFldSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlPlayerDataBackgroundLayout.createSequentialGroup()
                        .addComponent(btnSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addComponent(comBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comBoxSortType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSort, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addGap(27, 27, 27))
                    .addGroup(pnlPlayerDataBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemovePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );
        pnlPlayerDataBackgroundLayout.setVerticalGroup(
            pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerDataBackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlayerDataBackgroundLayout.createSequentialGroup()
                        .addComponent(btnRemovePlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnAddPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlPlayerDataBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comBoxSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comBoxSortType, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtFldSearchPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );

        pnlAdminBackground.add(pnlPlayerDataBackground);
        pnlPlayerDataBackground.setBounds(10, 170, 980, 660);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cricademy/resource/smalllogo.png"))); // NOI18N
        pnlAdminBackground.add(lblLogo);
        lblLogo.setBounds(810, 10, 170, 160);

        btnExit.setBackground(new java.awt.Color(232, 95, 92));
        btnExit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        pnlAdminBackground.add(btnExit);
        btnExit.setBounds(10, 10, 114, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdminBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAdminBackground, javax.swing.GroupLayout.PREFERRED_SIZE, 868, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnMaleActionPerformed

    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void btnAddPlayer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPlayer1ActionPerformed
        // TODO add your handling code here:

        //check if the input field are empty
        if (txtFldPlayerName.getText().equals("") || txtFldAddress.getText().equals("") || txtFldPlayerValue.getText().equals("") || txtFldAge.getText().equals("") || txtFldRuns.getText().equals("") || txtFldWickets.getText().equals("") || txtFldPlayerId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Empty field detected!");
        } //check if the gender is not selected
        else if (!radioBtnMale.isSelected() && !radioBtnFemale.isSelected()) {
            JOptionPane.showMessageDialog(null, "Gender is not selected. Please select a gender!", "Error", JOptionPane.WARNING_MESSAGE);
        } //check if the player status is not selected
        else if (!radioBtnCapped.isSelected() && !radioBtnUncapped.isSelected()) {
            JOptionPane.showMessageDialog(null, "Player status is not selected. Please select player status!", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                //validate if the age is in integer
                int playerAgeInt = Integer.parseInt(txtFldAge.getText());
                try {
                    //validate if the value is in integer
                    int playerValueInt = Integer.parseInt(txtFldPlayerValue.getText());

                    try {
                        //validate if the runs is in integer
                        int runsInt = Integer.parseInt(txtFldRuns.getText());

                        try {
                            //validate if the wickets is in integer
                            int wicketsInt = Integer.parseInt(txtFldWickets.getText());

                            try {
                                //validate if the player id is in integer
                                int idInt = Integer.parseInt(txtFldPlayerId.getText());

                                String playerName = txtFldPlayerName.getText();
                                String playerAddress = txtFldAddress.getText();
                                int playerValue = Integer.parseInt(txtFldPlayerValue.getText());
                                String selectedGender = radioBtnMale.isSelected() ? "Male" : "Female";
                                String selectedPlayerType = (String) comBoxPlayerType.getSelectedItem();
                                int playerAge = Integer.parseInt(txtFldAge.getText());
                                int runs = Integer.parseInt(txtFldRuns.getText());
                                int wickets = Integer.parseInt(txtFldWickets.getText());
                                int playerId = Integer.parseInt(txtFldPlayerId.getText());
                                String selectedPlayerStatus = radioBtnCapped.isSelected() ? "Capped" : "Uncapped";

                                boolean isValid = true;

                                if (isValid) {
                                    AddPlayer newPlayer = new AddPlayer(playerName, playerAddress, playerValue, selectedGender, selectedPlayerType, playerAge, runs, wickets, selectedPlayerStatus, playerId);
                                    if (checkRepeatedId(newPlayer)) {
                                        JOptionPane.showMessageDialog(null, "Duplicate player ID. Please insert a valid ID", "Error", JOptionPane.INFORMATION_MESSAGE);

                                    } else {
                                        addPlayer(newPlayer);
                                        JOptionPane.showMessageDialog(null, "Added successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                                    }

                                }

                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "Please enter ID in numeric form.", "Error", JOptionPane.ERROR_MESSAGE);
                            }

                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Please enter wickets in numeric form.", "Error", JOptionPane.ERROR_MESSAGE);
                        }

                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "Please enter runs in numeric form.", "Error", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Please enter player value in numeric form.", "Error", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Please enter player age in numeric value.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddPlayer1ActionPerformed

    private void btnRemovePlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePlayerActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) tblPlayerData.getModel();
        int selectedRow = tblPlayerData.getSelectedRow();

        if (selectedRow != -1) {
            int playerId = (Integer) tblPlayerData.getValueAt(selectedRow, 0);
            int confirm = JOptionPane.showConfirmDialog(
                    null, "Are you sure you want to remove this player?", "Confirm Deletion", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

            if (confirm == JOptionPane.YES_OPTION) {
                boolean remove = removePlayer(playerId, selectedRow);
                if (remove) {
                    JOptionPane.showMessageDialog(null, "Player deleted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a player from the below table.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnRemovePlayerActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtFldPlayerName.setText("");
        txtFldAddress.setText("");
        txtFldPlayerValue.setText("");
        buttonGroupGender.clearSelection();
        txtFldAge.setText("");
        txtFldRuns.setText("");
        txtFldWickets.setText("");
        buttonGroupPlayerStatus.clearSelection();
        txtFldPlayerId.setText("");

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String playerName = txtFldPlayerName.getText();
        String playerAddress = txtFldAddress.getText();
        int playerValue = Integer.parseInt(txtFldPlayerValue.getText());
        String selectedGender = radioBtnMale.isSelected() ? "Male" : "Female";
        String selectedPlayerType = (String) comBoxPlayerType.getSelectedItem();
        int playerAge = Integer.parseInt(txtFldAge.getText());
        int runs = Integer.parseInt(txtFldRuns.getText());
        int wickets = Integer.parseInt(txtFldWickets.getText());
        int playerId = Integer.parseInt(txtFldPlayerId.getText());
        String selectedPlayerStatus = radioBtnCapped.isSelected() ? "Capped" : "Uncapped";

        boolean isValid = true;

        if (isValid) {
            // Locate the member in the LinkedList and update it
            for (AddPlayer player : playerList) {
                if (player.getPlayerId() == playerId) { // Matching memberId
                    // Update member details
                    player.setPlayerName(playerName);
                    player.setPlayerAddress(playerAddress);
                    player.setSelectedPlayerType(selectedPlayerType);
                    player.setPlayerValue(playerValue);
                    player.setPlayerAge(playerAge);
                    player.setSelectedPlayerStatus(selectedPlayerStatus);
                    player.setSelectedGender(selectedGender);
                    player.setRuns(runs);
                    player.setWickets(wickets);
                    

                    updatePlayer();
                    JOptionPane.showMessageDialog(null, "Players data updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                    return; // Exit after updating
                }
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void comBoxPlayerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxPlayerTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxPlayerTypeActionPerformed

    private void txtFldPlayerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldPlayerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldPlayerNameActionPerformed

    private void txtFldAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldAddressActionPerformed

    private void txtFldPlayerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldPlayerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldPlayerIdActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtFldSearchPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFldSearchPlayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFldSearchPlayerActionPerformed

    private void btnSearchPlayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchPlayerActionPerformed
        // TODO add your handling code here:
        MergeSort mergeSortPlayerName = new MergeSort();
        List<AddPlayer> sortedList = mergeSortPlayerName.sortByPlayerName(playerList, false);
        BinarySearch search = new BinarySearch();
        AddPlayer searchValue = search.searchByPlayerName(txtFldSearchPlayer.getText().trim(), sortedList, 0, sortedList.size()-1);
        if(searchValue!=null){

            
            DefaultTableModel model = (DefaultTableModel) tblPlayerData.getModel();
            // Clear the table
            model.setRowCount(0);

            // Add the searched bike as the first row
            model.addRow(new Object[]{
                searchValue.getPlayerId(),
                searchValue.getPlayerName(),
                searchValue.getPlayerAddress(),
                searchValue.getSelectedPlayerType(),
                searchValue.getPlayerValue(),
                searchValue.getPlayerAge(),
                searchValue.getSelectedPlayerStatus(),
                searchValue.getSelectedGender(),
                searchValue.getRuns(),
                searchValue.getWickets()
            });

            //add the other players into the table
            for (AddPlayer player : sortedList) {
                if (!player.getPlayerName().equalsIgnoreCase(searchValue.getPlayerName())) {
                    model.addRow(new Object[]{
                        player.getPlayerId(),
                        player.getPlayerName(),
                        player.getPlayerAddress(),
                        player.getSelectedPlayerType(),
                        player.getPlayerValue(),
                        player.getPlayerAge(),
                        player.getSelectedPlayerStatus(),
                        player.getSelectedGender(),
                        player.getRuns(),
                        player.getWickets()
                    });
                }
            }

            // Select and highlight the first row
            tblPlayerData.setRowSelectionInterval(0, 0);
            tblPlayerData.scrollRectToVisible(tblPlayerData.getCellRect(0, 0, true));
            
            //making a panel that displays searched players data
            
            String displayPlayerDetails = "Players Details:\n"
                    + "Player Name:" + searchValue.getPlayerName()+"\n"
                    + "PlayerID:" + searchValue.getPlayerId()+"\n"
                    + "Age:" + searchValue.getPlayerAge()+"\n"
                    + "Player Address:" + searchValue.getPlayerAddress()+"\n"
                    + "Player Value: Rs." + searchValue.getPlayerValue()+"\n"
                    + "Gender:" + searchValue.getSelectedGender()+"\n"
                    + "Player Type:" + searchValue.getSelectedPlayerType()+"\n"
                    + "Total Runs scored:" + searchValue.getRuns()+"\n"
                    + "Total Wickets Taken:" + searchValue.getWickets()+"\n"
                    + "Player Status:" + searchValue.getSelectedPlayerStatus()+"\n";
            
            JOptionPane.showMessageDialog(null,displayPlayerDetails,"Player Found",JOptionPane.INFORMATION_MESSAGE);

                    
        }else{
            JOptionPane.showMessageDialog(null,"There is no player with the name that you have searched for", "Player not found",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchPlayerActionPerformed

    private void comBoxSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxSortActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_comBoxSortActionPerformed

    private void comBoxSortTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comBoxSortTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comBoxSortTypeActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        // TODO add your handling code here:
        SelectionSort selectionSortAge = new SelectionSort();
        InsertionSort insertionSortPlayerValue = new InsertionSort();
        MergeSort mergeSortPlayerName = new MergeSort();
        
        
        String sort = (String)comBoxSort.getSelectedItem();//get the response obtained from sort combo box and store in sort
        String sortType = (String)comBoxSortType.getSelectedItem();//get the response from sortType combo box and store in sortType
        
        //sort player age
        if (sort.equals("Age")) {
            
            //sort player age in descending order
            if(sortType.equals("Descending")){
                List<AddPlayer> sortedList = selectionSortAge.sortByAge(playerList, false);
                loadSortedData(sortedList);
            }
            //sort player age in ascending order
            else if(sortType.equals("Ascending")){
                List<AddPlayer> sortedList = selectionSortAge.sortByAge(playerList, true);
                loadSortedData(sortedList);
            }
        }
        
        //sort player value
        else if(sort.equals("Player Value")){
            //sort player value in descending order
            if(sortType.equals("Descending")){
                List<AddPlayer> sortedList = insertionSortPlayerValue.sortByPlayerValue(playerList, true);
                loadSortedData(sortedList);
            }
            //sort player value in ascending order
            else if(sortType.equals("Ascending")){
                List<AddPlayer> sortedList = insertionSortPlayerValue.sortByPlayerValue(playerList, false);
                loadSortedData(sortedList);
            }

        }
        //sort player name in alphabetical order
        else if(sort.equals("Player Name")){
            
            //sort in alphabetical order
            if(sortType.equals("Descending")){
                List<AddPlayer> sortedList = mergeSortPlayerName.sortByPlayerName(playerList, true);
                loadSortedData(sortedList);
            }
            //sort in reverse alphabetical order
            else if(sortType.equals("Ascending")){
                List<AddPlayer> sortedList = mergeSortPlayerName.sortByPlayerName(playerList, false);
                loadSortedData(sortedList);
            }
        }
    }//GEN-LAST:event_btnSortActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPlayer1;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRemovePlayer;
    private javax.swing.JButton btnSearchPlayer;
    private javax.swing.JButton btnSort;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroupGender;
    private javax.swing.ButtonGroup buttonGroupPlayerStatus;
    private javax.swing.JComboBox<String> comBoxPlayerType;
    private javax.swing.JComboBox<String> comBoxSort;
    private javax.swing.JComboBox<String> comBoxSortType;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAdminTitle;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPlayerId;
    private javax.swing.JLabel lblPlayerName;
    private javax.swing.JLabel lblPlayerType;
    private javax.swing.JLabel lblPlayerValue;
    private javax.swing.JLabel lblRuns;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblWickets;
    private javax.swing.JPanel pnlAddPlayerBackground;
    private javax.swing.JPanel pnlAdminBackground;
    private javax.swing.JPanel pnlAdminTitleBackground;
    private javax.swing.JPanel pnlLine;
    private javax.swing.JPanel pnlPlayerDataBackground;
    private javax.swing.JRadioButton radioBtnCapped;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JRadioButton radioBtnUncapped;
    private javax.swing.JTable tblPlayerData;
    private javax.swing.JTextField txtFldAddress;
    private javax.swing.JTextField txtFldAge;
    private javax.swing.JTextField txtFldPlayerId;
    private javax.swing.JTextField txtFldPlayerName;
    private javax.swing.JTextField txtFldPlayerValue;
    private javax.swing.JTextField txtFldRuns;
    private javax.swing.JTextField txtFldSearchPlayer;
    private javax.swing.JTextField txtFldWickets;
    // End of variables declaration//GEN-END:variables
}
