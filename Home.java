import java.awt.Toolkit;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Home extends javax.swing.JFrame {
public static ImageIcon[] adv = new ImageIcon[5]; 
int i=0;
    public Home() {
        initComponents();    
        Connecttoarr();
        ads.setIcon(adv[0]);
        
    }
private void Connecttoarr(){
    try
        {
            int id = 0;
            String sql = "select * from advertisement where status=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/midpj"+ 
                    "?verifyServerCertificate=false" + 
                    "&useSSL=false"+
                    "&requireSSL=false","root","123456");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            String status = "Uploaded";
            pstmt.setString(1, status);
            ResultSet rs = pstmt.executeQuery();
            while(id<5){
            if(rs.next()){
                String pth = rs.getString("advertisementFile");
                adv[id] = new ImageIcon(pth);
                id++;
            }
            else{
                    adv[id] = new javax.swing.ImageIcon(getClass().getResource("/Picture/Banner.JPG"));
                    id++;
                }
            }   
            conn.close();
        }
    catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        Next = new javax.swing.JLabel();
        Prev = new javax.swing.JLabel();
        home = new javax.swing.JLabel();
        prf = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        play = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ads = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        page = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MFU Music");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        logout.setForeground(new java.awt.Color(255, 255, 255));
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logoutlogo.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });

        Next.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        Next.setForeground(new java.awt.Color(255, 255, 255));
        Next.setText("Next");
        Next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NextMouseExited(evt);
            }
        });

        Prev.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        Prev.setForeground(new java.awt.Color(255, 255, 255));
        Prev.setText("Prev");
        Prev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PrevMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PrevMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PrevMouseExited(evt);
            }
        });

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

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("||");
        jLabel2.setToolTipText("");

        play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/playlogo.png"))); // NOI18N
        play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playMouseClicked(evt);
            }
        });

        ads.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/Banner.JPG"))); // NOI18N
        ads.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adsMouseClicked(evt);
            }
        });

        jPanel2.setPreferredSize(new java.awt.Dimension(900, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 900, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

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

        page.setFont(new java.awt.Font("Century Schoolbook", 0, 14)); // NOI18N
        page.setForeground(new java.awt.Color(255, 255, 255));
        page.setText("P.1/5");
        page.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(logout)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ads)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(page)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Prev)
                                .addGap(2, 2, 2)
                                .addComponent(jLabel2)
                                .addGap(4, 4, 4)
                                .addComponent(Next)
                                .addGap(13, 13, 13)))
                        .addComponent(jLabel4))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(home)
                .addGap(300, 300, 300)
                .addComponent(play)
                .addGap(300, 300, 300)
                .addComponent(prf)
                .addGap(80, 80, 80))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(logout)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ads)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Next)
                    .addComponent(Prev)
                    .addComponent(jLabel2)
                    .addComponent(page))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prf, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(play)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(home))))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 50));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logo_head.png"))); // NOI18N
        jLabel3.setText("  MFU MUSIC");

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
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mini)
                .addGap(1, 1, 1)
                .addComponent(close))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel3)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseClicked
        if(i<4)
        {
            i++; 
            ads.setIcon(adv[i]);
            int p =i+1;
            page.setText("P."+p+"/5");
        }
    }//GEN-LAST:event_NextMouseClicked

    private void PrevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrevMouseClicked
        if(i>0)
        {
            i--;
            ads.setIcon(adv[i]);
            int p =i+1;
            page.setText("P."+p+"/5");
        }
    }//GEN-LAST:event_PrevMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        this.setVisible (false);
        new Logout().setVisible(true);
    }//GEN-LAST:event_logoutMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        this.setVisible (false);
        new Home().setVisible(true);
    }//GEN-LAST:event_homeMouseClicked

    private void prfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prfMouseClicked
        this.setVisible (false);
        if(Login.email.equals("admin"))
            new AdminProfile().setVisible(true);
        else new UserProfile().setVisible(true);
    }//GEN-LAST:event_prfMouseClicked

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

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logoutlogo_focus.png")));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logoutlogo.png")));
    }//GEN-LAST:event_logoutMouseExited

    private void playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playMouseClicked
        this.setVisible (false);
        new PlayerForm().setVisible(true);
    }//GEN-LAST:event_playMouseClicked

    private void PrevMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrevMouseEntered
        Prev.setFont(new java.awt.Font("Constantia", 1, 14));
    }//GEN-LAST:event_PrevMouseEntered

    private void PrevMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PrevMouseExited
        Prev.setFont(new java.awt.Font("Constantia", 0, 14));
    }//GEN-LAST:event_PrevMouseExited

    private void NextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseEntered
        Next.setFont(new java.awt.Font("Constantia", 1, 14));
    }//GEN-LAST:event_NextMouseEntered

    private void NextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NextMouseExited
        Next.setFont(new java.awt.Font("Constantia", 0, 14));
    }//GEN-LAST:event_NextMouseExited

    private void adsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adsMouseClicked
        if((!"admin".equals(Login.email))&&(adv[i].getDescription().contains("Banner.JPG")))
        {
            this.setVisible(false);
            new AddAdv().setVisible(true);
        }
    }//GEN-LAST:event_adsMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Next;
    private javax.swing.JLabel Prev;
    private javax.swing.JLabel ads;
    private javax.swing.JLabel close;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel mini;
    private javax.swing.JLabel page;
    private javax.swing.JLabel play;
    private javax.swing.JLabel prf;
    // End of variables declaration//GEN-END:variables
}
