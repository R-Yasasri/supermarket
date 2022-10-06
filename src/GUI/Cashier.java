/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import database.db;
import java.awt.Color;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.LoggingAndFeedbackHelper;
import model.ErrorReporter;
import model.Validator;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Thilina
 */
public class Cashier extends javax.swing.JInternalFrame {

    private int selectedItemId = 0;
    private static final String perDelimiter = " per ";
    private static final String maxDelimiter = " max ";

    /**
     * Creates new form Cashier
     */
    public Cashier() {
        initComponents();
        init();
        clearItemFields(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();
        jSpinField1 = new com.toedter.components.JSpinField();
        jLabel18 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        discountText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSpinField2 = new com.toedter.components.JSpinField();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        invoice_total_text = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Invoice");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Cooperative-logo (1).gif"))); // NOI18N

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("jLabel2");

        jLabel1.setText("Invoice id");

        jLabel3.setText("Maliban Biscuit");

        jLabel6.setText("Stock id");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel8.setText("qty");

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel9.setText("unit price (Rs.)");

        jLabel10.setText("0.00 per Kg");

        jButton1.setText("add to table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("price (Rs.)");

        jLabel7.setText("Rs. 0.00");

        jLabel20.setText("discount (%)");

        jLabel22.setText("Item :");

        jLabel4.setText("Item id: ");

        jLabel5.setText("1");

        jLabel24.setText("Payment Method");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash" }));

        jLabel25.setForeground(new java.awt.Color(0, 204, 0));
        jLabel25.setText("Max: 10");

        jSpinField1.setMaximum(100);
        jSpinField1.setMinimum(0);

        jLabel18.setText("0.00");

        jLabel27.setText("discounted price:");

        jLabel17.setText("Rs.");

        discountText.setText("0.00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel24)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)
                                .addGap(36, 36, 36)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(discountText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel22)
                                .addComponent(jLabel24)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel7)
                            .addComponent(jLabel25)
                            .addComponent(jLabel18)
                            .addComponent(jLabel27)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel17)
                                .addComponent(discountText))
                            .addComponent(jLabel20))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "stock id", "item id", "item", "qty", "unit", "unit price", "net price", "discount", "total price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel12.setText("net total (Rs.)");

        jLabel13.setText("0.00");

        jLabel14.setText("discount (%)");

        jLabel15.setText("payment (Rs.)");

        jLabel16.setText("balance (Rs.) ");

        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });

        jLabel19.setText("0.00");

        jButton2.setText("clear table");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("remove row");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("clear fields");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("sell");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel21.setText("Rs.");

        jLabel23.setText("0.00");

        jLabel26.setText("Invoice total (Rs.)");

        invoice_total_text.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        invoice_total_text.setText("0.00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(91, 91, 91)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSpinField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel26))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(invoice_total_text, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(jLabel16)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(jLabel21)
                        .addComponent(jLabel23)
                        .addComponent(jLabel26)
                        .addComponent(invoice_total_text))
                    .addComponent(jSpinField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        String stockId = jTextField1.getText();

        jTextField1.setForeground(Color.black);
        if (stockId.isEmpty()) {
            clearItemFields(true);
        } else {

            try {
                ResultSet search = db.search("SELECT * FROM stock s INNER JOIN item i INNER JOIN grnitem g ON s.item_iditem=i.iditem AND g.idgrnitem=s.grnitem_idgrnitem WHERE s.qty>0 AND s.`status`=1 AND idstock='" + stockId + "'");

                String text = null;
                if (search.next()) {

                    String name = search.getString("brand") + " " + search.getString("name");

                    jLabel3.setText(name);
                    jLabel5.setText(search.getString("iditem"));

                    text = search.getString("selling_price") + perDelimiter + search.getString("unit");

                    jLabel10.setText(text);

                    jLabel25.setText(maxDelimiter + search.getString("qty"));

                    calculateTotalPrice();
                } else {
                    clearItemFields(false);
                    jTextField1.setForeground(Color.red);
                }
            } catch (Exception e) {
                ErrorReporter.reportError(e);
            }
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow != -1) {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

            dtm.removeRow(selectedRow);

            if (jTable1.getRowCount() == 0) {
                clearMonetaryFields();
            } else {

                calculateNetTotal();
                calculateBalance();

            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        clearMonetaryFields();

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clearItemFields(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        String maxText = jLabel25.getText();

        String q = jTextField2.getText();

        jTextField2.setForeground(Color.black);

        if (q.isEmpty()) {
            // nothing to do
            return;
        }

        if (maxText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a stock id, first", "ERROR", JOptionPane.WARNING_MESSAGE);
            jTextField2.setText(null);
            jTextField2.setForeground(Color.red);
        } else {

            String m = maxText.split(maxDelimiter)[1];

            Double maxQty = Double.parseDouble(m);

            if (Validator.isValidNumber(q)) {

                Double qty = Double.parseDouble(q);
                if (qty <= maxQty) {
                    calculateTotalPrice();

                } else {
                    JOptionPane.showMessageDialog(this, "Maximum qty is exceeded", "ERROR", JOptionPane.WARNING_MESSAGE);
                    jTextField2.setForeground(Color.red);
                    jTextField2.setText(null);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid number", "ERROR", JOptionPane.WARNING_MESSAGE);
                jTextField2.setForeground(Color.red);
                jTextField2.setText(null);
            }
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tPrice = jLabel7.getText();
        String name = jLabel3.getText();

        if (!tPrice.isEmpty()) {

            if (Double.parseDouble(tPrice) < 0 || name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Invalid data", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {

                Vector v = new Vector();
                String sId = jTextField1.getText();
                String iId = jLabel5.getText();
                String iName = jLabel3.getText();
                String qty = jTextField2.getText();

                String uPriceAndQty = jLabel10.getText();

                String uPrice = uPriceAndQty.split(perDelimiter)[0];
                String unit = uPriceAndQty.split(perDelimiter)[1];

                int discount = jSpinField1.getValue();

                double nPrice = Double.parseDouble(qty) * Double.parseDouble(uPrice);

                v.add(sId);
                v.add(iId);
                v.add(iName);
                v.add(qty);
                v.add(unit);
                v.add(uPrice);
                v.add(nPrice);
                v.add(discount);
                v.add(tPrice);

                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);

                clearItemFields(true);

                calculateNetTotal();
                calculateBalance();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please provide valid data", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        String payment = jTextField5.getText();

        if (Validator.isValidNumber(payment)) {
            jTextField5.setForeground(Color.red);
            calculateBalance();
        } else {

            jTextField5.setForeground(Color.black);
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String balance = jLabel19.getText();

        if (jTable1.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Empty table", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (balance.equals("0.00") || (jLabel19.getForeground() == Color.red) || (Double.parseDouble(balance) < 0)) {
            JOptionPane.showMessageDialog(this, "Invalid balance", "WARNING", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // for later use in invoice generation        
        String netTotal = jLabel13.getText();// becuase the clearMonetaryFields method is called before generating the invoice and it removes the netTotal value

        // save the data
        try {
            String payment_method = jComboBox1.getSelectedItem().toString();

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String today = sdf.format(date);

            int discount = jSpinField2.getValue();

            String payment = jTextField5.getText();

            db.iud("INSERT INTO invoice (datetime,payment_method,status,discount,payment) VALUES('" + today + "','" + payment_method + "','" + 1 + "','" + discount + "','" + payment + "')");
            ResultSet search = db.search("SELECT MAX(idinvoice) FROM invoice");

            int invoiceId = 1;
            if (search.next()) {
                invoiceId = search.getInt(1);
            }

            // save invoice items and reduce the stock
            for (int i = 0; i < jTable1.getRowCount(); i++) {

                String stockId = jTable1.getValueAt(i, 0).toString();
                String itemId = jTable1.getValueAt(i, 1).toString();
                String item = jTable1.getValueAt(i, 2).toString();
                String qty = jTable1.getValueAt(i, 3).toString();
                String unit = jTable1.getValueAt(i, 4).toString();
                String unitPrice = jTable1.getValueAt(i, 5).toString();
                String netPrice = jTable1.getValueAt(i, 6).toString();
                String dis = jTable1.getValueAt(i, 7).toString();
                // deduct the stock
                ResultSet stockSearch = db.search("SELECT qty FROM stock WHERE idstock='" + stockId + "'");

                if (stockSearch.next()) {

                    double stockQty = stockSearch.getDouble(1);
                    double soldQty = Double.parseDouble(qty);

                    double newStockQty = stockQty - soldQty;// already validated that the newStockQty is a positive number

                    db.iud("UPDATE stock SET qty='" + newStockQty + "' WHERE idstock='" + stockId + "'");

                }

                // save invoice items
                db.iud("INSERT INTO invoiceitem (item_iditem,invoice_idinvoice,qty,unit_price,unit,discount,status,stock_idstock) VALUES ('" + itemId + "','" + invoiceId + "','" + qty + "','" + unitPrice + "','" + unit + "','" + dis + "','" + 1 + "','" + stockId + "')");
            }

            LoggingAndFeedbackHelper.successfulInsert("Invoice " + invoiceId + " was added", this);
            clearMonetaryFields();
            // clear the table
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            // generate invoice
            try {

                String invId = Integer.toString(invoiceId);

                Map<String, Object> m = new HashMap();
                m.put("invId", invId);
                m.put("net_total", netTotal);

                String report = System.getenv("reports") + File.separator + "invoice.jasper";

                JasperPrint fillReport = JasperFillManager.fillReport(report, m, db.getConnection());
                JasperViewer.viewReport(fillReport, false);
                JasperPrintManager.printReport(fillReport, true);
            } catch (Exception e) {
                ErrorReporter.reportError(e);
            }

        } catch (Exception e) {
            ErrorReporter.reportError(e);
            JOptionPane.showMessageDialog(this, "An Error Occurred", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel discountText;
    private javax.swing.JLabel invoice_total_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.components.JSpinField jSpinField1;
    private com.toedter.components.JSpinField jSpinField2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    public void init() {
        try {
            ResultSet search = db.search("SELECT MAX(idinvoice) FROM invoice");

            int idInvoice = 0;
            if (search.next()) {

                idInvoice = search.getInt(1);
            }

            if (idInvoice == 0) {
                idInvoice = 1;
            }

            jLabel2.setText(Integer.toString(idInvoice));
        } catch (Exception e) {
            ErrorReporter.reportError(e);
        }

    }

    private void clearItemFields(boolean clearStockId) {

        if (clearStockId) {
            jTextField1.setText("");
        }

        jTextField2.setText("");
        jSpinField1.setValue(0);

        jLabel3.setText("");
        jLabel5.setText("");
        jLabel10.setText("");
        jLabel7.setText("");
        jLabel25.setText("");
    }

    private void calculateTotalPrice() {
        String qty = jTextField2.getText();
        String unitPrice = jLabel10.getText().split(perDelimiter)[0];

        jLabel7.setForeground(Color.black);
        if (!qty.isEmpty() && !unitPrice.isEmpty()) {

            Double q = Double.parseDouble(qty);
            Double u = Double.parseDouble(unitPrice);

            double total = q * u;

            Integer discount = jSpinField1.getValue();

            if (discount != 0) {
                double d = discount.doubleValue();

                total = total - d;
            }

            if (total < 0) {
                jLabel7.setForeground(Color.red);
            }

            jLabel7.setText(Double.toString(total));
        } else {
            jLabel7.setText("");
        }
    }

    private void calculateNetTotal() {

        if (jTable1.getRowCount() > 0) {
            int rowCount = jTable1.getRowCount();

            double netTotal = 0;
            for (int i = 0; i < rowCount; i++) {
                String value = jTable1.getValueAt(i, 8).toString();
                double totalPrice = Double.parseDouble(value);

                netTotal = netTotal + totalPrice;
            }

            jLabel13.setText(Double.toString(netTotal));
            calculateInvoiceTotal();
            calculateBalance();
        }
    }

    private void calculateBalance() {
        String payment = jTextField5.getText();
        Integer discount = jSpinField2.getValue();
        String netTotal = jLabel13.getText();

        jTextField5.setForeground(Color.black);
        jLabel19.setForeground(Color.black);

        if (!netTotal.isEmpty() && !payment.isEmpty()) {

            double balance = 0;

            double pay = Double.parseDouble(payment);
            double net = Double.parseDouble(netTotal);

            if (discount == 0) {
                balance = pay - net;
            } else {

                double dis = discount.doubleValue();
                balance = pay - (net - dis);
            }

            jLabel19.setText(Double.toString(balance));

            if (balance < 0) {
                jLabel19.setForeground(Color.red);
            }
        } else {

            jLabel19.setText("0.00");
        }
    }

    private void clearMonetaryFields() {

        jLabel13.setText("0.00");
        jSpinField2.setValue(0);
        jTextField5.setText("");
    }

    private void calculateInvoiceTotal() {
        Integer discount = jSpinField2.getValue();

        double total = Double.parseDouble(jLabel13.getText()) - discount.doubleValue();
        invoice_total_text.setText(Double.toString(total));
    }
}
