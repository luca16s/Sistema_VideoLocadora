/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUILocadora;

import SourceCodes.AutenticationLogin;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.PlainDocument;

/**
 *
 * @author Gian Luca
 */
public class StartPageJFM extends javax.swing.JFrame {
    int count = 0;
    

    /**
     * Creates new form StartPageJFM
     */
    public StartPageJFM() {
        initComponents();
        //<editor-fold defaultstate="collapsed" desc="Limite de Caracteres no TextField">
        jTXFLogin.setDocument((Document) new CharacterLimit(20));
        jTXFPassword.setDocument((Document) new CharacterLimit(10));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LBLTitle = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LBLLogin = new javax.swing.JLabel();
        LBLPassword = new javax.swing.JLabel();
        BTNLogin = new javax.swing.JButton();
        BTNCancelar = new javax.swing.JButton();
        jTXFLogin = new javax.swing.JTextField();
        jTXFPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Locadora Do Coiote");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setFocusable(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Wileecoyte.gif"))); // NOI18N

        LBLTitle.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        LBLTitle.setText("Locadora Do Coiote");
        LBLTitle.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 34)); // NOI18N
        jLabel3.setText("Tela de Login");

        LBLLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLLogin.setText("Usuário:");

        LBLPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBLPassword.setText("Senha:");

        BTNLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Accept.png"))); // NOI18N
        BTNLogin.setText("Entrar");
        BTNLogin.setToolTipText("");
        BTNLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNLoginMouseClicked(evt);
            }
        });
        BTNLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNLoginActionPerformed(evt);
            }
        });

        BTNCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Cancel.png"))); // NOI18N
        BTNCancelar.setText("Cancelar");
        BTNCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BTNCancelarMouseClicked(evt);
            }
        });

        jTXFLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTXFPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLTitle)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTXFLogin))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BTNLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTNCancelar))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LBLPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTXFPassword)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LBLTitle)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LBLLogin)
                            .addComponent(jTXFLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBLPassword)
                            .addComponent(jTXFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTNLogin)
                            .addComponent(BTNCancelar))))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTNLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNLoginMouseClicked
        //<editor-fold defaultstate="collapsed" desc="Login and Autentication">
        AutenticationLogin Al = new AutenticationLogin();
        String username = jTXFLogin.getText();
        String Password = jTXFPassword.getText();
        boolean resposta = false;
        try {
            resposta = Al.LoginNivel(username, Password);
        } catch (SQLException ex) {
            Logger.getLogger(StartPageJFM.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (resposta == true) {
            if (Al.Acesso.equalsIgnoreCase("Administrador")) {
                MainPageAdminJFM MP = new MainPageAdminJFM();
                MP.setVisible(true);
                dispose();
            } else {
                if (Al.Acesso.equals("Funcionario")) {
                    MainPageNormalJFM MP = new MainPageNormalJFM();
                    MP.setVisible(true);
                    dispose();
                }
            }
        } else {
            jTXFLogin.setText("");
            jTXFPassword.setText("");
            count += 1;
            if (count == 3) {
                JOptionPane.showMessageDialog(null,"Você errou três vezes. Encerrando o Sistema!","Dados Incorretos!",JOptionPane.ERROR_MESSAGE);
                System.exit(0);
            }
        }
        //</editor-fold>
        //<editor-fold defaultstate="collapsed">
        /**
         * String sql = "select login,senha from funcionarios where login=? and
         * senha=?"; try { pst = conn.prepareStatement(sql); pst.setString(1,
         * username); pst.setString(2, Password); rs = pst.executeQuery(); if
         * (rs.next()) { if ("Administrador".equals("Administrador")) {
         * MainPageAdminJFM MP = new MainPageAdminJFM(); MP.setVisible(true);
         * dispose(); } else { if ("Normal".equals("s")) { MainPageNormalJFM MP
         * = new MainPageNormalJFM(); MP.setVisible(true); dispose(); } } } else
         * { JOptionPane.showMessageDialog(null, "Please try again"); } } catch
         * (Exception e) { JOptionPane.showMessageDialog(null, e); }*
         */
        //</editor-fold>
    }//GEN-LAST:event_BTNLoginMouseClicked

    private void BTNLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNLoginActionPerformed

    }//GEN-LAST:event_BTNLoginActionPerformed

    private void BTNCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BTNCancelarMouseClicked
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","Sair da Tela",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
            System.exit(0);
        }
    }//GEN-LAST:event_BTNCancelarMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartPageJFM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPageJFM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPageJFM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPageJFM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //<editor-fold defaultstate="collapsed" desc="SplashScreen Configuration!">
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {

                }
                //</editor-fold>

                new StartPageJFM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNCancelar;
    private javax.swing.JButton BTNLogin;
    private javax.swing.JLabel LBLLogin;
    private javax.swing.JLabel LBLPassword;
    private javax.swing.JLabel LBLTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTXFLogin;
    private javax.swing.JPasswordField jTXFPassword;
    // End of variables declaration//GEN-END:variables
//<editor-fold defaultstate="collapsed" desc="Limite de Caracteres">
    public class CharacterLimit extends PlainDocument {

        private int iMaxLength;

        public CharacterLimit(int maxlen) {
            super();
            iMaxLength = maxlen;
        }

        @Override
        public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
            

            if (iMaxLength <= 0) // aceitara qualquer no. de caracteres  
            {
                super.insertString(offset, str, attr);
                return;
            }

            int ilen = (getLength() + str.length());
            if (ilen <= iMaxLength) // se o comprimento final for menor...  
            {
                super.insertString(offset, str, attr);   // ...aceita str  
            }
        }
    }
//</editor-fold>
}
