package br.com.dias.geniustudy.view;

import br.com.dias.geniustudy.fontedados.BancoDeDadosProfessor;
import br.com.dias.geniustudy.modelo.Aluno;
import br.com.dias.geniustudy.modelo.Curso;
import br.com.dias.geniustudy.modelo.Professor;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class JFAluno extends javax.swing.JFrame {

    private Aluno aluno;
    BancoDeDadosProfessor bdProfessor;

    public JFAluno(Aluno aluno) {
        bdProfessor = new BancoDeDadosProfessor();
        
        this.aluno = aluno;
        initComponents();
        setTitle("GeniuStudy -- Área do Aluno");// Juan
        setupAluno();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelNomeAluno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDisciplinas = new javax.swing.JTable();
        jTextFieldBusca = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnVoltarLogin = new javax.swing.JButton();
        btnBuscarProfessor = new javax.swing.JButton();
        jTextFieldBuscarProfessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Bem vindo,");

        jLabelNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeAluno.setText("nomeAluno");

        jTableDisciplinas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableDisciplinas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Horário", "Valor da hora", "Professor", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDisciplinas);

        jTextFieldBusca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscaActionPerformed(evt);
            }
        });

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Disciplina");

        btnVoltarLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnVoltarLogin.setText("Logoff");
        btnVoltarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarLoginActionPerformed(evt);
            }
        });

        btnBuscarProfessor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscarProfessor.setText("Buscar");
        btnBuscarProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProfessorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Professor");

        jLabel4.setFont(new java.awt.Font("Segoe Script", 3, 24)); // NOI18N
        jLabel4.setText("GeniuStudy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldBuscarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonBuscar)
                                    .addComponent(btnBuscarProfessor))))
                        .addContainerGap(98, Short.MAX_VALUE))))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVoltarLogin)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelNomeAluno)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscarProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProfessor))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVoltarLogin)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
       jTextFieldBuscarProfessor.setText("");
        String valorBusca = jTextFieldBusca.getText();

        DefaultTableModel model = (DefaultTableModel) jTableDisciplinas.getModel();
        model.setRowCount(0);

        ArrayList<Professor> professores = bdProfessor.buscarCursos(valorBusca);

        for (Professor professor : professores) {
            for (Curso curso : professor.getCursos()) {
                montarLinhaTabela(curso, professor);
            }
        }
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void btnVoltarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarLoginActionPerformed
        JFLogin btnVoltar = new JFLogin();
        this.dispose();
        btnVoltar.setVisible(true);
    }//GEN-LAST:event_btnVoltarLoginActionPerformed

    private void jTextFieldBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscaActionPerformed

    private void btnBuscarProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProfessorActionPerformed
        jTextFieldBusca.setText("");
        String valorBusca = jTextFieldBuscarProfessor.getText();
        

        DefaultTableModel model = (DefaultTableModel) jTableDisciplinas.getModel();
        model.setRowCount(0);

        ArrayList<Professor> professores = bdProfessor.buscarProfessores(valorBusca);

        for (Professor professor : professores) {
            for (Curso curso : professor.getCursos()) {
                montarLinhaTabela(curso, professor);
            }
        }
    }//GEN-LAST:event_btnBuscarProfessorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarProfessor;
    private javax.swing.JButton btnVoltarLogin;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelNomeAluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDisciplinas;
    private javax.swing.JTextField jTextFieldBusca;
    private javax.swing.JTextField jTextFieldBuscarProfessor;
    // End of variables declaration//GEN-END:variables

    private void setupAluno() {
        jLabelNomeAluno.setText(aluno.getNome());

        ArrayList<Professor> professores = bdProfessor.getProfessores();

        for (Professor professor : professores) {
            for (Curso curso : professor.getCursos()) {
                montarLinhaTabela(curso, professor);
            }
        }

    }

    private void montarLinhaTabela(Curso curso, Professor professor) {
        DefaultTableModel model = (DefaultTableModel) jTableDisciplinas.getModel();

        String coluna1 = curso.getNome();
        String coluna2 = curso.getHorario();
        double coluna3 = curso.getValor();
        String coluna4 = professor.getNome();
        String coluna5 = professor.getEmail();
        
        Object[] linha = new Object[]{coluna1, coluna2, coluna3, coluna4, coluna5};
        model.addRow(linha);
    }
}
