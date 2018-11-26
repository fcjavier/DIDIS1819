/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.corredor_gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.RowSorter.SortKey;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import practica_segundaIdea.carreras_gui.ListaParticipantesCarrera;
import practica_segundaIdea.corredor_gui.tableModelCorredores.CorredoresTableModel;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.dto.Corredor;
import practica_segundaIdea.dto.Participante;
import practica_segundaIdea.logica.LogicaCarrera;
import practica_segundaIdea.logica.LogicaCorredor;
import practica_segundaIdea.logica.LogicaFicheros;
import practica_segundaIdea.run.PaginaPrincipal;

/**
 *
 * @author USER
 */
public class ListadoDeCorredores extends javax.swing.JDialog {

    LogicaCorredor lc = new LogicaCorredor();
    LogicaFicheros lf = new LogicaFicheros();
    LogicaCarrera logicaCarrera = new LogicaCarrera();
    TableRowSorter<CorredoresTableModel> sorter;
    PaginaPrincipal paginaPrincipal;
    CorredoresTableModel ctm;
    Carrera carrera;

    /**
     * Creates new form ListadoDeCorredores
     */
    public ListadoDeCorredores(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        this.setTitle("LISTADO DE CORREDORES");
        initComponents();
        rellenarTablaCorredores();
    }

    public ListadoDeCorredores(java.awt.Frame parent, boolean modal, Carrera c) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        initComponents();
        this.carrera = c;
        rellenarTablaCorredores();
    }

    /**
     * Método que carga la cabecera y los datos en la tabla que muestra los
     * corredores.Dandole una ordenación por defecto y la posibilidad del cambio
     * en la ordenación.
     */
    private void rellenarTablaCorredores() {
        ctm = new CorredoresTableModel(lc.getListaCorredores());
        jTableCorredores.setModel(ctm);

        sorter = new TableRowSorter<>(ctm);
        jTableCorredores.setRowSorter(sorter);

        List<SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new SortKey(0, SortOrder.ASCENDING));
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
        jTableCorredores = new javax.swing.JTable();
        jButtonNuevaAlta = new javax.swing.JButton();
        jButtonBaja = new javax.swing.JButton();
        jButtonModificacion = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonFiltrar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextFielFiltrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCorredores);

        jButtonNuevaAlta.setText("ALTA");
        jButtonNuevaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevaAltaActionPerformed(evt);
            }
        });

        jButtonBaja.setText("BAJA");
        jButtonBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaActionPerformed(evt);
            }
        });

        jButtonModificacion.setText("MODIFICACIÓN");
        jButtonModificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificacionActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("REGISTRAR");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jButtonFiltrar.setText("FILTRAR POR..");
        jButtonFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrarActionPerformed(evt);
            }
        });

        jButton2.setText("SALIR FILTRADO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 553, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNuevaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFielFiltrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButtonModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFielFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonNuevaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonModificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonFiltrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addGap(0, 33, Short.MAX_VALUE))
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
        DatosCorredor datosCorredor = new DatosCorredor(paginaPrincipal, true);
        datosCorredor.setVisible(true);
        ctm.fireTableDataChanged();
    }//GEN-LAST:event_jButtonNuevaAltaActionPerformed

    private void jButtonBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaActionPerformed
        try {
            int seleccion = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
            int opcion = JOptionPane.showConfirmDialog(this, "¿Desea eliminar al corredor?", "BORRADO", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.YES_OPTION) {
                lc.getListaCorredores().remove(seleccion);
                lf.abrirFicheroCSVEscrituraCorredor("corredor.csv", lc.getListaCorredores());
                JOptionPane.showMessageDialog(this, "Corredor eliminado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                ctm.fireTableDataChanged();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar", "ERROR", JOptionPane.ERROR);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado corredor", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonBajaActionPerformed

    private void jButtonModificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificacionActionPerformed
        try {
            int seleccion = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
            ModificarDatos modificarDatos = new ModificarDatos(paginaPrincipal,
                    true, lc.getListaCorredores().get(seleccion));
            modificarDatos.setVisible(true);
            lf.abrirFicheroCSVEscrituraCorredor("corredor.csv", lc.getListaCorredores());
            ctm.fireTableDataChanged();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado corredor", "", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonModificacionActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
      try{
        int opcion = jTableCorredores.convertRowIndexToModel(jTableCorredores.getSelectedRow());
        Corredor c = lc.getListaCorredores().get(opcion);
        Participante p = new Participante(c.getDni(), c.getNombre());        
            if(carrera.getListaDeParticipantes().size()<carrera.getMaxParticipantes()){
        if (carrera.getListaDeParticipantes().contains(p)) {
            JOptionPane.showMessageDialog(this, "El corredor ya existe", " ", JOptionPane.INFORMATION_MESSAGE);
        } else {
            carrera.getListaDeParticipantes().add(p);
            ListaParticipantesCarrera lpc=new ListaParticipantesCarrera(paginaPrincipal, true, carrera);
            lpc.setVisible(true);
        }
            }else{
                JOptionPane.showMessageDialog(this, "Carrera completa", " ", JOptionPane.INFORMATION_MESSAGE);
            }
      }catch(Exception e){
          JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
      }
      jTableCorredores.clearSelection();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrarActionPerformed
        RowFilter<CorredoresTableModel,Integer> rf=RowFilter.regexFilter(jTextFielFiltrar.getText(), 0);
        sorter.setRowFilter(rf);
        jTextFielFiltrar.setText("");
    }//GEN-LAST:event_jButtonFiltrarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          rellenarTablaCorredores();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonBaja;
    private javax.swing.JButton jButtonFiltrar;
    private javax.swing.JButton jButtonModificacion;
    private javax.swing.JButton jButtonNuevaAlta;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredores;
    private javax.swing.JTextField jTextFielFiltrar;
    // End of variables declaration//GEN-END:variables
}
