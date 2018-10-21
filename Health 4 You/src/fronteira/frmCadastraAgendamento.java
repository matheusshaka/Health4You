/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import persistencia.AgendamentoDAO;
import entidade.Agendamento;
import entidade.Paciente;
import entidade.Servico;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import persistencia.PacienteDAO;
import persistencia.ServicoDAO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
/**
 *
 * @author joao-
 */
public class frmCadastraAgendamento extends javax.swing.JFrame {

    public String Nome, Servico;
    
    
    private String[] colunas = new String[]{"Codigo","Nome",
           "Valor"};
    
    private DefaultTableModel tmServicos = new DefaultTableModel
               (null, colunas);
    
    private List<Servico> listaServicos;
    private ListSelectionModel lsmServicos;
    
    
    private String[] colunaspaciente = new String[]{"Codigo","Nome",
           "Endereço","Telefone"};
    
    private DefaultTableModel tmPacientes = new DefaultTableModel
               (null, colunaspaciente);
    
    private List<Paciente> listaPacientes;
    private ListSelectionModel lsmPacientes; 
    
    /**
     * Creates new form frmCadastraAgendamento
     */
    public frmCadastraAgendamento() {
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

        txtNomePaciente = new javax.swing.JTextField();
        txtCPFPaciente = new javax.swing.JTextField();
        txtNomeServico = new javax.swing.JTextField();
        txtValorServico = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPesquisaPaciente = new javax.swing.JTextField();
        btnNovoCliente = new javax.swing.JButton();
        btnPesquisarPaciente = new javax.swing.JButton();
        btnPesquisarServico = new javax.swing.JButton();
        btnNovoServico = new javax.swing.JButton();
        txtPesquisaServicos = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServico = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        txtData = new com.toedter.calendar.JDateChooser();
        txtHorario = new javax.swing.JFormattedTextField();

        txtValorServico.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamentos");
        setResizable(false);

        jLabel1.setText("Paciente:");

        jLabel2.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jLabel2.setText("Agendamentos");

        jLabel3.setText("Serviço:");

        jLabel4.setText("Horário:");

        jLabel5.setText("Data:");

        btnNovoCliente.setText("Novo Paciente");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnPesquisarPaciente.setText("Pesquisar Paciente");
        btnPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPacienteActionPerformed(evt);
            }
        });

        btnPesquisarServico.setText("Pesquisar Serviço");
        btnPesquisarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarServicoActionPerformed(evt);
            }
        });

        btnNovoServico.setText("Novo Serviço");
        btnNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoServicoActionPerformed(evt);
            }
        });

        tblServico.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        tblServico.setModel(tmServicos);
        tblServico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmServicos = tblServico.getSelectionModel();
        lsmServicos.addListSelectionListener (new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()) {
                    tblServicoLinhaSelecionada(tblServico);
                }
            }

        });
        jScrollPane1.setViewportView(tblServico);

        tblPaciente.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
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
        jScrollPane2.setViewportView(tblPaciente);

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        try {
            txtHorario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorario.setToolTipText("  ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesquisaServicos)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtPesquisaPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNovoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txtPesquisaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoServico)
                    .addComponent(btnPesquisarServico))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar)
                            .addComponent(jButton5)))
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:
        new frmPaciente().setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoServicoActionPerformed
        // TODO add your handling code here:
        new frmCadastraServico().setVisible(true);
    }//GEN-LAST:event_btnNovoServicoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnPesquisarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarServicoActionPerformed
        // TODO add your handling code here:
        
        listarServicos();
    }//GEN-LAST:event_btnPesquisarServicoActionPerformed

    private void btnPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPacienteActionPerformed
        // TODO add your handling code here:
        
        listarPacientes();
    }//GEN-LAST:event_btnPesquisarPacienteActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        cadastrarAgendamento();
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastraAgendamento().setVisible(true);
            }
        });
    }
    
    private void cadastrarAgendamento(){
        
        if(txtNomePaciente.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Você precisa selecionar um paciente para agendar","Selecionar Paciente",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }else if( txtNomeServico.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Você precisa selecionar um serviço para agendar","Selecionar Serviço",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }else if(txtHorario.getText().isEmpty()){
        
            JOptionPane.showMessageDialog(null,"Você precisa informar um horário para o agendamento","Selecionar Horário",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }else if(String.valueOf(txtData.getDate()).isEmpty()){
            
            JOptionPane.showMessageDialog(null,"Você precisa informar uma data para o agendamento","Selecionar Horário",
                    JOptionPane.INFORMATION_MESSAGE);
            
        }else{
        
            
        Date data = txtData.getDate();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String novaData = formatador.format(data);
            
        Agendamento agendamento = new  Agendamento();
        agendamento.setNome(txtNomePaciente.getText().trim());
        agendamento.setCpf(txtCPFPaciente.getText().trim());
        agendamento.setServico(txtNomeServico.getText().trim());
        agendamento.setValor(txtValorServico.getText().trim());
        agendamento.setHorario(txtHorario.getText().trim());
        agendamento.setData(String.valueOf(txtData.getDate()).format(novaData));
        
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        agendamentoDAO.cadastrarAgendamento(agendamento);
        JOptionPane.showMessageDialog(null,"Agendamento Cadastrado com sucesso !","Cadastro de Agendamento",
                JOptionPane.INFORMATION_MESSAGE);
    
    }
}
    
     private void mostrarServicos(List<Servico> servicos){
        
        while (tmServicos.getRowCount() > 0){
            tmServicos.removeRow(0);
        }
        if(servicos.size() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum Serviço foi encontrado!");
        }else{
            
            for (int i = 0; i < servicos.size(); i++){
                tmServicos.addRow(colunas);
                tmServicos.setValueAt(servicos.get(i).getCodigo(), i,0);
                tmServicos.setValueAt(servicos.get(i).getNome(), i,1);
                tmServicos.setValueAt(servicos.get(i).getValor(), i,2);
                                
            }
        }
    }
    
     private void listarServicos(){
        
        ServicoDAO servicoDAO =  new ServicoDAO();
        listaServicos = servicoDAO.listarServicos("%"
             +txtPesquisaServicos.getText().trim() + "%");
        mostrarServicos(listaServicos);
        
    }

      private void mostrarPacientes(List<Paciente> pacientes){
        
        while (tmPacientes.getRowCount() > 0){
            tmPacientes.removeRow(0);
        }
        if(pacientes.size() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum Paciente foi encontrado!");
        }else{
            
            for (int i = 0; i < pacientes.size(); i++){
                tmPacientes.addRow(colunaspaciente);
                tmPacientes.setValueAt(pacientes.get(i).getCodigo(), i,0);
                tmPacientes.setValueAt(pacientes.get(i).getNome(), i,1);
                tmPacientes.setValueAt(pacientes.get(i).getRua(), i,2);
                tmPacientes.setValueAt(pacientes.get(i).getTelefone(), i,3);
                
            }
        }
    }
     
     private void listarPacientes(){
        
        PacienteDAO pacienteDAO =  new PacienteDAO();
        listaPacientes = pacienteDAO.listarPacientes("%"
             +txtPesquisaPaciente.getText().trim() + "%");
        mostrarPacientes(listaPacientes);
        
    }
     
     
       public void tblPacienteLinhaSelecionada(JTable tbl){
        
            int linhaSelecionada = tbl.getSelectedRow();
          
             if (linhaSelecionada != -1){
            
             txtNomePaciente.setText(listaPacientes.get(linhaSelecionada).getNome());
             txtCPFPaciente.setText(listaPacientes.get(linhaSelecionada).getCpf());
                 }
        }
     
       public void tblServicoLinhaSelecionada(JTable tbl){
        
            int linhaSelecionada = tbl.getSelectedRow();
          
             if (linhaSelecionada != -1){
            
             txtNomeServico.setText(listaServicos.get(linhaSelecionada).getNome());
             txtValorServico.setText(listaServicos.get(linhaSelecionada).getValor());
                 }
        }
       
       
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoServico;
    private javax.swing.JButton btnPesquisarPaciente;
    private javax.swing.JButton btnPesquisarServico;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPaciente;
    private javax.swing.JTable tblServico;
    private javax.swing.JTextField txtCPFPaciente;
    private com.toedter.calendar.JDateChooser txtData;
    private javax.swing.JFormattedTextField txtHorario;
    private javax.swing.JTextField txtNomePaciente;
    private javax.swing.JTextField txtNomeServico;
    private javax.swing.JTextField txtPesquisaPaciente;
    private javax.swing.JTextField txtPesquisaServicos;
    private javax.swing.JTextField txtValorServico;
    // End of variables declaration//GEN-END:variables
}
