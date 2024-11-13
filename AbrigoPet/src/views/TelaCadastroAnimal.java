/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import entities.Cachorro;
import entities.Gato;
import java.awt.Color;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class TelaCadastroAnimal extends javax.swing.JFrame {

    /**
     * Creates new form TelaInicial
     */
    public TelaCadastroAnimal() {
        initComponents();
        ativarPlaceHolder();
    }
    
    public void configurarPlaceHolder(JTextField txt, String mensagem){
        txt.setText(mensagem);
        txt.setForeground(Color.GRAY);
        
        txt.addFocusListener(new FocusListener() {
            
            public void focusGained(FocusEvent e) {
                if (txt.getText().equals(mensagem)) {
                    txt.setText("");
                    txt.setForeground(Color.BLACK); // Cor do texto normal
                }
            }
            public void focusLost(FocusEvent e) {
                if (txt.getText().isEmpty()) {
                    txt.setText(mensagem);
                    txt.setForeground(Color.GRAY); // Cor do placeholder
                }
            }
        });
        
    }
    
    public void ativarPlaceHolder(){
        configurarPlaceHolder(txtNomeAnimal, "Digite o nome...");
        configurarPlaceHolder(txtPesoAnimal, "Digite o peso...");
        configurarPlaceHolder(txtIdadeAnimal, "Digite a idade...");
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
        txtNomeAnimal = new javax.swing.JTextField();
        btnEncerrarSessao = new javax.swing.JButton();
        txtIdadeAnimal = new javax.swing.JTextField();
        txtPesoAnimal = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        comboBoxEspecie = new javax.swing.JComboBox<>();
        comboBoxCor = new javax.swing.JComboBox<>();
        btnListarAnimais = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 0, 51));

        jLabel1.setFont(new java.awt.Font("Californian FB", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Pets");

        txtNomeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAnimalActionPerformed(evt);
            }
        });

        btnEncerrarSessao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEncerrarSessao.setText("X");
        btnEncerrarSessao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncerrarSessaoActionPerformed(evt);
            }
        });

        txtIdadeAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdadeAnimalActionPerformed(evt);
            }
        });

        txtPesoAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoAnimalActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(0, 255, 0));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        comboBoxEspecie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE A ESPÉCIE", "GATO", "CACHORRO" }));
        comboBoxEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEspecieActionPerformed(evt);
            }
        });

        comboBoxCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECIONE A COR", "BRANCO", "PRETO", "CARAMELO", " " }));
        comboBoxCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCorActionPerformed(evt);
            }
        });

        btnListarAnimais.setText("LISTAR ANIMAIS");
        btnListarAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAnimaisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdadeAnimal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPesoAnimal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNomeAnimal, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListarAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboBoxEspecie, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnEncerrarSessao, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtNomeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPesoAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtIdadeAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxCor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnListarAnimais, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncerrarSessaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncerrarSessaoActionPerformed
        dispose();
    }//GEN-LAST:event_btnEncerrarSessaoActionPerformed

    private void txtNomeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAnimalActionPerformed

    private void txtIdadeAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdadeAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdadeAnimalActionPerformed

    private void txtPesoAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoAnimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoAnimalActionPerformed

    private void comboBoxEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEspecieActionPerformed
       
    }//GEN-LAST:event_comboBoxEspecieActionPerformed

    private void comboBoxCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCorActionPerformed
        
    }//GEN-LAST:event_comboBoxCorActionPerformed

            
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String nome = txtNomeAnimal.getText();
        if(nome.equalsIgnoreCase("")|| nome.equalsIgnoreCase("Digite o nome...") || nome.length()<=3){
            JOptionPane.showMessageDialog(null, "Preencha o campo com pelo menos 3 caracteres");
        }
        
        int idade = Integer.parseInt(txtIdadeAnimal.getText());
        if(idade<=0|| txtIdadeAnimal.getText().equalsIgnoreCase("Digite a idade...")){
            JOptionPane.showMessageDialog(null, "Preencha a idade com um valor válido");            
        }
        
        double peso = Double.parseDouble(txtPesoAnimal.getText());
        if(peso<=0.0|| txtPesoAnimal.getText().equalsIgnoreCase("Digite a peso...")){
            JOptionPane.showMessageDialog(null, "Digite um peso válido");            
        }
        
        int indexEspecie = comboBoxEspecie.getSelectedIndex(); //verifica o id do item na caixa de selecao
        int indexCor = comboBoxCor.getSelectedIndex(); //verifica o id do item na caixa de selecao
        
        
        String cor = null;
        
        switch (indexCor){ // associa o id do item ao texto presente no campo
            case 0 -> {
               JOptionPane.showMessageDialog(null, "Selecione uma cor válida");
                break; 
            }
            case 1 -> cor = "BRANCO";
            case 2 -> cor = "PRETO";
            case 3 -> cor = "CARAMELO";
        }
        
        switch(indexEspecie){ // associa o id do item ao texto presente no campo
           case 0 -> { // se o item selecionado for o 0 ele vai instanciar um objeto GATO
               JOptionPane.showMessageDialog(null, "Selecione uma espécie válida");
               break;
            }
           case 1 -> { // se o item selecionado for o 0 ele vai instanciar um objeto GATO
               var gato = new Gato(nome, idade, peso, cor);
               gato.cacadastrarAnimal(); // cadastra o objeto instanciado na lista de animais
            }
           case 2 -> { 
               var cachorro = new Cachorro(nome, idade, peso, cor); // se o item selecionado for o 0 ele vai instanciar um objeto GATO
               cachorro.cacadastrarAnimal(); // cadastra o objeto instanciado na lista de animais
            }
        }
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnListarAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAnimaisActionPerformed
        TelaListagemDePets telaAnimais = new TelaListagemDePets();       
        telaAnimais.setVisible(true);
    }//GEN-LAST:event_btnListarAnimaisActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEncerrarSessao;
    private javax.swing.JButton btnListarAnimais;
    private javax.swing.JComboBox<String> comboBoxCor;
    private javax.swing.JComboBox<String> comboBoxEspecie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtIdadeAnimal;
    private javax.swing.JTextField txtNomeAnimal;
    private javax.swing.JTextField txtPesoAnimal;
    // End of variables declaration//GEN-END:variables
}
