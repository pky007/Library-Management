package library.lms.Main;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import library.lms.About.About;
import library.lms.AddBook.AddBook;
import library.lms.AddMember.AddMember;
import library.lms.DataBaseHandler.DataBaseHandler;
import library.lms.Issue.Issue;
import library.lms.Mygame.MyGame;
import library.lms.ReturnRenewBook.ReturnRenewBook;
import library.lms.UpdateDeleteMember.UpdateDeleteMember;
import library.lms.UpdateDeletedBook.UpdateDeleteBook;
import library.lms.ViewBook.ViewBook;
import library.lms.ViewMember.ViewMember;

/**
 *
 * @author PK YADAV
 */
public class Main extends javax.swing.JFrame {

    DataBaseHandler dbh;

    public Main() throws Exception {
        initComponents();
        dbh = DataBaseHandler.getDataBaseHandler();
        jp2.setVisible(false);
        jp3.setVisible(false);
        jp4.setVisible(false);
        //date.setHorizontalAlignment(JLabel.CENTER);
        //time.setHorizontalAlignment(JLabel.CENTER);
        tickTack();
        tickTack1();
        Timer timer = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tickTack();
                tickTack1();

            }

        });

        timer.setRepeats(true);
        timer.setCoalesce(true);
        timer.setInitialDelay(0);
        timer.start();

    }

    private void tickTack() {
        date.setText(DateFormat.getDateInstance().format(new Date()));
    }

    private void tickTack1() {
        time.setText(DateFormat.getTimeInstance().format(new Date()));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidePane = new javax.swing.JPanel();
        btn1 = new javax.swing.JPanel();
        bb1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn3 = new javax.swing.JPanel();
        bb3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn2 = new javax.swing.JPanel();
        bb2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn4 = new javax.swing.JPanel();
        bb4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        date = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        root = new javax.swing.JPanel();
        jp1 = new javax.swing.JPanel();
        p1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        p3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        p4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        p5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        p6 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jp2 = new javax.swing.JPanel();
        bp1 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        bp4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        bp2 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        bp3 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        bp5 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        bp6 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jp3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        mp1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mp2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        mp3 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        mp4 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        mp5 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        mp6 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jp4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        b1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        t2 = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        t3 = new javax.swing.JPasswordField();
        t5 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LibraryManagement");

        sidePane.setBackground(new java.awt.Color(13, 35, 53));

        btn1.setBackground(new java.awt.Color(41, 57, 86));
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout bb1Layout = new javax.swing.GroupLayout(bb1);
        bb1.setLayout(bb1Layout);
        bb1Layout.setHorizontalGroup(
            bb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        bb1Layout.setVerticalGroup(
            bb1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
        btn1.setLayout(btn1Layout);
        btn1Layout.setHorizontalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn1Layout.createSequentialGroup()
                .addComponent(bb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );
        btn1Layout.setVerticalGroup(
            btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bb1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn3.setBackground(new java.awt.Color(13, 35, 53));
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn3MousePressed(evt);
            }
        });

        bb3.setOpaque(false);

        javax.swing.GroupLayout bb3Layout = new javax.swing.GroupLayout(bb3);
        bb3.setLayout(bb3Layout);
        bb3Layout.setHorizontalGroup(
            bb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        bb3Layout.setVerticalGroup(
            bb3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Member");

        javax.swing.GroupLayout btn3Layout = new javax.swing.GroupLayout(btn3);
        btn3.setLayout(btn3Layout);
        btn3Layout.setHorizontalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn3Layout.createSequentialGroup()
                .addComponent(bb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn3Layout.setVerticalGroup(
            btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bb3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn2.setBackground(new java.awt.Color(13, 35, 53));
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn2MousePressed(evt);
            }
        });

        bb2.setOpaque(false);

        javax.swing.GroupLayout bb2Layout = new javax.swing.GroupLayout(bb2);
        bb2.setLayout(bb2Layout);
        bb2Layout.setHorizontalGroup(
            bb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        bb2Layout.setVerticalGroup(
            bb2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book");

        javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
        btn2.setLayout(btn2Layout);
        btn2Layout.setHorizontalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn2Layout.createSequentialGroup()
                .addComponent(bb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn2Layout.setVerticalGroup(
            btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bb2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn4.setBackground(new java.awt.Color(13, 35, 53));
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn4MousePressed(evt);
            }
        });

        bb4.setOpaque(false);

        javax.swing.GroupLayout bb4Layout = new javax.swing.GroupLayout(bb4);
        bb4.setLayout(bb4Layout);
        bb4Layout.setHorizontalGroup(
            bb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );
        bb4Layout.setVerticalGroup(
            bb4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Settings");

        javax.swing.GroupLayout btn4Layout = new javax.swing.GroupLayout(btn4);
        btn4.setLayout(btn4Layout);
        btn4Layout.setHorizontalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn4Layout.createSequentialGroup()
                .addComponent(bb4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btn4Layout.setVerticalGroup(
            btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(btn4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout sidePaneLayout = new javax.swing.GroupLayout(sidePane);
        sidePane.setLayout(sidePaneLayout);
        sidePaneLayout.setHorizontalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePaneLayout.createSequentialGroup()
                .addGroup(sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        sidePaneLayout.setVerticalGroup(
            sidePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePaneLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Library Management");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(451, 451, 451))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 153));
        jPanel3.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        time.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(time, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 410, 110));

        jPanel5.setBackground(new java.awt.Color(3, 155, 229));

        date.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 114, 410, 120));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/lib2.png"))); // NOI18N
        jPanel3.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 130, 140));

        root.setLayout(new java.awt.CardLayout());

        jp1.setBackground(new java.awt.Color(0, 102, 102));
        jp1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p1MousePressed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Book_52px_7.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 102));
        jLabel13.setText("Book");

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jp1.add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, 140));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p2MousePressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Member");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Circled User Male_50px_6.png"))); // NOI18N

        javax.swing.GroupLayout p2Layout = new javax.swing.GroupLayout(p2);
        p2.setLayout(p2Layout);
        p2Layout.setHorizontalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        p2Layout.setVerticalGroup(
            p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(p2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jp1.add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 170, 140));

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p3MousePressed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Bowling Spare_50px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Game");

        javax.swing.GroupLayout p3Layout = new javax.swing.GroupLayout(p3);
        p3.setLayout(p3Layout);
        p3Layout.setHorizontalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        p3Layout.setVerticalGroup(
            p3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );

        jp1.add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 140));

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p4MousePressed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Settings_52px.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Settings");

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p4Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap())
        );

        jp1.add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 170, 140));

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p5MousePressed(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Info_52px.png"))); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 102));
        jLabel17.setText("About");

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addContainerGap())
        );

        jp1.add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 170, 140));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                p6MousePressed(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Shutdown_52px_1.png"))); // NOI18N

        jLabel46.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(0, 102, 102));
        jLabel46.setText("Exit");

        javax.swing.GroupLayout p6Layout = new javax.swing.GroupLayout(p6);
        p6.setLayout(p6Layout);
        p6Layout.setHorizontalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        p6Layout.setVerticalGroup(
            p6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p6Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel46)
                .addContainerGap())
        );

        jp1.add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 170, 140));

        root.add(jp1, "card2");

        jp2.setBackground(new java.awt.Color(0, 153, 255));
        jp2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bp1.setBackground(new java.awt.Color(255, 255, 255));
        bp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bp1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bp1MousePressed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Home_48px_1.png"))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 102, 102));
        jLabel33.setText("Home");

        javax.swing.GroupLayout bp1Layout = new javax.swing.GroupLayout(bp1);
        bp1.setLayout(bp1Layout);
        bp1Layout.setHorizontalGroup(
            bp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bp1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(bp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        bp1Layout.setVerticalGroup(
            bp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jp2.add(bp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 120, 170, 140));

        bp4.setBackground(new java.awt.Color(255, 255, 255));
        bp4.setPreferredSize(new java.awt.Dimension(170, 140));
        bp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bp4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bp4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bp4MousePressed(evt);
            }
        });

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Borrow Book_52px_1.png"))); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(0, 102, 102));
        jLabel35.setText("Issue");

        javax.swing.GroupLayout bp4Layout = new javax.swing.GroupLayout(bp4);
        bp4.setLayout(bp4Layout);
        bp4Layout.setHorizontalGroup(
            bp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bp4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(bp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        bp4Layout.setVerticalGroup(
            bp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bp4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel35)
                .addContainerGap())
        );

        jp2.add(bp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 140));

        bp2.setBackground(new java.awt.Color(255, 255, 255));
        bp2.setPreferredSize(new java.awt.Dimension(170, 140));
        bp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bp2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bp2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bp2MousePressed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(0, 102, 102));
        jLabel37.setText("Add Book");

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Book Stack_52px_3.png"))); // NOI18N

        javax.swing.GroupLayout bp2Layout = new javax.swing.GroupLayout(bp2);
        bp2.setLayout(bp2Layout);
        bp2Layout.setHorizontalGroup(
            bp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bp2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel37)
                .addGap(27, 27, 27))
        );
        bp2Layout.setVerticalGroup(
            bp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(bp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel37)
                .addContainerGap())
        );

        jp2.add(bp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 170, 140));

        bp3.setBackground(new java.awt.Color(255, 255, 255));
        bp3.setPreferredSize(new java.awt.Dimension(170, 140));
        bp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bp3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bp3MousePressed(evt);
            }
        });

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/View Details_50px.png"))); // NOI18N

        jLabel40.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(0, 102, 102));
        jLabel40.setText("View Book");

        javax.swing.GroupLayout bp3Layout = new javax.swing.GroupLayout(bp3);
        bp3.setLayout(bp3Layout);
        bp3Layout.setHorizontalGroup(
            bp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bp3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        bp3Layout.setVerticalGroup(
            bp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel40)
                .addContainerGap())
        );

        jp2.add(bp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 170, 140));

        bp5.setBackground(new java.awt.Color(255, 255, 255));
        bp5.setPreferredSize(new java.awt.Dimension(170, 140));
        bp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bp5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bp5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bp5MousePressed(evt);
            }
        });

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Return Book_52px_4.png"))); // NOI18N

        jLabel42.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(0, 102, 102));
        jLabel42.setText("Return/Renew");

        javax.swing.GroupLayout bp5Layout = new javax.swing.GroupLayout(bp5);
        bp5.setLayout(bp5Layout);
        bp5Layout.setHorizontalGroup(
            bp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp5Layout.createSequentialGroup()
                .addGroup(bp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bp5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel42))
                    .addGroup(bp5Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel41)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        bp5Layout.setVerticalGroup(
            bp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel42)
                .addGap(6, 6, 6))
        );

        jp2.add(bp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 170, 140));

        bp6.setBackground(new java.awt.Color(255, 255, 255));
        bp6.setPreferredSize(new java.awt.Dimension(170, 140));
        bp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bp6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bp6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bp6MousePressed(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Health Book_50px_2.png"))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(0, 102, 102));
        jLabel44.setText("Update/Delete");

        javax.swing.GroupLayout bp6Layout = new javax.swing.GroupLayout(bp6);
        bp6.setLayout(bp6Layout);
        bp6Layout.setHorizontalGroup(
            bp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(bp6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel43)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bp6Layout.setVerticalGroup(
            bp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bp6Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel44)
                .addContainerGap())
        );

        jp2.add(bp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 170, 140));

        root.add(jp2, "card3");

        jPanel6.setBackground(new java.awt.Color(0, 102, 153));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mp1.setBackground(new java.awt.Color(255, 255, 255));
        mp1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mp1MousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Home_48px_1.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Home");

        javax.swing.GroupLayout mp1Layout = new javax.swing.GroupLayout(mp1);
        mp1.setLayout(mp1Layout);
        mp1Layout.setHorizontalGroup(
            mp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mp1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(mp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mp1Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mp1Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
        );
        mp1Layout.setVerticalGroup(
            mp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel6.add(mp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 170, 140));

        mp2.setBackground(new java.awt.Color(255, 255, 255));
        mp2.setPreferredSize(new java.awt.Dimension(170, 140));
        mp2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mp2MousePressed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Add Member");

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Add User Group Man Man_50px_4.png"))); // NOI18N

        javax.swing.GroupLayout mp2Layout = new javax.swing.GroupLayout(mp2);
        mp2.setLayout(mp2Layout);
        mp2Layout.setHorizontalGroup(
            mp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mp2Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mp2Layout.setVerticalGroup(
            mp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(mp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addContainerGap())
        );

        jPanel6.add(mp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 170, 140));

        mp3.setBackground(new java.awt.Color(255, 255, 255));
        mp3.setPreferredSize(new java.awt.Dimension(170, 140));
        mp3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mp3MousePressed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Find User Male_52px.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(0, 102, 102));
        jLabel25.setText("View Member");

        javax.swing.GroupLayout mp3Layout = new javax.swing.GroupLayout(mp3);
        mp3.setLayout(mp3Layout);
        mp3Layout.setHorizontalGroup(
            mp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mp3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mp3Layout.setVerticalGroup(
            mp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25)
                .addContainerGap())
        );

        jPanel6.add(mp3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 170, 140));

        mp4.setBackground(new java.awt.Color(255, 255, 255));
        mp4.setPreferredSize(new java.awt.Dimension(170, 140));
        mp4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp4MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mp4MousePressed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Change User Male_50px.png"))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 102));
        jLabel27.setText("Update");

        javax.swing.GroupLayout mp4Layout = new javax.swing.GroupLayout(mp4);
        mp4.setLayout(mp4Layout);
        mp4Layout.setHorizontalGroup(
            mp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mp4Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(mp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );
        mp4Layout.setVerticalGroup(
            mp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mp4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel27)
                .addContainerGap())
        );

        jPanel6.add(mp4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 170, 140));

        mp5.setBackground(new java.awt.Color(255, 255, 255));
        mp5.setPreferredSize(new java.awt.Dimension(170, 140));
        mp5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp5MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mp5MousePressed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Remove User Male_52px_2.png"))); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("Delete");

        javax.swing.GroupLayout mp5Layout = new javax.swing.GroupLayout(mp5);
        mp5.setLayout(mp5Layout);
        mp5Layout.setHorizontalGroup(
            mp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp5Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(mp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        mp5Layout.setVerticalGroup(
            mp5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addContainerGap())
        );

        jPanel6.add(mp5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 170, 140));

        mp6.setBackground(new java.awt.Color(255, 255, 255));
        mp6.setPreferredSize(new java.awt.Dimension(170, 140));
        mp6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mp6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mp6MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mp6MousePressed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/library/lms/Main/Info_52px.png"))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 102, 102));
        jLabel31.setText("About");

        javax.swing.GroupLayout mp6Layout = new javax.swing.GroupLayout(mp6);
        mp6.setLayout(mp6Layout);
        mp6Layout.setHorizontalGroup(
            mp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp6Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(mp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        mp6Layout.setVerticalGroup(
            mp6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mp6Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addContainerGap())
        );

        jPanel6.add(mp6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 170, 140));

        javax.swing.GroupLayout jp3Layout = new javax.swing.GroupLayout(jp3);
        jp3.setLayout(jp3Layout);
        jp3Layout.setHorizontalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1041, Short.MAX_VALUE)
            .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE))
        );
        jp3Layout.setVerticalGroup(
            jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(jp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );

        root.add(jp3, "card4");

        jPanel7.setBackground(new java.awt.Color(0, 153, 153));

        jPanel8.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("@Settings");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(34, 34, 34))
        );

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("AdminId");

        t1.setBackground(new java.awt.Color(0, 153, 153));
        t1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t1.setForeground(new java.awt.Color(255, 255, 255));
        t1.setBorder(null);

        jLabel47.setBackground(new java.awt.Color(255, 255, 255));
        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 0, 0));
        jLabel47.setText("Password");

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 0, 0));
        jLabel48.setText("NewPassword");

        jLabel49.setBackground(new java.awt.Color(255, 255, 255));
        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(102, 0, 0));
        jLabel49.setText("E-mail");

        t4.setBackground(new java.awt.Color(0, 153, 153));
        t4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t4.setForeground(new java.awt.Color(255, 255, 255));
        t4.setBorder(null);

        b1.setBackground(new java.awt.Color(0, 153, 51));
        b1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("Update");
        b1.setToolTipText("");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        t2.setBackground(new java.awt.Color(0, 153, 153));
        t2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        t2.setForeground(new java.awt.Color(255, 255, 255));
        t2.setBorder(null);

        t3.setBackground(new java.awt.Color(0, 153, 153));
        t3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        t3.setForeground(new java.awt.Color(255, 255, 255));
        t3.setBorder(null);

        t5.setBackground(new java.awt.Color(0, 153, 153));
        t5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        t5.setForeground(new java.awt.Color(255, 255, 255));
        t5.setBorder(null);

        jLabel50.setBackground(new java.awt.Color(255, 255, 255));
        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(102, 0, 0));
        jLabel50.setText("Epassword");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel15))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel48)
                            .addComponent(jLabel50))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator4)
                        .addComponent(t4, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                        .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator6)
                        .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(t2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(353, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel15))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jp4Layout = new javax.swing.GroupLayout(jp4);
        jp4.setLayout(jp4Layout);
        jp4Layout.setHorizontalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jp4Layout.setVerticalGroup(
            jp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        root.add(jp4, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(root, javax.swing.GroupLayout.PREFERRED_SIZE, 1041, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(root, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(sidePane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setColor(JPanel panel) {
        panel.setBackground(new Color(197, 197, 197));
    }

    public void reSetColor(JPanel panel) {
        panel.setBackground(new Color(255, 255, 255));
    }


    private void btn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MousePressed
        setSidePane(btn1);
        bb1.setOpaque(true);
        jp1.setVisible(true);
        jp2.setVisible(false);
        jp4.setVisible(false);
        jp3.setVisible(false);
        reSetSidePane(new JPanel[]{btn2, btn3, btn4}, new JPanel[]{bb2, bb3, bb4});
    }//GEN-LAST:event_btn1MousePressed

    private void btn2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousePressed
        setSidePane(btn2);
        bb2.setOpaque(true);
        jp1.setVisible(false);
        jp4.setVisible(false);
        jp2.setVisible(true);
        jp3.setVisible(false);
        reSetSidePane(new JPanel[]{btn1, btn3, btn4}, new JPanel[]{bb1, bb3, bb4});
    }//GEN-LAST:event_btn2MousePressed

    private void btn3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MousePressed
        setSidePane(btn3);
        bb3.setOpaque(true);
        jp1.setVisible(false);
        jp4.setVisible(false);
        jp2.setVisible(false);
        jp3.setVisible(true);

        reSetSidePane(new JPanel[]{btn1, btn2, btn4}, new JPanel[]{bb1, bb2, bb4});
    }//GEN-LAST:event_btn3MousePressed

    private void btn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousePressed
        setSidePane(btn4);
        bb4.setOpaque(true);

        jp2.setVisible(false);
        jp3.setVisible(false);
        jp1.setVisible(false);
        jp4.setVisible(true);

        reSetSidePane(new JPanel[]{btn1, btn3, btn2}, new JPanel[]{bb1, bb3, bb2});


    }//GEN-LAST:event_btn4MousePressed

    private void bp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp1MouseEntered

        setColor(bp1);
    }//GEN-LAST:event_bp1MouseEntered

    private void bp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp1MouseExited

        reSetColor(bp1);
    }//GEN-LAST:event_bp1MouseExited


    private void bp1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp1MousePressed
        try {

            setSidePane(btn1);
            bb1.setOpaque(true);
            reSetSidePane(new JPanel[]{btn2, btn3, btn4}, new JPanel[]{bb2, bb3, bb4});

            jp2.setVisible(false);
            jp3.setVisible(false);
            jp1.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bp1MousePressed

    private void bp4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp4MouseEntered

        setColor(bp4);
    }//GEN-LAST:event_bp4MouseEntered

    private void bp4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp4MouseExited

        reSetColor(bp4);
    }//GEN-LAST:event_bp4MouseExited

    private void bp4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp4MousePressed
        try {

            new Issue().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bp4MousePressed

    private void bp2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp2MouseEntered

        setColor(bp2);
    }//GEN-LAST:event_bp2MouseEntered

    private void bp2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp2MouseExited

        reSetColor(bp2);
    }//GEN-LAST:event_bp2MouseExited

    private void bp2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp2MousePressed
        try {

            new AddBook().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bp2MousePressed

    private void bp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp3MouseEntered

        setColor(bp3);
    }//GEN-LAST:event_bp3MouseEntered

    private void bp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp3MouseExited

        reSetColor(bp3);
    }//GEN-LAST:event_bp3MouseExited

    private void bp3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp3MousePressed
        try {

            new ViewBook().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bp3MousePressed

    private void bp5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp5MouseEntered

        setColor(bp5);
    }//GEN-LAST:event_bp5MouseEntered

    private void bp5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp5MouseExited

        reSetColor(bp5);
    }//GEN-LAST:event_bp5MouseExited

    private void bp6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp6MouseEntered

        setColor(bp6);
    }//GEN-LAST:event_bp6MouseEntered

    private void bp6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp6MouseExited

        reSetColor(bp6);
    }//GEN-LAST:event_bp6MouseExited

    private void mp1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp1MousePressed
        try {

            setSidePane(btn1);
            bb1.setOpaque(true);
            reSetSidePane(new JPanel[]{btn2, btn3, btn4}, new JPanel[]{bb2, bb3, bb4});

            jp2.setVisible(false);

            jp3.setVisible(false);
            jp1.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mp1MousePressed

    private void mp2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp2MouseEntered

        setColor(mp2);
    }//GEN-LAST:event_mp2MouseEntered

    private void mp2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp2MouseExited

        reSetColor(mp2);
    }//GEN-LAST:event_mp2MouseExited

    private void mp2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp2MousePressed
        try {

            new AddMember().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mp2MousePressed

    private void mp3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp3MouseEntered

        setColor(mp3);
    }//GEN-LAST:event_mp3MouseEntered

    private void mp3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp3MouseExited

        reSetColor(mp3);
    }//GEN-LAST:event_mp3MouseExited

    private void mp3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp3MousePressed
        try {

            new ViewMember().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mp3MousePressed

    private void mp4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp4MouseEntered

        setColor(mp4);
    }//GEN-LAST:event_mp4MouseEntered

    private void mp4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp4MouseExited

        reSetColor(mp4);
    }//GEN-LAST:event_mp4MouseExited

    private void mp4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp4MousePressed
        try {

            new UpdateDeleteMember().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mp4MousePressed

    private void mp5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp5MouseEntered

        setColor(mp5);
    }//GEN-LAST:event_mp5MouseEntered

    private void mp5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp5MouseExited

        reSetColor(mp5);
    }//GEN-LAST:event_mp5MouseExited

    private void mp6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp6MouseEntered

        setColor(mp6);
    }//GEN-LAST:event_mp6MouseEntered

    private void mp6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp6MouseExited

        reSetColor(mp6);
    }//GEN-LAST:event_mp6MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        //Extra

    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        //Extre


    }//GEN-LAST:event_jPanel6MouseExited

    private void mp1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp1MouseEntered
        setColor(mp1);
    }//GEN-LAST:event_mp1MouseEntered

    private void mp1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp1MouseExited

        reSetColor(mp1);

    }//GEN-LAST:event_mp1MouseExited

    private void bp5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp5MousePressed

        try {
            new ReturnRenewBook().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bp5MousePressed

    private void bp6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bp6MousePressed

        try {
            new UpdateDeleteBook().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_bp6MousePressed

    private void mp5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp5MousePressed
        try {
            new UpdateDeleteMember().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mp5MousePressed

    private void mp6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mp6MousePressed
        new About().show();
    }//GEN-LAST:event_mp6MousePressed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        String admin = t1.getText();
        String password = t2.getText();
        String newpassword = t3.getText();
        String email = t4.getText();
        String epassword = t5.getText();
        if (admin.equals("") || password.equals("") || newpassword.equals("") || email.equals("") || epassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Fill All the Fields", "Error", HEIGHT);

            return;
        }
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(null, "Please check E-mail Id", "Error", HEIGHT);
            return;

        } else {
            ResultSet rs = dbh.getData("select * from LoginLms");
            try {
                rs.next();

                String adminA = rs.getString("username");
                String passwordP = rs.getString("password");

                if (adminA.equals(admin) && passwordP.equals(password)) {
                    String q = "update  loginLms set username =" + "'" + admin + "',password=" + "'" + newpassword + "',email=" + "'" + email + "',epassword=" + "'" + epassword + "'";

                    if (dbh.isExeQuery(q)) {
                        JOptionPane.showMessageDialog(null, "Data Updated");
                        t1.setText("");
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                    } else {
                        JOptionPane.showMessageDialog(null, "Data Not Updated");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Please Fill Correct user Id or Password", "Error", HEIGHT);
                    return;

                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }

        }

    }//GEN-LAST:event_b1ActionPerformed

    private void p6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MousePressed
        System.exit(0);
    }//GEN-LAST:event_p6MousePressed

    private void p6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseExited

        reSetColor(p6);
    }//GEN-LAST:event_p6MouseExited

    private void p6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p6MouseEntered

        setColor(p6);
    }//GEN-LAST:event_p6MouseEntered

    private void p5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MousePressed

        new About().show();

    }//GEN-LAST:event_p5MousePressed

    private void p5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseExited

        reSetColor(p5);
    }//GEN-LAST:event_p5MouseExited

    private void p5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p5MouseEntered

        setColor(p5);
    }//GEN-LAST:event_p5MouseEntered

    private void p4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MousePressed
        try {

            setSidePane(btn4);
            bb4.setOpaque(true);
            reSetSidePane(new JPanel[]{btn2, btn3, btn1}, new JPanel[]{bb2, bb3, bb1});

            jp2.setVisible(false);
            jp3.setVisible(false);
            jp1.setVisible(false);
            jp4.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p4MousePressed

    private void p4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseExited

        reSetColor(p4);
    }//GEN-LAST:event_p4MouseExited

    private void p4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p4MouseEntered

        setColor(p4);
    }//GEN-LAST:event_p4MouseEntered

    private void p3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MousePressed
        try {

            new MyGame().show();
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p3MousePressed

    private void p3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseExited

        reSetColor(p3);
    }//GEN-LAST:event_p3MouseExited

    private void p3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p3MouseEntered

        setColor(p3);
    }//GEN-LAST:event_p3MouseEntered

    private void p2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MousePressed
        try {

            setSidePane(btn3);
            bb3.setOpaque(true);
            reSetSidePane(new JPanel[]{btn1, btn2, btn4}, new JPanel[]{bb1, bb2, bb4});

            jp1.setVisible(false);
            jp2.setVisible(false);
            jp3.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p2MousePressed

    private void p2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseExited

        reSetColor(p2);
    }//GEN-LAST:event_p2MouseExited

    private void p2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p2MouseEntered

        setColor(p2);
    }//GEN-LAST:event_p2MouseEntered

    //Pane 1
    private void p1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MousePressed
        try {

            setSidePane(btn2);
            bb2.setOpaque(true);
            reSetSidePane(new JPanel[]{btn1, btn3, btn4}, new JPanel[]{bb1, bb3, bb4});
            jp1.setVisible(false);
            jp3.setVisible(false);
            jp2.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_p1MousePressed

    private void p1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseExited

        reSetColor(p1);
    }//GEN-LAST:event_p1MouseExited

    private void p1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p1MouseEntered

        setColor(p1);
    }//GEN-LAST:event_p1MouseEntered

    private void setSidePane(JPanel pan) {

        pan.setBackground(new Color(41, 57, 80));
    }

    private void reSetSidePane(JPanel[] pan, JPanel[] pan2) {

        for (int i = 0; i < pan.length; i++) {
            pan[i].setBackground(new Color(23, 35, 51));
        }

        for (int i = 0; i < pan2.length; i++) {
            pan2[i].setOpaque(false);
        }
    }

    public boolean isValidEmail(String email) {
        // boolean stricterFilter = true; 
        String stricterFilterString = "[A-Z0-9a-z._%+-]{6,50}+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}";
        // String laxString = ".+@.+\\.[A-Za-z]{2}[A-Za-z]*";
        String emailRegex = stricterFilterString;//: laxString;
        Pattern p = Pattern.compile(emailRegex);
        Matcher m = p.matcher(email);
        return m.matches();
    }

    public static void main(String args[]) throws Exception {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Main().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JPanel bb1;
    private javax.swing.JPanel bb2;
    private javax.swing.JPanel bb3;
    private javax.swing.JPanel bb4;
    private javax.swing.JPanel bp1;
    private javax.swing.JPanel bp2;
    private javax.swing.JPanel bp3;
    private javax.swing.JPanel bp4;
    private javax.swing.JPanel bp5;
    private javax.swing.JPanel bp6;
    private javax.swing.JPanel btn1;
    private javax.swing.JPanel btn2;
    private javax.swing.JPanel btn3;
    private javax.swing.JPanel btn4;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JPanel jp1;
    private javax.swing.JPanel jp2;
    private javax.swing.JPanel jp3;
    private javax.swing.JPanel jp4;
    private javax.swing.JPanel mp1;
    private javax.swing.JPanel mp2;
    private javax.swing.JPanel mp3;
    private javax.swing.JPanel mp4;
    private javax.swing.JPanel mp5;
    private javax.swing.JPanel mp6;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel root;
    private javax.swing.JPanel sidePane;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    private javax.swing.JPasswordField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables

}
