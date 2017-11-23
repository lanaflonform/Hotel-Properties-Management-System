/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coder.hms.ui.external;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author dell-pc
 */
public class AllReservationsWindow extends javax.swing.JFrame {

    /**
     * Creates new form AllReservationsWindow
     */
    public AllReservationsWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        upperPanel = new javax.swing.JPanel();
        editButton = new javax.swing.JButton();
        startDateChooser = new datechooser.beans.DateChooserCombo();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        endDateChooser = new datechooser.beans.DateChooserCombo();
        centeredPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reservationTable = new javax.swing.JTable();
        searchFieldsHolder = new javax.swing.JPanel();
        filterLbl = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Coder HPMSA - [All Reservations]");
        setExtendedState(1);
        setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(1100, 750));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(1312, 800));

        upperPanel.setBackground(new java.awt.Color(6, 109, 149));
        upperPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        upperPanel.setPreferredSize(new java.awt.Dimension(1312, 70));

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coder/hms/icons/main_edit.png"))); // NOI18N
        editButton.setText("Edit Reservation");

        jLabel2.setText("Start date : ");

        jLabel3.setText("End date : ");

        javax.swing.GroupLayout upperPanelLayout = new javax.swing.GroupLayout(upperPanel);
        upperPanel.setLayout(upperPanelLayout);
        upperPanelLayout.setHorizontalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(679, 679, 679))
        );
        upperPanelLayout.setVerticalGroup(
            upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upperPanelLayout.createSequentialGroup()
                .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, upperPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(upperPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(endDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(upperPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(13, 13, 13))
        );

        getContentPane().add(upperPanel, java.awt.BorderLayout.PAGE_START);

        centeredPanel.setBackground(new java.awt.Color(6, 109, 149));
        centeredPanel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        centeredPanel.setLayout(new java.awt.BorderLayout());

        jScrollPane1.setBorder(null);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        reservationTable.setAutoCreateRowSorter(true);
        reservationTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "GROUP NAME", "CHECKIN ", "CHECKOUT", "AGENCY", "AGENCY REF NO", "ROOM NUMBER", "TOTAL DAYS", "HOST TYPE", "PAYMENT STATUS", "BOOK STATUS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        reservationTable.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(reservationTable);
        reservationTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (reservationTable.getColumnModel().getColumnCount() > 0) {
            reservationTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            reservationTable.getColumnModel().getColumn(1).setPreferredWidth(110);
            reservationTable.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        centeredPanel.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        searchFieldsHolder.setBackground(new java.awt.Color(6, 109, 149));
        searchFieldsHolder.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        filterLbl.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        filterLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/coder/hms/icons/logging.png"))); // NOI18N
        filterLbl.setText("Filter : ");
        searchFieldsHolder.add(filterLbl);

        searchField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchField.setToolTipText("Specialize your rows by typing here");
        searchField.setPreferredSize(new java.awt.Dimension(1150, 20));
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchFieldKeyTyped(evt);
            }
        });
        searchFieldsHolder.add(searchField);

        centeredPanel.add(searchFieldsHolder, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(centeredPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyTyped
        
    }//GEN-LAST:event_searchFieldKeyTyped

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
            java.util.logging.Logger.getLogger(AllReservationsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllReservationsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllReservationsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllReservationsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllReservationsWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel centeredPanel;
    private javax.swing.JButton editButton;
    private datechooser.beans.DateChooserCombo endDateChooser;
    private javax.swing.JLabel filterLbl;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable reservationTable;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel searchFieldsHolder;
    private datechooser.beans.DateChooserCombo startDateChooser;
    private javax.swing.JPanel upperPanel;
    // End of variables declaration//GEN-END:variables
}
