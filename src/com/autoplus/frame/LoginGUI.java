/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.autoplus.frame;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;


/**
 *
 * @author anouer
 */
public class LoginGUI extends javax.swing.JFrame {
      int xMouse;
      int yMouse;
      public static String t1;
      Connection conn=null;
      ResultSet rs = null ;
      PreparedStatement ps = null;
    /**
     * Creates new form LoginGUI
     */
    public LoginGUI() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("logocar.png")).getImage());
        conn = ConexionBD.Conexion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        txtlogin = new javax.swing.JTextField();
        back1 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        close = new javax.swing.JLabel();
        resize = new javax.swing.JLabel();
        MouveJframe = new javax.swing.JLabel();
        Description = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/boutton_large.png"))); // NOI18N
        btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMouseReleased(evt);
            }
        });
        getContentPane().add(btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 320, 380, 50));

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("Login");
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 40, 30));

        txtlogin.setBackground(new java.awt.Color(14, 142, 202));
        txtlogin.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtlogin.setForeground(new java.awt.Color(255, 255, 255));
        txtlogin.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtlogin.setBorder(null);
        txtlogin.setCaretColor(new java.awt.Color(204, 204, 255));
        txtlogin.setOpaque(false);
        txtlogin.setSelectionColor(new java.awt.Color(255, 204, 204));
        txtlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtloginMouseExited(evt);
            }
        });
        txtlogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtloginMouseMoved(evt);
            }
        });
        txtlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtloginActionPerformed(evt);
            }
        });
        txtlogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtloginKeyPressed(evt);
            }
        });
        getContentPane().add(txtlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 330, 30));

        back1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back1.setForeground(new java.awt.Color(255, 255, 255));
        back1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back1.setText("Mot de passe");
        getContentPane().add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 90, 30));

        txtpassword.setBackground(new java.awt.Color(14, 142, 202));
        txtpassword.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        txtpassword.setForeground(new java.awt.Color(255, 255, 255));
        txtpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpassword.setBorder(null);
        txtpassword.setCaretColor(new java.awt.Color(204, 204, 255));
        txtpassword.setSelectionColor(new java.awt.Color(255, 204, 204));
        txtpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtpasswordMouseExited(evt);
            }
        });
        txtpassword.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                txtpasswordMouseMoved(evt);
            }
        });
        txtpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpasswordKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpasswordKeyTyped(evt);
            }
        });
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 330, 30));

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 30, 30));

        resize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        resize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resizeMouseClicked(evt);
            }
        });
        getContentPane().add(resize, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 40, 40));

        MouveJframe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MouveJframeMousePressed(evt);
            }
        });
        MouveJframe.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MouveJframeMouseDragged(evt);
            }
        });
        getContentPane().add(MouveJframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 30));

        Description.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Description.setForeground(new java.awt.Color(51, 153, 0));
        Description.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Description, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 430, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/autoplus/images/max2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        setSize(new java.awt.Dimension(499, 450));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseEntered
        ImageIcon img = new ImageIcon(getClass().getResource("boutton_hover.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMouseEntered

    private void btnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseExited
        ImageIcon img = new ImageIcon(getClass().getResource("boutton_large.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMouseExited

    private void btnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMousePressed
        ImageIcon img = new ImageIcon(getClass().getResource("boutton_pressed.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMousePressed

    private void btnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseReleased
         ImageIcon img = new ImageIcon(getClass().getResource("boutton_hover.png"));
        btn.setIcon(img);
    }//GEN-LAST:event_btnMouseReleased

    private void txtloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtloginActionPerformed

    private void txtloginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtloginKeyPressed
        ImageIcon img = new ImageIcon(getClass().getResource("backtxt.png"));
        back.setIcon(img); 
    }//GEN-LAST:event_txtloginKeyPressed

    private void txtpasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyTyped
       
    }//GEN-LAST:event_txtpasswordKeyTyped

    private void txtpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpasswordKeyPressed
        ImageIcon img = new ImageIcon(getClass().getResource("backtxt.png"));
        back1.setIcon(img); 
    }//GEN-LAST:event_txtpasswordKeyPressed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void resizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resizeMouseClicked
        this.setState(LoginGUI.ICONIFIED);
    }//GEN-LAST:event_resizeMouseClicked

    private void MouveJframeMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveJframeMouseDragged
       int x = evt.getXOnScreen();
       int y = evt.getYOnScreen();
       this.setLocation( x - xMouse , y - yMouse);
    }//GEN-LAST:event_MouveJframeMouseDragged

    private void MouveJframeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MouveJframeMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
        
    }//GEN-LAST:event_MouveJframeMousePressed

    private void btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMouseClicked
        String requete ="select * from login_table where login = ? and password =? ";
        try{
            
            ps = conn.prepareStatement(requete);
            ps.setString(1, txtlogin.getText());
            ps.setString(2, txtpassword.getText());
            rs = ps.executeQuery();
        if(rs.next()){
             this.t1 = rs.getString("login");
//          System.out.println(t1 ) ;  
//          JOptionPane.showMessageDialog(null, t1);
          dispose();
          new AcceuilGui().setVisible(true);
                        
        }   
            
        }catch(Exception e){
            System.out.println("--> Exception : " + e) ;
           
        }
        Description.setForeground(Color.red);
        Description.setText("Choix invalide");
        
     //txtlogin.setBackground(Color.red);
     // txtlogin.setForeground(Color.red);
            txtlogin.setText("");
            txtpassword.setText("");
        System.out.println(" login failed" ) ;  
    }//GEN-LAST:event_btnMouseClicked
 public String utilisateur() {
        return t1;
    }
    private void txtloginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseMoved
     Description.setText("Veuillez entrer votre  login pour accéder à votre session");
        
        
    }//GEN-LAST:event_txtloginMouseMoved

    private void txtpasswordMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMouseMoved
        Description.setText("Veuillez entrer votre mot de passe pour accéder à votre session");
    }//GEN-LAST:event_txtpasswordMouseMoved

    private void txtloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtloginMouseExited
      Description.setText("");
    }//GEN-LAST:event_txtloginMouseExited

    private void txtpasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpasswordMouseExited
         Description.setText("");
    }//GEN-LAST:event_txtpasswordMouseExited

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                try{
                    Thread.sleep(3000);
                }catch(Exception e){
                    System.out.println(e);
                }
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Description;
    private javax.swing.JLabel MouveJframe;
    private javax.swing.JLabel back;
    private javax.swing.JLabel back1;
    private javax.swing.JLabel btn;
    private javax.swing.JLabel close;
    private javax.swing.JLabel resize;
    private javax.swing.JTextField txtlogin;
    private javax.swing.JPasswordField txtpassword;
    // End of variables declaration//GEN-END:variables
}
