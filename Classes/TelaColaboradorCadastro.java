/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author PauloMagno
 */
public class TelaColaboradorCadastro extends javax.swing.JFrame {
    /**
     * Creates new form TelaColaboradorCadastro
     */
    private Colaborador colaborador;
    private int matricula;
    private String areaTrabalho;

    public TelaColaboradorCadastro() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_GerarMatricula = new javax.swing.JButton();
        jRadioButton_Interno = new javax.swing.JRadioButton();
        jRadioButton_Externo = new javax.swing.JRadioButton();
        TextField_Matricula = new javax.swing.JFormattedTextField();
        TextField_Nome = new javax.swing.JFormattedTextField();
        btn_cadastrar = new javax.swing.JButton();
        btn_Limpar = new javax.swing.JButton();
        btn_Cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro dos Colaboradores");

        jLabel2.setText("Matrícula:");

        jLabel3.setText("Nome:");

        jLabel4.setText("Local de Trabalho");

        btn_GerarMatricula.setText("Gerar Matrícula");
        btn_GerarMatricula.setAlignmentY(0.0F);
        btn_GerarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GerarMatriculaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Interno);
        jRadioButton_Interno.setText("Interno");
        jRadioButton_Interno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_InternoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton_Externo);
        jRadioButton_Externo.setText("Externo");
        jRadioButton_Externo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_ExternoActionPerformed(evt);
            }
        });

        TextField_Matricula.setEditable(false);

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_Limpar.setText("Limpar");
        btn_Limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimparActionPerformed(evt);
            }
        });

        btn_Cancelar.setText("Cancelar");
        btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(btn_GerarMatricula))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btn_cadastrar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Limpar)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Cancelar)))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(130, 130, 130)
                                        .addComponent(jRadioButton_Interno)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton_Externo))
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(83, 83, 83)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextField_Nome)
                                    .addComponent(TextField_Matricula))))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextField_Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextField_Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton_Interno)
                    .addComponent(jRadioButton_Externo))
                .addGap(18, 18, 18)
                .addComponent(btn_GerarMatricula)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_Limpar)
                    .addComponent(btn_Cancelar))
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton_ExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_ExternoActionPerformed
        areaTrabalho=jRadioButton_Externo.getText();
    }//GEN-LAST:event_jRadioButton_ExternoActionPerformed

    private void btn_GerarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GerarMatriculaActionPerformed
        int CodArea;
        if (TextField_Nome.getText().trim().equals("") || jRadioButton_Externo.isSelected() == false && jRadioButton_Interno.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Nome ou Local de Trabalho não preenchidos");
        } else { 
           
            if(jRadioButton_Externo.isSelected()){
                CodArea=101;
            }else{
                CodArea=202;
            }
            verificarMatricula();
            TextField_Matricula.setText(Integer.toString(CodArea));
        }
    }//GEN-LAST:event_btn_GerarMatriculaActionPerformed

    private void jRadioButton_InternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_InternoActionPerformed
        areaTrabalho=jRadioButton_Interno.getText();
    }//GEN-LAST:event_jRadioButton_InternoActionPerformed

    private void btn_LimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimparActionPerformed
        limpar();
    }//GEN-LAST:event_btn_LimparActionPerformed

    private void btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CancelarActionPerformed
        Main.T.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btn_CancelarActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        colaborador = new Colaborador();
        colaborador.setNome(TextField_Nome.getText());
        colaborador.setMatricula(Integer.parseInt(TextField_Matricula.getText()));
        colaborador.setLocalTrabalho(areaTrabalho);
        Main.data.addColaborador(colaborador);
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    public void limpar() {
        TextField_Matricula.setText("");
        TextField_Nome.setText("");
        jRadioButton_Externo.setSelected(false);
        jRadioButton_Interno.setSelected(false);
    }
public void verificarMatricula(){
    
        
    
}
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
            java.util.logging.Logger.getLogger(TelaColaboradorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaColaboradorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaColaboradorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaColaboradorCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaColaboradorCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField TextField_Matricula;
    private javax.swing.JFormattedTextField TextField_Nome;
    private javax.swing.JButton btn_Cancelar;
    private javax.swing.JButton btn_GerarMatricula;
    private javax.swing.JButton btn_Limpar;
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton_Externo;
    private javax.swing.JRadioButton jRadioButton_Interno;
    // End of variables declaration//GEN-END:variables
}
