package GUI;

import database.db;
import java.awt.Image;
import java.io.File;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.CustomLogging;
import model.ErrorReporter;
import model.Validator;

public class Users extends javax.swing.JInternalFrame {

    String imgPath = "";

    public Users() {
        initComponents();
        loadAll();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setTitle("User Details");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Cooperative-logo (1).gif"))); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Image");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jLabel1.setPreferredSize(new java.awt.Dimension(158, 158));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NIC number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("First Name");

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Last Name");

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Email");

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Password");

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField5KeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Mobile 1");

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Mobile 2");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Address");

        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(51, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton5.setText("Browse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Date of Birth");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Gender");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Civil Status");

        buttonGroup2.add(jRadioButton3);
        jRadioButton3.setText("Unmarried");

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setText("Married");

        jCheckBox1.setText("show password");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(47, 47, 47)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addGap(81, 81, 81)
                                .addComponent(jRadioButton2))
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)
                            .addComponent(jTextField6, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addGap(63, 63, 63)
                                .addComponent(jRadioButton4))
                            .addComponent(jPasswordField1)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(jLabel13)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jRadioButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nic = jTextField1.getText();
        String fname = jTextField2.getText();
        String lname = jTextField3.getText();
        String password = jPasswordField1.getText();

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

        String dob = "";
        if (jDateChooser1.getDate() != null) {
            dob = date.format(jDateChooser1.getDate());

        }

        String email = jTextField4.getText();
        String mobile1 = jTextField5.getText();
        String mobile2 = jTextField6.getText();
        String address = jTextField7.getText();

        String gender;
        if (jRadioButton1.isSelected()) {
            gender = "Male";

        } else {
            gender = "Female";
        }
        boolean jr1 = jRadioButton1.isSelected();
        boolean jr2 = jRadioButton2.isSelected();

        String civil_status;
        if (jRadioButton3.isSelected()) {
            civil_status = "Married";

        } else {
            civil_status = "Unmarried";
        }
        boolean jr3 = jRadioButton3.isSelected();
        boolean jr4 = jRadioButton4.isSelected();

        if (nic.isEmpty()) {
            // no NIC
            JOptionPane.showMessageDialog(this, "Please provide NIC", "Error", JOptionPane.WARNING_MESSAGE);
            jTextField1.grabFocus();
            return;
        }

        if (password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide a password", "Error", JOptionPane.WARNING_MESSAGE);
            jPasswordField1.grabFocus();
            return;
        }

        if (!Validator.isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please provide a valid email", "Error", JOptionPane.WARNING_MESSAGE);
            jTextField4.grabFocus();
            return;
        }

        if (!Validator.isValidNIC(nic)) {
            JOptionPane.showMessageDialog(this, "Please provide a valid nic", "Error", JOptionPane.WARNING_MESSAGE);
            jTextField1.grabFocus();
            return;
        }

        if (!Validator.isValidPhoneNumber(mobile1)) {
            JOptionPane.showMessageDialog(this, "Please fill mobile 1 field", "Error", JOptionPane.WARNING_MESSAGE);
            jTextField5.grabFocus();
            return;
        }

        if (!mobile2.isEmpty() && !Validator.isValidPhoneNumber(mobile2)) {
            JOptionPane.showMessageDialog(this, "Invalid value provided for mobile 2 field", "Error", JOptionPane.WARNING_MESSAGE);
            jTextField6.grabFocus();
            return;
        }

        try {
            db.iud("UPDATE user SET email ='" + email + "' ,nic='" + nic + "',password='" + password + "',fname='" + fname + "',lname='" + lname + "',img='" + imgPath + "',dob='" + dob + "',gender='" + gender + "',mobile1='" + mobile1 + "',mobile2='" + mobile2 + "',address='" + address + "',civil_status='" + civil_status + "',img='" + imgPath + "'");// no need to use a where clause becuase there is one and only admin(user)

            CustomLogging.loggingMethod("User details were updated", CustomLogging.INFO);
            JOptionPane.showMessageDialog(null, "saved successfully");

        } catch (Exception e) {
            ErrorReporter.reportError(e);

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed

    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed
    String dbPAth;
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        File destination;
        try {
            JFileChooser jf = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter("*images", ".jpeg", "png", "jpg");
            jf.addChoosableFileFilter(filter);
            int soDdialod = jf.showOpenDialog(this);

            if (soDdialod == jf.APPROVE_OPTION) {
                String path = jf.getSelectedFile().getAbsolutePath();
                imgPath = path.replace("\\", "/");
                File f = new File(imgPath);

                Image img = ImageIO.read(f);
                img = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                jLabel1.setText(null);
                jLabel1.setIcon(new ImageIcon(img));

            }
        } catch (Exception e) {
            ErrorReporter.reportError(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField2KeyTyped

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased

        if (Character.isAlphabetic(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased

    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed

    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField5KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (Character.isLetter(c) && !evt.isAltDown()) {
            jTextField5.setColumns(10);
            evt.consume();
            JOptionPane.showMessageDialog(null, "Only numbers are allowed");
        }

    }//GEN-LAST:event_jTextField5KeyTyped

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed

        if (jCheckBox1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        } else {
            jPasswordField1.setEchoChar('*');
        }

    }//GEN-LAST:event_jCheckBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables

    private void loadAll() {

        try {
            ResultSet search = db.search("SELECT * FROM user");

            if (search.next()) {

                jTextField1.setText(search.getString("nic"));
                jTextField2.setText(search.getString("fname"));
                jTextField3.setText(search.getString("lname"));
                jTextField4.setText(search.getString("email"));
                jTextField5.setText(search.getString("mobile1"));
                jTextField6.setText(search.getString("mobile2"));
                jTextField7.setText(search.getString("address"));

                String dob = search.getString("dob");

                if (!dob.isEmpty()) {

                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = sdf.parse(dob);

                    jDateChooser1.setDate(date);
                }

                String gender = search.getString("gender");

                if (gender.equals("Male")) {
                    jRadioButton1.setSelected(true);
                } else {
                    jRadioButton2.setSelected(true);
                }

                String civilStatus = search.getString("civil_status");

                if (civilStatus.equals("Married")) {

                    jRadioButton4.setSelected(true);

                } else {
                    jRadioButton3.setSelected(true);
                }

                jPasswordField1.setText(search.getString("password"));

                //set image
                imgPath = search.getString("img");

                if (imgPath.isEmpty()) {
                    jLabel1.setText("no image");
                } else {
                    File f = new File(imgPath);

                    Image img = ImageIO.read(f);
                    img = img.getScaledInstance(158, 158, Image.SCALE_SMOOTH);
                    jLabel1.setText(null);
                    jLabel1.setIcon(new ImageIcon(img));

                }
            }

        } catch (Exception e) {
            ErrorReporter.reportError(e);
        }

    }
}
