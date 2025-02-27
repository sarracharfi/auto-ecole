/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoplus.frame;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author anouer
 */
public class Parametre extends javax.swing.JInternalFrame {

    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    public static String test;
    public String etats;

    /**
     * Creates new form Examen
     */
    public Parametre() {

        initComponents();
        remove_title_bar();
        conn = ConexionBD.Conexion();
        Affichage();

    }

    void remove_title_bar() {
        putClientProperty("Parametre.isPalette", Boolean.TRUE);
        getRootPane().setWindowDecorationStyle(JRootPane.NONE);
        ((BasicInternalFrameUI) this.getUI()).setNorthPane(null);
        this.setBorder(null);
    }

    public void Affichage() {
        try {

            String requete = "select * from parametre";
            ps = conn.prepareStatement(requete);
            rs = ps.executeQuery();

            if (rs.next()) {
                String t1 = rs.getString("idar");
                txtid.setText(t1);
                String t0 = rs.getString("nom_auto");
                txtnom.setText(t0);
                String t2 = rs.getString("propretaire_auto");
                txtprop.setText(t2);
                String t3 = rs.getString("adresse_auto");
                txtadresse.setText(t3);
                String t4 = rs.getString("ville_auto");
                txtville.setText(t4);
                String t5 = rs.getString("codepostal");
                txtpost.setText(t5);
                String t6 = rs.getString("mail");
                txtmail.setText(t6);
                String t7 = rs.getString("telfixe");
                txtfixe.setText(t7);
                String t8 = rs.getString("telportable");
                txtportable.setText(t8);
                String t9 = rs.getString("identifientfiscal");
                txtfiscale.setText(t9);
                String t10 = rs.getString("code_auto");
                txtcode.setText(t10);
                Date t11 = rs.getDate("date_ouverture");
                txtdouverture.setDate(t11);
                ps.close();
                rs.close();

            }

        } catch (Exception e) {
            System.out.println(e);

        } finally {

            try {
                ps.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erreur BD");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtprop = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtville = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtdouverture = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        txtmail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtfixe = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtportable = new javax.swing.JTextField();
        txtpost = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtadresse = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtfiscale = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        btnmodifier = new javax.swing.JButton();

        setBorder(null);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/p.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 1366, 53);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "Informations sur l'auto-école :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 3, 14))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Id :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Tél Portabele :");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setText("Adresse :");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Nom Auto-Ecole :");

        txtdouverture.setDateFormatString("yyyy-MM-dd");
        txtdouverture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtdouvertureMouseReleased(evt);
            }
        });
        txtdouverture.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtdouvertureComponentAdded(evt);
            }
        });
        txtdouverture.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                txtdouvertureAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        txtdouverture.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdouvertureKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("Ville :");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Email :");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Tél Fixe :");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Propéritaire :");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Date d'ouverture:");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Code Postale :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel10)
                        .addGap(42, 42, 42)
                        .addComponent(txtpost, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel7)
                        .addGap(86, 86, 86)
                        .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtprop, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8)
                        .addGap(72, 72, 72)
                        .addComponent(txtfixe, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtportable, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(txtville, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtdouverture, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtpost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtfixe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtportable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtville, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdouverture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(110, 110, 680, 190);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 255)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Identifiant Fiscale :");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Code Auto-Ecole :");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(txtfiscale, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel12)
                        .addGap(9, 9, 9)
                        .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtfiscale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(110, 300, 310, 82);

        btnmodifier.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnmodifier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/file (2).png"))); // NOI18N
        btnmodifier.setText("Modifier");
        btnmodifier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnmodifier.setContentAreaFilled(false);
        btnmodifier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnmodifier.setOpaque(true);
        btnmodifier.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnmodifierMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnmodifierMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnmodifierMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnmodifierMouseReleased(evt);
            }
        });
        btnmodifier.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnmodifierMouseMoved(evt);
            }
        });
        btnmodifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodifierActionPerformed(evt);
            }
        });
        getContentPane().add(btnmodifier);
        btnmodifier.setBounds(280, 390, 140, 60);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
//clear();       
    }//GEN-LAST:event_formMouseClicked

    private void txtdouvertureMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdouvertureMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdouvertureMouseReleased

    private void txtdouvertureComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtdouvertureComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdouvertureComponentAdded

    private void txtdouvertureAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_txtdouvertureAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdouvertureAncestorAdded

    private void txtdouvertureKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdouvertureKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdouvertureKeyReleased

    private void btnmodifierMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseEntered
        btnmodifier.setBackground(new java.awt.Color(188,1,255));
    }//GEN-LAST:event_btnmodifierMouseEntered

    private void btnmodifierMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseExited
        btnmodifier.setBackground(new java.awt.Color(240,240,240));
    }//GEN-LAST:event_btnmodifierMouseExited

    private void btnmodifierMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMousePressed
        btnmodifier.setBackground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnmodifierMousePressed

    private void btnmodifierMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btnmodifierMouseReleased

    private void btnmodifierMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnmodifierMouseMoved

    }//GEN-LAST:event_btnmodifierMouseMoved

    private void btnmodifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodifierActionPerformed
       String t1 = txtid.getText();
        try {
            String requete = "update parametre  set idar =?,nom_auto=?,propretaire_auto=?,adresse_auto=?,ville_auto =?,codepostal =?,mail=?,telfixe =?,telportable =?,identifientfiscal =?,code_auto=?,date_ouverture =?   where  idar ='" + t1 + "'";
            ps = conn.prepareStatement(requete);
            ps.setString(1, txtid.getText());
            ps.setString(2, txtnom.getText());
            ps.setString(3, txtprop.getText());
            ps.setString(4, txtadresse.getText());
            ps.setString(5, txtville.getText());
            ps.setString(6, txtpost.getText());
            ps.setString(7, txtmail.getText());
            ps.setString(8, txtfixe.getText());
            ps.setString(9, txtportable.getText());
            ps.setString(10, txtfiscale.getText());
            ps.setString(11, txtcode.getText());
             ps.setString(12, ((JTextField) txtdouverture.getDateEditor().getUiComponent()).getText());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Modification avec succès");
            ps.close();
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {

            try {
                ps.close();
                rs.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "erreur BD");
            }
        }

    }//GEN-LAST:event_btnmodifierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnmodifier;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextField txtcode;
    private com.toedter.calendar.JDateChooser txtdouverture;
    private javax.swing.JTextField txtfiscale;
    private javax.swing.JTextField txtfixe;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtmail;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtportable;
    private javax.swing.JTextField txtpost;
    private javax.swing.JTextField txtprop;
    private javax.swing.JTextField txtville;
    // End of variables declaration//GEN-END:variables
}
