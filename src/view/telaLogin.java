/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.Gerente;
import entidadesDAO.GerenteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Josiel
 */
public class telaLogin extends javax.swing.JFrame {

    /**
     * Creates new form telaLogin
     */
    public telaLogin() {
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

        LoginTexto = new javax.swing.JTextField();
        Login = new javax.swing.JLabel();
        SenhaLabel = new javax.swing.JLabel();
        Entrar = new javax.swing.JButton();
        senhaTexto = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginTextoActionPerformed(evt);
            }
        });

        Login.setText("LOGIN");

        SenhaLabel.setText("SENHA");

        Entrar.setText("Entrar");
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(Entrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Login)
                            .addComponent(SenhaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(LoginTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(senhaTexto))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LoginTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Login))
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SenhaLabel)
                        .addComponent(senhaTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(Entrar)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginTextoActionPerformed
        // chama a classe login e verifica se o texto login eh igual ao cadastrado
    }//GEN-LAST:event_LoginTextoActionPerformed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
            // chama uma classe que valida o login e a senha
        TelaInicial telaInicial = TelaInicial.getInstance();
        this.dispose();
        telaInicial.setVisible(true);
        
        
    }//GEN-LAST:event_EntrarMouseClicked

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        // TODO add your handling code here:
        GerenteDAO gerente = new GerenteDAO();
        Gerente manager;
        manager = gerente.buscarGerente(LoginTexto.getText());
        if(manager == null){
            JOptionPane.showMessageDialog(this, "Login não existe");
        } 
        else 
            if(manager.getSenha().equals(String.valueOf(senhaTexto.getPassword()))){             
                TelaInicial tela = TelaInicial.getInstance();
                tela.setVisible(true);            
        }
        else
                JOptionPane.showMessageDialog(this, "Senha não confere");
        
        //ajeitar
        
    }//GEN-LAST:event_EntrarActionPerformed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JLabel Login;
    public javax.swing.JTextField LoginTexto;
    private javax.swing.JLabel SenhaLabel;
    private javax.swing.JPasswordField senhaTexto;
    // End of variables declaration//GEN-END:variables
}
