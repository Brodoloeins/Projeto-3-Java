package meutrabalho03;

import javax.swing.JOptionPane;

public class FormBase2 extends javax.swing.JFrame {

    //Intância
    Cliente cliente = new Cliente();
    
    //Iniciando os componentes do cliente
    public FormBase2() {
        initComponents();
    }
    public FormBase2(Cliente c){
        initComponents();
        cliente = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPainel = new javax.swing.JPanel();
        lblPainel = new javax.swing.JLabel();
        pnBackgroud = new javax.swing.JPanel();
        txNome = new javax.swing.JTextField();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblelefone = new javax.swing.JLabel();
        txCidade = new javax.swing.JTextField();
        lblProfissao = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        ftfCpf = new javax.swing.JFormattedTextField();
        ftfTelefone = new javax.swing.JFormattedTextField();
        txProfissao = new javax.swing.JTextField();

        setTitle("Cadastro Cliente");
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);

        pnPainel.setBackground(new java.awt.Color(255, 255, 51));

        lblPainel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPainel.setText("Cadastro Cliente");
        lblPainel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pnPainelLayout = new javax.swing.GroupLayout(pnPainel);
        pnPainel.setLayout(pnPainelLayout);
        pnPainelLayout.setHorizontalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnPainelLayout.setVerticalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );

        pnBackgroud.setBackground(new java.awt.Color(255, 255, 204));

        lblNome.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome:");

        lblCpf.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpf.setText("CPF:");

        lblelefone.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblelefone.setText("Telefone:");

        lblProfissao.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblProfissao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProfissao.setText("Profissão:");

        lblCidade.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblCidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCidade.setText("Cidade:");

        btSubmit.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        btSubmit.setText("Submit");
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });

        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCpf.setToolTipText("   .   .   -");

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("+55 (##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnBackgroudLayout = new javax.swing.GroupLayout(pnBackgroud);
        pnBackgroud.setLayout(pnBackgroudLayout);
        pnBackgroudLayout.setHorizontalGroup(
            pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroudLayout.createSequentialGroup()
                .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnBackgroudLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSubmit))
                    .addGroup(pnBackgroudLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblProfissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnBackgroudLayout.createSequentialGroup()
                                .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnBackgroudLayout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnBackgroudLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ftfTelefone)
                                    .addComponent(txCidade))))))
                .addGap(54, 54, 54))
            .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroudLayout.createSequentialGroup()
                    .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnBackgroudLayout.createSequentialGroup()
                            .addGap(7, 7, 7)
                            .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(423, Short.MAX_VALUE)))
        );
        pnBackgroudLayout.setVerticalGroup(
            pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(pnBackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnBackgroudLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(131, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnBackgroud, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnBackgroud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        
        //Atributos
        boolean checagem = true;//variavel de controle;
        String mensagemErro = "";//variavel para erro;
        
        //Checagem para confirmar se os campos foram preenchidos;
        if(txNome.getText().equals("")){
            checagem = false;
            mensagemErro += "Obrigatório preencher o nome!!\n";
        }
        
        if(ftfCpf.getText().charAt(0) == ' '){
            checagem = false;
            mensagemErro += "Obrigatório preencher o CPF!!\n";
        }

        if(ftfTelefone.getText().charAt(4) == ' '){
            checagem = false;
            mensagemErro += "Obrigatório preencher o telefone!!\n";
        }
        
         if(txProfissao.getText().equals("")){
            checagem = false;
            mensagemErro += "Obrigatório preencher sua profissão!!\n";
        }
         
          if(txCidade.getText().equals("")){
            checagem = false;
            mensagemErro += "Obrigatório preencher sua cicade!!\n";
        }
        
        //Checagem para a atribuição dos dados;
        if(!checagem){
                JOptionPane.showMessageDialog(null, mensagemErro,
                        "ERRO!!!", JOptionPane.ERROR_MESSAGE);
            } else{
                cliente.setNome(txNome.getText());
                cliente.setCpf(ftfCpf.getText());
                cliente.setTelefone(ftfTelefone.getText());
                cliente.setProfissao(txProfissao.getText());
                cliente.setCidade(txCidade.getText());
                dispose();
            }
    }//GEN-LAST:event_btSubmitActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBase2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPainel;
    private javax.swing.JLabel lblProfissao;
    private javax.swing.JLabel lblelefone;
    private javax.swing.JPanel pnBackgroud;
    private javax.swing.JPanel pnPainel;
    private javax.swing.JTextField txCidade;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txProfissao;
    // End of variables declaration//GEN-END:variables

}//Fim da classe FormBase2
