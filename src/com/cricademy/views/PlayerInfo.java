/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cricademy.views;



/**
 *
 * @author arpannepal LmuId 23048647
 */
public class PlayerInfo extends javax.swing.JFrame {

    /**
     * Creates new form PlayerInfo
     */
    public PlayerInfo() {
        initComponents();
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPlayerInfoBackground = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPlayerData = new javax.swing.JTable();
        pnlGalleryBackground = new javax.swing.JPanel();
        lblGallery = new javax.swing.JLabel();
        lblGalleryImage = new javax.swing.JLabel();
        pnlPlayersInfoTitleBackground = new javax.swing.JPanel();
        lblPlayersInfoTitle = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlPlayerInfoBackground.setBackground(new java.awt.Color(254, 236, 195));
        pnlPlayerInfoBackground.setMaximumSize(new java.awt.Dimension(978, 609));
        pnlPlayerInfoBackground.setMinimumSize(new java.awt.Dimension(978, 609));
        pnlPlayerInfoBackground.setPreferredSize(new java.awt.Dimension(978, 609));

        tblPlayerData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Player Name", "Address", "Player Value", "Gender", "Player Type", "Age", "Runs", "Wickets", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblPlayerData);

        pnlGalleryBackground.setBackground(new java.awt.Color(124, 156, 171));

        lblGallery.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblGallery.setForeground(new java.awt.Color(255, 255, 255));
        lblGallery.setText("GALLERY");

        lblGalleryImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cricademy/resource/gallery.png"))); // NOI18N

        javax.swing.GroupLayout pnlGalleryBackgroundLayout = new javax.swing.GroupLayout(pnlGalleryBackground);
        pnlGalleryBackground.setLayout(pnlGalleryBackgroundLayout);
        pnlGalleryBackgroundLayout.setHorizontalGroup(
            pnlGalleryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGalleryBackgroundLayout.createSequentialGroup()
                .addGroup(pnlGalleryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGalleryBackgroundLayout.createSequentialGroup()
                        .addGap(399, 399, 399)
                        .addComponent(lblGallery))
                    .addGroup(pnlGalleryBackgroundLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblGalleryImage)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlGalleryBackgroundLayout.setVerticalGroup(
            pnlGalleryBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGalleryBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGallery)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGalleryImage)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pnlPlayersInfoTitleBackground.setBackground(new java.awt.Color(51, 58, 68));

        lblPlayersInfoTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lblPlayersInfoTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPlayersInfoTitle.setText("Players Information");

        javax.swing.GroupLayout pnlPlayersInfoTitleBackgroundLayout = new javax.swing.GroupLayout(pnlPlayersInfoTitleBackground);
        pnlPlayersInfoTitleBackground.setLayout(pnlPlayersInfoTitleBackgroundLayout);
        pnlPlayersInfoTitleBackgroundLayout.setHorizontalGroup(
            pnlPlayersInfoTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayersInfoTitleBackgroundLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lblPlayersInfoTitle)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        pnlPlayersInfoTitleBackgroundLayout.setVerticalGroup(
            pnlPlayersInfoTitleBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayersInfoTitleBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPlayersInfoTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnExit.setBackground(new java.awt.Color(193, 90, 72));
        btnExit.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/cricademy/resource/logosmall.png"))); // NOI18N

        javax.swing.GroupLayout pnlPlayerInfoBackgroundLayout = new javax.swing.GroupLayout(pnlPlayerInfoBackground);
        pnlPlayerInfoBackground.setLayout(pnlPlayerInfoBackgroundLayout);
        pnlPlayerInfoBackgroundLayout.setHorizontalGroup(
            pnlPlayerInfoBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerInfoBackgroundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(pnlPlayersInfoTitleBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18))
            .addGroup(pnlPlayerInfoBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 955, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlPlayerInfoBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGalleryBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlPlayerInfoBackgroundLayout.setVerticalGroup(
            pnlPlayerInfoBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPlayerInfoBackgroundLayout.createSequentialGroup()
                .addGroup(pnlPlayerInfoBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPlayerInfoBackgroundLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlPlayerInfoBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlPlayersInfoTitleBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit)))
                    .addGroup(pnlPlayerInfoBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(pnlGalleryBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPlayerInfoBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPlayerInfoBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblGallery;
    private javax.swing.JLabel lblGalleryImage;
    private javax.swing.JLabel lblPlayersInfoTitle;
    private javax.swing.JPanel pnlGalleryBackground;
    private javax.swing.JPanel pnlPlayerInfoBackground;
    private javax.swing.JPanel pnlPlayersInfoTitleBackground;
    private javax.swing.JTable tblPlayerData;
    // End of variables declaration//GEN-END:variables
}
