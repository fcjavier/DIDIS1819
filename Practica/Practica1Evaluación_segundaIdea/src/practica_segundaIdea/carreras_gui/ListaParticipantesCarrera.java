/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.carreras_gui;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import practica_segundaIdea.carreras_gui.tableModelParticipantes.ParticipantesTableModel;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.dto.Participante;
import practica_segundaIdea.logica.LogicaCarrera;
import practica_segundaIdea.logica.LogicaFicherosObjetos;

/**
 *
 * @author USER
 */
public class ListaParticipantesCarrera extends javax.swing.JDialog {

    ParticipantesTableModel ptm;
    LogicaCarrera lc = new LogicaCarrera();
    LogicaFicherosObjetos lfo = new LogicaFicherosObjetos();
    TableRowSorter<ParticipantesTableModel> sorter;    
    Carrera carrera;
    Participante p;

    /**
     * Creates new form ParticipantesCarrera
     * @param parent
     * @param modal
     * @param c
     */
    public ListaParticipantesCarrera(java.awt.Frame parent, boolean modal, Carrera c) {
        super(parent, modal);
        initComponents();
        this.carrera = c;
        this.setTitle("PARTICIPANTES EN: "+(c.getNomCarrera().toUpperCase()).toString());
        rellenarTabalParicipantes();
        anularBoton();
    }

    private void rellenarTabalParicipantes() {

        ptm = new ParticipantesTableModel(carrera.getListaDeParticipantes());
        jTableParticipantes.setModel(ptm);
        sorter = new TableRowSorter<>(ptm);
        jTableParticipantes.setRowSorter(sorter);
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(2, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);

    }

    public final void anularBoton() {
        if (carrera.isIniciada()) {
            jButtonEliminarParticipante.setEnabled(false);
            jButtonAsignarDorsal.setEnabled(false);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableParticipantes = new javax.swing.JTable();
        jButtonEliminarParticipante = new javax.swing.JButton();
        jButtonAsignarDorsal = new javax.swing.JButton();
        jTextFieldFiltro = new javax.swing.JTextField();
        jButtonFiltrar = new javax.swing.JButton();
        jButtonSalirFiltrado = new javax.swing.JButton();
        jComboBoxFiltrar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 450));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jTableParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableParticipantes);

        jButtonEliminarParticipante.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonEliminarParticipante.setText(org.openide.util.NbBundle.getMessage(ListaParticipantesCarrera.class, "ListaParticipantesCarrera.jButtonEliminarParticipante.text")); // NOI18N
        jButtonEliminarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarParticipanteActionPerformed(evt);
            }
        });

        jButtonAsignarDorsal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonAsignarDorsal.setText(org.openide.util.NbBundle.getMessage(ListaParticipantesCarrera.class, "ListaParticipantesCarrera.jButtonAsignarDorsal.text")); // NOI18N
        jButtonAsignarDorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAsignarDorsalActionPerformed(evt);
            }
        });

        jTextFieldFiltro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldFiltro.setText(org.openide.util.NbBundle.getMessage(ListaParticipantesCarrera.class, "ListaParticipantesCarrera.jTextFieldFiltro.text")); // NOI18N

        jButtonFiltrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonFiltrar.setText(org.openide.util.NbBundle.getMessage(ListaParticipantesCarrera.class, "ListaParticipantesCarrera.jButtonFiltrar.text")); // NOI18N
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButtonSalirFiltrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalirFiltrado.setText(org.openide.util.NbBundle.getMessage(ListaParticipantesCarrera.class, "ListaParticipantesCarrera.jButtonSalirFiltrado.text")); // NOI18N
        jButtonSalirFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirFiltradoActionPerformed(evt);
            }
        });

        jComboBoxFiltrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxFiltrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "DORSAL" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonEliminarParticipante)
                        .addGap(7, 7, 7)
                        .addComponent(jButtonAsignarDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxFiltrar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSalirFiltrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldFiltro))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonSalirFiltrado)
                            .addComponent(jButtonFiltrar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonEliminarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAsignarDorsal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEliminarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarParticipanteActionPerformed
        try {
            int posicion = jTableParticipantes.convertRowIndexToModel(jTableParticipantes.getSelectedRow());
            int confirmar = JOptionPane.showConfirmDialog(this, "CONFIRMAR BORRADO", "", JOptionPane.OK_CANCEL_OPTION);
            if (confirmar == JOptionPane.OK_OPTION) {
                if (carrera.getListaDeParticipantes().remove(carrera.getListaDeParticipantes().get(posicion))) {
                    JOptionPane.showMessageDialog(this, "Participane eliminado", "ELIMINAR PARTICIPANTE", JOptionPane.INFORMATION_MESSAGE);
                    lfo.abrirFicheroObjetosGrabar("carreras.txt", lc.getListaCarreras());
                    ptm.fireTableDataChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "No se ha podido eliminar", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            jTableParticipantes.clearSelection();
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEliminarParticipanteActionPerformed

    private void jButtonAsignarDorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAsignarDorsalActionPerformed
        try {
            boolean valido=true;
            int seleccion = jTableParticipantes.convertRowIndexToModel(jTableParticipantes.getSelectedRow());
            p = carrera.getListaDeParticipantes().get(seleccion);
            String dorsal = JOptionPane.showInputDialog(this, "ASIGNAR DORSAL(000-999)", "DORSAL", JOptionPane.QUESTION_MESSAGE);                                
            
            p.setDorsal(dorsal);
            lfo.abrirFicheroObjetosGrabar("carreras.txt", lc.getListaCarreras());
            ptm.fireTableDataChanged();
 
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableParticipantes.clearSelection();

    }//GEN-LAST:event_jButtonAsignarDorsalActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        if(jComboBoxFiltrar.getSelectedItem().equals("NOMBRE")){
        RowFilter<ParticipantesTableModel, Integer> rf = RowFilter.regexFilter(jTextFieldFiltro.getText(), 1);
        sorter.setRowFilter(rf);
        }
        if(jComboBoxFiltrar.getSelectedItem().equals("DORSAL")){
        RowFilter<ParticipantesTableModel, Integer> rf1 = RowFilter.regexFilter(jTextFieldFiltro.getText(), 2);
        sorter.setRowFilter(rf1);
        }
        jTextFieldFiltro.setText("");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonSalirFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirFiltradoActionPerformed
        rellenarTabalParicipantes();
        jTextFieldFiltro.setText("");
    }//GEN-LAST:event_jButtonSalirFiltradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAsignarDorsal;
    private javax.swing.JButton jButtonEliminarParticipante;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonSalirFiltrado;
    private javax.swing.JComboBox<String> jComboBoxFiltrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableParticipantes;
    private javax.swing.JTextField jTextFieldFiltro;
    // End of variables declaration//GEN-END:variables
}
