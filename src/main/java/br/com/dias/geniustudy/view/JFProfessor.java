/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.dias.geniustudy.view;

import br.com.dias.geniustudy.fontedados.BancoDeDadosProfessor;
import br.com.dias.geniustudy.modelo.Curso;
import br.com.dias.geniustudy.modelo.Professor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author frand
 */
public class JFProfessor extends javax.swing.JFrame {

    
    private Professor professor;
    
    public JFProfessor(Professor professor) {
        this.professor = professor;
        initComponents();
        setupProfessor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisciplinas = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelNomeTutor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Horário", "Valor da hora"
            }
        ));
        jScrollPane1.setViewportView(jTableDisciplinas);

        jButtonExcluir.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAdicionar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAdicionar.setText("Adicionar");
        jButtonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Tutor");

        jLabelNomeTutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeTutor.setText("nomeTutor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomeTutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonExcluir)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtonAdicionar))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(0, 0, 0)
                .addComponent(jLabelNomeTutor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAdicionar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdicionarActionPerformed
        JFDisciplina jfDisciplina = new JFDisciplina(this, professor);
        jfDisciplina.setVisible(true);
    }//GEN-LAST:event_jButtonAdicionarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int linha = jTableDisciplinas.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) jTableDisciplinas.getModel();
        model.removeRow(linha);
        professor.getCursos().remove(linha);
        
        BancoDeDadosProfessor bdProfessor = new BancoDeDadosProfessor();
        bdProfessor.atualizarProfessor(professor);
    }//GEN-LAST:event_jButtonExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdicionar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNomeTutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDisciplinas;
    // End of variables declaration//GEN-END:variables

    private void setupProfessor() {
        jLabelNomeTutor.setText(professor.getNome());
        
        ArrayList<Curso> cursos = professor.getCursos();
        
        for(Curso curso: cursos) {
            exibirCurso(curso);
        }
    }

    void exibirCurso(Curso curso) {
        DefaultTableModel model = (DefaultTableModel) jTableDisciplinas.getModel();
        
        
        Object[] linha = new Object[]{curso.getNome(), curso.getHorario(), curso.getValor()};
        model.addRow(linha);
    }
}
