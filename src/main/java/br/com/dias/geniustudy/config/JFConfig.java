/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.dias.geniustudy.config;

import br.com.dias.geniustudy.fontedados.BancoDeDadosAluno;
import br.com.dias.geniustudy.fontedados.BancoDeDadosProfessor;
import br.com.dias.geniustudy.modelo.Aluno;
import br.com.dias.geniustudy.modelo.Professor;
import java.util.ArrayList;

/**
 *
 * @author frand
 */
public class JFConfig extends javax.swing.JFrame {

    /**
     * Creates new form JFConfig
     */
    public JFConfig() {
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

        jCbxLimpar = new javax.swing.JCheckBox();
        jCbxAddUsuariosSimples = new javax.swing.JCheckBox();
        jCbxAddUsuariosCompleto = new javax.swing.JCheckBox();
        jButtonConfigurarBanco = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCbxLimpar.setSelected(true);
        jCbxLimpar.setText("Limpar banco");

        jCbxAddUsuariosSimples.setText("Add usuarios simples");

        jCbxAddUsuariosCompleto.setText("Add usuarios completo");

        jButtonConfigurarBanco.setText("Rodar");
        jButtonConfigurarBanco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConfigurarBancoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Configurar banco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCbxLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCbxAddUsuariosSimples, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCbxAddUsuariosCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonConfigurarBanco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jCbxLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCbxAddUsuariosSimples)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCbxAddUsuariosCompleto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonConfigurarBanco)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConfigurarBancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConfigurarBancoActionPerformed
        boolean limpar = jCbxLimpar.isSelected();
        boolean gerarCadastroSimples = jCbxAddUsuariosSimples.isSelected();
        boolean gerarCadastroCompleto = jCbxAddUsuariosCompleto.isSelected();

        BancoDeDadosProfessor bdProfessor = new BancoDeDadosProfessor();
        BancoDeDadosAluno bdAluno = new BancoDeDadosAluno();

        if (limpar) {
            bdProfessor.limparArquivo();
            bdAluno.limparArquivo();
        }

        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();

        if (gerarCadastroSimples) {
            alunos.addAll(ConfigBancoDados.getAlunosSimples());
            professores.addAll(ConfigBancoDados.getProfessoresSimples());
        }

        if (gerarCadastroCompleto) {
            alunos.addAll(ConfigBancoDados.getAlunosCompleto());
            professores.addAll(ConfigBancoDados.getProfessoresCompleto());
        }

        for(Aluno aluno: alunos) {
            bdAluno.adicionarAluno(aluno);
        }
        
        for(Professor professor: professores) {
            bdProfessor.adicionarProfessor(professor);
        }
    }//GEN-LAST:event_jButtonConfigurarBancoActionPerformed

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
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConfigurarBanco;
    private javax.swing.JCheckBox jCbxAddUsuariosCompleto;
    private javax.swing.JCheckBox jCbxAddUsuariosSimples;
    private javax.swing.JCheckBox jCbxLimpar;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
