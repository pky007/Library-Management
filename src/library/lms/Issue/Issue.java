package library.lms.Issue;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import library.lms.DataBaseHandler.DataBaseHandler;

public class Issue extends javax.swing.JFrame {

    boolean yes1 = false, yes2 = false;

    DataBaseHandler dbh;

    /**
     * Creates new form Issue
     */
    public Issue() throws Exception {
        initComponents();
        dbh = DataBaseHandler.getDataBaseHandler();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        t2 = new javax.swing.JTextField();
        MemberId = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Issue Book");
        setBounds(new java.awt.Rectangle(10, 40, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("@Issue_Book");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(491, 491, 491)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setText("BookId");

        t1.setBackground(new java.awt.Color(0, 153, 153));
        t1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setBorder(null);
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }
        });

        t2.setBackground(new java.awt.Color(0, 153, 153));
        t2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(null);
        t2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t2KeyReleased(evt);
            }
        });

        MemberId.setBackground(new java.awt.Color(255, 255, 255));
        MemberId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        MemberId.setForeground(new java.awt.Color(102, 0, 0));
        MemberId.setText("MemberId");

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));

        l3.setBackground(new java.awt.Color(255, 255, 255));
        l3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l3.setForeground(new java.awt.Color(255, 255, 255));

        l2.setBackground(new java.awt.Color(255, 255, 255));
        l2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));

        l4.setBackground(new java.awt.Color(255, 255, 255));
        l4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l4.setForeground(new java.awt.Color(255, 255, 255));

        l5.setBackground(new java.awt.Color(255, 255, 255));
        l5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        l5.setForeground(new java.awt.Color(255, 255, 255));

        b2.setBackground(new java.awt.Color(255, 0, 0));
        b2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b2.setForeground(new java.awt.Color(255, 255, 255));
        b2.setText("Close");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(51, 153, 0));
        b1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Issue");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(MemberId)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(l5, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MemberId, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t1KeyReleased
        clear();

        String id = t1.getText().trim();
        String q = "select * from book where bookId='" + id + "'";
        ResultSet rs = dbh.getData(q);
        boolean fg = false;
        try {
            while (rs.next()) {
                String name = rs.getString("bookName");
                String author = rs.getString("author");
                boolean available = rs.getBoolean("isY");

                l1.setText(name);
                l2.setText(author);
                String chk = (available) ? "Available" : "Not Available";
                l3.setText(chk);
                fg = true;
                yes1 = true;
            }
        } catch (SQLException ex) {
            yes1 = false;
            Logger.getLogger(Issue.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!fg && !t1.getText().trim().equals("")) {
            l1.setText("Wrong Id");
            l2.setText("");
            l3.setText("");
            yes1 = false;
        }


    }//GEN-LAST:event_t1KeyReleased

    private void t2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t2KeyReleased

        cclear();
        String id = t2.getText().trim();
        String q = "select * from member where id='" + id + "'";
        ResultSet rs = dbh.getData(q);
        boolean fg = false;
        try {
            while (rs.next()) {
                String name = rs.getString("name");
                String contact = rs.getString("contact");
                fg = true;

                l4.setText(name);
                l5.setText(contact);

                fg = true;
                yes2 = true;

            }
        } catch (SQLException ex) {
            yes2 = false;
            Logger.getLogger(Issue.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (!fg && !t2.getText().trim().equals("")) {
            l4.setText("Wrong Id");
            l5.setText("");
            yes2 = false;

        }
    }//GEN-LAST:event_t2KeyReleased

    void clear() {

        l1.setText("");
        l2.setText("");
        l3.setText("");

    }

    void cclear() {

        l4.setText("");
        l5.setText("");
    }


    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        String bookId = t1.getText().trim();
        String memberId = t2.getText().trim();

        if (bookId.equals("") || memberId.equals("")) {
            JOptionPane.showMessageDialog(null, null, "Fill All the Fields", HEIGHT);
            return;
        } else {
            // System.out.println(JOptionPane.showConfirmDialog(null,null,"ARE You Sure to Issue Book", WIDTH));
            if (JOptionPane.showConfirmDialog(null,"Are you Confirm to Issue Book","Issue book", WIDTH) == 0) {

                String q = "insert into issueBook (bookId,memberId) values ("
                        + "'" + bookId + "',"
                        + "'" + memberId + "'"
                        + ")";
                String qq = "update book set isY =false where bookId=" + bookId + "";
                //  System.out.println(yes1+" "+yes2);

                if (yes1 && yes2) {
                    if (dbh.isExeQuery(q) && dbh.isExeQuery(qq)) {
                        JOptionPane.showMessageDialog(null, "Book Issued");
                        System.out.println("Book Issue");
                        // yes1=false;
                        //yes2=false;
                    } else {
                        System.out.println("Book Not Issue");
                        JOptionPane.showMessageDialog(null, "Book Not Issued", "Information", HEIGHT);
                        return;

                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Book Not Issued", "Information", HEIGHT);
                }

            } else {
                return;
            }

        }


    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_b2ActionPerformed

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
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Issue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Issue().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Issue.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MemberId;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    // End of variables declaration//GEN-END:variables
}
