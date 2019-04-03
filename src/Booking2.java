
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Booking2 extends javax.swing.JFrame {
    static int seatsleft,baseprice;
    static double price;
    static String loginid,usertype,fname,source,destination,tod,toa,airline,date,flightid;
    public Booking2(int a,String b,String c,String d, String e ,String f,String g,String h,int i ,String j ,String k,String l) {
        initComponents();
        seatsleft=a;
        loginid=b;
        usertype=c;
        fname=d;
        source=e;
        destination=f;
        tod=g;
        toa=h;
        baseprice=i;
        airline=j;
        date=k;
        flightid=l;
        airlinetxt.setText(airline);
        sourcetxt.setText(source);
        destinationtxt.setText(destination);
        datetxt.setText(date);
        seatslefttxt.setText(Integer.toString(seatsleft));
        todtxt.setText(tod);
        toatxt.setText(toa);
        pricetxt.setText(Integer.toString(baseprice));
        flightidtxt.setText(flightid);
        price=baseprice;
        }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        SmallImageLabel = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        airlinetxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sourcetxt = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        datetxt = new javax.swing.JLabel();
        seatslefttxt = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        todtxt = new javax.swing.JLabel();
        toatxt = new javax.swing.JLabel();
        pricetxt = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        flightidtxt = new javax.swing.JLabel();
        destinationtxt = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(801, 570));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel11.setText("             Confirm your Booking");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 70));

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

        SmallImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Bookflightimage.png")); // NOI18N
        jPanel2.add(SmallImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 160, 160));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 570));

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 110, 40));

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Logoutbuttonedit.jpg")); // NOI18N
        jButton4.setIconTextGap(0);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 0, 60, 50));

        jLabel1.setBackground(new java.awt.Color(255, 204, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Price:");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, 130, 30));

        airlinetxt.setBackground(new java.awt.Color(255, 204, 153));
        airlinetxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        airlinetxt.setOpaque(true);
        getContentPane().add(airlinetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 130, 30));

        jLabel4.setBackground(new java.awt.Color(255, 204, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Destination:");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, 130, 30));

        jLabel8.setBackground(new java.awt.Color(255, 204, 153));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Date:");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 130, 30));

        jLabel9.setBackground(new java.awt.Color(255, 204, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Seats left:");
        jLabel9.setOpaque(true);
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 130, 30));

        sourcetxt.setBackground(new java.awt.Color(255, 204, 153));
        sourcetxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sourcetxt.setOpaque(true);
        getContentPane().add(sourcetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 130, 30));

        jLabel13.setBackground(new java.awt.Color(255, 204, 153));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Airline:");
        jLabel13.setOpaque(true);
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 130, 30));

        datetxt.setBackground(new java.awt.Color(255, 204, 153));
        datetxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        datetxt.setOpaque(true);
        getContentPane().add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 130, 30));

        seatslefttxt.setBackground(new java.awt.Color(255, 204, 153));
        seatslefttxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        seatslefttxt.setOpaque(true);
        getContentPane().add(seatslefttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 130, 30));

        jLabel16.setBackground(new java.awt.Color(255, 204, 153));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Time of departure:");
        jLabel16.setOpaque(true);
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, 130, 30));

        jLabel17.setBackground(new java.awt.Color(255, 204, 153));
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Time of arrival:");
        jLabel17.setOpaque(true);
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 130, 30));

        jLabel18.setBackground(new java.awt.Color(255, 204, 153));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Source:");
        jLabel18.setOpaque(true);
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 130, 30));

        todtxt.setBackground(new java.awt.Color(255, 204, 153));
        todtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        todtxt.setOpaque(true);
        getContentPane().add(todtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 130, 30));

        toatxt.setBackground(new java.awt.Color(255, 204, 153));
        toatxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toatxt.setOpaque(true);
        getContentPane().add(toatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 170, 130, 30));

        pricetxt.setBackground(new java.awt.Color(255, 204, 153));
        pricetxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pricetxt.setOpaque(true);
        getContentPane().add(pricetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 240, 130, 30));

        jLabel22.setBackground(new java.awt.Color(255, 204, 153));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setText("Flight ID:");
        jLabel22.setOpaque(true);
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, 130, 30));

        flightidtxt.setBackground(new java.awt.Color(255, 204, 153));
        flightidtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightidtxt.setOpaque(true);
        getContentPane().add(flightidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 310, 130, 30));

        destinationtxt.setBackground(new java.awt.Color(255, 204, 153));
        destinationtxt.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        destinationtxt.setOpaque(true);
        getContentPane().add(destinationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 130, 30));

        jCheckBox1.setText("In-flight meal");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 400, -1, -1));

        jCheckBox2.setText("Wifi");
        jCheckBox2.setOpaque(false);
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 400, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setText("Book now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 490, 90, 30));

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\airplane1.jpg")); // NOI18N
        jLabel25.setText("jLabel25");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 800, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected())
price+=500;
else
    price-=500;
pricetxt.setText(Double.toString(price));
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
if(jCheckBox2.isSelected())
price+=100;
else
    price-=100;
pricetxt.setText(Double.toString(price));
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      PreparedStatement ps1,ps2,ps3;
      String selectindex="SELECT ticketindex from `flight` WHERE `flightid` like ?";
      String check="SELECT * from `flightuser` WHERE `flightid` like ? AND `loginid` like ?";
      String query="INSERT INTO `flightuser` (`flightid`,`loginid`,`ticket_no`,`price`) VALUES(?,?,?,?)",ticketnumber;
       try {
                ps3=MyConn.getConnection().prepareStatement(check);
                ps3.setString(1,flightid);
                ps3.setString(2,loginid);
                ResultSet rq=ps3.executeQuery();
                if(rq.next())
                {JOptionPane.showMessageDialog(null,"You have already booked a ticket on this plane");
                return;
                }
                ps1=MyConn.getConnection().prepareStatement(selectindex);
                ps1.setString(1,flightid);
                ResultSet rs=ps1.executeQuery();
                rs.next();
                String ticketindex=Integer.toString(rs.getInt("ticketindex"));
                ticketnumber=flightid+ticketindex;
                ps2=MyConn.getConnection().prepareStatement(query);
                ps2.setString(1,flightid);
                ps2.setString(2,loginid);
                ps2.setString(3,ticketnumber);
                ps2.setDouble(4, price);
                  if(ps2.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(null, "Ticket Booked Your Ticket Number is "+ticketnumber);
                }
                
                
                }
            
                
                   
       
       catch(SQLException e)
       {
           Logger.getLogger(Registration.class.getName()).log(Level.SEVERE, null, e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                        Booking j=new Booking(loginid,usertype,fname);
                        j.setVisible(true);
                        this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;    
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Booking2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Booking2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Booking2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Booking2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Booking2(seatsleft,loginid,usertype,fname,source,destination,tod,toa,baseprice,airline,date,flightid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SmallImageLabel;
    private javax.swing.JLabel airlinetxt;
    private javax.swing.JLabel datetxt;
    private javax.swing.JLabel destinationtxt;
    private javax.swing.JLabel flightidtxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel pricetxt;
    private javax.swing.JLabel seatslefttxt;
    private javax.swing.JLabel sourcetxt;
    private javax.swing.JLabel toatxt;
    private javax.swing.JLabel todtxt;
    // End of variables declaration//GEN-END:variables
}
