/*
Trabalho 3º Bimestre
Alunos: Estevão, Rafael Vieira, João Fernando
Data: Setembro/2023
Função global: Controle de cadastro de clientes e Funciónarios
*/
package meutrabalho03;

import javax.swing.JOptionPane;

 public class FormBase extends javax.swing.JFrame {

    //Instância
    Funcionário func = new Funcionário();
    
    //Iniciando os componentes do Funcionário
    public FormBase() {
        initComponents();
    }
    public FormBase(Funcionário f) {
        initComponents();
        func = f;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPainel = new javax.swing.JPanel();
        lblPainel = new javax.swing.JLabel();
        pnBackground = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblelefone = new javax.swing.JLabel();
        lblCargo = new javax.swing.JLabel();
        lblsalario = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        txNome = new javax.swing.JTextField();
        ftfCpf = new javax.swing.JFormattedTextField();
        txCargo = new javax.swing.JTextField();
        txSalario = new javax.swing.JTextField();
        ftfTelefone = new javax.swing.JFormattedTextField();

        setTitle("Cadastro Funcionário");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setResizable(false);

        pnPainel.setBackground(new java.awt.Color(255, 255, 51));

        lblPainel.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblPainel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPainel.setText("Cadastro Funcionário");
        lblPainel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblPainel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnPainelLayout = new javax.swing.GroupLayout(pnPainel);
        pnPainel.setLayout(pnPainelLayout);
        pnPainelLayout.setHorizontalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPainel, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnPainelLayout.setVerticalGroup(
            pnPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPainel, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        pnBackground.setBackground(new java.awt.Color(255, 255, 204));

        lblNome.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNome.setText("Nome:");

        lblCpf.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblCpf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCpf.setText("CPF:");

        lblelefone.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblelefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblelefone.setText("Telefone:");

        lblCargo.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblCargo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCargo.setText("Cargo:");

        lblsalario.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        lblsalario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsalario.setText("Salário:");

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

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNome)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSubmit))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBackgroundLayout.createSequentialGroup()
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(lblsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnBackgroundLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(lblelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfTelefone)
                            .addComponent(txSalario))))
                .addGap(54, 54, 54))
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txNome, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsalario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        
        //Atributos
        boolean checagem = true;
        String mensagemErro = "";
        
        //Checagem para confirmar se os campos foram preenchidos;
        if(txNome.getText().equals("")){
            checagem = false;
            mensagemErro += "Obrigatório preencher o nome!!\n";
        }
        
        if(ftfCpf.getText().charAt(0) == ' '){
            checagem = false;
            mensagemErro += "Obrigatório preencher o CPF!!\n";
        }

        if(ftfTelefone.getText().charAt(1) == ' '){
            checagem = false;
            mensagemErro += "Obrigatório preencher o telefone!!\n";
        }
        
         if(txCargo.getText().equals("")){
            checagem = false;
            mensagemErro += "Obrigatório preencher sua profissão!!\n";
        }
         
          if(txSalario.getText().equals("")){
            checagem = false;
            mensagemErro += "Obrigatório preencher sua cicade!!\n";
        }
          
         //Checagem para a atribuição dos dados;  
        if(!checagem){
                JOptionPane.showMessageDialog(null, mensagemErro,
                        "ERRO!!!", JOptionPane.ERROR_MESSAGE);
            } else{
                func.setNome(txNome.getText());
                func.setCpf(ftfCpf.getText());
                func.setTelefone(ftfTelefone.getText());
                func.setCargo(txCargo.getText());
                func.setSalario(Float.parseFloat((txSalario.getText())));
                
                dispose();
            }
    }//GEN-LAST:event_btSubmitActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSubmit;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPainel;
    private javax.swing.JLabel lblelefone;
    private javax.swing.JLabel lblsalario;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnPainel;
    private javax.swing.JTextField txCargo;
    private javax.swing.JTextField txNome;
    private javax.swing.JTextField txSalario;
    // End of variables declaration//GEN-END:variables
}//Fim da classe FormBase;
