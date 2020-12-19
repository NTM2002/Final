import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;


public class Login extends javax.swing.JFrame {
public static String email,pass;
    public Login() {
        initComponents();
        check.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        loginbt = new javax.swing.JButton();
        Create = new javax.swing.JLabel();
        check = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        show = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MFU Music");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("E-mail ");

        mail.setBackground(new java.awt.Color(0, 0, 0));
        mail.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        mail.setForeground(new java.awt.Color(255, 255, 255));
        mail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mailFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password ");

        loginbt.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        loginbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/loginlogo.png"))); // NOI18N
        loginbt.setBorderPainted(false);
        loginbt.setContentAreaFilled(false);
        loginbt.setDefaultCapable(false);
        loginbt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginbtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginbtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginbtMouseExited(evt);
            }
        });

        Create.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        Create.setForeground(new java.awt.Color(255, 255, 255));
        Create.setText("Create your account");
        Create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CreateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CreateMouseExited(evt);
            }
        });

        check.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        check.setForeground(new java.awt.Color(255, 0, 0));
        check.setText("Error! Please check your e-mail or password.");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/indexlogo.png"))); // NOI18N

        show.setBackground(new java.awt.Color(0, 0, 0));
        show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showActionPerformed(evt);
            }
        });

        password.setBackground(new java.awt.Color(0, 0, 0));
        password.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        password.setForeground(new java.awt.Color(255, 255, 255));
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 22)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Show/Hide");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(144, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(332, 332, 332))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(show, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8))
                                    .addComponent(check)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(Create)
                                .addGap(260, 260, 260))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(loginbt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(270, 270, 270)))
                        .addGap(98, 98, 98))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(check)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(show, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addComponent(loginbt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Create)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logo_head.png"))); // NOI18N
        jLabel5.setText("  MFU MUSIC");

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
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mini)
                .addGap(1, 1, 1)
                .addComponent(close))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseClicked
        this.setVisible (false);
        new Signup().setVisible(true);
    }//GEN-LAST:event_CreateMouseClicked

    private void showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showActionPerformed
        if(show.isSelected())
        {
            password.setEchoChar((char)0);
        }
        else
            password.setEchoChar('*');
    }//GEN-LAST:event_showActionPerformed

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

    private void mailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusGained
        mail.setBackground(Color.WHITE);
        mail.setForeground(Color.BLACK);
    }//GEN-LAST:event_mailFocusGained

    private void mailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mailFocusLost
        mail.setBackground(Color.BLACK);
        mail.setForeground(Color.WHITE);
    }//GEN-LAST:event_mailFocusLost

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusGained
        password.setBackground(Color.WHITE);
        password.setForeground(Color.BLACK);
    }//GEN-LAST:event_passwordFocusGained

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFocusLost
        password.setBackground(Color.BLACK);
        password.setForeground(Color.WHITE);
    }//GEN-LAST:event_passwordFocusLost

    private void loginbtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtMouseClicked
    email = mail.getText();
    pass = password.getText();
    try {
            String sql = "select * from Accounts where UserEmail=? and UserPassword=?";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/MidPJ"+ 
                    "?verifyServerCertificate=false" + 
                    "&useSSL=false"+
                    "&requireSSL=false","root","123456");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,email);
            pstmt.setString(2,pass);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next())
            {
                email = rs.getString("UserEmail");
                this.setVisible(false);
                new Home().setVisible(true);
            }
            else{
                check.setText("Error! Please check your e-mail or password.");
            }
            conn.close();
        }
        catch (Exception e){
        }
    }//GEN-LAST:event_loginbtMouseClicked

    private void loginbtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtMouseEntered
        loginbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/loginlogo_focus.png")));
    }//GEN-LAST:event_loginbtMouseEntered

    private void loginbtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginbtMouseExited
        loginbt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/loginlogo.png")));
    }//GEN-LAST:event_loginbtMouseExited

    private void CreateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseEntered
        Create.setFont(new java.awt.Font("Constantia", 1, 14));
    }//GEN-LAST:event_CreateMouseEntered

    private void CreateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateMouseExited
        Create.setFont(new java.awt.Font("Constantia", 0, 14));
    }//GEN-LAST:event_CreateMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Create;
    private javax.swing.JLabel check;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginbt;
    private javax.swing.JTextField mail;
    private javax.swing.JLabel mini;
    private javax.swing.JPasswordField password;
    private javax.swing.JCheckBox show;
    // End of variables declaration//GEN-END:variables
}
