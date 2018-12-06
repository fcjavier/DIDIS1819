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
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableRowSorter;
import practica_segundaIdea.carreras_gui.tableModelCarreraFinalizada.CarreraTableModelFinalizada;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.logica.LogicaCarrera;
import practica_segundaIdea.logica.LogicaFicheros;
import practica_segundaIdea.logica.LogicaFicherosObjetos;
import practica_segundaIdea.run.PaginaPrincipal;

/**
 *
 * @author USER
 */
public class ListadoCarrerasTerminadas extends javax.swing.JDialog {

    LogicaCarrera logCarrera = new LogicaCarrera();
    LogicaFicheros lf = new LogicaFicheros();
    LogicaFicherosObjetos lfo = new LogicaFicherosObjetos();
    TableRowSorter<CarreraTableModelFinalizada> sorter;
    PaginaPrincipal paginaPrincipal;
    CarreraTableModelFinalizada ctmf;
    Carrera carrera=null;

    /**
     * Creates new form ListadoCarrerasTerminadas
     */
    public ListadoCarrerasTerminadas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        rellenarTableCarrera();       
        this.setTitle("LISTADO DE CARRERAS FINALIZADAS");
    }

    private void rellenarTableCarrera() {
        ctmf = new CarreraTableModelFinalizada(logCarrera.getListaCarrerasFinalizadas());
        jTableListadoCarrerasTerminadas.setModel(ctmf);
        sorter = new TableRowSorter<>(ctmf);
        jTableListadoCarrerasTerminadas.setRowSorter(sorter);
        List<RowSorter.SortKey> sortKeys = new ArrayList<>();
        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
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
        jTableListadoCarrerasTerminadas = new javax.swing.JTable();
        jButtonVerParticipantes = new javax.swing.JButton();
        jButtonInformeCarreras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxFiltro = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButtonSalirFiltrado = new javax.swing.JButton();
        jTextFieldFiltrar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(570, 360));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jTableListadoCarrerasTerminadas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableListadoCarrerasTerminadas);

        jButtonVerParticipantes.setText(org.openide.util.NbBundle.getMessage(ListadoCarrerasTerminadas.class, "ListadoCarrerasTerminadas.jButtonVerParticipantes.text")); // NOI18N
        jButtonVerParticipantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerParticipantesActionPerformed(evt);
            }
        });

        jButtonInformeCarreras.setText(org.openide.util.NbBundle.getMessage(ListadoCarrerasTerminadas.class, "ListadoCarrerasTerminadas.jButtonInformeCarreras.text")); // NOI18N
        jButtonInformeCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInformeCarrerasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText(org.openide.util.NbBundle.getMessage(ListadoCarrerasTerminadas.class, "ListadoCarrerasTerminadas.jLabel1.text")); // NOI18N

        jComboBoxFiltro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NOMBRE", "FECHA NACIMIENTO", "LUGAR", "MAX PARTICIPANTES", " " }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText(org.openide.util.NbBundle.getMessage(ListadoCarrerasTerminadas.class, "ListadoCarrerasTerminadas.jButton1.text")); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonSalirFiltrado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonSalirFiltrado.setText(org.openide.util.NbBundle.getMessage(ListadoCarrerasTerminadas.class, "ListadoCarrerasTerminadas.jButtonSalirFiltrado.text")); // NOI18N
        jButtonSalirFiltrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirFiltradoActionPerformed(evt);
            }
        });

        jTextFieldFiltrar.setText(org.openide.util.NbBundle.getMessage(ListadoCarrerasTerminadas.class, "ListadoCarrerasTerminadas.jTextFieldFiltrar.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInformeCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonVerParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                .addComponent(jButtonSalirFiltrado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jTextFieldFiltrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalirFiltrado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInformeCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    private void jButtonVerParticipantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerParticipantesActionPerformed
        try {
            int opcion = jTableListadoCarrerasTerminadas.convertRowIndexToModel(jTableListadoCarrerasTerminadas.getSelectedRow());            
            carrera = logCarrera.getListaCarrerasFinalizadas().get(opcion);
            ListaParticipantesCarrera listaParticipantesCarrera = new ListaParticipantesCarrera(paginaPrincipal, true, carrera);
            listaParticipantesCarrera.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableListadoCarrerasTerminadas.clearSelection();
    }//GEN-LAST:event_jButtonVerParticipantesActionPerformed

    private void jButtonInformeCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInformeCarrerasActionPerformed
        try {
            int opcion = jTableListadoCarrerasTerminadas.convertRowIndexToModel(jTableListadoCarrerasTerminadas.getSelectedRow());
            carrera = logCarrera.getListaCarrerasFinalizadas().get(opcion);
            InformeCarrera informeCarrera = new InformeCarrera(paginaPrincipal, true,carrera);
            informeCarrera.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No hay selección", "", JOptionPane.INFORMATION_MESSAGE);
        }
        jTableListadoCarrerasTerminadas.clearSelection();

    }//GEN-LAST:event_jButtonInformeCarrerasActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if(jComboBoxFiltro.getSelectedItem().equals("NOMBRE")){
             RowFilter<CarreraTableModelFinalizada, Integer> rf=RowFilter.regexFilter(jTextFieldFiltrar.getText(), 0);
             sorter.setRowFilter(rf);
         }
         if(jComboBoxFiltro.getSelectedItem().equals("FECHA NACIMIENTO")){
             RowFilter<CarreraTableModelFinalizada, Integer> rf1=RowFilter.regexFilter(jTextFieldFiltrar.getText(), 1);
             sorter.setRowFilter(rf1);
         }
         if(jComboBoxFiltro.getSelectedItem().equals("LUGAR")){
             RowFilter<CarreraTableModelFinalizada, Integer> rf2=RowFilter.regexFilter(jTextFieldFiltrar.getText(), 2);
             sorter.setRowFilter(rf2);
         }
         if(jComboBoxFiltro.getSelectedItem().equals("MAX PARTICIPANTES")){
             RowFilter<CarreraTableModelFinalizada, Integer> rf3=RowFilter.regexFilter(jTextFieldFiltrar.getText(), 3);
             sorter.setRowFilter(rf3);
         }
         jTextFieldFiltrar.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonSalirFiltradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirFiltradoActionPerformed
        rellenarTableCarrera();
        jTextFieldFiltrar.setText("");
    }//GEN-LAST:event_jButtonSalirFiltradoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonInformeCarreras;
    private javax.swing.JButton jButtonSalirFiltrado;
    private javax.swing.JButton jButtonVerParticipantes;
    private javax.swing.JComboBox<String> jComboBoxFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListadoCarrerasTerminadas;
    private javax.swing.JTextField jTextFieldFiltrar;
    // End of variables declaration//GEN-END:variables
}
