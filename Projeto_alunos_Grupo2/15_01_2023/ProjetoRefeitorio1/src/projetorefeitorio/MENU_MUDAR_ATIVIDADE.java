/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetorefeitorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static projetorefeitorio.Login1.HoverBotao;

/**
 *
 * @author dbugalho
 */
public class MENU_MUDAR_ATIVIDADE extends javax.swing.JFrame {

    /**
     * Creates new form MENU_CRIAR_ADMIN
     */
    public MENU_MUDAR_ATIVIDADE() {
        initComponents();
        HoverBotao(btn_save);
        this.setSize(720, 420);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));

        preencheTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        btn_save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Label_Info = new javax.swing.JLabel();
        btn_return1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(182, 81, 38));
        btn_save.setText("Ativar/Desativar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mudar Atividade");

        jTable1.setForeground(new java.awt.Color(255, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Login", "Tipo Admin", "Estado Atividade"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Label_Info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(182, 81, 38));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("Cencal 2023 ");

        btn_return1.setBackground(new java.awt.Color(255, 255, 255));
        btn_return1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_return1.setForeground(new java.awt.Color(255, 51, 51));
        btn_return1.setText("VOLTAR");
        btn_return1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_return1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
                        .addGap(185, 185, 185))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_return1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Info)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_return1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Label_Info)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void mensagemErro(String erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro Validação", JOptionPane.ERROR_MESSAGE);
    }

    private void mensagemSucesso(String sucesso) {
        JOptionPane.showMessageDialog(null, sucesso, "Validação", JOptionPane.INFORMATION_MESSAGE);
    }
    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if (jTable1.getSelectedRow() >= 0) {
            int i = JOptionPane.showConfirmDialog(null, "Pretende Alterar Estado Atividade", "Tem a Certeza?", JOptionPane.YES_NO_OPTION);
            if (i == JOptionPane.YES_OPTION) {

                try {
                    int p = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                    int q = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
                    LigaBD.MudarEstadoAtividade(p, q);
                    MENU_MUDAR_ATIVIDADE tb;
                    tb = new MENU_MUDAR_ATIVIDADE();
                    this.setVisible(false);
                    tb.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MENU_MUDAR_ATIVIDADE.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_return1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_return1ActionPerformed
        // TODO add your handling code here:
        switch (Login1.verifica) {
            case 1:
                MENU_S_Admin sa = new MENU_S_Admin();
                this.setVisible(false);
                sa.setVisible(true);
                break;
            case 2:
                MENU_A_Relatorio mo = new MENU_A_Relatorio();
                this.setVisible(false);
                mo.setVisible(true);
                break;
            case 3:
                Login1 log = new Login1();
                this.dispose();
                log.setVisible(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btn_return1ActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_MUDAR_ATIVIDADE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_MUDAR_ATIVIDADE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_MUDAR_ATIVIDADE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_MUDAR_ATIVIDADE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_MUDAR_ATIVIDADE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Info;
    private javax.swing.JButton btn_return1;
    private javax.swing.JButton btn_save;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
 private void preencheTabela() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            Connection conn = LigaBD.ligacao();
            String sql = "SELECT * FROM admin";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            rs.first();

            int rowCount = modelo.getRowCount();
            for (int i = rowCount - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            do {
                modelo.addRow(new Object[]{rs.getInt("id_admin"), rs.getString("Nome"), rs.getString("Login"), rs.getInt("Tipo_admin_id_tipoadmin"), rs.getInt("Estado_atividade_idEstado_atividade")});
            } while (rs.next());

        } catch (Exception e) {
            Logger.getLogger(MENU_MUDAR_ATIVIDADE.class.getName()).log(Level.SEVERE, null, e);
        }

    }
}
