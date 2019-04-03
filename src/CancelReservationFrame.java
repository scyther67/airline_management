
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class CancelReservationFrame extends javax.swing.JFrame {

    static String loginid,usertype,fname;
    public CancelReservationFrame(String a,String b,String c) {
        loginid=a;
        usertype=b;
        fname=c;
        initComponents();
       //String "SELECT * from `patientinfo` WHERE `doctorid` like ?";
       
        
        String query="SELECT `price`,`source`,`airline`,`destination`,`date`,`tod`,`toa`,f.flightid,`ticket_no` FROM flight f,`flightuser` r WHERE f.flightid=r.flightid AND `loginid`=?";
    DefaultTableModel model1=(DefaultTableModel)searchtable.getModel();
    
    double price;
    String source,destination,airline,date,tod,toa,flightid,ticketno;
    PreparedStatement ps;
    ResultSet rs;
    int count=1;
       try {
           
                ps=MyConn.getConnection().prepareStatement(query);
                ps.setString(1,loginid);
                rs=ps.executeQuery();
                while(rs.next())
                {
                    ticketno=rs.getString("ticket_no");
                airline=rs.getString("airline");
                price=rs.getDouble("price");
                tod=rs.getString("tod");
                toa=rs.getString("toa");
                source=rs.getString("source");
                destination=rs.getString("destination");
                date=rs.getString("date");
                
                model1.addRow(new Object[]{Integer.toString(count++),airline,price,tod,toa,date,source,destination,ticketno});
                }
            }
        catch(SQLException e)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
       }
        ListSelectionModel model=searchtable.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedrow=1+model.getMinSelectionIndex();
                  double price;
                String source,destination,airline,date,tod,toa,flightid;
                String q="DELETE FROM `flightuser` WHERE `loginid` = ? AND `flightid` = ?";
    if(jCheckBox1.isSelected())
                {
                try{
                PreparedStatement ps=MyConn.getConnection().prepareStatement(query);
                PreparedStatement ps3=MyConn.getConnection().prepareStatement(q);
                ps.setString(1,loginid);
                
                ResultSet rs=ps.executeQuery();
                while(selectedrow>0)
                {
                    rs.next();
                    selectedrow--;
                }
                flightid=rs.getString("f.flightid");
                
                ps3.setString(1,loginid);
                ps3.setString(2,flightid);
                if(ps3.executeUpdate()>0)
                {JOptionPane.showMessageDialog(null,"Booking Cancelled");
                CancelReservationFrame c=new CancelReservationFrame(loginid,usertype,fname);
                c.setVisible(true);
//this.setVisible(false);
                c.pack();
                c.setLocationRelativeTo(null);
                c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                c=null;    
                /*source=rs.getString("source");
                destination=rs.getString("destination");
                date=rs.getString("date");
                airline=rs.getString("airline");
                price=rs.getDouble("baseprice");
                tod=rs.getString("tod");
                toa=rs.getString("toa");*/
                 
                }
            }
       catch(SQLException f)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, f);
       }
                }
    else
                {
                JOptionPane.showMessageDialog(null,"Select Checkbox");
                
                
                }}
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SmallImageLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchtable = new javax.swing.JTable();
        BigImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setText("             Cancel Reservation");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 70));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Click on Ticket You Wish to Delete from Table:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 420, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox1.setText("I have read and understood the terms and conditions and wish to confirm my cancellation.");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("pollicy has got");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("worry, our");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("You need not ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Change of plans?");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("you covered!");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 140, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("cancellation");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 50));

        SmallImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Cancellationimage.jpg")); // NOI18N
        jPanel2.add(SmallImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 160, 150));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 570));

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setText("Back to Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 40));

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Logoutbuttonedit.jpg")); // NOI18N
        jButton4.setIconTextGap(0);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 0, 60, 50));

        jLabel10.setText("*Terms and Conditions: You will be refunded only 50% of your money upon cancellation.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 510, 620, 60));

        searchtable.setBackground(new java.awt.Color(255, 204, 153));
        searchtable.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        searchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.", "Airline", "Price", "TOD", "TOA", "Date", "Source", "Destination", "Ticket Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchtable.setColumnSelectionAllowed(true);
        searchtable.setOpaque(false);
        searchtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchtableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(searchtable);
        searchtable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (searchtable.getColumnModel().getColumnCount() > 0) {
            searchtable.getColumnModel().getColumn(0).setMinWidth(40);
            searchtable.getColumnModel().getColumn(0).setPreferredWidth(40);
            searchtable.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 600, 190));

        BigImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\airplane1.jpg")); // NOI18N
        BigImageLabel.setText("jLabel4");
        jPanel1.add(BigImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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

    private void searchtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtableMouseClicked

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
            java.util.logging.Logger.getLogger(CancelReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CancelReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CancelReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CancelReservationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CancelReservationFrame(loginid,usertype,fname).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BigImageLabel;
    private javax.swing.JLabel SmallImageLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable searchtable;
    // End of variables declaration//GEN-END:variables
}
