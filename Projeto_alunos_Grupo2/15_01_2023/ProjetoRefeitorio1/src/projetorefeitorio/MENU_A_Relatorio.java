/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetorefeitorio;

import static projetorefeitorio.Login1.HoverBotao;


/**
 *
 * @author dbugalho
 */
public class MENU_A_Relatorio extends javax.swing.JFrame {

    /**
     * Creates new form MENU_A_Relatorio
     */
    public MENU_A_Relatorio() {
        initComponents();
        HoverBotao(btn_turma);
        HoverBotao(btn_rpersonalizado);
        this.setSize(635, 360);
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));

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
        btn_rpersonalizado = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_turma = new javax.swing.JButton();
        Label_Info = new javax.swing.JLabel();
        btn_return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_rpersonalizado.setBackground(new java.awt.Color(255, 255, 255));
        btn_rpersonalizado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_rpersonalizado.setForeground(new java.awt.Color(182, 81, 38));
        btn_rpersonalizado.setText(" GERAR RELATÓRIO");
        btn_rpersonalizado.setPreferredSize(new java.awt.Dimension(255, 50));
        btn_rpersonalizado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rpersonalizadoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btn_turma.setBackground(new java.awt.Color(255, 255, 255));
        btn_turma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_turma.setForeground(new java.awt.Color(182, 81, 38));
        btn_turma.setText("GERIR TURMAS");
        btn_turma.setPreferredSize(new java.awt.Dimension(255, 50));
        btn_turma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_turmaActionPerformed(evt);
            }
        });

        Label_Info.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Label_Info.setForeground(new java.awt.Color(182, 81, 38));
        Label_Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_Info.setText("Cencal 2023 ");

        btn_return.setBackground(new java.awt.Color(255, 255, 255));
        btn_return.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_return.setForeground(new java.awt.Color(255, 51, 51));
        btn_return.setText("VOLTAR");
        btn_return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_returnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 390, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(524, Short.MAX_VALUE)
                .addComponent(Label_Info)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btn_rpersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btn_turma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_rpersonalizado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_return, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(Label_Info)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_rpersonalizadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rpersonalizadoActionPerformed
        // TODO add your handling code here:
        MENU_AG_Relatorio mr = new MENU_AG_Relatorio();
        this.dispose();
        mr.setVisible(true);
    }//GEN-LAST:event_btn_rpersonalizadoActionPerformed

    private void btn_turmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_turmaActionPerformed
        // TODO add your handling code here:
        MENU_SA_Turmas mt = new MENU_SA_Turmas();
        this.dispose();
        mt.setVisible(true);
    }//GEN-LAST:event_btn_turmaActionPerformed

    private void btn_returnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_returnActionPerformed
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
    }//GEN-LAST:event_btn_returnActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_A_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_A_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_A_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_A_Relatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_A_Relatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Info;
    private javax.swing.JButton btn_return;
    private javax.swing.JButton btn_rpersonalizado;
    private javax.swing.JButton btn_turma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
