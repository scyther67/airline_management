
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class Booking extends javax.swing.JFrame {
    static String loginid,usertype,fname;
    static ResultSet rs;
    public Booking(String a,String b,String c) {
        loginid=a;
        usertype=b;
        fname=c;
        initComponents();
        ListSelectionModel model=searchtable.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int selectedrow=1+model.getMinSelectionIndex();
                String source,destination,flightid;
    String date;
    
    String airline,tod,toa;
    int seatsleft;
    int baseprice,count=1;
    try {
                rs.first();
                while(selectedrow>1)
                {
                    rs.next();
                    selectedrow--;
                }
                source=rs.getString("source");
                destination=rs.getString("destination");
                date=rs.getString("date");
                flightid=rs.getString("flightid");
                airline=rs.getString("airline");
                baseprice=rs.getInt("baseprice");
                tod=rs.getString("tod");
                toa=rs.getString("toa");
                seatsleft=rs.getInt("currentcapacity");
                 Booking2 j=new Booking2(seatsleft,loginid,usertype,fname,source,destination,tod,toa,baseprice,airline,date,flightid);
                        j.setVisible(true);
                        //this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;    
                
            }
       catch(SQLException f)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, f);
       }
                
                
            }
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        destinationcombo = new javax.swing.JComboBox<>();
        sourcecombo = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        searchtable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        search_button = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SmallImageLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BigImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(802, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 204, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Source:");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 140, 30));

        jLabel2.setBackground(new java.awt.Color(255, 204, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Destination:");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, 140, 30));

        destinationcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Delhi", "Kolkata", "Chennai", "Jaipur" }));
        destinationcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationcomboActionPerformed(evt);
            }
        });
        getContentPane().add(destinationcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 162, 30));

        sourcecombo.setBackground(new java.awt.Color(255, 204, 153));
        sourcecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mumbai", "Delhi", "Kolkata", "Chennai", "Jaipur" }));
        sourcecombo.setOpaque(false);
        sourcecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourcecomboActionPerformed(evt);
            }
        });
        getContentPane().add(sourcecombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 160, 30));

        jDateChooser1.setDateFormatString("d/MM/yyyy");
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 160, 30));

        searchtable.setBackground(new java.awt.Color(255, 204, 153));
        searchtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sr.", "Airline", "Price", "Time of Departure", "Time of Arrival"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
            searchtable.getColumnModel().getColumn(0).setMinWidth(30);
            searchtable.getColumnModel().getColumn(0).setPreferredWidth(30);
            searchtable.getColumnModel().getColumn(0).setMaxWidth(30);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 600, 100));

        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Date:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 140, 30));

        search_button.setBackground(new java.awt.Color(255, 102, 51));
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        getContentPane().add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 360, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("options.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 140, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("from our wide");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 160, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("preferred flight ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 160, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Choose your");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 160, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("range of ");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 140, 50));

        SmallImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\SearchFlightImage.png")); // NOI18N
        jPanel2.add(SmallImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 160, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 570));

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel11.setText("              Search your Flight");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 70));

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setText("Back to Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 40));

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Logoutbuttonedit.jpg")); // NOI18N
        jButton4.setIconTextGap(0);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 0, 60, 50));

        BigImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\airplane1.jpg")); // NOI18N
        getContentPane().add(BigImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 801, 570));

        setSize(new java.awt.Dimension(814, 615));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void destinationcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationcomboActionPerformed
  
    }//GEN-LAST:event_destinationcomboActionPerformed

    private void searchtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchtableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_searchtableMouseClicked

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

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
//String date=((JTextField)jDateChooser1.getDateEditor().getUiComponent()).getText();
//int sourcenum=sourcecombo.getSelectedIndex();
String source=(sourcecombo.getSelectedItem()).toString(),date,destination;
int destinationnum=destinationcombo.getSelectedIndex();
    try
    {
    destination=(destinationcombo.getSelectedItem()).toString();
    DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
    date=df.format(jDateChooser1.getDate());
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,"Select Date");
        return;
    }
    if(destinationnum==-1)
{
    JOptionPane.showMessageDialog(null,"Select Destination");
    return;
}
    DefaultTableModel model1=(DefaultTableModel)searchtable.getModel();
    model1.setRowCount(0);
    
    PreparedStatement ps;
    String airline,tod,toa;
    int baseprice,count=1;
      String query="SELECT `source`,`destination`,`airline`,`baseprice`,`tod`,`toa`,`flightid`,`currentcapacity`"
              + ",`date` FROM `flight` WHERE `date` like ? AND source like ? AND destination like ?";
       try {
           
                ps=MyConn.getConnection().prepareStatement(query);
                ps.setString(1,date);
                ps.setString(2,source);
                ps.setString(3,destination);
                               
                rs=ps.executeQuery();
                while(rs.next())
                {
                airline=rs.getString("airline");
                baseprice=rs.getInt("baseprice");
                tod=rs.getString("tod");
                toa=rs.getString("toa");
                
                model1.addRow(new Object[]{Integer.toString(count++),airline,baseprice,tod,toa});
                }
            }
                
                   
       
       catch(SQLException e)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
       }

    }//GEN-LAST:event_search_buttonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        try
                        {
                        NewJFrame j=new NewJFrame(loginid,usertype,fname);
                        j.setVisible(true);
                        this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;
                        }
                        catch(Exception e)
                        {
                            JOptionPane.showMessageDialog(null,e);
                        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Login l=new Login();
l.setVisible(true);
this.setVisible(false);
l.pack();
l.setLocationRelativeTo(null);
l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
l=null;
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking(loginid,usertype,fname).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BigImageLabel;
    private javax.swing.JLabel SmallImageLabel;
    private javax.swing.JComboBox<String> destinationcombo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JButton search_button;
    private javax.swing.JTable searchtable;
    private javax.swing.JComboBox<String> sourcecombo;
    // End of variables declaration//GEN-END:variables
}
