/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MahasiswaForm.java
 * 
 * Created on Oct 22, 2011, 2:56:09 PM
 */
package universitas;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author indra
 */
@SuppressWarnings("serial")
public class MatakuliahForm extends javax.swing.JFrame {

    DefaultTableModel tableModel = new ReadonlyTableModel();
    final Connection dbConnection;
    Statement sqlStatement;
    String selectedKode;
    final String select_sql;

    /** Creates new form MahasiswaForm */
    public MatakuliahForm() {
        initComponents();
        table.setModel(tableModel);
        tableModel.addColumn("Kode");
        tableModel.addColumn("Nama");
        tableModel.addColumn("SKS");
        tableModel.addColumn("Semester");

        dbConnection = KoneksiDatabase.getKoneksi();
        try {
            sqlStatement = dbConnection.createStatement();
        } catch (SQLException e) {
            System.err.println(e);
        }
        select_sql = "SELECT * FROM matakuliah";

        loadData();

        table.setModel(tableModel);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        kodeTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        namaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        tambahButton = new javax.swing.JButton();
        ubahButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        semesterFormattedTextField = new javax.swing.JFormattedTextField();
        sksFormatedTextField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("Kode");

        kodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodeTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("Nama");

        jLabel4.setText("SKS");

        jLabel5.setText("Semester");

        tambahButton.setText("Tambah");
        tambahButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tambahButtonMouseClicked(evt);
            }
        });

        ubahButton.setText("Ubah");
        ubahButton.setEnabled(false);
        ubahButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ubahButtonMouseClicked(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.setEnabled(false);
        hapusButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hapusButtonMouseClicked(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 8));
        jLabel7.setText("indraginanjar@gmail.com");

        try {
            semesterFormattedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            sksFormatedTextField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel1)
                                    .addGap(33, 33, 33)
                                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(29, 29, 29)
                                    .addComponent(jLabel4)
                                    .addGap(32, 32, 32)
                                    .addComponent(sksFormatedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(semesterFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tambahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(ubahButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(hapusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sksFormatedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel5))
                    .addComponent(semesterFormattedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tambahButton)
                    .addComponent(ubahButton)
                    .addComponent(hapusButton))
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tambahButtonMouseClicked
        if(ubahButton.isEnabled()){
            emptyAllTextField();
            return;
        }
        try {
            String sql = "INSERT INTO matakuliah VALUES (?, ?, ?, ?)";
            PreparedStatement p = dbConnection.prepareStatement(sql);
            p.setString(1, kodeTextField.getText());
            p.setString(2, namaTextField.getText());
            p.setString(3, sksFormatedTextField.getText());
            p.setString(4, semesterFormattedTextField.getText());
            p.executeUpdate();
            p.close();
        } catch (java.lang.NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Seluruh field mesti diisi lengkap");
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(this, "ID yang dimasukkan, sudah ada");
        } catch (SQLException e) {
            System.err.println(e);
        }
        loadData();
        emptyAllTextField();

    }//GEN-LAST:event_tambahButtonMouseClicked

    private void ubahButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ubahButtonMouseClicked
        if (selectedKode == null) {
            // tidak ada baris terseleksi
            return;
        }
        // ambil kode yang terseleksi
        try {
            String sql = "UPDATE matakuliah SET nama_mtk = ?, sks = ?, semester = ? where kode_mtk = ?";
            PreparedStatement p = dbConnection.prepareStatement(sql);
            p.setString(1, namaTextField.getText());
            p.setString(2, sksFormatedTextField.getText());
            p.setString(3, semesterFormattedTextField.getText());
            p.setString(4, selectedKode);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        loadData();




    }//GEN-LAST:event_ubahButtonMouseClicked

    private void hapusButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hapusButtonMouseClicked
        if (selectedKode == null) {
            // tidak ada baris terseleksi
            return;
        }
        try {
            String sql = "DELETE FROM matakuliah WHERE kode_mtk = ?";
            PreparedStatement p = dbConnection.prepareStatement(sql);
            p.setString(1, selectedKode);
            p.executeUpdate();
            p.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
        loadData();
        emptyAllTextField();

    }//GEN-LAST:event_hapusButtonMouseClicked

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selectedRow = table.getSelectedRow();
        // jika tak ada baris terseleksi
        if (selectedRow == -1) {
            emptyAllTextField();
            selectedKode = null;
            ubahButton.setEnabled(false);
            hapusButton.setEnabled(false);
            return;
        }
        ubahButton.setEnabled(true);
        hapusButton.setEnabled(true);
        selectedKode = (String) tableModel.getValueAt(selectedRow, 0);
        kodeTextField.setText(selectedKode);
        namaTextField.setText((String) tableModel.getValueAt(selectedRow, 1));
        sksFormatedTextField.setText((String) tableModel.getValueAt(selectedRow, 2));
        semesterFormattedTextField.setText((String) tableModel.getValueAt(selectedRow, 3));
    }//GEN-LAST:event_tableMouseClicked

    private void kodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kodeTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MatakuliahForm().setVisible(true);
            }
        });
    }

    private void loadData() {
// menghapus seluruh data
        tableModel.getDataVector().removeAllElements();
// memberi tahu bahwa data telah kosong
        tableModel.fireTableDataChanged();
        try {

            ResultSet r = sqlStatement.executeQuery(select_sql);
            while (r.next()) {
// lakukan penelusuran baris
                Object[] newRowFields = new Object[5];
                newRowFields[0] = r.getString("kode_mtk");
                newRowFields[1] = r.getString("nama_mtk");
                newRowFields[2] = r.getString("sks");
                newRowFields[3] = r.getString("semester");
                tableModel.addRow(newRowFields);
            }
            r.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    void emptyAllTextField() {
        kodeTextField.setText(null);
        namaTextField.setText(null);
        sksFormatedTextField.setText(null);
        semesterFormattedTextField.setText(null);
        ubahButton.setEnabled(false);
        hapusButton.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kodeTextField;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JFormattedTextField semesterFormattedTextField;
    private javax.swing.JFormattedTextField sksFormatedTextField;
    private javax.swing.JTable table;
    private javax.swing.JButton tambahButton;
    private javax.swing.JButton ubahButton;
    // End of variables declaration//GEN-END:variables
}