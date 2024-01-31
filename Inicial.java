/*
Trabalho 3º Bimestre
Alunos: Estevão, Rafael Vieira, João Fernando
Data: Setembro/2023
Função global: Controle de cadastro de clientes e Funciónarios
*/
package meutrabalho03;

import javax.swing.JOptionPane;

public class Inicial extends javax.swing.JFrame{
    
    //Instâncias
    Funcionário f = new Funcionário();
    Cliente c = new Cliente();
 
    public Inicial() {
        initComponents();
    }
    public Inicial(Funcionário func, Cliente cliente){
        initComponents();
        c = cliente;
        f = func;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnbackgroud = new javax.swing.JPanel();
        btCadastrarClient = new javax.swing.JButton();
        btConsCliente = new javax.swing.JButton();
        btConsFunc = new javax.swing.JButton();
        btCadastrarFunc = new javax.swing.JButton();
        lblWelcome = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Inicial");
        setResizable(false);

        pnbackgroud.setBackground(new java.awt.Color(255, 255, 204));

        btCadastrarClient.setBackground(new java.awt.Color(255, 255, 51));
        btCadastrarClient.setText("Cadastrar Cliente");
        btCadastrarClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarClientActionPerformed(evt);
            }
        });

        btConsCliente.setBackground(new java.awt.Color(255, 255, 51));
        btConsCliente.setText("Consultar Cliente");
        btConsCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsClienteActionPerformed(evt);
            }
        });

        btConsFunc.setBackground(new java.awt.Color(255, 255, 51));
        btConsFunc.setText("Consultar Funcionário");
        btConsFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsFuncActionPerformed(evt);
            }
        });

        btCadastrarFunc.setBackground(new java.awt.Color(255, 255, 51));
        btCadastrarFunc.setText("Cadastrar Funcionário");
        btCadastrarFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarFuncActionPerformed(evt);
            }
        });

        lblWelcome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblWelcome.setText("Bem-Vindx!!");

        jLabel1.setText("Oque deseja fazer??");

        javax.swing.GroupLayout pnbackgroudLayout = new javax.swing.GroupLayout(pnbackgroud);
        pnbackgroud.setLayout(pnbackgroudLayout);
        pnbackgroudLayout.setHorizontalGroup(
            pnbackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbackgroudLayout.createSequentialGroup()
                .addGroup(pnbackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnbackgroudLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel1))
                    .addGroup(pnbackgroudLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(pnbackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btCadastrarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btCadastrarClient, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btConsFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(50, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnbackgroudLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblWelcome)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnbackgroudLayout.setVerticalGroup(
            pnbackgroudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnbackgroudLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btCadastrarClient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btCadastrarFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btConsFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnbackgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnbackgroud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarClientActionPerformed
        FormBase2 funcs = new FormBase2(c);
        funcs.setLocationRelativeTo(this);
        funcs.setVisible(true);
    }//GEN-LAST:event_btCadastrarClientActionPerformed

    private void btConsClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsClienteActionPerformed
        JOptionPane.showMessageDialog(null, c.toString());
    }//GEN-LAST:event_btConsClienteActionPerformed

    private void btConsFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsFuncActionPerformed
        JOptionPane.showMessageDialog(null, f.toString());
    }//GEN-LAST:event_btConsFuncActionPerformed

    private void btCadastrarFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarFuncActionPerformed
        FormBase func = new FormBase(f);
        func.setLocationRelativeTo(this);
        func.setVisible(true);
    }//GEN-LAST:event_btCadastrarFuncActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicial().setVisible(true);
            }
        });
    }//Fim da main;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrarClient;
    private javax.swing.JButton btCadastrarFunc;
    private javax.swing.JButton btConsCliente;
    private javax.swing.JButton btConsFunc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnbackgroud;
    // End of variables declaration//GEN-END:variables
}
