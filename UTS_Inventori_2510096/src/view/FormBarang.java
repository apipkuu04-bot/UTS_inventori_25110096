/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import  javax.swing.JOptionPane;
import model.Barang;
import dao.BarangDAO;
import javax.swing.table.DefaultTableModel;

public class FormBarang extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormBarang.class.getName());

private void tampilkanData() {
    DefaultTableModel model =
        (DefaultTableModel) tblBarang.getModel();

    model.setRowCount(0);

    BarangDAO dao = new BarangDAO();

    try {
       for (Barang b : dao.tampilData()) {
            model.addRow(new Object[]{
                b.getKodeBarang(),
                b.getNamaBarang(),
                b.getKategori(),
                b.getStok()
            });
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
            "Gagal menampilkan data: " + e.getMessage());
    }
} private void bersihkanForm() {
    txtKode.setText("");
    txtNama.setText("");
    txtStok.setText("");

    cmbKategori.setSelectedIndex(0);

    txtKode.setEditable(true);
    tblBarang.clearSelection();

    txtKode.requestFocus();
}
public FormBarang() {
    initComponents();
    setLocationRelativeTo(null);

    tblBarang.setModel(new DefaultTableModel(
        new Object[][]{},
        new String[]{
            "Kode Barang",
            "Nama Barang",
            "Kategori",
            "Stok"
        }
    ));

    btnBersihkan.addActionListener(e -> bersihkanForm());

    tampilkanData();
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();
        lblKodeBarang = new javax.swing.JLabel();
        lblNamaBarang = new javax.swing.JLabel();
        lblKategori = new javax.swing.JLabel();
        lblStok = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        lblKodeBarang.setText("Kode Barang");

        lblNamaBarang.setText("Nama Barang");

        lblKategori.setText("Kategori");

        lblStok.setText("Stok");

        txtKode.addActionListener(this::txtKodeActionPerformed);

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Komputer", "Jaringan", "Alat Ukur" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(this::btnSimpanActionPerformed);

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(this::btnUbahActionPerformed);

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(this::btnHapusActionPerformed);

        btnBersihkan.setText("Bersihkan");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblKategori)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKode, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbKategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(158, 158, 158)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                            .addComponent(lblStok)
                            .addComponent(txtStok)
                            .addComponent(lblNamaBarang)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUbah)
                        .addGap(26, 26, 26)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnBersihkan))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKodeBarang)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 1, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKodeBarang)
                    .addComponent(lblNamaBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKategori)
                    .addComponent(lblStok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBersihkan))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
       String kode = txtKode.getText().trim();
    String nama = txtNama.getText().trim();
    String kategori = cmbKategori.getSelectedItem().toString();

    // Validasi kode dan nama
    if (kode.isEmpty() || nama.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Kode dan nama barang tidak boleh kosong!");
        return;
    }

    // Validasi stok
    int stok;

    try {
        stok = Integer.parseInt(txtStok.getText().trim());

        if (stok < 0) {
            JOptionPane.showMessageDialog(this,
                    "Stok tidak boleh kurang dari 0!");
            return;
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Stok harus berupa angka!");
        return;
    }

    Barang b = new Barang(kode, nama, kategori, stok);

    BarangDAO dao = new BarangDAO();

    if (dao.simpan(b)) {
        JOptionPane.showMessageDialog(this,
                "Data berhasil disimpan!");

        tampilkanData();
        bersihkanForm();

    } else {
        JOptionPane.showMessageDialog(this,
                "Data gagal disimpan!");
    }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
    

    

    int baris = tblBarang.getSelectedRow();

    if (baris != -1) {
        txtKode.setText(tblBarang.getValueAt(baris, 0).toString());
        txtNama.setText(tblBarang.getValueAt(baris, 1).toString());

        cmbKategori.setSelectedItem(
            tblBarang.getValueAt(baris, 2).toString()
        );

        txtStok.setText(tblBarang.getValueAt(baris, 3).toString());

        txtKode.setEditable(false);
    }

    }//GEN-LAST:event_tblBarangMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
 

    String kode = txtKode.getText().trim();
    String nama = txtNama.getText().trim();
    String kategori = cmbKategori.getSelectedItem().toString();

    if (kode.isEmpty() || nama.isEmpty()) {
        JOptionPane.showMessageDialog(this,
                "Pilih data dan isi kode serta nama barang!");
        return;
    }

    int stok;

    try {
        stok = Integer.parseInt(txtStok.getText().trim());

        if (stok < 0) {
            JOptionPane.showMessageDialog(this,
                    "Stok tidak boleh negatif!");
            return;
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this,
                "Stok harus berupa angka!");
        return;
    }

    Barang b = new Barang(kode, nama, kategori, stok);
    BarangDAO dao = new BarangDAO();

    if (dao.ubah(b)) {
        JOptionPane.showMessageDialog(this,
                "Data berhasil diubah!");

        tampilkanData();
        bersihkanForm();

    } else {
        JOptionPane.showMessageDialog(this,
                "Data gagal diubah!");
    }

    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
   

    String kode = txtKode.getText().trim();

    if (kode.isEmpty()) {
        JOptionPane.showMessageDialog(this,
            "Pilih data yang ingin dihapus!");
        return;
    }

    int konfirmasi = JOptionPane.showConfirmDialog(
        this,
        "Yakin ingin menghapus data ini?",
        "Konfirmasi",
        JOptionPane.YES_NO_OPTION
    );

    if (konfirmasi == JOptionPane.YES_OPTION) {
        try {
            BarangDAO dao = new BarangDAO();
            dao.hapus(kode);

            JOptionPane.showMessageDialog(this,
                "Data berhasil dihapus!");

            tampilkanData();
            bersihkanForm();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                "Gagal menghapus: " + e.getMessage());
        }
    }

    
    }//GEN-LAST:event_btnHapusActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormBarang().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblKategori;
    private javax.swing.JLabel lblKodeBarang;
    private javax.swing.JLabel lblNamaBarang;
    private javax.swing.JLabel lblStok;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
