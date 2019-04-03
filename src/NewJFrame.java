
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {
    static String loginid,usertype,fname;
    public NewJFrame(String a,String b,String c) 
    {
        loginid=a;
        usertype=b;
        fname=c;
        initComponents();
        if(usertype.equals("C"))
           AddFlightButton.setVisible(false);
        welcomelabel.setText("Welcome "+c+" how can we help you");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        SloganLabel = new javax.swing.JLabel();
        BookButton = new javax.swing.JButton();
        CheckReservationButton = new javax.swing.JButton();
        CancelReservationButton = new javax.swing.JButton();
        AddFlightButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        welcomelabel = new javax.swing.JLabel();
        ImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(802, 570));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleLabel.setFont(new java.awt.Font("Tahoma", 3, 32)); // NOI18N
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Merryweather Flight Booking Services");
        jPanel1.add(TitleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 60));

        SloganLabel.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        SloganLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SloganLabel.setText("Fly high. At low prices.");
        jPanel1.add(SloganLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 116, 660, 30));

        BookButton.setBackground(new java.awt.Color(255, 51, 51));
        BookButton.setText("Book Flight");
        BookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BookButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 200, 40));

        CheckReservationButton.setBackground(new java.awt.Color(255, 51, 51));
        CheckReservationButton.setText("Check Reservation Status");
        CheckReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckReservationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CheckReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 220, 40));

        CancelReservationButton.setBackground(new java.awt.Color(255, 51, 51));
        CancelReservationButton.setText("Cancel Reservation");
        CancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelReservationButtonActionPerformed(evt);
            }
        });
        jPanel1.add(CancelReservationButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 370, 220, 40));

        AddFlightButton.setBackground(new java.awt.Color(255, 51, 51));
        AddFlightButton.setText("Add Flight");
        AddFlightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlightButtonActionPerformed(evt);
            }
        });
        jPanel1.add(AddFlightButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 200, 40));

        jButton4.setBackground(new java.awt.Color(255, 102, 51));
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\Logoutbuttonedit.jpg")); // NOI18N
        jButton4.setIconTextGap(0);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(739, 0, 60, 50));

        welcomelabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(welcomelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 800, 100));

        ImageLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jash\\Pictures\\airplane1.jpg")); // NOI18N
        ImageLabel.setText("BookMyFLight");
        jPanel1.add(ImageLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelReservationButtonActionPerformed
CancelReservationFrame c=new CancelReservationFrame(loginid,usertype,fname);
c.setVisible(true);
this.setVisible(false);
c.pack();
c.setLocationRelativeTo(null);
c.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
c=null;
    }//GEN-LAST:event_CancelReservationButtonActionPerformed

    private void AddFlightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlightButtonActionPerformed
                        FlightAdd j=new FlightAdd(loginid,usertype,fname);
                        j.setVisible(true);
                        this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;
            
    }//GEN-LAST:event_AddFlightButtonActionPerformed

    private void CheckReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckReservationButtonActionPerformed
                        NewJFrame1 j=new NewJFrame1(loginid,usertype,fname);
                        j.setVisible(true);
                        this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;
    }//GEN-LAST:event_CheckReservationButtonActionPerformed

    private void BookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookButtonActionPerformed
                        String e=loginid;
                        Booking j=new Booking(e,usertype,fname);
                        j.setVisible(true);
                        this.setVisible(false);
                        j.pack();
                        j.setLocationRelativeTo(null);
                        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        j=null;       
    }//GEN-LAST:event_BookButtonActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
Login l=new Login();
l.setVisible(true);
this.setVisible(false);
l.pack();
l.setLocationRelativeTo(null);
l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame(loginid,usertype,fname).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddFlightButton;
    private javax.swing.JButton BookButton;
    private javax.swing.JButton CancelReservationButton;
    private javax.swing.JButton CheckReservationButton;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JLabel SloganLabel;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel welcomelabel;
    // End of variables declaration//GEN-END:variables
}
