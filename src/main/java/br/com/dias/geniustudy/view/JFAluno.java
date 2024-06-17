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
        setTitle("GeniuStudy   --   Área do Aluno");
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setText("Bem vindo,");

        jLabelNomeAluno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelNomeAluno.setText("nomeAluno");

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

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Disciplina");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(431, 605, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonBuscar))
                    .addComponent(jLabelNomeAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldBusca))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomeAluno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addComponent(jTextFieldBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelNomeAluno;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDisciplinas;
    private javax.swing.JTextField jTextFieldBusca;
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
