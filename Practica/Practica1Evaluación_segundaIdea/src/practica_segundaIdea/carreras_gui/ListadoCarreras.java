/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.carreras_gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import practica_segundaIdea.carreras_gui.tableModelCarrera.CarreraTableModel;
import practica_segundaIdea.corredor_gui.DatosCorredor;
import practica_segundaIdea.corredor_gui.ListadoDeCorredores;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.logica.LogicaCarrera;
import practica_segundaIdea.logica.LogicaFicheros;
import practica_segundaIdea.logica.LogicaFicherosObjetos;
import practica_segundaIdea.run.PaginaPrincipal;

/**
 *
 * @author USER
 */
public class ListadoCarreras extends javax.swing.JDialog {

    LogicaCarrera logCarrera = new LogicaCarrera();
    LogicaFicheros lf = new LogicaFicheros();
    LogicaFicherosObjetos lfo = new LogicaFicherosObjetos();
    TableRowSorter<CarreraTableModel> sorter;
    PaginaPrincipal paginaPrincipal;
    CarreraTableModel ctm;
    Carrera carrera;

    /**
     * Creates new form ListadoCarreras
     */
    public ListadoCarreras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        initComponents();
        this.setTitle("LISTADO DE CARRERAS");
        rellenarTableCarrera();
    }

    /**
     * Método que se encarga de llenar la tabla de carreras. Cabecera y tantas
     * filas como registros existan.
     */
    private void rellenarTableCarrera() {
        ctm = new CarreraTableModel(logCarrera.getListaCarreras());
        jTableListaCarreras.setModel(ctm);
        sorter = new TableRowSorter<>(ctm);
        jTableListaCarreras.setRowSorter(sorter);
        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(2, SortOrder.ASCENDING));
        sorter.setSortKeys(sortKeys);
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
        jTableListaCarreras = new javax.swing.JTable();
        jButtonNuevaAlta = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregarCorredor = new javax.swing.JButton();
        jButtonParticipantes = new javax.swing.JButton();
        jButtonGuardarRegistros = new javax.swing.JButton();
        jButtonIniciarCarrera = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jTextFieldFiltrado = new javax.swing.JTextField();
        jButtonSalirFiltrado = new javax.swing.JButton();
        jComboBoxFiltro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableListaCarreras.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableListaCarreras);

        jButtonNuevaAlta.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonNuevaAlta.text")); // NOI18N
        jButtonNuevaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaAltaActionPerformed(evt);
            }
        });

        jButtonBaja.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonBaja.text")); // NOI18N
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jButtonModificar.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonModificar.text")); // NOI18N
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        jButtonAgregarCorredor.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonAgregarCorredor.text")); // NOI18N
        jButtonAgregarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarCorredorActionPerformed(evt);
            }
        });

        jButtonParticipantes.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonParticipantes.text")); // NOI18N
        jButtonParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonParticipantesActionPerformed(evt);
            }
        });

        jButtonGuardarRegistros.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonGuardarRegistros.text")); // NOI18N
        jButtonGuardarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistrosActionPerformed(evt);
            }
        });

        jButtonIniciarCarrera.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonIniciarCarrera.text")); // NOI18N
        jButtonIniciarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarCarreraActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonFiltrar.text")); // NOI18N
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jTextFieldFiltrado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldFiltrado.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jTextFieldFiltrado.text")); // NOI18N

        jButtonSalirFiltrado.setText(org.openide.util.NbBundle.getMessage(ListadoCarreras.class, "ListadoCarreras.jButtonSalirFiltrado.text")); // NOI18N
        jButtonSalirFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirFiltradoActionPerformed(evt);
            }
        });

        jComboBoxFiltro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "FECHA", "LUGAR" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)
                        .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNuevaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBaja, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addComponent(jButtonAgregarCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGuardarRegistros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonIniciarCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSalirFiltrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonNuevaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jButtonAgregarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonGuardarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIniciarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalirFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxFiltro)
                    .addComponent(jButtonFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNuevaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaAltaActionPerformed
        DatosCarrera datosCarrera = new DatosCarrera(paginaPrincipal, true);
        datosCarrera.setVisible(true);
        ctm.fireTableDataChanged();
    }//GEN-LAST:event_jButtonNuevaAltaActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        try {
            int seleccion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            if (!logCarrera.getListaCarreras().get(seleccion).isIniciada()) {
                int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la carrera?", "BORRADO", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION) {
                    logCarrera.getListaCarreras().remove(seleccion);
                    lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
                    JOptionPane.showMessageDialog(this, "Carrera eliminada", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                    ctm.fireTableDataChanged();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar", "ERROR", JOptionPane.ERROR);
                }
            } else {
                // JOptionPane.showMessageDialog(this, "CARRERA INICIADA", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado carrera", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        try {
            int seleccion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            if (!logCarrera.getListaCarreras().get(seleccion).isIniciada()) {
                ModificarCarrera modificarCarrera = new ModificarCarrera(paginaPrincipal,
                        true, logCarrera.getListaCarreras().get(seleccion));
                modificarCarrera.setVisible(true);
                lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
                ctm.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "CARRERA INICIADA", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado carrera", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAgregarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCorredorActionPerformed
        try {
            int opcion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            if (!logCarrera.getListaCarreras().get(opcion).isIniciada()) {
                int seleccion = JOptionPane.showConfirmDialog(this, "¿EXISTE EL CORREDOR?", "", JOptionPane.YES_NO_OPTION);
                if (seleccion == JOptionPane.YES_OPTION) {
                    carrera = logCarrera.getListaCarreras().get(opcion);
                    ListadoDeCorredores listadoDeCorredores = new ListadoDeCorredores(paginaPrincipal, true, carrera);
                    listadoDeCorredores.setVisible(true);
                } else {
                    DatosCorredor datosCorredor = new DatosCorredor(paginaPrincipal, true);
                    datosCorredor.setVisible(true);
                }
            } else {
                JOptionPane.showMessageDialog(this, "CARRERA INICIADA", "", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableListaCarreras.clearSelection();
    }//GEN-LAST:event_jButtonAgregarCorredorActionPerformed

    private void jButtonParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonParticipantesActionPerformed
        try {
            int opcion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            carrera = logCarrera.getListaCarreras().get(opcion);
            ListaParticipantesCarrera listaParticipantesCarrera = new ListaParticipantesCarrera(paginaPrincipal, true, carrera);
            listaParticipantesCarrera.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableListaCarreras.clearSelection();
    }//GEN-LAST:event_jButtonParticipantesActionPerformed

    private void jButtonGuardarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistrosActionPerformed

        lfo.abrirFicheroObjetosGrabar("carreras.txt", logCarrera.getListaCarreras());

    }//GEN-LAST:event_jButtonGuardarRegistrosActionPerformed

    private void jButtonIniciarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarCarreraActionPerformed
        try {
            int seleccion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            carrera = logCarrera.getListaCarreras().get(seleccion);
            carrera.setIniciada(true);
            lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
            lfo.abrirFicheroObjetosGrabar("carreras.txt", logCarrera.getListaCarreras());
            ctm.fireTableDataChanged();
            CarreraEnCurso carreraEnCurso = new CarreraEnCurso(paginaPrincipal, true, carrera);
            carreraEnCurso.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonIniciarCarreraActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        if(jComboBoxFiltro.getSelectedItem().equals("NOMBRE")){
        RowFilter<CarreraTableModel, Integer> rf = RowFilter.regexFilter(jTextFieldFiltrado.getText(), 0);
        sorter.setRowFilter(rf);
        }else if(jComboBoxFiltro.getSelectedItem().equals("FECHA")){
        RowFilter<CarreraTableModel, Integer> rf1 = RowFilter.regexFilter(jTextFieldFiltrado.getText(), 1);
        sorter.setRowFilter(rf1);
        }else if(jComboBoxFiltro.getSelectedItem().equals("LUGAR")){
        RowFilter<CarreraTableModel, Integer> rf2 = RowFilter.regexFilter(jTextFieldFiltrado.getText(), 2);
        sorter.setRowFilter(rf2);
        }
        jTextFieldFiltrado.setText("");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButtonSalirFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirFiltradoActionPerformed
        rellenarTableCarrera();
        jTextFieldFiltrado.setText("");
    }//GEN-LAST:event_jButtonSalirFiltradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCorredor;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonGuardarRegistros;
    private javax.swing.JButton jButtonIniciarCarrera;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevaAlta;
    private javax.swing.JButton jButtonParticipantes;
    private javax.swing.JButton jButtonSalirFiltrado;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaCarreras;
    private javax.swing.JTextField jTextFieldFiltrado;
    // End of variables declaration//GEN-END:variables
}
