/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import entidade.Agendamento;
import java.awt.Color;
import java.sql.Date;
import java.util.Calendar;
import persistencia.AgendamentoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author joao-
 */
public class frmAgendamento extends javax.swing.JFrame {

    frmAlteraAgendamento enviar;
    
    private String[] colunas = new String[]{"Número","Nome",
           "Servico","Valor","Horario","Data"};
    
    private DefaultTableModel tmAgendamentos = new DefaultTableModel
               (null, colunas);
    
    private List<Agendamento> listaAgendamentos;
    private ListSelectionModel lsmAgendamentos;
    
    
    
    /**
     * Creates new form frmAgendamento
     */
    public frmAgendamento() {
        initComponents();
        listarAgendamentos();
        this.getContentPane().setBackground(new Color(240,240,240));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIDAgendamento = new javax.swing.JTextField();
        txtNomePaciente = new javax.swing.JTextField();
        txtCPFPaciente = new javax.swing.JTextField();
        txtServico = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtData = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisarConsultas = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAgendamentos = new javax.swing.JTable();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnInserr = new javax.swing.JButton();
        lblSair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamento de Serviços");
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 73, 125));
        jLabel1.setText("AGENDAMENTO DE CONSULTAS");

        txtPesquisarConsultas.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtPesquisarConsultas.setForeground(new java.awt.Color(0, 73, 125));
        txtPesquisarConsultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));

        tblAgendamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        tblAgendamentos.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        tblAgendamentos.setModel(tmAgendamentos);
        tblAgendamentos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmAgendamentos = tblAgendamentos.getSelectionModel();
        lsmAgendamentos.addListSelectionListener (new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()) {
                    tblAgendamentosLinhaSelecionada(tblAgendamentos);
                }
            }

        });
        jScrollPane1.setViewportView(tblAgendamentos);

        btnAlterar.setBackground(new java.awt.Color(0, 155, 219));
        btnAlterar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Atualizar.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setBackground(new java.awt.Color(0, 155, 219));
        btnPesquisar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Pesquisar.png"))); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(0, 155, 219));
        btnExcluir.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Lixeira.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 155, 219));
        btnCancelar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Cancelar IMG - Sistema.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnInserr.setBackground(new java.awt.Color(0, 155, 219));
        btnInserr.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnInserr.setForeground(new java.awt.Color(255, 255, 255));
        btnInserr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Inserir.png"))); // NOI18N
        btnInserr.setText("Inserir");
        btnInserr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserrActionPerformed(evt);
            }
        });

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
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSair))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPesquisarConsultas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnInserr, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSair)
                        .addGap(37, 37, 37))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar)
                    .addComponent(txtPesquisarConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInserr)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnCancelar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(474, 373));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserrActionPerformed
        // TODO add your handling code here:
        new frmCadastraAgendamento().setVisible(true);
    }//GEN-LAST:event_btnInserrActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:
        
        if(txtNomePaciente.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Favor selecionar um agendamento para alterar","Alterar Agendamento",
                 JOptionPane.INFORMATION_MESSAGE);
        }else{
       enviarAlteracaoAgendamento();}
    
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:
        listarAgendamentos();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_lblSairMouseClicked

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:
         if(txtNomePaciente.getText().isEmpty()){
         JOptionPane.showMessageDialog(null,"Favor selecionar um agendamento para excluir","Excluir Agendamento",
                 JOptionPane.INFORMATION_MESSAGE);
        }else{
        excluirAgendamento();
        listarAgendamentos();
    }//GEN-LAST:event_btnExcluirActionPerformed
    }
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
//            java.util.logging.Logger.getLogger(frmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAgendamento().setVisible(true);
            }
        });
    }

      private void mostrarAgendamentos(List<Agendamento> agendamentos){
        
        while (tmAgendamentos.getRowCount() > 0){
            tmAgendamentos.removeRow(0);
        }
        if(agendamentos.size() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum Agendamento foi encontrado!");
        }else{
            
            for (int i = 0; i < agendamentos.size(); i++){
                tmAgendamentos.addRow(colunas);
                tmAgendamentos.setValueAt(agendamentos.get(i).getCodigo(), i,0);
                tmAgendamentos.setValueAt(agendamentos.get(i).getNome(), i,1);
                tmAgendamentos.setValueAt(agendamentos.get(i).getServico(), i,2);
                tmAgendamentos.setValueAt(agendamentos.get(i).getValor(), i,3);
                tmAgendamentos.setValueAt(agendamentos.get(i).getHorario(), i,4);
                tmAgendamentos.setValueAt(agendamentos.get(i).getData(), i,5);
                
            }
        }
    }
      
      
      private void listarAgendamentos(){
        
        AgendamentoDAO agendamentoDAO =  new AgendamentoDAO();
        listaAgendamentos = agendamentoDAO.listarAgendamentos("%"
             +txtPesquisarConsultas.getText().trim() + "%");
        mostrarAgendamentos(listaAgendamentos);
        
    }
      
       private void excluirAgendamento(){
        
          int excluir;
          
          excluir = JOptionPane.showConfirmDialog(null,"Deseja excluir esse agendamento ?","Excluir Agendamento",0);
          
          if(excluir == 0){
              
        Agendamento agendamento = new Agendamento();
        agendamento.setCodigo(listaAgendamentos.get(tblAgendamentos.getSelectedRow()).getCodigo());
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        agendamentoDAO.excluirAgendamento(agendamento);
        JOptionPane.showMessageDialog(this, "Agendamento excluído com sucesso!");
        
    }
     
     }
    
       public void tblAgendamentosLinhaSelecionada(JTable tbl){
        
            int linhaSelecionada = tbl.getSelectedRow();
            
             if (linhaSelecionada != -1){
            
             txtNomePaciente.setText(listaAgendamentos.get(linhaSelecionada).getNome());
             txtServico.setText(listaAgendamentos.get(linhaSelecionada).getServico());
             txtHorario.setText(listaAgendamentos.get(linhaSelecionada).getHorario());
             txtData.setDate(Date.valueOf(listaAgendamentos.get(linhaSelecionada).getData()));
             txtIDAgendamento.setText(String.valueOf(listaAgendamentos.get(linhaSelecionada).getCodigo()));
             
             }
        }
       
       public void enviarAlteracaoAgendamento(){
              if(enviar==null){
           
            
            enviar = new frmAlteraAgendamento();
            enviar.setVisible(true);
            enviar.recebeNome(txtNomePaciente.getText());
            enviar.recebeServico(txtServico.getText());
            enviar.recebeHora(txtHorario.getText());
            enviar.recebeData(txtData.getDate());
            enviar.recebeId(txtIDAgendamento.getText());
            
            
        }else{
             
                  
            enviar = new frmAlteraAgendamento();
            enviar.setVisible(true);
            enviar.recebeNome(txtNomePaciente.getText());
            enviar.recebeServico(txtServico.getText());
            enviar.recebeHora(txtHorario.getText());
            enviar.recebeData(txtData.getDate());
            enviar.recebeId(txtIDAgendamento.getText());
            enviar.setState(frmAlteraAgendamento.NORMAL);
             
          }
      
          }
       
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnInserr;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSair;
    private javax.swing.JTable tblAgendamentos;
    private javax.swing.JTextField txtCPFPaciente;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtIDAgendamento;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtPesquisarConsultas;
    private javax.swing.JTextField txtServico;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
