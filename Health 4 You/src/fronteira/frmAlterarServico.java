/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;
import entidade.Servico;
import javax.swing.JOptionPane;
import persistencia.ServicoDAO;
/**
 *
 * @author ma-th
 */
public class frmAlterarServico extends javax.swing.JFrame {

    
    /**
     * Creates new form frmAlterarServico
     */
    public frmAlterarServico() {
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

        txtCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeServicoAlterar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JToggleButton();
        txtValorAlterar = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        txtCodigo.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 73, 125));
        jLabel1.setText("ALTERAÇÃO DE SERVIÇO");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 73, 125));
        jLabel2.setText("Nome do Serviço:");

        txtNomeServicoAlterar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtNomeServicoAlterar.setForeground(new java.awt.Color(0, 73, 125));
        txtNomeServicoAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtNomeServicoAlterar.setCaretColor(new java.awt.Color(0, 73, 125));

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 73, 125));
        jLabel3.setText("Valor:");

        btnCadastrar.setBackground(new java.awt.Color(0, 155, 219));
        btnCadastrar.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Inserir.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219)));
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 155, 219));
        btnCancelar.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Cancelar IMG - Sistema.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219)));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtValorAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtValorAlterar.setForeground(new java.awt.Color(0, 73, 125));
        txtValorAlterar.setCaretColor(new java.awt.Color(0, 73, 125));
        txtValorAlterar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 73, 125));
        jLabel4.setText("X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeServicoAlterar)
                    .addComponent(txtValorAlterar)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeServicoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtValorAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        frmPesquisaServico ps = new frmPesquisaServico();
        alterarServico();
        ps.listarServicos();
        dispose();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        frmPesquisaServico ps = new frmPesquisaServico();
        ps.setVisible(true);
        ps.listarServicos();
        dispose();
        
        
        
    }//GEN-LAST:event_btnCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAlterarServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlterarServico().setVisible(true);
            }
        });
    }

    public void recebeNome(String recebeNome){ 
       txtNomeServicoAlterar.setText(recebeNome);
   }
    
    public void recebeValor(String recebeValor){ 
       txtValorAlterar.setText(recebeValor);
   }
    
    public void recebeId(String recebeId){
      txtCodigo.setText(recebeId);
    }
    
    private void alterarServico(){
    
       
        int opcao =  JOptionPane.showConfirmDialog(null, "Deseja alterar o serviço?","Alterar Serviço",0);
       
       if (opcao == 0){
           
          Servico ser = new Servico();
        
        ser.setNome(txtNomeServicoAlterar.getText().trim());
        ser.setValor(txtValorAlterar.getText().trim());
        ser.setCodigo(Integer.valueOf(txtCodigo.getText()));
        
        ServicoDAO servicoDAO = new ServicoDAO();
        servicoDAO.alterarServico(ser);
           JOptionPane.showMessageDialog(null,"Serviço alterado com sucesso!","Serviço Alterado",JOptionPane.INFORMATION_MESSAGE);
        
           frmPesquisaServico ps = new frmPesquisaServico();
           
        String n = txtNomeServicoAlterar.getText();
       
        ps.listaServicos = servicoDAO.listarServicos("%"+
             n + "%");
        ps.mostrarServicos(ps.listaServicos);
        ps.listarServicos();
        dispose();
        ps.setVisible(true);
       }else{
        frmPesquisaServico ps = new frmPesquisaServico();
        ps.setVisible(true);
        ps.listarServicos();
        dispose();
     
        
       }   
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCadastrar;
    private javax.swing.JToggleButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNomeServicoAlterar;
    private javax.swing.JFormattedTextField txtValorAlterar;
    // End of variables declaration//GEN-END:variables
}
