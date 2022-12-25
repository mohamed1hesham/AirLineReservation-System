
package airline.reservation;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class NewJFrame extends javax.swing.JFrame {
    public NewJFrame() {
        initComponents();
        table_update();
        table_update1();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pn1 = new javax.swing.JTextField();
        rd = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        fd = new javax.swing.JTextField();
        od = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cls = new javax.swing.JComboBox<>();
        bc = new javax.swing.JComboBox<>();
        ft = new javax.swing.JComboBox<>();
        tf = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        sc = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        pa = new javax.swing.JTextField();
        pno = new javax.swing.JTextField();
        ps = new javax.swing.JComboBox<>();
        scrollbar1 = new java.awt.Scrollbar();
        scrollbar2 = new java.awt.Scrollbar();
        scrollbar4 = new java.awt.Scrollbar();
        scrollbar5 = new java.awt.Scrollbar();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        scrollbar6 = new java.awt.Scrollbar();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setForeground(new java.awt.Color(153, 255, 153));
        jPanel1.setToolTipText("H");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("AIRLINE RESERVATION SYSTEM");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("RESERVATION FORM");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel5.setText("RESERVATION DETAILS");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel6.setText("RESERV DATE:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel7.setText("PNR NO:");

        pn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pn1ActionPerformed(evt);
            }
        });

        rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel8.setText("FLIGHT DATE:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("ORIGIN DEST:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("BRANCH CODE:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel11.setText("TICKET FARE:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("SERVICE CODE:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel13.setText("FLIGHT TYPE:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel14.setText("TOTAL FARE:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel15.setText("CLASS:");

        cls.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "A", "B", "C", "D" }));

        bc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BRANCH_CODE", "11", "22", "33", "44", "55", "" }));

        ft.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flight Type", "Airbus A-330", "Airbus A-380", "C17 Globrmaster", "C-5 GALAXY" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel16.setText("PASSENGER DETAILS");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel17.setText("PASSENGER NAME:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel18.setText("PASSENGER ADDRESS:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel19.setText("PASSPORT NO:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel20.setText("PASSENGER STATUS:");

        ps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Passenger Status", "Confirmed", "Not Confirmed" }));

        scrollbar1.setBlockIncrement(0);
        scrollbar1.setName("HFJ"); // NOI18N
        scrollbar1.setOrientation(java.awt.Scrollbar.HORIZONTAL);

        scrollbar2.setOrientation(java.awt.Scrollbar.HORIZONTAL);

        scrollbar4.setOrientation(java.awt.Scrollbar.HORIZONTAL);

        scrollbar5.setOrientation(java.awt.Scrollbar.HORIZONTAL);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("SAVE");

        jButton3.setText("EDIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Reset");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("PRINT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("EXIT");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("FIND");

        jButton9.setText("LAST");

        jButton10.setText("PREVIOUS");

        jButton11.setText("NEXT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setText("FIRST");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PNR NO", "Flight Date", "Origin Dest", "Class", "Branch code", "Ticket fare", "Service code", "Flight Type", "Total fare", "Reserv date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        scrollbar6.setOrientation(java.awt.Scrollbar.HORIZONTAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Reservation Table");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Passenger name", "Passenger Address", "Passport NO.", "Passenger Status", "Pnr_no"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Passenger Table");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/LOGO.png"))); // NOI18N
        jLabel22.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel15)
                                                .addComponent(jLabel16))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGap(28, 28, 28)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(rd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGap(33, 33, 33)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel11)
                                                                .addComponent(jLabel10)))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(fd, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                    .addComponent(cls, javax.swing.GroupLayout.Alignment.LEADING, 0, 143, Short.MAX_VALUE)
                                                                    .addComponent(od, javax.swing.GroupLayout.Alignment.LEADING)))
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel13)
                                                                .addComponent(jLabel12)
                                                                .addComponent(jLabel14)))))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(ps, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addGap(18, 18, 18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel18)
                                            .addGap(295, 295, 295)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGap(119, 119, 119)
                                                .addComponent(pno, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tf)
                                            .addComponent(bc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sc)
                                            .addComponent(ft, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(scrollbar4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scrollbar6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(scrollbar5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(scrollbar2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(scrollbar1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(94, 94, 94)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane2)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel21)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(482, 482, 482))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel17)
                                        .addGap(23, 23, 23))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel19)
                                            .addComponent(jLabel20))
                                        .addGap(12, 12, 12)))
                                .addComponent(pa, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel22)
                        .addGap(405, 405, 405)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(17, 17, 17)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(pn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(fd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(od, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(cls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(21, 21, 21)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(32, 32, 32)
                                .addComponent(tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(sc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(ft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(tf2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(scrollbar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(scrollbar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(scrollbar4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(pa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(pno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollbar6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel20))
                    .addComponent(scrollbar5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton9)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection conn=null;
PreparedStatement insert;
private void table_update1(){
int c;
    try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","3571596482");
                 insert= conn.prepareStatement("select * from passenger_table");
               ResultSet rs=insert.executeQuery();
               ResultSetMetaData rss=rs.getMetaData();
               c=rss.getColumnCount();
               DefaultTableModel Df=(DefaultTableModel)jTable2.getModel();
               Df.setRowCount(0);
               while(rs.next()){
                   Vector v2 =new Vector();
                   for(int a=1;a<=c;a++){
                       v2.add(rs.getString("passenger_name"));
                       v2.add(rs.getString("passenger_address"));
                       v2.add(rs.getString("passport_no"));
                       v2.add(rs.getString("passenger_status"));
                       v2.add(rs.getString("pnr_no"));
                   }
                   Df.addRow(v2);
               }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Please all data is needed");
        }
}
private void table_update(){
    int c;
    try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","3571596482");
                 insert= conn.prepareStatement("select * from reservation_table");
               ResultSet rs=insert.executeQuery();
               ResultSetMetaData rss=rs.getMetaData();
               c=rss.getColumnCount();
               DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
               Df.setRowCount(0);
               while(rs.next()){
                   Vector v2 =new Vector();
                   for(int a=1;a<=c;a++){
                       v2.add(rs.getString("pnr_no"));
                       v2.add(rs.getString("flight_date"));
                       v2.add(rs.getString("origin_dest"));
                       v2.add(rs.getString("classify"));
                       v2.add(rs.getString("branch_code"));
                       v2.add(rs.getString("ticket_fare"));
                       v2.add(rs.getString("service_code"));
                       v2.add(rs.getString("flight_type"));
                       v2.add(rs.getString("total_fare"));
                       v2.add(rs.getString("reserv_date"));
                   }
                   Df.addRow(v2);
               }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Please all data is needed");
        }
}
    private void pn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pn1ActionPerformed

    private void rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       
        String pnr_no=pn1.getText();
        String reserv_date=rd.getText();
        String flight_date=fd.getText();
        String origin_dest=od.getText();
        String clss=cls.getSelectedItem().toString();
        String branch_code=bc.getSelectedItem().toString();
        String ticket_fare=tf.getText();
        String service_code=sc.getText();
        String flight_type=ft.getSelectedItem().toString();
        String total_fare=tf2.getText();
        
        
        String passenger_name=pname.getText();
        String passenger_address=pa.getText();
        String passport_no=pno.getText();
        String passenger_status=ps.getSelectedItem().toString();
        
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","3571596482");
           
                 insert= conn.prepareStatement("insert into reservation_table(pnr_no,reserv_date,flight_date,origin_dest,classify,branch_code,ticket_fare,service_code,flight_type,total_fare)values(?,?,?,?,?,?,?,?,?,?)");
                 insert.setString(1, pnr_no);
                 insert.setString(2, reserv_date);
                 insert.setString(3, flight_date);
                 insert.setString(4, origin_dest);
                 insert.setString(5, clss);
                 insert.setString(6, branch_code);
                 insert.setString(7, ticket_fare);
                 insert.setString(8, service_code);
                 insert.setString(9, flight_type);
                 insert.setString(10, total_fare);
                 insert.executeUpdate();
                 insert= conn.prepareStatement("insert into passenger_table(passenger_name,passenger_address,passport_no,passenger_status,pnr_no)values(?,?,?,?,?)");
                 insert.setString(1, passenger_name);
                 insert.setString(2, passenger_address);
                 insert.setString(3, passport_no);
                 insert.setString(4, passenger_status);
                 insert.setString(5, pnr_no);
                 insert.executeUpdate();
            JOptionPane.showMessageDialog(this,"Record Added");
            table_update();
            table_update1();
            pn1.setText("");
            rd.setText("");
            fd.setText("");
            od.setText("");
            cls.setSelectedItem("Class");
            bc.setSelectedItem("BRANCH_CODE");
            tf.setText("");
            sc.setText("");
            ft.setSelectedItem("Flight Type");
            tf2.setText("");
            pname.setText("");
            pa.setText("");
            pno.setText("");
            ps.setSelectedItem("Passenger Status");
            rd.requestFocus();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Please insert a correct data.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
            pn1.setText("");
            rd.setText("");
            fd.setText("");
            od.setText("");
            cls.setSelectedItem("Class");
            bc.setSelectedItem("BRANCH_CODE");
            tf.setText("");
            sc.setText("");
            ft.setSelectedItem("Flight Type");
            tf2.setText("");
            pname.setText("");
            pa.setText("");
            pno.setText("");
            ps.setSelectedItem("Passenger Status");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        DefaultTableModel Df=(DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
            pn1.setText(Df.getValueAt(selectIndex,0).toString());
            fd.setText(Df.getValueAt(selectIndex,1).toString());
            od.setText(Df.getValueAt(selectIndex,2).toString());
            cls.setSelectedItem(Df.getValueAt(selectIndex,3).toString());
            bc.setSelectedItem(Df.getValueAt(selectIndex,4).toString());
            tf.setText(Df.getValueAt(selectIndex,5).toString());
            sc.setText(Df.getValueAt(selectIndex,6).toString());
            ft.setSelectedItem(Df.getValueAt(selectIndex,7).toString());
            tf2.setText(Df.getValueAt(selectIndex,8).toString());
            rd.setText(Df.getValueAt(selectIndex, 9).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel Df=(DefaultTableModel)jTable2.getModel();
        int selectIndex = jTable2.getSelectedRow();
        pname.setText(Df.getValueAt(selectIndex,0).toString());
        pa.setText(Df.getValueAt(selectIndex,1).toString());
        pno.setText(Df.getValueAt(selectIndex,2).toString());
        ps.setSelectedItem(Df.getValueAt(selectIndex,3).toString());
        pn1.setText(Df.getValueAt(selectIndex,4).toString());
        
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        try{
            String pnr_no=pn1.getText();
            String reserv_date=rd.getText();
            String flight_date=fd.getText();
            String origin_dest=od.getText();
            String clss=cls.getSelectedItem().toString();
            String branch_code=bc.getSelectedItem().toString();
            String ticket_fare=tf.getText();
            String service_code=sc.getText();
            String flight_type=ft.getSelectedItem().toString();
            String total_fare=tf2.getText();
            
        String passenger_name=pname.getText();
        String passenger_address=pa.getText();
        String passport_no=pno.getText();
        String passenger_status=ps.getSelectedItem().toString();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","3571596482");
           if(pnr_no!=null){
               insert= conn.prepareStatement("update reservation_table set reserv_date=?,flight_date=?,origin_dest=?,classify=?,branch_code=?,ticket_fare=?,service_code=?,flight_type=?,total_fare=? where pnr_no=?");
           
                 insert.setString(1, reserv_date);
                 insert.setString(10, pnr_no);
                 insert.setString(2, flight_date);
                 insert.setString(3, origin_dest);
                 insert.setString(4, clss);
                 insert.setString(5, branch_code);
                 insert.setString(6, ticket_fare);
                 insert.setString(7, service_code);
                 insert.setString(8, flight_type);
                 insert.setString(9, total_fare);
                 insert.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Record Updated");
                 }
           if(passport_no!=null){
               
                 insert= conn.prepareStatement("update passenger_table set passenger_name=?,passenger_address=?,passenger_status=? where passport_no=? "); 
                 insert.setString(1, passenger_name);
                 insert.setString(2, passenger_address);
                 insert.setString(3, passenger_status);
                 insert.setString(4, passport_no);
                 insert.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Record Updated");
        }
             
            table_update();
            table_update1();
            pn1.setText("");
            rd.setText("");
            fd.setText("");
            od.setText("");
            cls.setSelectedItem("Class");
            bc.setSelectedItem("BRANCH_CODE");
            tf.setText("");
            sc.setText("");
            ft.setSelectedItem("Flight Type");
            tf2.setText("");
            pname.setText("");
            pa.setText("");
            pno.setText("");
            ps.setSelectedItem("Passenger Status");
            rd.requestFocus();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Please all data is needed");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       
        try{
          String pnr_no=pn1.getText();
            int dialogResult=JOptionPane.showConfirmDialog(null, "Do You Want to Delete the record","warning",JOptionPane.YES_NO_OPTION );
            if(dialogResult== JOptionPane.YES_OPTION){
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testing","root","3571596482");
               insert= conn.prepareStatement("delete from reservation_table where reservation_table.pnr_no=?");
               insert.setString(1, pnr_no);
               insert.executeUpdate();
               insert= conn.prepareStatement("delete from passenger_table where passenger_table.pnr_no=?");
               insert.setString(1, pnr_no);
                 insert.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Record Deleted");
                table_update();
            table_update1();
            pn1.setText("");
            rd.setText("");
            fd.setText("");
            od.setText("");
            cls.setSelectedItem("Class");
            bc.setSelectedItem("BRANCH_CODE");
            tf.setText("");
            sc.setText("");
            ft.setSelectedItem("Flight Type");
            tf2.setText("");
            pname.setText("");
            pa.setText("");
            pno.setText("");
            ps.setSelectedItem("Passenger Status");
            rd.requestFocus();
                
                
                
            }
            
            
          
        }catch(SQLException e){
            JOptionPane.showMessageDialog(this,"Not deleted");
        }
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
       int exit = JOptionPane.showConfirmDialog(null, "Do You want to Exit the program","warning",JOptionPane.YES_NO_OPTION );
       if(exit== JOptionPane.YES_OPTION){
            System.exit(0);
       }           
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            boolean print=jTable1.print();
            if(!print){
                JOptionPane.showMessageDialog(null,"Unable to print");
            }
            boolean print2=jTable2.print();
            if(!print2){
                JOptionPane.showMessageDialog(null,"Unable to print");
            }
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(null,ex.getMessage());
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
      
    }//GEN-LAST:event_jButton6ActionPerformed

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
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bc;
    private javax.swing.JComboBox<String> cls;
    private javax.swing.JTextField fd;
    private javax.swing.JComboBox<String> ft;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField od;
    private javax.swing.JTextField pa;
    private javax.swing.JTextField pn1;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField pno;
    private javax.swing.JComboBox<String> ps;
    private javax.swing.JTextField rd;
    private javax.swing.JTextField sc;
    private java.awt.Scrollbar scrollbar1;
    private java.awt.Scrollbar scrollbar2;
    private java.awt.Scrollbar scrollbar4;
    private java.awt.Scrollbar scrollbar5;
    private java.awt.Scrollbar scrollbar6;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
