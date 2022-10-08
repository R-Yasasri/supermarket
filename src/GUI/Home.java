package GUI;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Thilina
 */
public class Home extends javax.swing.JFrame implements Runnable {

    int x, y;
    JPanel p;
    static boolean maximized = true;
    public static String loggedInUserNIC;

    private static final int LEFT_MOUSE_BTN = 1;
    private int hour;
    private int minute;
    private int second;
    private int year;
    private int month;
    private int day;
    private String timeatr;
    private String yearatr;

    public Home() {
        initComponents();
        panel.removeAll();
        p = new Dashboard().mainPanel;
        p.setSize(panel.getSize());
        p.setBounds(panel.getBounds());
        panel.add(p);
        panel.repaint();

        icon();
        Thread t = new Thread(this);
        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        side_men7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        max_btn = new javax.swing.JLabel();
        cls_btn1 = new javax.swing.JLabel();
        min_btn2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        side_men1 = new javax.swing.JLabel();
        side_men4 = new javax.swing.JLabel();
        side_men3 = new javax.swing.JLabel();
        side_men5 = new javax.swing.JLabel();
        side_men6 = new javax.swing.JLabel();
        side_men8 = new javax.swing.JLabel();
        side_men9 = new javax.swing.JLabel();
        side_men10 = new javax.swing.JLabel();
        side_men11 = new javax.swing.JLabel();
        viewPanel = new javax.swing.JDesktopPane();
        panel = new javax.swing.JPanel();

        side_men7.setBackground(new java.awt.Color(0, 0, 0));
        side_men7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men7.setForeground(new java.awt.Color(255, 255, 255));
        side_men7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/accounting.png"))); // NOI18N
        side_men7.setText("Advanced Accounting");
        side_men7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men7MouseExited(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(25, 42, 86));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));

        jPanel4.setBackground(new java.awt.Color(25, 42, 86));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel1.setkEndColor(new java.awt.Color(25, 42, 86));
        jPanel1.setkGradientFocus(0);
        jPanel1.setkStartColor(new java.awt.Color(72, 126, 176));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Super Market Software");

        max_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        max_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                max_btnMouseClicked(evt);
            }
        });

        cls_btn1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cls_btn1.setForeground(new java.awt.Color(255, 255, 255));
        cls_btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cls_btn1.setText("X");
        cls_btn1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cls_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cls_btn1MouseClicked(evt);
            }
        });

        min_btn2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min_btn2.setForeground(new java.awt.Color(255, 255, 255));
        min_btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        min_btn2.setText("_");
        min_btn2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        min_btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                min_btn2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(min_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(max_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cls_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(max_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(cls_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(min_btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
        );

        kGradientPanel1.setkEndColor(new java.awt.Color(25, 42, 86));
        kGradientPanel1.setkStartColor(new java.awt.Color(72, 126, 176));

        side_men1.setBackground(new java.awt.Color(0, 0, 0));
        side_men1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men1.setForeground(new java.awt.Color(255, 255, 255));
        side_men1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/stock.png"))); // NOI18N
        side_men1.setText("Stocks");
        side_men1.setToolTipText("");
        side_men1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men1MouseExited(evt);
            }
        });

        side_men4.setBackground(new java.awt.Color(0, 0, 0));
        side_men4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men4.setForeground(new java.awt.Color(255, 255, 255));
        side_men4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/expenses.png"))); // NOI18N
        side_men4.setText("Expenses");
        side_men4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men4MouseExited(evt);
            }
        });

        side_men3.setBackground(new java.awt.Color(0, 0, 0));
        side_men3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men3.setForeground(new java.awt.Color(255, 255, 255));
        side_men3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/sales.png"))); // NOI18N
        side_men3.setText("Sales");
        side_men3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men3MouseExited(evt);
            }
        });

        side_men5.setBackground(new java.awt.Color(0, 0, 0));
        side_men5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men5.setForeground(new java.awt.Color(255, 255, 255));
        side_men5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/purchase.png"))); // NOI18N
        side_men5.setText("Returns & Removes");
        side_men5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men5MouseExited(evt);
            }
        });

        side_men6.setBackground(new java.awt.Color(0, 0, 0));
        side_men6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men6.setForeground(new java.awt.Color(255, 255, 255));
        side_men6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/reports.png"))); // NOI18N
        side_men6.setText("Reports");
        side_men6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men6MouseExited(evt);
            }
        });

        side_men8.setBackground(new java.awt.Color(0, 0, 0));
        side_men8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men8.setForeground(new java.awt.Color(255, 255, 255));
        side_men8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/supplier.png"))); // NOI18N
        side_men8.setText("Suppliers");
        side_men8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men8MouseExited(evt);
            }
        });

        side_men9.setBackground(new java.awt.Color(0, 0, 0));
        side_men9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men9.setForeground(new java.awt.Color(255, 255, 255));
        side_men9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/settings.png"))); // NOI18N
        side_men9.setText("Other");
        side_men9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men9MouseExited(evt);
            }
        });

        side_men10.setBackground(new java.awt.Color(0, 0, 0));
        side_men10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men10.setForeground(new java.awt.Color(255, 255, 255));
        side_men10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/dashboard.png"))); // NOI18N
        side_men10.setText("Dashboard");
        side_men10.setToolTipText("");
        side_men10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men10MouseExited(evt);
            }
        });

        side_men11.setBackground(new java.awt.Color(0, 0, 0));
        side_men11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        side_men11.setForeground(new java.awt.Color(255, 255, 255));
        side_men11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/user.png"))); // NOI18N
        side_men11.setText("Employee");
        side_men11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        side_men11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                side_men11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                side_men11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                side_men11MouseExited(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(side_men4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(side_men11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(side_men10, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men4, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men11, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men6, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(side_men8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(side_men9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(77, 77, 77))
        );

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        viewPanel.setLayer(panel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout viewPanelLayout = new javax.swing.GroupLayout(viewPanel);
        viewPanel.setLayout(viewPanelLayout);
        viewPanelLayout.setHorizontalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        viewPanelLayout.setVerticalGroup(
            viewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewPanel))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPanel)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        this.setLocation(xx - x, yy - y);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void side_men1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men1MouseEntered
        side_men1.setOpaque(true);
        side_men1.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men1MouseEntered

    private void side_men1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men1MouseExited
        side_men1.setOpaque(false);
        side_men1.setBackground(null);
    }//GEN-LAST:event_side_men1MouseExited

    private void side_men4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men4MouseEntered
        side_men4.setOpaque(true);
        side_men4.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men4MouseEntered

    private void side_men4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men4MouseExited
        side_men4.setOpaque(false);
        side_men4.setBackground(null);
    }//GEN-LAST:event_side_men4MouseExited

    private void side_men3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men3MouseEntered
        side_men3.setOpaque(true);
        side_men3.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men3MouseEntered

    private void side_men3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men3MouseExited
        side_men3.setOpaque(false);
        side_men3.setBackground(null);
    }//GEN-LAST:event_side_men3MouseExited

    private void side_men5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men5MouseEntered
        side_men5.setOpaque(true);
        side_men5.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men5MouseEntered

    private void side_men5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men5MouseExited
        side_men5.setOpaque(false);
        side_men5.setBackground(null);
    }//GEN-LAST:event_side_men5MouseExited

    private void side_men6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men6MouseEntered
        side_men6.setOpaque(true);
        side_men6.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men6MouseEntered

    private void side_men6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men6MouseExited
        side_men6.setOpaque(false);
        side_men6.setBackground(null);
    }//GEN-LAST:event_side_men6MouseExited

    private void side_men7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men7MouseEntered
        side_men7.setOpaque(true);
        side_men7.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men7MouseEntered

    private void side_men7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men7MouseExited
        side_men7.setOpaque(false);
        side_men7.setBackground(null);
    }//GEN-LAST:event_side_men7MouseExited

    private void side_men8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men8MouseEntered
        side_men8.setOpaque(true);
        side_men8.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men8MouseEntered

    private void side_men8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men8MouseExited
        side_men8.setOpaque(false);
        side_men8.setBackground(null);
    }//GEN-LAST:event_side_men8MouseExited

    private void cls_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cls_btn1MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            System.exit(0);
        }
    }//GEN-LAST:event_cls_btn1MouseClicked

    private void side_men9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men9MouseEntered
        side_men9.setOpaque(true);
        side_men9.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men9MouseEntered

    private void side_men9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men9MouseExited
        side_men9.setOpaque(false);
        side_men9.setBackground(null);
    }//GEN-LAST:event_side_men9MouseExited

    private void max_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_max_btnMouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            if (maximized) {

                Home.this.setExtendedState(JFrame.MAXIMIZED_BOTH);
                Dimension x = Home.this.getSize();
                int width = x.width - 235;
                int height = x.height - 36;
                x.setSize(width, height);
                panel.setSize(x);
                p.setSize(panel.getSize());
                maximized = false;

            } else {
                setExtendedState(JFrame.NORMAL);
                maximized = true;

                p.setSize(panel.getSize());
                panel.add(p);
                panel.repaint();
            }
        }


    }//GEN-LAST:event_max_btnMouseClicked

    private void side_men1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men1MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Stock().mainPanel;

            p.setSize(panel.getSize());

            p.setBounds(panel.getBounds());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men1MouseClicked

    private void side_men10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men10MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Dashboard().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }

    }//GEN-LAST:event_side_men10MouseClicked

    private void side_men10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men10MouseEntered
        side_men10.setOpaque(true);
        side_men10.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men10MouseEntered

    private void side_men10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men10MouseExited
        side_men10.setOpaque(false);
        side_men10.setBackground(null);
    }//GEN-LAST:event_side_men10MouseExited

    private void side_men3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men3MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Sales().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men3MouseClicked

    private void side_men4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men4MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Expenses().mainPanel;
            p.setSize(panel.getSize());
            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men4MouseClicked

    private void side_men5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men5MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Purchase().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men5MouseClicked

    private void side_men6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men6MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Reports().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men6MouseClicked

    private void side_men7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men7MouseClicked
        
    }//GEN-LAST:event_side_men7MouseClicked

    private void side_men8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men8MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Suppliers().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men8MouseClicked

    private void side_men9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men9MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Other().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men9MouseClicked

    private void min_btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_min_btn2MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            this.setExtendedState(ICONIFIED);
        }
    }//GEN-LAST:event_min_btn2MouseClicked

    private void side_men11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men11MouseClicked
        if (evt.getButton() == LEFT_MOUSE_BTN) {
            panel.removeAll();
            p = new Employee().mainPanel;

            p.setSize(panel.getSize());

            panel.add(p);
            panel.repaint();
        }
    }//GEN-LAST:event_side_men11MouseClicked

    private void side_men11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men11MouseEntered
        side_men11.setOpaque(true);
        side_men11.setBackground(new java.awt.Color(0, 168, 255));
    }//GEN-LAST:event_side_men11MouseEntered

    private void side_men11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_side_men11MouseExited
        side_men11.setOpaque(false);
        side_men11.setBackground(null);
    }//GEN-LAST:event_side_men11MouseExited

    public static void main(String args[]) {

        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Windows".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            setLookAndFeel();

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cls_btn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel max_btn;
    private javax.swing.JLabel min_btn2;
    public static javax.swing.JPanel panel;
    private javax.swing.JLabel side_men1;
    private javax.swing.JLabel side_men10;
    private javax.swing.JLabel side_men11;
    private javax.swing.JLabel side_men3;
    private javax.swing.JLabel side_men4;
    private javax.swing.JLabel side_men5;
    private javax.swing.JLabel side_men6;
    private javax.swing.JLabel side_men7;
    private javax.swing.JLabel side_men8;
    private javax.swing.JLabel side_men9;
    public static javax.swing.JDesktopPane viewPanel;
    // End of variables declaration//GEN-END:variables

    public void run() {
        while (true) {
            try {
                Calendar c = Calendar.getInstance();
                hour = c.get(Calendar.HOUR_OF_DAY);
                minute = c.get(Calendar.MINUTE);
                second = c.get(Calendar.SECOND);
                second = c.get(Calendar.SECOND);
                year = c.get(Calendar.YEAR);
                month = c.get(Calendar.MONTH);
                day = c.get(Calendar.DAY_OF_MONTH);
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat df = new SimpleDateFormat("dd/MMMM/YYYY");
                Date d = c.getTime();
                timeatr = sdf.format(d);
                yearatr = df.format(d);
                jLabel2.setText(timeatr);
                jLabel3.setText(yearatr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void icon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../Image/logo.png")));

    }

    public static void setLookAndFeel() throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        Properties p = new Properties();
        javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");

        p.put("windowDecoration", "off");
        AcrylLookAndFeel.setTheme(p);
    }
}
