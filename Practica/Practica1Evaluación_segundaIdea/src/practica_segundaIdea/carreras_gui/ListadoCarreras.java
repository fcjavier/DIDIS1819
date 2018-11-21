/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.carreras_gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
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
        TableRowSorter<CarreraTableModel> sorter = new TableRowSorter<>(ctm);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonNuevaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAgregarCorredor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonParticipantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jButtonGuardarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonNuevaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
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

    private void jButtonNuevaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevaAltaActionPerformed
        DatosCarrera datosCarrera = new DatosCarrera(paginaPrincipal, true);
        datosCarrera.setVisible(true);
        ctm.fireTableDataChanged();
    }//GEN-LAST:event_jButtonNuevaAltaActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        try {
            int seleccion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la carrera?", "BORRADO", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                logCarrera.getListaCarreras().remove(seleccion);
                lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
                JOptionPane.showMessageDialog(this, "Carrera eliminada", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                ctm.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar", "ERROR", JOptionPane.ERROR);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado carrera", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        try {
            int seleccion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            ModificarCarrera modificarCarrera = new ModificarCarrera(paginaPrincipal,
                    true, logCarrera.getListaCarreras().get(seleccion));
            modificarCarrera.setVisible(true);
            lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
            ctm.fireTableDataChanged();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado carrera", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModificarActionPerformed

    private void jButtonAgregarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarCorredorActionPerformed
        try {
            int opcion = jTableListaCarreras.convertRowIndexToModel(jTableListaCarreras.getSelectedRow());
            int seleccion = JOptionPane.showConfirmDialog(this, "¿EXISTE EL CORREDOR?", "", JOptionPane.YES_NO_OPTION);
            if (seleccion == JOptionPane.YES_OPTION) {
                carrera = logCarrera.getListaCarreras().get(opcion);
                ListadoDeCorredores listadoDeCorredores = new ListadoDeCorredores(paginaPrincipal, true, carrera);
                listadoDeCorredores.setVisible(true);
            }else{
                DatosCorredor datosCorredor=new DatosCorredor(paginaPrincipal, true);
                datosCorredor.setVisible(true);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregarCorredor;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonGuardarRegistros;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JButton jButtonNuevaAlta;
    private javax.swing.JButton jButtonParticipantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaCarreras;
    // End of variables declaration//GEN-END:variables
}
