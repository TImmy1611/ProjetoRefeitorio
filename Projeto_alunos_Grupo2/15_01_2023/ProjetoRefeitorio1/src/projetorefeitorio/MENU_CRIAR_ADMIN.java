/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetorefeitorio;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isUpperCase;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static projetorefeitorio.Login1.HoverBotao;

/**
 *
 * @author dbugalho
 */
public class MENU_CRIAR_ADMIN extends javax.swing.JFrame {

    /**
     * Creates new form MENU_CRIAR_ADMIN
     */
    public MENU_CRIAR_ADMIN() {
        initComponents();
        HoverBotao(btn_save);
        HoverBotao(btn_eliminar);
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

        jScrollBar1 = new javax.swing.JScrollBar();
        btn_save = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ctxLogin = new javax.swing.JTextField();
        fld_pass = new javax.swing.JPasswordField();
        lbl_nome = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        lbl_repass = new javax.swing.JLabel();
        lbl_repass1 = new javax.swing.JLabel();
        fld_repass1 = new javax.swing.JPasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        lbl_nome1 = new javax.swing.JLabel();
        ctxLogin1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Label_Info = new javax.swing.JLabel();
        btn_return1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_save.setBackground(new java.awt.Color(255, 255, 255));
        btn_save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_save.setForeground(new java.awt.Color(182, 81, 38));
        btn_save.setText("GUARDAR");
        btn_save.setPreferredSize(new java.awt.Dimension(255, 50));
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_eliminar.setBackground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_eliminar.setForeground(new java.awt.Color(182, 81, 38));
        btn_eliminar.setText("Mudar Atividade");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        ctxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginActionPerformed(evt);
            }
        });

        lbl_nome.setText("Login:");

        lbl_pass.setText("PASSWORD :");

        lbl_repass.setText("Tipo:");

        lbl_repass1.setText("Re PASS :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Super Admin", "Admin", "Admin Financeiro" }));
        jComboBox1.setSelectedItem(jComboBox1);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        lbl_nome1.setText("Nome");

        ctxLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLogin1ActionPerformed(evt);
            }
        });

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 129, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lbl_repass, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lbl_repass1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(fld_repass1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(fld_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(btn_return1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(6, 6, 6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ctxLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Label_Info)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fld_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_repass1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fld_repass1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_return1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_repass, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
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
        try {
            // TODO add your handling code here:
            Connection conn = LigaBD.ligacao();
        } catch (SQLException ex) {
            Logger.getLogger(MENU_CRIAR_ADMIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        String nome = ctxLogin1.getText();
        String login = ctxLogin.getText();
        String pass = fld_pass.getText();
        String repass = fld_repass1.getText();
        int tipo = jComboBox1.getSelectedIndex() + 1;
        String atividade = "1";
        if ((validaNome(nome) && (validaLogin(login)) && (validaPass(pass) && (repass.equals(pass)))))  {
            try {
                LigaBD.registaUtilizador(nome, login, pass, tipo, atividade);
                mensagemSucesso("Administrador Criado ");
            } catch (SQLException ex) {
                Logger.getLogger(MENU_CRIAR_ADMIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void ctxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxLoginActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        // TODO add your handling code here:
        MENU_MUDAR_ATIVIDADE ma = new MENU_MUDAR_ATIVIDADE();
        this.setVisible(false);
        ma.setVisible(true);
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void ctxLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLogin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxLogin1ActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_CRIAR_ADMIN.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_CRIAR_ADMIN.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_CRIAR_ADMIN.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_CRIAR_ADMIN.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_CRIAR_ADMIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_Info;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_return1;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField ctxLogin;
    private javax.swing.JTextField ctxLogin1;
    private javax.swing.JPasswordField fld_pass;
    private javax.swing.JPasswordField fld_repass1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_nome1;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_repass;
    private javax.swing.JLabel lbl_repass1;
    // End of variables declaration//GEN-END:variables
    private boolean validaNome(String nome) {
        int x, contador = 0, t = nome.length();
        char c;
        if (t == 0) {
            mensagemErro("Nome Inválido");
            return false;
        } else {
            for (x = 0; x < t; x++) {
                c = nome.charAt(x);
                if (isLetter(c)) {
                    contador++;
                } else {
                    mensagemErro("Nome não pode conter numeros");
                    return false;
                }
            }
            if (t != contador) {
                return false;
            }
        }
        return true;
    }

    private boolean validaLogin(String login) {
        int x, contador = 0, t = login.length();
        char c;
        if (t == 0) {
            mensagemErro("Login Inválido");
            return false;
        }
        if (t <= 7) {
            mensagemErro("Campo Login deve ter pelo menos 8 caracteres!");
            return false;
        }
        return true;

    }

    private boolean validaPass(String pass) {
        int x = 0, t = pass.length();
        int contadorM = 0;
        int contadorn = 0;
        int contadoresp = 0;
        char c;
        if (t < 8) {
            mensagemErro("Password deve ter pelo menos 8 caracteres");
            return false;
        } else {
            for (x = 0; x < t; x++) {
                c = pass.charAt(x);
                if (isUpperCase(c)) {
                    contadorM++;
                }
                if (isDigit(c)) {
                    contadorn++;
                }
                if (!isDigit(c) && !isLetter(c)) {
                    contadoresp++;
                }
            }
            if ((contadorM > 0) && (contadorn > 0) && (contadoresp > 0)) {
                return true;
            } else {
                mensagemErro("Password deve conter 1 caracter maiusculo\n1 caracter numerico\n1 caracter especial");
                return false;
            }
        }
    }
}
