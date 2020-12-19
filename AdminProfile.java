import java.awt.Toolkit;

public class AdminProfile extends javax.swing.JFrame {

    public AdminProfile() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        admusic = new javax.swing.JButton();
        account = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        adv = new javax.swing.JButton();
        data = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        prf = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        play = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MFU Music");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MFU Music");

        admusic.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        admusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/admusiclogo.png"))); // NOI18N
        admusic.setBorderPainted(false);
        admusic.setContentAreaFilled(false);
        admusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                admusicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                admusicMouseExited(evt);
            }
        });
        admusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admusicActionPerformed(evt);
            }
        });

        account.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/allaccountlogo.png"))); // NOI18N
        account.setBorderPainted(false);
        account.setContentAreaFilled(false);
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accountMouseExited(evt);
            }
        });
        account.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/indexlogo.png"))); // NOI18N

        adv.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        adv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/adslogo.png"))); // NOI18N
        adv.setBorderPainted(false);
        adv.setContentAreaFilled(false);
        adv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                advMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                advMouseExited(evt);
            }
        });
        adv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advActionPerformed(evt);
            }
        });

        data.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        data.setForeground(new java.awt.Color(255, 255, 255));
        data.setText("We love Music.");

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/homelogo.png"))); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        prf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/profilelogo.png"))); // NOI18N
        prf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prfMouseClicked(evt);
            }
        });

        jPanel5.setPreferredSize(new java.awt.Dimension(900, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/playlogo.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(account)
                .addGap(124, 124, 124)
                .addComponent(adv)
                .addGap(128, 128, 128)
                .addComponent(admusic)
                .addGap(91, 91, 91))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(home)
                        .addGap(300, 300, 300)
                        .addComponent(play)
                        .addGap(300, 300, 300)
                        .addComponent(prf))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(data))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(109, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(data)))
                .addGap(99, 99, 99)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admusic, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(account, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(100, 100, 100)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(prf, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(play))
                    .addComponent(home, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 50));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logo_head.png"))); // NOI18N
        jLabel12.setText("  MFU MUSIC");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
                .addComponent(mini)
                .addGap(1, 1, 1)
                .addComponent(close))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mini)
                    .addComponent(close))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void accountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountActionPerformed
        this.setVisible (false);
        new AllAccount().setVisible(true);
    }//GEN-LAST:event_accountActionPerformed

    private void admusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admusicActionPerformed
        this.setVisible (false);
        new AddMusic().setVisible(true);
    }//GEN-LAST:event_admusicActionPerformed

    private void advActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_advActionPerformed
        this.setVisible (false);
        new Advertisement().setVisible(true);
    }//GEN-LAST:event_advActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible (false);
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/close_red.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/close.png")));
    }//GEN-LAST:event_closeMouseExited

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/minimize_focus.png")));
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/minimize.png")));
    }//GEN-LAST:event_miniMouseExited

    private void accountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseEntered
        account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/allaccountlogo_focus.png")));
    }//GEN-LAST:event_accountMouseEntered

    private void accountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseExited
        account.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/allaccountlogo.png")));
    }//GEN-LAST:event_accountMouseExited

    private void advMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advMouseEntered
        adv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/adslogo_focus.png")));
    }//GEN-LAST:event_advMouseEntered

    private void advMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_advMouseExited
        adv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/adslogo.png")));
    }//GEN-LAST:event_advMouseExited

    private void admusicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admusicMouseEntered
        admusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/admusiclogo_focus.png")));
    }//GEN-LAST:event_admusicMouseEntered

    private void admusicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_admusicMouseExited
        admusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/admusiclogo.png")));
    }//GEN-LAST:event_admusicMouseExited

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        this.setVisible (false);
        new Home().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void prfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prfMouseClicked
        this.setVisible (false);
        new AdminProfile().setVisible(true);
    }//GEN-LAST:event_prfMouseClicked

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        this.setVisible (false);
        new PlayerForm().setVisible(true);
    }//GEN-LAST:event_playMouseClicked

 
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton account;
    private javax.swing.JButton admusic;
    private javax.swing.JButton adv;
    private javax.swing.JLabel close;
    private javax.swing.JLabel data;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel play;
    private javax.swing.JLabel prf;
    // End of variables declaration//GEN-END:variables
}
