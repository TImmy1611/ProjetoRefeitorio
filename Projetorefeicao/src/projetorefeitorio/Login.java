package projetorefeitorio;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static projetorefeitorio.LigaBD.ligacao;
import static projetorefeitorio.Login.login;

public class Login extends javax.swing.JFrame {

    public static String login;

    public Login() {
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 204, 153));
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        ctxLogin = new javax.swing.JTextField();
        ctxPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Login");
        setBackground(new java.awt.Color(204, 0, 255));

        ctxLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctxLogin.setToolTipText("");
        ctxLogin.setPreferredSize(new java.awt.Dimension(100, 50));
        ctxLogin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ctxLoginFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ctxLoginFocusLost(evt);
            }
        });
        ctxLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginActionPerformed(evt);
            }
        });

        ctxPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ctxPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                ctxPasswordFocusLost(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 255, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jButton2.setText("Entrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetorefeitorio/gokuIcon-removebg-preview (1).png"))); // NOI18N
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BEM-VINDO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ctxPassword)
                            .addComponent(ctxLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(122, 122, 122)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(194, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctxLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jLabel5)
                    .addContainerGap(157, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctxLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxLoginActionPerformed
    private void mensagemErro(String erro) {
        JOptionPane.showMessageDialog(null, erro, "Erro Validação", JOptionPane.ERROR_MESSAGE);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /*validação através da recolha e comparação de password e login
        Verificar se existe ficheiro "login.txt"*/
        login = ctxLogin.getText();
        String pass = ctxPassword.getText();
        int verifica;
        try {
            if (VerificaLogin(login, pass)) {
                verifica = VerificaAdmin(login);
                System.out.println("Verifica=" + verifica);
                if (verifica == 1) {
                    SuperAdminMenuOpcoes sa = new SuperAdminMenuOpcoes();
                    this.setVisible(false);
                    sa.setVisible(true);
                } else if (verifica == 2) {
                    AdminMenuOpcoes mo = new AdminMenuOpcoes();
                    this.setVisible(false);
                    mo.setVisible(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ctxLoginFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ctxLoginFocusGained
        // TODO add your handling code here:
        if(ctxLogin.getText().equals("Utilizador")){
            ctxLogin.setText("");
            ctxLogin.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ctxLoginFocusGained

    private void ctxLoginFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ctxLoginFocusLost
        // TODO add your handling code here:
        if(ctxLogin.getText().equals("")){
            ctxLogin.setText("Utilizador");
            ctxLogin.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ctxLoginFocusLost

    private void ctxPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ctxPasswordFocusGained
        // TODO add your handling code here:
        if(ctxPassword.getText().equals("*********")){
            ctxPassword.setText("");
            ctxPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ctxPasswordFocusGained

    private void ctxPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ctxPasswordFocusLost
        // TODO add your handling code here:
        if(ctxPassword.getText().equals("")){
            ctxPassword.setText("*********");
            ctxPassword.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_ctxPasswordFocusLost

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxLogin;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
private boolean VerificaLogin(String login, String pass) throws SQLException {
        Connection con = ligacao();
        String sql = "SELECT * FROM admin WHERE Login= '" + login + "' AND Password= '" + pass + "'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return true;
        }
        return false;
    }

    private int VerificaAdmin(String login) throws SQLException {
        Connection con = ligacao();
        String sql = "SELECT * FROM admin WHERE Login= '" + login + "'";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            int tipoAdmin = rs.getInt("Tipo_admin_id_tipoadmin");
            int atividadeAdmin = rs.getInt("Estado_atividade_idEstado_atividade");
            if (atividadeAdmin == 0) {
                mensagemErro("Admin Inativo");
                return 0;
            } else if (atividadeAdmin == 1) {
                if (tipoAdmin == 1) {
                    return 1;
                } else if (tipoAdmin == 2) {
                    return 2;
                }
            }
        }
        return 0;
    }
}
