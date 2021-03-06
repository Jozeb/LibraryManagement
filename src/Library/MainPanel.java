/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.NotActiveException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Jazib Hassan
 */
public class MainPanel extends javax.swing.JFrame {

    /**
     * Creates new form MainPanel
     */
    public MainPanel() {
        initComponents();

        ImageIcon icon = new ImageIcon("C:\\Users\\Jazib Hassan\\Documents\\library.jpg");
        Image img = icon.getImage();
        //background is the label
        Image newimg = img.getScaledInstance(background.getWidth(), background.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(newimg);
        background.setIcon(icon);

        System.out.println("width: " + background.getWidth());
        System.out.println("height: " + background.getHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtoncirculation = new javax.swing.JButton();
        jButtonmanageusers = new javax.swing.JButton();
        jButtonmanagebooks = new javax.swing.JButton();
        jButtonexit = new javax.swing.JButton();
        jButtonbookrequest = new javax.swing.JButton();
        jButtonuserrequest = new javax.swing.JButton();
        jButtonmanageorders = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 490));
        setResizable(false);
        getContentPane().setLayout(null);

        jButtoncirculation.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtoncirculation.setText("Circulation");
        jButtoncirculation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtoncirculationMouseClicked(evt);
            }
        });
        getContentPane().add(jButtoncirculation);
        jButtoncirculation.setBounds(180, 270, 170, 30);

        jButtonmanageusers.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtonmanageusers.setText("Manage Users");
        jButtonmanageusers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmanageusersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonmanageusers);
        jButtonmanageusers.setBounds(180, 190, 170, 30);

        jButtonmanagebooks.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtonmanagebooks.setText("Manage Books");
        jButtonmanagebooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmanagebooksActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonmanagebooks);
        jButtonmanagebooks.setBounds(180, 230, 170, 30);

        jButtonexit.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtonexit.setText("Exit");
        jButtonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonexitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonexit);
        jButtonexit.setBounds(550, 410, 170, 30);

        jButtonbookrequest.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtonbookrequest.setText("Book Requests");
        jButtonbookrequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbookrequestActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonbookrequest);
        jButtonbookrequest.setBounds(370, 230, 170, 30);

        jButtonuserrequest.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtonuserrequest.setText("User Requests");
        jButtonuserrequest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonuserrequestMouseClicked(evt);
            }
        });
        getContentPane().add(jButtonuserrequest);
        jButtonuserrequest.setBounds(370, 190, 170, 30);

        jButtonmanageorders.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButtonmanageorders.setText("Manage Orders");
        jButtonmanageorders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonmanageordersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonmanageorders);
        jButtonmanageorders.setBounds(370, 270, 170, 30);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Library Management System");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 40, 520, 90);

        jButton1.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButton1.setText("Notifications");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(613, 10, 110, 25);

        background.setMaximumSize(new java.awt.Dimension(3000, 3000));
        getContentPane().add(background);
        background.setBounds(0, 0, 740, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonmanageusersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmanageusersActionPerformed
        try {
            // TODO add your handling code here:
            ManageUsers obj = new ManageUsers();
            obj.setVisible(true);
            close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonmanageusersActionPerformed

    private void jButtonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonexitActionPerformed
        // TODO add your handling code here:
        close();
        login obj = new login();
        obj.setVisible(true);
    }//GEN-LAST:event_jButtonexitActionPerformed

    private void jButtonmanagebooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmanagebooksActionPerformed
        try {
            // TODO add your handling code here:
            ManageBooks obj = new ManageBooks();
            obj.setVisible(true);
            close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonmanagebooksActionPerformed

    private void jButtonbookrequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbookrequestActionPerformed
        try {
            // TODO add your handling code here:
            Requests obj = new Requests();
            obj.setVisible(true);
            close();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonbookrequestActionPerformed

    private void jButtonmanageordersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonmanageordersActionPerformed
        // TODO add your handling code here:
        ManageVendors obj;
        try {
            obj = new ManageVendors();
            obj.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

        close();
    }//GEN-LAST:event_jButtonmanageordersActionPerformed

    private void jButtonuserrequestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonuserrequestMouseClicked
        try {
            // TODO add your handling code here:
            UserRequest obj = new UserRequest();
            obj.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonuserrequestMouseClicked

    private void jButtoncirculationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtoncirculationMouseClicked
        try {
            // TODO add your handling code here:
            Circulation obj = new Circulation();
            obj.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtoncirculationMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // TODO add your handling code here:
            Notification notification = new Notification();
            notification.setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked
    public void close() {
        WindowEvent close = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(close);
    }

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
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPanel().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonbookrequest;
    private javax.swing.JButton jButtoncirculation;
    private javax.swing.JButton jButtonexit;
    private javax.swing.JButton jButtonmanagebooks;
    private javax.swing.JButton jButtonmanageorders;
    private javax.swing.JButton jButtonmanageusers;
    private javax.swing.JButton jButtonuserrequest;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
