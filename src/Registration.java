/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Jash
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
        managerpassword_label.setVisible(false);
        managerpassword_passfield.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        fullscreen_panel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lname_txt = new javax.swing.JTextField();
        fname_txt = new javax.swing.JTextField();
        login_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        customer_rbutton = new javax.swing.JRadioButton();
        manager_rbutton = new javax.swing.JRadioButton();
        managerpassword_label = new javax.swing.JLabel();
        register_button = new javax.swing.JButton();
        back_button = new javax.swing.JButton();
        password_passfield = new javax.swing.JPasswordField();
        repassword_passfield = new javax.swing.JPasswordField();
        managerpassword_passfield = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        BigImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullscreen_panel.setBackground(new java.awt.Color(255, 255, 255));
        fullscreen_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("First Name:");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 13, 150, 30));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Re-Enter Password:");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 239, 150, 30));

        jLabel4.setBackground(new java.awt.Color(204, 204, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Last Name:");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 68, 150, 30));

        jLabel5.setBackground(new java.awt.Color(204, 204, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Login ID:");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 30));

        jLabel6.setBackground(new java.awt.Color(204, 204, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Password:");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 30));

        lname_txt.setForeground(new java.awt.Color(204, 204, 204));
        lname_txt.setText("Enter last name here");
        lname_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lname_txtMouseClicked(evt);
            }
        });
        jPanel1.add(lname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 68, 160, 30));

        fname_txt.setForeground(new java.awt.Color(204, 204, 204));
        fname_txt.setText("Enter first name here");
        fname_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fname_txtMouseClicked(evt);
            }
        });
        fname_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_txtActionPerformed(evt);
            }
        });
        jPanel1.add(fname_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 13, 160, 30));

        login_txt.setForeground(new java.awt.Color(204, 204, 204));
        login_txt.setText("Enter Login ID here");
        login_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                login_txtMouseClicked(evt);
            }
        });
        login_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_txtActionPerformed(evt);
            }
        });
        jPanel1.add(login_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 160, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Choose Type of User");
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 170, 30));

        customer_rbutton.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(customer_rbutton);
        customer_rbutton.setText("Customer");
        customer_rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customer_rbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(customer_rbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, 20));

        manager_rbutton.setBackground(new java.awt.Color(204, 204, 255));
        buttonGroup1.add(manager_rbutton);
        manager_rbutton.setText("Manager");
        manager_rbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manager_rbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(manager_rbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, 20));

        managerpassword_label.setBackground(new java.awt.Color(204, 204, 255));
        managerpassword_label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        managerpassword_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        managerpassword_label.setText("Enter Managerial Password:");
        managerpassword_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        managerpassword_label.setOpaque(true);
        jPanel1.add(managerpassword_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 200, 30));

        register_button.setBackground(new java.awt.Color(255, 51, 51));
        register_button.setText("REGISTER");
        register_button.setBorder(null);
        register_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(register_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 170, 30));

        back_button.setBackground(new java.awt.Color(102, 153, 255));
        back_button.setText("Go back to Login Page");
        back_button.setBorder(null);
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 320, 167, 30));

        password_passfield.setForeground(new java.awt.Color(204, 204, 204));
        password_passfield.setText("jPasswordField1");
        password_passfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_passfieldMouseClicked(evt);
            }
        });
        jPanel1.add(password_passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 160, 30));

        repassword_passfield.setForeground(new java.awt.Color(204, 204, 204));
        repassword_passfield.setText("jPasswordField2");
        repassword_passfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repassword_passfieldMouseClicked(evt);
            }
        });
        jPanel1.add(repassword_passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 160, 30));

        managerpassword_passfield.setForeground(new java.awt.Color(204, 204, 204));
        managerpassword_passfield.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managerpassword_passfieldMouseClicked(evt);
            }
        });
        jPanel1.add(managerpassword_passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 200, 30));

        fullscreen_panel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 780, 400));

        jLabel8.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel8.setText("                          Registration");
        fullscreen_panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 800, 80));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("                     Create an account by filling up these simple details.");
        fullscreen_panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 650, 40));

        BigImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\plane.jpg")); // NOI18N
        BigImageLabel.setText("jLabel1");
        fullscreen_panel.add(BigImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        getContentPane().add(fullscreen_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void login_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_login_txtMouseClicked
login_txt.setForeground(Color.black);  
login_txt.setText("");
    }//GEN-LAST:event_login_txtMouseClicked

    private void fname_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_txtActionPerformed
       
    }//GEN-LAST:event_fname_txtActionPerformed

    private void fname_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fname_txtMouseClicked
fname_txt.setForeground(Color.black);  
fname_txt.setText("");
    }//GEN-LAST:event_fname_txtMouseClicked

    private void lname_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lname_txtMouseClicked
lname_txt.setForeground(Color.black);  
lname_txt.setText("");
    }//GEN-LAST:event_lname_txtMouseClicked

    private void customer_rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customer_rbuttonActionPerformed
     managerpassword_label.setVisible(false);
