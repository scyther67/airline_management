
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FlightAdd extends javax.swing.JFrame {

static String loginid,usertype,fname;
    public FlightAdd(String a,String b,String c) {
        loginid=a;
        usertype=b;
        fname=c;
        initComponents();
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        companycombo = new javax.swing.JComboBox<>();
        sourcecombo = new javax.swing.JComboBox<>();
        destinationcombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        capacity_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        baseprice_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        flightid_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        SmallImageLabel = new javax.swing.JLabel();
        tod_timepicker = new com.github.lgooddatepicker.components.TimePicker();
        toa_timepicker = new com.github.lgooddatepicker.components.TimePicker();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BigImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(801, 570));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Airline:");
        jLabel2.setAutoscrolls(true);
        jLabel2.setBackground(new java.awt.Color(255, 204, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 144, 42));

        jLabel3.setText("Source:");
        jLabel3.setBackground(new java.awt.Color(255, 204, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 144, 42));

        jLabel4.setText("Destination:");
        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 144, 42));

        jLabel5.setText("Date:");
        jLabel5.setBackground(new java.awt.Color(255, 204, 153));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setOpaque(true);
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 144, 42));

        jLabel6.setText("Capacity:");
        jLabel6.setBackground(new java.awt.Color(255, 204, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 430, 144, 42));

        jLabel7.setText("Time of Departure:");
        jLabel7.setBackground(new java.awt.Color(255, 204, 153));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setOpaque(true);
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 144, 42));

        jLabel8.setText("Time of Arrival:");
        jLabel8.setBackground(new java.awt.Color(255, 204, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 144, 42));

        companycombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Emirates", "Jet Airways", "Indigo", "Go Air", "Jet Lite" }));
        companycombo.setBackground(new java.awt.Color(255, 204, 153));
        companycombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companycomboActionPerformed(evt);
            }
        });
        jPanel2.add(companycombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 130, 40));

        sourcecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Kolkata", "Chennai", "Jaipur" }));
        sourcecombo.setBackground(new java.awt.Color(255, 204, 153));
        sourcecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourcecomboActionPerformed(evt);
            }
        });
        jPanel2.add(sourcecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 130, 40));

        destinationcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Kolkata", "Chennai", "Jaipur" }));
        destinationcombo.setBackground(new java.awt.Color(255, 204, 153));
        destinationcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationcomboActionPerformed(evt);
            }
        });
        jPanel2.add(destinationcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 130, 40));

        jButton1.setText("Create Flight");
        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 132, 45));

        capacity_txt.setBackground(new java.awt.Color(255, 204, 153));
        capacity_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capacity_txtActionPerformed(evt);
            }
        });
        jPanel2.add(capacity_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 130, 40));

        jLabel9.setText("Base Price:");
        jLabel9.setBackground(new java.awt.Color(255, 204, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 140, 40));

        baseprice_txt.setBackground(new java.awt.Color(255, 204, 153));
        baseprice_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baseprice_txtActionPerformed(evt);
            }
        });
        jPanel2.add(baseprice_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 120, 30));

        jLabel10.setText("FlightID:");
        jLabel10.setBackground(new java.awt.Color(255, 204, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, 140, 40));

        flightid_txt.setBackground(new java.awt.Color(255, 204, 153));
        flightid_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightid_txtActionPerformed(evt);
            }
        });
        jPanel2.add(flightid_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 360, 120, 30));

        jLabel1.setText("                 Add New Flight");
        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 93));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Strictly for");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("managerial");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 40));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("purpose.");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 40));

        SmallImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Managerimage.png")); // NOI18N
        SmallImageLabel.setText("jLabel11");
        jPanel1.add(SmallImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 160, 150));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 570));
        jPanel2.add(tod_timepicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 150, 120, -1));
        jPanel2.add(toa_timepicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 120, -1));
        jPanel2.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, 130, 30));

        jButton2.setText("Back to Home");
        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 40));

        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Logoutbuttonedit.jpg")); // NOI18N
        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setIconTextGap(0);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 0, 60, 50));

        BigImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\airplane1.jpg")); // NOI18N
        BigImageLabel.setText("jLabel11");
        jPanel2.add(BigImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
int sourcenum=sourcecombo.getSelectedIndex();
String source=(sourcecombo.getSelectedItem()).toString();
int destinationnum=destinationcombo.getSelectedIndex();

if(destinationnum==-1)
{
    JOptionPane.showMessageDialog(null,"Select Destination");
    return;
}
    String company=(companycombo.getSelectedItem()).toString();
    String destination=(destinationcombo.getSelectedItem()).toString();
    DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
    String date=df.format(jDateChooser1.getDate());
    int capacity=Integer.parseInt(capacity_txt.getText());
    String tod=tod_timepicker.getText();
    String toa=toa_timepicker.getText();
    int baseprice=Integer.parseInt(baseprice_txt.getText());
    String flightid=flightid_txt.getText();
    PreparedStatement ps,checkflight;
      String chkflight="SELECT * FROM `flight` WHERE `flightid` like ?";
      String query="INSERT INTO `flight`(`airline`, `source`, `destination`, `initialcapacity`,`date`,`baseprice`,`flightid`,`tod`,`toa`,`ticketindex`) VALUES (?,?,?,?,?,?,?,?,?,?)";
       try {
                checkflight=MyConn.getConnection().prepareStatement(chkflight);
                checkflight.setString(1,flightid);
                ResultSet rs=checkflight.executeQuery();
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null, "Flight already exists.");
                    return;
                }
                else
                {
                ps=MyConn.getConnection().prepareStatement(query);
                ps.setString(1,company);
                ps.setString(2,source);
                ps.setString(3,destination);
                ps.setInt(4,capacity);
                ps.setString(5,date);
                ps.setInt(6,baseprice);
                ps.setString(7,flightid);
                ps.setString(8,tod);
                ps.setString(9,toa);
                ps.setInt(10,1000);
                               
                 if(ps.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null, "New Flight Added");
                }
                }
                
                   
       }
       catch(SQLException e)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void destinationcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationcomboActionPerformed

    }//GEN-LAST:event_destinationcomboActionPerformed

    private void sourcecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourcecomboActionPerformed
       int sourceindex=sourcecombo.getSelectedIndex();
    destinationcombo.removeAllItems();
    destinationcombo.addItem("Mumbai");
    destinationcombo.addItem("Delhi");
    destinationcombo.addItem("Kolkata");
    destinationcombo.addItem("Chennai");
    destinationcombo.addItem("Jaipur");
    destinationcombo.removeItemAt(sourceindex);
               
    }//GEN-LAST:event_sourcecomboActionPerformed

    private void flightid_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightid_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_flightid_txtActionPerformed

    private void baseprice_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baseprice_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_baseprice_txtActionPerformed

    private void capacity_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capacity_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capacity_txtActionPerformed

    private void companycomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companycomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companycomboActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Login l=new Login();
l.setVisible(true);
this.setVisible(false);
l.pack();
l.setLocationRelativeTo(null);
l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        NewJFrame j=new NewJFrame(loginid,usertype,fname);
                        j.setVisible(true);
                        this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FlightAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FlightAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FlightAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FlightAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FlightAdd(loginid,usertype,fname).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BigImageLabel;
    private javax.swing.JLabel SmallImageLabel;
    private javax.swing.JTextField baseprice_txt;
    private javax.swing.JTextField capacity_txt;
    private javax.swing.JComboBox<String> companycombo;
    private javax.swing.JComboBox<String> destinationcombo;
    private javax.swing.JTextField flightid_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> sourcecombo;
    private com.github.lgooddatepicker.components.TimePicker toa_timepicker;
    private com.github.lgooddatepicker.components.TimePicker tod_timepicker;
    // End of variables declaration//GEN-END:variables
}
