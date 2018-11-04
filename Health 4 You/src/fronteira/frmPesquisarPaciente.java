/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import entidade.Paciente;
import javax.swing.JTable;
import persistencia.PacienteDAO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ma-th
 */
public class frmPesquisarPaciente extends javax.swing.JFrame {
  
 
    frmAlterarPaciente enviar;
    
    private String[] colunas = new String[]{"Codigo","Nome",
           "Endereço","Telefone"};
    
    private DefaultTableModel tmPacientes = new DefaultTableModel
               (null, colunas);
    
    public List<Paciente> listaPacientes;
    private ListSelectionModel lsmPacientes; 
    
   
    /**
     * Creates new form frmPesquisarCliente
     */
    public frmPesquisarPaciente() {
        initComponents();
        listarPacientes();
       
        
        
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        txtNome = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtDataDeNascimento = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPesquisaPaciente = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        btnInserir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluirPaciente = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();

        jButton3.setText("jButton1");

        txtCPF.setText("jTextField1");

        txtDataDeNascimento.setText("jTextField1");

        txtEndereco.setText("jTextField1");

        txtNumero.setText("jTextField1");

        txtBairro.setText("jTextField1");

        txtEstado.setText("jTextField1");

        txtCidade.setText("jTextField1");

        txtTelefone.setText("jTextField1");

        txtCelular.setText("jTextField1");

        txtEmail.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pacientes");
        setUndecorated(true);
        setResizable(false);

        txtPesquisaPaciente.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtPesquisaPaciente.setForeground(new java.awt.Color(0, 73, 125));
        txtPesquisaPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));

        btnPesquisar.setBackground(new java.awt.Color(0, 155, 219));
        btnPesquisar.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219)));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblPaciente.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        tblPaciente.setModel(tmPacientes);
        tblPaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmPacientes = tblPaciente.getSelectionModel();
        lsmPacientes.addListSelectionListener (new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()) {
                    tblPacienteLinhaSelecionada(tblPaciente);
                }
            }

        });
        tblPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPacienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPaciente);

        btnInserir.setBackground(new java.awt.Color(0, 155, 219));
        btnInserir.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnInserir.setForeground(new java.awt.Color(255, 255, 255));
        btnInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Inserir.png"))); // NOI18N
        btnInserir.setText("Inserir");
        btnInserir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219)));
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(0, 155, 219));
        btnAlterar.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Atualizar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219)));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluirPaciente.setBackground(new java.awt.Color(0, 155, 219));
        btnExcluirPaciente.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        btnExcluirPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluirPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Lixeira.png"))); // NOI18N
        btnExcluirPaciente.setText("Excluir");
        btnExcluirPaciente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219)));
        btnExcluirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirPacienteActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 73, 125));
        jLabel1.setText("PESQUISA DE PACIENTES");

        lblSair.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(0, 73, 125));
        lblSair.setText("X");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addComponent(lblSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnExcluirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(txtPesquisaPaciente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSair)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPesquisaPaciente)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluirPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
        dispose();
        frmPaciente cliente = new frmPaciente();
        cliente.setVisible(true);
                
    }//GEN-LAST:event_btnInserirActionPerformed
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if(txtNome.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Favor selecionar um paciente para alterar","Alterar Paciente",JOptionPane.INFORMATION_MESSAGE);
        }else{
            enviarAlteracaoPaciente();
            dispose();
        }
        
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        
       listarPacientes();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnExcluirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirPacienteActionPerformed
        // TODO add your handling code here:
        excluirPaciente();
        listarPacientes();
    }//GEN-LAST:event_btnExcluirPacienteActionPerformed

    private void tblPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPacienteMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tblPacienteMouseClicked

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_lblSairMouseClicked

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
//            java.util.logging.Logger.getLogger(frmPesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmPesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmPesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmPesquisarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPesquisarPaciente().setVisible(true);
            }
        });
    }

    
      public void mostrarPacientes(List<Paciente> pacientes){
        
        while (tmPacientes.getRowCount() > 0){
            tmPacientes.removeRow(0);
        }
        if(pacientes.size() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum Paciente foi encontrado!");
        }else{
            
            for (int i = 0; i < pacientes.size(); i++){
                tmPacientes.addRow(colunas);
                tmPacientes.setValueAt(pacientes.get(i).getCodigo(), i,0);
                tmPacientes.setValueAt(pacientes.get(i).getNome(), i,1);
                tmPacientes.setValueAt(pacientes.get(i).getRua(), i,2);
                tmPacientes.setValueAt(pacientes.get(i).getTelefone(), i,3);
                
            }
        }
    }
      
      public void listarPacientes(){
        
        PacienteDAO pacienteDAO =  new PacienteDAO();
        listaPacientes = pacienteDAO.listarPacientes("%"
             +txtPesquisaPaciente.getText().trim() + "%");
        mostrarPacientes(listaPacientes);
        
    }
      
      public void exibePacientes(){
          
          frmAlterarPaciente alt = new frmAlterarPaciente();
          PacienteDAO pacienteDAO =  new PacienteDAO();
        listaPacientes = pacienteDAO.listarPacientes("%"
             +alt.txtNomeAlterar.getText().trim() + "%");
        mostrarPacientes(listaPacientes);
      }
    
      
     
      
      private void excluirPaciente(){
        
          if(txtNome.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Favor selecionar um paciente para excluir","Excluir Paciente",JOptionPane.INFORMATION_MESSAGE);
        }else{
          
          int excluir;
          
          excluir = JOptionPane.showConfirmDialog(null,"Deseja excluir esse paciente ?","Excluir Paciente",0);
          
          if(excluir == 0){
              
        Paciente paciente = new Paciente();
        paciente.setCodigo(listaPacientes.get(tblPaciente.getSelectedRow()).getCodigo());
        PacienteDAO pacienteDAO = new PacienteDAO();
        pacienteDAO.excluirPaciente(paciente);
        JOptionPane.showMessageDialog(this, "Pacinte excluído com sucesso!");
        
    }
          }
      }
      
          public void tblPacienteLinhaSelecionada(JTable tbl){
        
            int linhaSelecionada = tbl.getSelectedRow();
            
            
            
             if (linhaSelecionada != -1){
            
             txtNome.setText(listaPacientes.get(linhaSelecionada).getNome());
             txtCPF.setText(listaPacientes.get(linhaSelecionada).getCpf());
             txtDataDeNascimento.setText(listaPacientes.get(linhaSelecionada).getDatanascimento());
             txtEndereco.setText(listaPacientes.get(linhaSelecionada).getRua());
             txtNumero.setText(listaPacientes.get(linhaSelecionada).getNumero());
             txtBairro.setText(listaPacientes.get(linhaSelecionada).getBairro());
             txtEstado.setText(listaPacientes.get(linhaSelecionada).getEstado());
             txtCidade.setText(listaPacientes.get(linhaSelecionada).getCidade());
             txtTelefone.setText(listaPacientes.get(linhaSelecionada).getTelefone());
             txtCelular.setText(listaPacientes.get(linhaSelecionada).getCelular());
             txtEmail.setText(listaPacientes.get(linhaSelecionada).getEmail());
             txtId.setText(String.valueOf(listaPacientes.get(linhaSelecionada).getCodigo()));
             
             }
        }
      
      
          public void enviarAlteracaoPaciente(){
              if(enviar==null){
           
            
            enviar = new frmAlterarPaciente();
            enviar.setVisible(true);
            enviar.recebe(txtNome.getText());
            enviar.recebeId(txtId.getText());
            enviar.recebeCPF(txtCPF.getText());
            enviar.recebeNascimento(txtDataDeNascimento.getText());
            enviar.recebeEndereco(txtEndereco.getText());
            enviar.recebeNumero(txtNumero.getText());
            enviar.recebeBairro(txtBairro.getText());
            enviar.recebeEstado(txtEstado.getText());
            enviar.recebeCidade(txtCidade.getText());
            enviar.recebeTelefone(txtTelefone.getText());
            enviar.recebeCelular(txtCelular.getText());
            enviar.recebeEmail(txtEmail.getText());
            
        }else{
             
                  
            enviar = new frmAlterarPaciente();
            enviar.setVisible(true);
            enviar.recebe(txtNome.getText());
            enviar.recebeId(txtId.getText());
            enviar.recebeCPF(txtCPF.getText());
            enviar.recebeNascimento(txtDataDeNascimento.getText());
            enviar.recebeEndereco(txtEndereco.getText());
            enviar.recebeNumero(txtNumero.getText());
            enviar.recebeBairro(txtBairro.getText());
            enviar.recebeEstado(txtEstado.getText());
            enviar.recebeCidade(txtCidade.getText());
            enviar.recebeTelefone(txtTelefone.getText());
            enviar.recebeCelular(txtCelular.getText());
            enviar.recebeEmail(txtEmail.getText());
            enviar.setState(frmAlterarPaciente.NORMAL);
             
          }
      
          }
          
      
          
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluirPaciente;
    private javax.swing.JButton btnInserir;
    private javax.swing.JToggleButton btnPesquisar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSair;
    private javax.swing.JTable tblPaciente;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisaPaciente;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    private void tblPacienteLinhaSelecionada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
