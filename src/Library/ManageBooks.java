/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * Akhtar
 */
import net.proteanit.sql.DbUtils;

public class ManageBooks extends javax.swing.JFrame {

    /**
     * Creates new form Books
     */
    Connection conn = null;
    ResultSet rst = null;
    Statement stm = null;

    public ManageBooks() throws ClassNotFoundException {
        initComponents();
        ImageIcon iconLogo = new ImageIcon("C:/Users/Akhtar/Documents/NetBeansProjects/LMS/Images/books.jpg");
        Image img = iconLogo.getImage();
        Image newimg = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), java.awt.Image.SCALE_SMOOTH);
        iconLogo = new ImageIcon(newimg);
        jLabel1.setIcon(iconLogo);
        conn = Dbconnection.connectDB();
        update_table();

    }

    private void update_table() {

        try {
            String query = "select b_title as 'Title',b_author as 'Author',"
                    + "b_edition as 'Edition',b_acce_no as 'ACC NO' from book ";

            int type = jCombo_filter.getSelectedIndex();
            switch (type) {
                case 0:
                    query += "where b_expiredate is null  or b_expiredate > curdate()";
                    break;
                case 1:
                    query += "where b_expiredate is not null and b_expiredate > curdate() ";
                    break;
            }

            stm = conn.createStatement();
            rst = stm.executeQuery(query);
            jTableBooks.setModel(DbUtils.resultSetToTableModel(rst));

        } catch (SQLException ex) {
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        infoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabeltitle = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelauthor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabeledition = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelstartdate = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelpage = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabelexpiredate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton_expire = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBooks = new javax.swing.JTable();
        jComboBoxSearch = new javax.swing.JComboBox();
        jTextFieldsearch = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jCombo_filter = new javax.swing.JComboBox();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuclose = new javax.swing.JMenu();
        jMenuItemAddBook = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuclosewindow = new javax.swing.JMenuItem();
        jMenuedit = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Open Sans", 0, 24)); // NOI18N
        jLabel1.setText("Manage Books");

        infoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel2.setText("Title:");

        jLabeltitle.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabeltitle.setText("title goes here");

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel4.setText("Author:");

        jLabelauthor.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabelauthor.setText("author goes here");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel6.setText("Edition:");

        jLabeledition.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabeledition.setText("edition goes here");

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setText("Start Date:");

        jLabelstartdate.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabelstartdate.setText("start date goes here");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel10.setText("Expire Date:");

        jLabelpage.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel12.setText("Page count:");

        jLabelexpiredate.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabelexpiredate.setText("expire date goes here");

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel3.setText("Info Panel");

        jButton_expire.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jButton_expire.setText("Expire");
        jButton_expire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_expireMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout infoPanelLayout = new javax.swing.GroupLayout(infoPanel);
        infoPanel.setLayout(infoPanelLayout);
        infoPanelLayout.setHorizontalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabeltitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelauthor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabeledition, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 46, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(infoPanelLayout.createSequentialGroup()
                        .addGroup(infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelexpiredate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(16, 16, 16))
                    .addComponent(jLabelpage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelstartdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_expire)
                .addContainerGap())
        );
        infoPanelLayout.setVerticalGroup(
            infoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(jLabeltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(7, 7, 7)
                .addComponent(jLabeledition, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelstartdate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelexpiredate, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelpage, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_expire)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel1.setAutoscrolls(true);

        jTableBooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Title", "Author", "Edition"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableBooks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableBooksMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableBooks);

        jComboBoxSearch.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jComboBoxSearch.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acce No", "Title", "Author" }));
        jComboBoxSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSearchActionPerformed(evt);
            }
        });

        jTextFieldsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsearchActionPerformed(evt);
            }
        });
        jTextFieldsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldsearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldsearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(346, 346, 346))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jCombo_filter.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jCombo_filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Available", "Expired", "All" }));
        jCombo_filter.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCombo_filterItemStateChanged(evt);
            }
        });

        jMenuclose.setText("File");

        jMenuItemAddBook.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemAddBook.setText("Add Book");
        jMenuItemAddBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAddBookActionPerformed(evt);
            }
        });
        jMenuclose.add(jMenuItemAddBook);

        jMenuItem2.setText("Book Issue");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenuclose.add(jMenuItem2);

        jMenuclosewindow.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuclosewindow.setText("Close");
        jMenuclosewindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuclosewindowActionPerformed(evt);
            }
        });
        jMenuclose.add(jMenuclosewindow);

        jMenuBar2.add(jMenuclose);

        jMenuedit.setText("Edit");

        jMenuItem1.setText("Edit Book Details");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuedit.add(jMenuItem1);

        jMenuBar2.add(jMenuedit);

        jMenu1.setText("View");
        jMenuBar2.add(jMenu1);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCombo_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(infoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCombo_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   public void close() {
        WindowEvent close = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(close);
    }

    private void jTableBooksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableBooksMouseClicked
        try {
            
            int row = jTableBooks.getSelectedRow();
            String click = (jTableBooks.getModel().getValueAt(row, 0)).toString();
            String query = "select * from Book where b_title ='" + click + "' ";
            stm = conn.createStatement();
            rst = stm.executeQuery(query);
            while (rst.next()) {

                String b_title = rst.getString("b_title");
                String b_author = rst.getString("b_author");
                String b_edition = rst.getString("b_edition");
                jLabelauthor.setText(b_author);
                jLabeledition.setText(b_edition);
                jLabeltitle.setText(b_title);
                jLabelstartdate.setText(rst.getString("b_startdate"));
                jLabelexpiredate.setText(rst.getString("b_expiredate"));
                jLabelpage.setText(rst.getString("b_pagecount"));

                String expire_date = rst.getString("b_expiredate");
                if (expire_date == null) {
                    jButton_expire.setEnabled(true);
                } else {
                    jButton_expire.setEnabled(false);
                }

            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jTableBooksMouseClicked

    private void jMenuItemAddBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAddBookActionPerformed
        // TODO add your handling code here:

        AddBooks obj = null;
        try {
            obj = new AddBooks();
        } catch (ClassNotFoundException ex) {
        } catch (SQLException ex) {

            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        obj.setVisible(true);
        close();

    }//GEN-LAST:event_jMenuItemAddBookActionPerformed

    private void jMenuclosewindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuclosewindowActionPerformed
        // TODO add your handling code here:
        close();
        MainPanel obj = new MainPanel();
        obj.setVisible(true);
    }//GEN-LAST:event_jMenuclosewindowActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            // TODO add your handling code here:

            EditBook obj = new EditBook();
            obj.setVisible(true);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        try {
            // TODO add your handling code here:
            BookIssue obj = new BookIssue();
            obj.setVisible(true);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jComboBoxSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSearchActionPerformed

    private void jTextFieldsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldsearchKeyReleased
        // TODO add your handling code here:
        try {
            String search = jTextFieldsearch.getText();
            String by = jComboBoxSearch.getSelectedItem().toString();
            // state.setString(1,jTextFieldSearch.getText());
            System.out.println("value = " + search);
            if (search.equals("")) {

                update_table();
            } else {
                if (by.equals("Title")) {
                    by = "b_title";
                } else if (by.equals("Acce No")) {
                    by = "b_acce_no";
                } else {
                    by = "b_author";
                }
                String que = "select b_title as 'Title',b_author as 'Author',b_edition as 'Edition',"
                        + "b_acce_no as 'ACC NO' from book where " + by + " like '%" + search + "%'";
                //conn = Dbconnection.connectDB();
                stm = conn.createStatement();
                rst = stm.executeQuery(que);
                jTableBooks.setModel(DbUtils.resultSetToTableModel(rst));
            }
            /*    if(set.next())
             {
             String add1 = set.getString("ID");
             jTextFieldID.setText(add1);
             String add2 = set.getString("Name");
             jTextFieldName.setText(add2);
             String add3 = set.getString("Contact");
             jTextFieldContact.setText(add3);
             String add4 = set.getString("Address");
             jTextFieldAddress.setText(add4);
               
             String add5 = set.getString("Email");
             jTextFieldEmail.setText(add5);
             }   
            
             */

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jTextFieldsearchKeyReleased

    private void jTextFieldsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsearchActionPerformed

    private void jCombo_filterItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCombo_filterItemStateChanged
        // TODO add your handling code here:
        update_table();
    }//GEN-LAST:event_jCombo_filterItemStateChanged

    private void jButton_expireMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_expireMouseClicked
        try {
            // TODO add your handling code here:

            int row = jTableBooks.getSelectedRow();

            String acc_no = jTableBooks.getModel().getValueAt(row, 3).toString();

            String query2 = "Select b_expiredate from book where b_acce_no = " + acc_no;
            stm = conn.createStatement();
            rst = stm.executeQuery(query2);

            if (rst.next()) {

                String expire_date = rst.getString("b_expiredate");

                System.out.println(expire_date);

                if (expire_date == null) {

                    String query = "Update book "
                            + "set b_expiredate = curdate() "
                            + "where b_acce_no = " + acc_no;

                    stm = conn.createStatement();
                    stm.execute(query);
                    update_table();
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_expireMouseClicked

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
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBooks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ManageBooks().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(ManageBooks.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel infoPanel;
    private javax.swing.JButton jButton_expire;
    private javax.swing.JComboBox jComboBoxSearch;
    private javax.swing.JComboBox jCombo_filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelauthor;
    private javax.swing.JLabel jLabeledition;
    private javax.swing.JLabel jLabelexpiredate;
    private javax.swing.JLabel jLabelpage;
    private javax.swing.JLabel jLabelstartdate;
    private javax.swing.JLabel jLabeltitle;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItemAddBook;
    private javax.swing.JMenu jMenuclose;
    private javax.swing.JMenuItem jMenuclosewindow;
    private javax.swing.JMenu jMenuedit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableBooks;
    private javax.swing.JTextField jTextFieldsearch;
    // End of variables declaration//GEN-END:variables
}
