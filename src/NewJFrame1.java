
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewJFrame1 extends javax.swing.JFrame {

       static String loginid,usertype,fname;

    public NewJFrame1(String a,String b,String c) {
        loginid=a;
        usertype=b;
        fname=c;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        HeadLabel = new javax.swing.JLabel();
        Ticketnolabel = new javax.swing.JLabel();
        Ticketnotext = new javax.swing.JTextField();
        StatusCheckButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        SmallImageLabel = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        AirlineLabel = new javax.swing.JLabel();
        TODInputLabel = new javax.swing.JLabel();
        SourceLabel = new javax.swing.JLabel();
        AirlineInputLabel = new javax.swing.JLabel();
        TODLabel = new javax.swing.JLabel();
        FlightIDInputLabel = new javax.swing.JLabel();
        TOALabel = new javax.swing.JLabel();
        SourceInputLabel = new javax.swing.JLabel();
        DestinationLabel = new javax.swing.JLabel();
        DestinationInputLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        DateInputLabel = new javax.swing.JLabel();
        TOAInputLabel = new javax.swing.JLabel();
        FlightIDLabel = new javax.swing.JLabel();
        BigImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HeadLabel.setBackground(new java.awt.Color(255, 255, 255));
        HeadLabel.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        HeadLabel.setText("              Reservation Status");
        jPanel2.add(HeadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 80));

        Ticketnolabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Ticketnolabel.setText("Enter your ticket number:");
        jPanel2.add(Ticketnolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 240, 30));

        Ticketnotext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TicketnotextActionPerformed(evt);
            }
        });
        jPanel2.add(Ticketnotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 180, 30));

        StatusCheckButton.setBackground(new java.awt.Color(255, 51, 51));
        StatusCheckButton.setText("Check Status");
        StatusCheckButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusCheckButtonActionPerformed(evt);
            }
        });
        jPanel2.add(StatusCheckButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 120, 30));

        jPanel1.setBackground(new java.awt.Color(255, 153, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Forgot your flight");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 160, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("details?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Check them ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 160, 40));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("here, anytime.");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 160, 40));

        SmallImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Reservationimage2.png")); // NOI18N
        jPanel1.add(SmallImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 436, 180, 140));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 570));

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Logoutbuttonedit.jpg")); // NOI18N
        jButton4.setIconTextGap(0);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 0, 60, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setText("Back to Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 40));

        AirlineLabel.setBackground(new java.awt.Color(255, 204, 153));
        AirlineLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AirlineLabel.setText("Airline:");
        AirlineLabel.setOpaque(true);
        jPanel2.add(AirlineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 90, 30));

        TODInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        TODInputLabel.setOpaque(true);
        jPanel2.add(TODInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 150, 30));

        SourceLabel.setBackground(new java.awt.Color(255, 204, 153));
        SourceLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SourceLabel.setText("Source:");
        SourceLabel.setOpaque(true);
        jPanel2.add(SourceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 90, 30));

        AirlineInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        AirlineInputLabel.setOpaque(true);
        jPanel2.add(AirlineInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 150, 30));

        TODLabel.setBackground(new java.awt.Color(255, 204, 153));
        TODLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TODLabel.setText("Time of Departure:");
        TODLabel.setOpaque(true);
        jPanel2.add(TODLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, 30));

        FlightIDInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        FlightIDInputLabel.setOpaque(true);
        jPanel2.add(FlightIDInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 150, 30));

        TOALabel.setBackground(new java.awt.Color(255, 204, 153));
        TOALabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TOALabel.setText("Time of Arrival:");
        TOALabel.setOpaque(true);
        jPanel2.add(TOALabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 110, 30));

        SourceInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        SourceInputLabel.setOpaque(true);
        jPanel2.add(SourceInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 150, 30));

        DestinationLabel.setBackground(new java.awt.Color(255, 204, 153));
        DestinationLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DestinationLabel.setText("Destination:");
        DestinationLabel.setOpaque(true);
        jPanel2.add(DestinationLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 90, 30));

        DestinationInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        DestinationInputLabel.setOpaque(true);
        jPanel2.add(DestinationInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 150, 30));

        DateLabel.setBackground(new java.awt.Color(255, 204, 153));
        DateLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DateLabel.setText("Date:");
        DateLabel.setOpaque(true);
        jPanel2.add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 120, 30));

        DateInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        DateInputLabel.setOpaque(true);
        jPanel2.add(DateInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 150, 30));

        TOAInputLabel.setBackground(new java.awt.Color(255, 204, 153));
        TOAInputLabel.setOpaque(true);
        jPanel2.add(TOAInputLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 150, 30));

        FlightIDLabel.setBackground(new java.awt.Color(255, 204, 153));
        FlightIDLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FlightIDLabel.setText("Flight ID:");
        FlightIDLabel.setOpaque(true);
        jPanel2.add(FlightIDLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 90, 30));

        BigImageLabel.setBackground(new java.awt.Color(255, 204, 153));
        BigImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\airplane1.jpg")); // NOI18N
        BigImageLabel.setText("jLabel8");
        BigImageLabel.setOpaque(true);
        jPanel2.add(BigImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TicketnotextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TicketnotextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TicketnotextActionPerformed

    private void StatusCheckButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusCheckButtonActionPerformed
String ticketno=Ticketnotext.getText();
if(ticketno.equals(""))
{
    JOptionPane.showMessageDialog(null,"Enter ticket number");
    return;
}
    PreparedStatement ps;
    String airline,tod,toa;
 
      String query="SELECT `price`,`source`,`airline`,`destination`,`date`,f.flightid,`tod`,`toa` FROM flight f,`flightuser` r WHERE f.flightid=r.flightid AND `ticket_no`=?";
       try {
           
                ps=MyConn.getConnection().prepareStatement(query);
                ps.setString(1,ticketno);
                                          
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                    AirlineInputLabel.setText(rs.getString("airline"));
                    DateInputLabel.setText(rs.getString("date"));
                    DestinationInputLabel.setText(rs.getString("destination"));
                    FlightIDInputLabel.setText(rs.getString("f.flightid"));
                    SourceInputLabel.setText(rs.getString("source"));
                    TOAInputLabel.setText(rs.getString("toa"));
                    TODInputLabel.setText(rs.getString("tod"));
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid Ticket Number");
                }
            }
                
                   
       
       catch(SQLException e)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
       }
    }//GEN-LAST:event_StatusCheckButtonActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1(loginid,usertype,fname).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AirlineInputLabel;
    private javax.swing.JLabel AirlineLabel;
    private javax.swing.JLabel BigImageLabel;
    private javax.swing.JLabel DateInputLabel;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DestinationInputLabel;
    private javax.swing.JLabel DestinationLabel;
    private javax.swing.JLabel FlightIDInputLabel;
    private javax.swing.JLabel FlightIDLabel;
    private javax.swing.JLabel HeadLabel;
    private javax.swing.JLabel SmallImageLabel;
    private javax.swing.JLabel SourceInputLabel;
    private javax.swing.JLabel SourceLabel;
    private javax.swing.JButton StatusCheckButton;
    private javax.swing.JLabel TOAInputLabel;
    private javax.swing.JLabel TOALabel;
    private javax.swing.JLabel TODInputLabel;
    private javax.swing.JLabel TODLabel;
    private javax.swing.JLabel Ticketnolabel;
    private javax.swing.JTextField Ticketnotext;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
