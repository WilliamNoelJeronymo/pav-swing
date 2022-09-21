/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.util.ArrayList;
import entites.Funcionario;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author will
 */
public class Principal extends javax.swing.JFrame {

    ArrayList<Funcionario> funcionarios, func;
    String e = null;
    CadastrarTest cadastro;
    Editar editar;
    View view;
    Procurar procurar;
    Funcionario d, funcd;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        this.cadastro = new CadastrarTest(this, rootPaneCheckingEnabled);
        this.editar = new Editar(this, rootPaneCheckingEnabled);
        this.view = new View(this, rootPaneCheckingEnabled);
        funcionarios = new ArrayList<>();
        func = new ArrayList<>();
        btn_excluir.setEnabled(false);
        btn_editar.setEnabled(false);
        btn_view.setEnabled(false);
    }

    public void loadTable() {
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"CPF", "Nome", "Data de Nascimento"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        TableRowSorter tableSorter = new TableRowSorter(modelo);
        tabelaPrincipal.setRowSorter(tableSorter);
        tableSorter.toggleSortOrder(1);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        for (int i = 0; i < funcionarios.size(); i++) {
            String date = sdf.format(funcionarios.get(i).getNascimento());
            Object linha[] = new Object[]{funcionarios.get(i).getCpf(),
                funcionarios.get(i).getNome(),
                date};
            modelo.addRow(linha);
        }

        tabelaPrincipal.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPrincipal = new javax.swing.JTable();
        btn_cadastrar = new javax.swing.JButton();
        btn_excluir = new javax.swing.JButton();
        btn_editar = new javax.swing.JButton();
        btn_view = new javax.swing.JButton();
        btn_cons = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabelaPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome", "Data de Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPrincipalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPrincipal);

        btn_cadastrar.setText("Cadastrar");
        btn_cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cadastrarActionPerformed(evt);
            }
        });

        btn_excluir.setText("Excluir");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_editar.setText("Editar");
        btn_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarActionPerformed(evt);
            }
        });

        btn_view.setText("Visualizar");
        btn_view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_viewActionPerformed(evt);
            }
        });

        btn_cons.setText("Consultar");
        btn_cons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_view)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_excluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cons)
                                .addGap(12, 12, 12)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excluir)
                    .addComponent(btn_editar)
                    .addComponent(btn_cadastrar)
                    .addComponent(btn_cons))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_view)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funcionarios", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarActionPerformed

        editar.setVisible(true);
        int index = tabelaPrincipal.getSelectedRow();

        if (editar.geti()) {
            this.d = funcionarios.stream().filter(x -> x.getCpf().equals(editar.getCpf())).findFirst().orElse(null);
             String y = null;
            if (this.d != null) {
                y = this.d.getCpf();
            }
            if (this.d == null) {
                System.out.println("nullo");
                funcionarios.get(index).setCpf(editar.getCpf());
                funcionarios.get(index).setEndereco(editar.getEndereco());
                funcionarios.get(index).setNome(editar.getNome());
                funcionarios.get(index).setNascimento(editar.getData());
                loadTable();
                JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso");
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_view.setEnabled(false);
            } else if (e.equals(y)) {
                System.out.println(this.d.toString());
                funcionarios.get(index).setCpf(editar.getCpf());
                funcionarios.get(index).setEndereco(editar.getEndereco());
                funcionarios.get(index).setNome(editar.getNome());
                funcionarios.get(index).setNascimento(editar.getData());
                loadTable();
                JOptionPane.showMessageDialog(null, "Funcionario editado com sucesso");
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_view.setEnabled(false);
            } else {
                btn_excluir.setEnabled(false);
                btn_editar.setEnabled(false);
                btn_view.setEnabled(false);
                JOptionPane.showMessageDialog(null, "CPF ja cadastrado", "ERRO AO EDITAR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }//GEN-LAST:event_btn_editarActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        int index = tabelaPrincipal.getSelectedRow();
        if (index >= 0 && index < funcionarios.size()) {
            funcionarios.remove(index);
            loadTable();
            JOptionPane.showMessageDialog(null, "Funcionario Excluido com sucesso");
            btn_excluir.setEnabled(false);
            btn_editar.setEnabled(false);
            btn_view.setEnabled(false);
        }
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cadastrarActionPerformed
        cadastro.setVisible(true);
        Funcionario f = cadastro.getFuncionario();
        this.d = funcionarios.stream().filter(x -> x.getCpf().equals(f.getCpf())).findFirst().orElse(null);
        if (this.d == null) {
            System.out.println(f.getCpf());
            if (!"   .   .   -  ".equals(f.getCpf()) && !"".equals(f.getEndereco()) && !"".equals(f.getNome())) {
                funcionarios.add(f);
                func.add(f);
                loadTable();
                JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
                cadastro.clearFuncionario();
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos corretamente antes de salvar", "ERRO AO SALVAR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "CPF ja cadastrado", "ERRO AO SALVAR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_cadastrarActionPerformed

    private void tabelaPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPrincipalMouseClicked
        int index = tabelaPrincipal.getSelectedRow();
        if (index >= 0 && index < funcionarios.size()) {
            Funcionario f = funcionarios.get(index);
            editar.setCpf(f.getCpf());
            editar.setNome(f.getNome());
            editar.setEndereco(f.getEndereco());
            editar.setData(f.getNascimento());
            e = editar.getCpf();
            view.setCpf(f.getCpf());
            view.setNome(f.getNome());
            view.setEndereco(f.getEndereco());
            view.setData(f.getNascimento());
            btn_editar.setEnabled(true);
            btn_excluir.setEnabled(true);
            btn_view.setEnabled(true);
        }
    }//GEN-LAST:event_tabelaPrincipalMouseClicked

    private void btn_viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_viewActionPerformed
        this.view.setVisible(true);
    }//GEN-LAST:event_btn_viewActionPerformed

    private void btn_consActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consActionPerformed
        this.procurar = new Procurar(this, rootPaneCheckingEnabled, funcionarios);
        procurar.setVisible(true);
    }//GEN-LAST:event_btn_consActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cadastrar;
    private javax.swing.JButton btn_cons;
    private javax.swing.JButton btn_editar;
    private javax.swing.JButton btn_excluir;
    private javax.swing.JButton btn_view;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tabelaPrincipal;
    // End of variables declaration//GEN-END:variables
}
