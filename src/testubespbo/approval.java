/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testubespbo;

import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class approval extends javax.swing.JFrame {
    
    private void kosongkan_form(){
        asurbal.setEditable(true);
        asurbal.setText(null);
        ajuml.setText(null);
        awak.setText(null);
        atem.setText(null);
    }
    
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("surat balasan");
        model.addColumn("jumlah anggota setuju.");
        model.addColumn("waktu disetujui.");
        model.addColumn("tempat disetujui.");
        
        try{
            int no = 1;
            String sql = "SELECT * FROM approval";
            
        }catch (SQLException e){
            System.out.println("eROR :" + e.getMessege());
        }
    }

    /**
     * Creates new form approval
     */
    public approval() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        asurbal = new javax.swing.JTextField();
        ajuml = new javax.swing.JTextField();
        awak = new javax.swing.JTextField();
        atem = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaproval = new javax.swing.JTable();
        tbtambah = new javax.swing.JButton();
        tbsimpan = new javax.swing.JButton();
        tbedit = new javax.swing.JButton();
        tbhapus = new javax.swing.JButton();
        tbbatal = new javax.swing.JButton();
        tbkeluar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        anilaiuj = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("APPROVAL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 26, -1, 34));

        jLabel2.setText("Nilai PKN dari perusahaan");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 110, 190, -1));

        jLabel3.setText("jumlah anggota yang disetujui");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 151, -1, -1));

        jLabel4.setText("waktu yang disetujui");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 193, -1, -1));

        jLabel5.setText("tempat yang disetujui");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 234, -1, -1));
        getContentPane().add(asurbal, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 104, 280, -1));
        getContentPane().add(ajuml, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 148, 283, -1));
        getContentPane().add(awak, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 190, 283, -1));
        getContentPane().add(atem, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 234, 283, -1));

        tabelaproval.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelaproval);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 481, 760, 153));

        tbtambah.setText("REFRESH DATA");
        getContentPane().add(tbtambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 340, -1, -1));

        tbsimpan.setText("SIMPAN");
        getContentPane().add(tbsimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 340, -1, -1));

        tbedit.setText("EDIT");
        getContentPane().add(tbedit, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 340, -1, -1));

        tbhapus.setText("HAPUS");
        getContentPane().add(tbhapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 340, -1, -1));

        tbbatal.setText("BATAL");
        getContentPane().add(tbbatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 340, -1, -1));

        tbkeluar.setText("KELUAR");
        tbkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbkeluarActionPerformed(evt);
            }
        });
        getContentPane().add(tbkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(762, 340, -1, -1));

        jLabel6.setText("Nilai Ujian");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(anilaiuj, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 280, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbkeluarActionPerformed
        // TODO add your handling code here:
        new menuadmin().show();
        this.dispose();
    }//GEN-LAST:event_tbkeluarActionPerformed

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
            java.util.logging.Logger.getLogger(approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(approval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new approval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ajuml;
    private javax.swing.JTextField anilaiuj;
    private javax.swing.JTextField asurbal;
    private javax.swing.JTextField atem;
    private javax.swing.JTextField awak;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaproval;
    private javax.swing.JButton tbbatal;
    private javax.swing.JButton tbedit;
    private javax.swing.JButton tbhapus;
    private javax.swing.JButton tbkeluar;
    private javax.swing.JButton tbsimpan;
    private javax.swing.JButton tbtambah;
    // End of variables declaration//GEN-END:variables
}
