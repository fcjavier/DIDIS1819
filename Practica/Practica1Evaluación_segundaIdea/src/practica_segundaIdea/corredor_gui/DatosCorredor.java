/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.corredor_gui;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;
import practica_segundaIdea.dto.Corredor;
import practica_segundaIdea.logica.LogicaCorredor;
import practica_segundaIdea.logica.LogicaFicheros;
import practica_segundaIdea.run.PaginaPrincipal;

/**
 *
 * @author USER
 */
public class DatosCorredor extends javax.swing.JDialog {

    LogicaCorredor lc = new LogicaCorredor();
    LogicaFicheros lf = new LogicaFicheros();
    private PaginaPrincipal paginaPrincipal;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    /**
     * Creates new form DatosCorredor
     * @param parent
     * @param modal
     */
    public DatosCorredor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        paginaPrincipal = (PaginaPrincipal) parent;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("DATOS PARA EL CORREDOR");
        jButtonRegistrarCorredor.setEnabled(false);

        ValidationGroup group = validationPanelCorredor.getValidationGroup();
        group.add(jTextFieldTelefono, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_NUMBER,
                StringValidators.maxLength(9), StringValidators.minLength(9));
        group.add(jTextFieldDireccion, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDNI, StringValidators.REQUIRE_NON_EMPTY_STRING,StringValidators.maxLength(9),
                StringValidators.minLength(9));
        group.add(jTextFieldNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        validationPanelCorredor.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent ce) {
                if (validationPanelCorredor.getProblem() == null) {
                    jButtonRegistrarCorredor.setEnabled(true);

                } else {
                    jButtonRegistrarCorredor.setEnabled(false);
                }
            }
        });
    }

    /**
     * Método para crear un nuevo corredor, tomando los datos del panel de
     * vistas. Cambia la fecha de un dato tipo Date a un String, que es el tipo
     * de dato requerido en el objeto corredor. A demás añade el nuevo corredor
     * a la lista de corredores.
     */
    public void crearCorredor() {
        String nombre = jTextFieldNombre.getText();
        String dni = jTextFieldDNI.getText();
        Date f = (Date) jSpinnerFecha.getValue();
        String fecha = sdf.format(f);
        String direccion = jTextFieldDireccion.getText();
        String telefono = jTextFieldTelefono.getText();
        Corredor corredor = new Corredor(nombre, dni, fecha, direccion, telefono);
        lc.agregarCorredor(corredor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDatosCorredor = new javax.swing.JPanel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jSpinnerFecha = new javax.swing.JSpinner();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButtonRegistrarCorredor = new javax.swing.JButton();
        validationPanelCorredor = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanelDatosCorredor.setBackground(new java.awt.Color(0, 204, 153));

        jLabelNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("DNI:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Fecha Nacimiento:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Dirección:");

        jLabelTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelTelefono.setText("Teléfono:");

        jTextFieldNombre.setName("Nombre"); // NOI18N

        jTextFieldDNI.setName("DNI"); // NOI18N

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(1543705200000L), null, new java.util.Date(1543705200000L), java.util.Calendar.DAY_OF_MONTH));

        jTextFieldDireccion.setName("Dirección"); // NOI18N

        jTextFieldTelefono.setName("Teléfono"); // NOI18N

        jButtonRegistrarCorredor.setText("REGISTRAR");
        jButtonRegistrarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarCorredorActionPerformed(evt);
            }
        });

        validationPanelCorredor.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Formato   ( 555777999 )");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Formato   (  99888777H )");

        javax.swing.GroupLayout jPanelDatosCorredorLayout = new javax.swing.GroupLayout(jPanelDatosCorredor);
        jPanelDatosCorredor.setLayout(jPanelDatosCorredorLayout);
        jPanelDatosCorredorLayout.setHorizontalGroup(
            jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDatosCorredorLayout.createSequentialGroup()
                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelDatosCorredorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonRegistrarCorredor)
                            .addGroup(jPanelDatosCorredorLayout.createSequentialGroup()
                                .addComponent(jLabelNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanelDatosCorredorLayout.createSequentialGroup()
                        .addGap(0, 33, Short.MAX_VALUE)
                        .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(validationPanelCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelDatosCorredorLayout.createSequentialGroup()
                                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabelTelefono))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(63, 63, 63))
        );
        jPanelDatosCorredorLayout.setVerticalGroup(
            jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosCorredorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDatosCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addGap(20, 20, 20)
                .addComponent(jButtonRegistrarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validationPanelCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatosCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelDatosCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarCorredorActionPerformed
        boolean registrar = true;
        if (!lc.comprobarDNI(jTextFieldDNI.getText())) {
            JOptionPane.showMessageDialog(this, "DNI INCORRECTO", "", JOptionPane.WARNING_MESSAGE);
            registrar = false;
        }
        Date hoy=new Date();
        hoy.getTime();
        Date fech=(Date) jSpinnerFecha.getValue();
        if(fech.after(hoy)){
            JOptionPane.showMessageDialog(this, "COMPRUEBE LA FECHAS DE NACIMIENTO");
            registrar=false;
        }
        if (!lc.comprobarTelefono(jTextFieldTelefono.getText())) {
            JOptionPane.showMessageDialog(this, "TELÉFONO INCORRECTO", "", JOptionPane.WARNING_MESSAGE);
            registrar = false;
        }
        if (registrar) {
            crearCorredor();
            lf.abrirFicheroCSVEscrituraCorredor("corredor.csv", lc.getListaCorredores());
            int opcion = JOptionPane.showConfirmDialog(this, "NUEVO CORREDOR", "REGISTRO REALIZADO", JOptionPane.YES_NO_OPTION);
            if (opcion == JOptionPane.NO_OPTION) {
                this.dispose();
            }
            if (opcion == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Corredor Registrado", "Confirmación", JOptionPane.INFORMATION_MESSAGE);
                jTextFieldNombre.setText("");
                jTextFieldDNI.setText("");
                jTextFieldDireccion.setText("");
                jTextFieldTelefono.setText("");
            }
        }

    }//GEN-LAST:event_jButtonRegistrarCorredorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrarCorredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanelDatosCorredor;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelCorredor;
    // End of variables declaration//GEN-END:variables
}
