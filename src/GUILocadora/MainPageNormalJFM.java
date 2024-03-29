/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUILocadora;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author Gian Luca
 */
public class MainPageNormalJFM extends javax.swing.JFrame {

    /**
     * Creates new form MainPageNormalJFM
     */
    public MainPageNormalJFM() {
        initComponents();
        //setSize(minhaLargura, minhaAltura);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDPNormal = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLBLTime = new javax.swing.JLabel();
        jLBLDate = new javax.swing.JLabel();
        jMPAdmJMB = new javax.swing.JMenuBar();
        jMBLocadora = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMISair = new javax.swing.JMenuItem();
        CadastroJMB = new javax.swing.JMenu();
        jClienteMI = new javax.swing.JMenuItem();
        jFilmesMI = new javax.swing.JMenuItem();
        FichasJMB = new javax.swing.JMenu();
        jMIFilme = new javax.swing.JMenuItem();
        jMICliente = new javax.swing.JMenuItem();
        jMBPedidos = new javax.swing.JMenu();
        jMIPedidos = new javax.swing.JMenuItem();
        jMIReserva = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Normal");
        setMinimumSize(null);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setPreferredSize(new java.awt.Dimension(900, 722));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jDPNormal.setBackground(new java.awt.Color(240, 240, 240));
        jDPNormal.setForeground(new java.awt.Color(240, 240, 240));
        jDPNormal.setPreferredSize(new java.awt.Dimension(900, 635));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/Wileecoyte.gif"))); // NOI18N

        javax.swing.GroupLayout jDPNormalLayout = new javax.swing.GroupLayout(jDPNormal);
        jDPNormal.setLayout(jDPNormalLayout);
        jDPNormalLayout.setHorizontalGroup(
            jDPNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jDPNormalLayout.setVerticalGroup(
            jDPNormalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        jDPNormal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLBLTime.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLBLTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBLTime.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLBLDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLBLDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLBLDate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jMBLocadora.setText("Locadora");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Deslogar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMBLocadora.add(jMenuItem1);

        jMISair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMISair.setText("Sair");
        jMISair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMISairMouseClicked(evt);
            }
        });
        jMISair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMISairActionPerformed(evt);
            }
        });
        jMBLocadora.add(jMISair);

        jMPAdmJMB.add(jMBLocadora);

        CadastroJMB.setText("Cadastro");

        jClienteMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jClienteMI.setText("Cliente");
        jClienteMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jClienteMIActionPerformed(evt);
            }
        });
        CadastroJMB.add(jClienteMI);

        jFilmesMI.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jFilmesMI.setText("Filmes");
        jFilmesMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFilmesMIActionPerformed(evt);
            }
        });
        CadastroJMB.add(jFilmesMI);

        jMPAdmJMB.add(CadastroJMB);

        FichasJMB.setText("Fichas");

        jMIFilme.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK));
        jMIFilme.setText("Filme");
        jMIFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIFilmeActionPerformed(evt);
            }
        });
        FichasJMB.add(jMIFilme);

        jMICliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMICliente.setText("Cliente");
        jMICliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIClienteActionPerformed(evt);
            }
        });
        FichasJMB.add(jMICliente);

        jMPAdmJMB.add(FichasJMB);

        jMBPedidos.setText("Pedidos");

        jMIPedidos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMIPedidos.setText("Novo");
        jMIPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIPedidosActionPerformed(evt);
            }
        });
        jMBPedidos.add(jMIPedidos);

        jMIReserva.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMIReserva.setText("Reserva");
        jMIReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIReservaActionPerformed(evt);
            }
        });
        jMBPedidos.add(jMIReserva);

        jMPAdmJMB.add(jMBPedidos);

        setJMenuBar(jMPAdmJMB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDPNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 564, Short.MAX_VALUE)
                .addComponent(jLBLTime, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLBLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDPNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLBLTime, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLBLDate, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        String diaSemana[] = {"domingo", "segunda-feira",
            "terça-feira", "quarta-feira",
            "quinta-feira", "sexta-feira",
            "sábado"};

        String meses[] = {"janeiro", "fevereiro", "março",
            "abril", "maio", "junho", "julho",
            "agosto", "setembro", "outubro",
            "novembro", "dezembro"};

        Calendar agora = Calendar.getInstance();
        int ho = agora.get(Calendar.HOUR_OF_DAY);
        int mi = agora.get(Calendar.MINUTE);
        int se = agora.get(Calendar.SECOND);

        int ds = agora.get(Calendar.DAY_OF_WEEK);
        int dia = agora.get(Calendar.DAY_OF_MONTH);
        int mes = agora.get(Calendar.MONTH);
        int ano = agora.get(Calendar.YEAR);

        jLBLTime.setText(formatar(ho % 12) + ":" + formatar(mi) + ":" + formatar(se) + "");

        jLBLDate.setText(diaSemana[ds - 1] + ", " + formatar(dia) + " de " + meses[mes] + " de " + ano + "");
    }//GEN-LAST:event_formWindowOpened

    private void jClienteMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jClienteMIActionPerformed
        Cad_ClienteJIF Cad_Cliente = new Cad_ClienteJIF();
        jDPNormal.add(Cad_Cliente);
        Cad_Cliente.setVisible(true);
    }//GEN-LAST:event_jClienteMIActionPerformed

    private void jFilmesMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFilmesMIActionPerformed
        Cad_FilmeJIF Cad_Filme = new Cad_FilmeJIF();
        jDPNormal.add(Cad_Filme);
        Cad_Filme.setVisible(true);
    }//GEN-LAST:event_jFilmesMIActionPerformed

    private void jMIPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIPedidosActionPerformed
        Cad_PedidoJIF Cad_Pedido = new Cad_PedidoJIF();
        jDPNormal.add(Cad_Pedido);
        Cad_Pedido.setVisible(true);
    }//GEN-LAST:event_jMIPedidosActionPerformed

    private void jMIReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIReservaActionPerformed
        Cad_ReservaJIF Cad_Reserva = new Cad_ReservaJIF();
        jDPNormal.add(Cad_Reserva);
        Cad_Reserva.setVisible(true);
    }//GEN-LAST:event_jMIReservaActionPerformed

    private void jMIFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIFilmeActionPerformed
        Ficha_FilmeJIF Ficha_Filme = new Ficha_FilmeJIF();
        jDPNormal.add(Ficha_Filme);
        Ficha_Filme.setVisible(true);
    }//GEN-LAST:event_jMIFilmeActionPerformed

    private void jMIClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIClienteActionPerformed
        Ficha_ClienteJIF Ficha_Cliente = new Ficha_ClienteJIF();
        jDPNormal.add(Ficha_Cliente);
        Ficha_Cliente.setVisible(true);
    }//GEN-LAST:event_jMIClienteActionPerformed

    private void jMISairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMISairActionPerformed
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Fechar?","Sair da Tela",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
            System.exit(0);
        }
    }//GEN-LAST:event_jMISairActionPerformed

    private void jMISairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMISairMouseClicked
        StartPageJFM login_page = new StartPageJFM();
        login_page.setVisible(true);
    }//GEN-LAST:event_jMISairMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        if(javax.swing.JOptionPane.showConfirmDialog(null,"Deseja Deslogar?","Trocar o usuário",javax.swing.JOptionPane.YES_NO_OPTION )==0){  
            this.dispose();
            StartPageJFM login_page = new StartPageJFM();
            login_page.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainPageNormalJFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPageNormalJFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPageNormalJFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPageNormalJFM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPageNormalJFM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu CadastroJMB;
    private javax.swing.JMenu FichasJMB;
    private javax.swing.JMenuItem jClienteMI;
    private javax.swing.JDesktopPane jDPNormal;
    private javax.swing.JMenuItem jFilmesMI;
    private javax.swing.JLabel jLBLDate;
    private javax.swing.JLabel jLBLTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMBLocadora;
    private javax.swing.JMenu jMBPedidos;
    private javax.swing.JMenuItem jMICliente;
    private javax.swing.JMenuItem jMIFilme;
    private javax.swing.JMenuItem jMIPedidos;
    private javax.swing.JMenuItem jMIReserva;
    private javax.swing.JMenuItem jMISair;
    private javax.swing.JMenuBar jMPAdmJMB;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
private String formatar(int num) {
        DecimalFormat df = new DecimalFormat("00");
        return df.format(num);
    }
/**
//<editor-fold defaultstate="collapsed" desc="Tamanho automático de tela.">
    Toolkit kit = Toolkit.getDefaultToolkit();
    Dimension tamTela = kit.getScreenSize();
    int larg = tamTela.width;
    int alt = tamTela.height;
    int minhaLargura = (int) (larg * 0.9);
    int minhaAltura = (int) (alt * 0.9);
    //</editor-fold>
    * */
}