managerpassword_passfield.setVisible(false);   
    }//GEN-LAST:event_customer_rbuttonActionPerformed

    private void manager_rbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manager_rbuttonActionPerformed
   managerpassword_label.setVisible(true);
managerpassword_passfield.setVisible(true);      
    }//GEN-LAST:event_manager_rbuttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
Login l=new Login();
l.setVisible(true);
this.setVisible(false);
l.pack();
l.setLocationRelativeTo(null);
l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//GEN-LAST:event_back_buttonActionPerformed

     
    private void register_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_buttonActionPerformed
    String fname=fname_txt.getText();
    String lname=lname_txt.getText();
    String login=login_txt.getText();
    String pass=String.valueOf(password_passfield.getPassword());
    String repass=String.valueOf(repassword_passfield.getPassword());
    String managerpass=String.valueOf(managerpassword_passfield.getPassword());
        if(fname.equals("")|| fname_txt.getForeground()!=Color.black)
     {JOptionPane.showMessageDialog(null,"Enter first name");
   return;
     }
   if(lname.equals("")|| lname_txt.getForeground()!=Color.black)
     {JOptionPane.showMessageDialog(null,"Enter last name");
   return;
     }
   if(login.equals("")|| login_txt.getForeground()!=Color.black)
     {JOptionPane.showMessageDialog(null,"Invalid Login ID");
   return;
     }
      if( pass.equals("")|| password_passfield.getForeground()!=Color.black)
     {JOptionPane.showMessageDialog(null,"Enter password");
   return;
     }
      if( repass.equals("")|| repassword_passfield.getForeground()!=Color.black)
     {JOptionPane.showMessageDialog(null,"Re enter password");
   return;
     }
      
      if(!customer_rbutton.isSelected() && !manager_rbutton.isSelected())
      {JOptionPane.showMessageDialog(null,"Choose user type");
   return;
     }
      if(manager_rbutton.isSelected())
        if( managerpass.equals(""))
     {JOptionPane.showMessageDialog(null,"Enter managerial password");
   return;
     }
      if(!pass.equals(repass))
      {
          JOptionPane.showMessageDialog(null,"Passwords do not match");
   return;
      }
      PreparedStatement ps,checklogin,checkmanager;
      String q="SELECT * FROM `user` WHERE `manager_password` like ?";
      String chklogin="SELECT * FROM `user` WHERE `loginid` like ?";
      String query="INSERT INTO `user`(`loginid`, `fname`, `lname`, `password`,`usertype`,`manager_password`) VALUES (?,?,?,?,?,?)";
       try {
                checklogin=MyConn.getConnection().prepareStatement(chklogin);
                checkmanager=MyConn.getConnection().prepareStatement(q);
                checklogin.setString(1, login);
                ResultSet rs=checklogin.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "Login already exists.");
                    return;
                }
                else
                {
                ps=MyConn.getConnection().prepareStatement(query);
                ps.setString(1,login);
                ps.setString(2,fname);
                ps.setString(3,lname);
                ps.setString(4,pass);
                if(manager_rbutton.isSelected())
                {
                    ps.setString(5,"M");
                    checkmanager.setString(1,managerpass);
                    ResultSet r=checkmanager.executeQuery();
                    if(!r.next())
                    {
                        JOptionPane.showMessageDialog(null,"Wrong Managerial Password");
                        return;
                    }
                    ps.setString(6,managerpass);
                
                }
                else
                {    ps.setString(5,"C");
                    ps.setString(6,"NULL");
                }
                
                 if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null, "New User Added");
                    Login l=new Login();
                    l.setVisible(true);
                    this.setVisible(false);
                    l.pack();
                    l.setLocationRelativeTo(null);
                    l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                }
                
                   
       }
       catch(SQLException e)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
       }
    }//GEN-LAST:event_register_buttonActionPerformed

    private void password_passfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_passfieldMouseClicked
password_passfield.setText("");
password_passfield.setForeground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_password_passfieldMouseClicked

    private void repassword_passfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repassword_passfieldMouseClicked
repassword_passfield.setText("");
repassword_passfield.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_repassword_passfieldMouseClicked

    private void managerpassword_passfieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managerpassword_passfieldMouseClicked
managerpassword_passfield.setText("");
managerpassword_passfield.setForeground(Color.black);        // TODO add your handling code here:
    }//GEN-LAST:event_managerpassword_passfieldMouseClicked

    private void login_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_login_txtActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BigImageLabel;
    private javax.swing.JButton back_button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton customer_rbutton;
    private javax.swing.JTextField fname_txt;
    private javax.swing.JPanel fullscreen_panel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname_txt;
    private javax.swing.JTextField login_txt;
    private javax.swing.JRadioButton manager_rbutton;
    private javax.swing.JLabel managerpassword_label;
    private javax.swing.JPasswordField managerpassword_passfield;
    private javax.swing.JPasswordField password_passfield;
    private javax.swing.JButton register_button;
    private javax.swing.JPasswordField repassword_passfield;
    // End of variables declaration//GEN-END:variables
}
