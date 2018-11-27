/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.run;

import java.io.File;
import practica_segundaIdea.corredor_gui.*;
import practica_segundaIdea.carreras_gui.*;
import javax.swing.JOptionPane;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.dto.Corredor;
import practica_segundaIdea.logica.LogicaCarrera;
import practica_segundaIdea.logica.LogicaCorredor;
import practica_segundaIdea.logica.LogicaFicheros;
import practica_segundaIdea.logica.LogicaFicherosObjetos;
import timersavedata.SaveListener;

/**
 *
 * @author USER
 */
public class PaginaPrincipal extends javax.swing.JFrame {

    LogicaCorredor lc = new LogicaCorredor();
    LogicaCarrera logCarrera = new LogicaCarrera();
    LogicaFicheros lf=new LogicaFicheros();
    LogicaFicherosObjetos lfo=new LogicaFicherosObjetos();
    Corredor c = new Corredor();
    Carrera carrera = new Carrera();

    /**
     * Creates new form PaginaPrincipal
     */
     
    public PaginaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarFichero();
        timerData.addSaveListener(new SaveListener() {
            @Override
            public void guardarDatos() {
             lf.abrirFicheroCSVEscrituraCorredor("corredor.csv", lc.getListaCorredores());
             lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
             lfo.abrirFicheroObjetosGrabar("carreras.txt", logCarrera.getListaCarreras());
             lfo.abrirFicheroObjetosGrabar("carrerasFinalizadas.txt", logCarrera.getListaCarrerasFinalizadas());
            }
        });
    }
    public void cargarFichero(){
        File fichero=new File("carreras.txt");
        File finales=new File("carrerasFinalizadas.txt");
        lc.cargarListaCorredor(lf.abrirFicheroCSVLecturaCorredor("corredor.csv"));
        logCarrera.cargarListaCarreras(lfo.abrirFicheroObjetosLeer(fichero));
        logCarrera.cargarListaCarrerasFinalizadas(lfo.abrirFicheroObjetosLeer(finales));
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
        jLabel1 = new javax.swing.JLabel();
        jButtonAltaCorredor = new javax.swing.JButton();
        jButtonBajaCorredor = new javax.swing.JButton();
        jButtonModificarCorredor = new javax.swing.JButton();
        jButtonConsultarCorredor = new javax.swing.JButton();
        jButtonListarCorredores = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCrearCarrera = new javax.swing.JButton();
        jButtonAnularCarrera = new javax.swing.JButton();
        jButtonModificarCarrera = new javax.swing.JButton();
        jButtonConsultarCarrera = new javax.swing.JButton();
        jButtonListarCarreras = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonGuardarRegistros = new javax.swing.JButton();
        timerData = new timersavedata.TimerData();
        jButtonCarrerasFinalizadas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(650, 490));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("GESTION   DE   CORREDORES");

        jButtonAltaCorredor.setText("ALTA");
        jButtonAltaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaCorredorActionPerformed(evt);
            }
        });

        jButtonBajaCorredor.setText("BAJA");
        jButtonBajaCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBajaCorredorActionPerformed(evt);
            }
        });

        jButtonModificarCorredor.setText("MODIFICAR");
        jButtonModificarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCorredorActionPerformed(evt);
            }
        });

        jButtonConsultarCorredor.setText("CONSULTAR");
        jButtonConsultarCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCorredorActionPerformed(evt);
            }
        });

        jButtonListarCorredores.setText("LISTAR");
        jButtonListarCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCorredoresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("GESTION  DE  CARRERAS");

        jButtonCrearCarrera.setText("CREAR");
        jButtonCrearCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCarreraActionPerformed(evt);
            }
        });

        jButtonAnularCarrera.setText("ANULAR");
        jButtonAnularCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnularCarreraActionPerformed(evt);
            }
        });

        jButtonModificarCarrera.setText("MODIFICAR");
        jButtonModificarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarCarreraActionPerformed(evt);
            }
        });

        jButtonConsultarCarrera.setText("CONSULTAR");
        jButtonConsultarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarCarreraActionPerformed(evt);
            }
        });

        jButtonListarCarreras.setText("LISTAR");
        jButtonListarCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonListarCarrerasActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("OTRAS   GESTIONES");

        jButtonGuardarRegistros.setText("GURARDAR REGISTROS");
        jButtonGuardarRegistros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarRegistrosActionPerformed(evt);
            }
        });

        timerData.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(0, 0, 0)));
        timerData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        timerData.setForeground(new java.awt.Color(0, 255, 0));
        timerData.setSalvar(new timersavedata.Save(0,false));

        jButtonCarrerasFinalizadas.setText("CARRERAS  FINALIZADAS");
        jButtonCarrerasFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCarrerasFinalizadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(212, 212, 212))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(228, 228, 228))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(timerData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonGuardarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonCarrerasFinalizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButtonCrearCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonAnularCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonModificarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonConsultarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButtonListarCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jButtonAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonBajaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonModificarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonConsultarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonListarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(timerData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAltaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBajaCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCrearCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAnularCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModificarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonConsultarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonListarCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardarRegistros, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCarrerasFinalizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
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

    private void jButtonAltaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaCorredorActionPerformed
        DatosCorredor datosCorredor = new DatosCorredor(this, true);
        datosCorredor.setVisible(true);
    }//GEN-LAST:event_jButtonAltaCorredorActionPerformed

    private void jButtonListarCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCorredoresActionPerformed
        ListadoDeCorredores listadoDeCorredores = new ListadoDeCorredores(this, true);
        listadoDeCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonListarCorredoresActionPerformed

    private void jButtonBajaCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBajaCorredorActionPerformed

        String dato = JOptionPane.showInputDialog(this, "INTRODUZCA DNI", JOptionPane.QUESTION_MESSAGE);
        try {
            if (lc.comprobarDNI(dato)) {
                c = lc.buscarCorredor(dato);
                if (c != null) {
                    int confirmar = JOptionPane.showConfirmDialog(this, "Eliminar: " + dato, "", JOptionPane.OK_CANCEL_OPTION);
                    if (confirmar == JOptionPane.OK_OPTION) {
                        lc.bajaCorredor(c);
                        JOptionPane.showMessageDialog(this, "El corredor se ha eliminado", "", JOptionPane.INFORMATION_MESSAGE);

                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El corredor no existe", "", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DNI ERRONEO", "", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jButtonBajaCorredorActionPerformed

    private void jButtonConsultarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCorredorActionPerformed
        String dato = JOptionPane.showInputDialog(this, "INTRODUZCA DNI", JOptionPane.QUESTION_MESSAGE);
        try {
            if (lc.comprobarDNI(dato)) {
                c = lc.buscarCorredor(dato);
                if (c != null) {
                    MostrarCorredor mostrarCorredor = new MostrarCorredor(this, true, c);
                    mostrarCorredor.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "El corredor no existe", "", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DNI ERRONEO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jButtonConsultarCorredorActionPerformed

    private void jButtonModificarCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCorredorActionPerformed
        String dato = JOptionPane.showInputDialog(this, "INTRODUZCA DNI", JOptionPane.QUESTION_MESSAGE);
        try {
            if (lc.comprobarDNI(dato)) {
                c = lc.buscarCorredor(dato);
                if (c != null) {
                    ModificarDatos modificarDatos = new ModificarDatos(this, true, c);
                    modificarDatos.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "El corredor no existe", "", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "DNI ERRONEO", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NullPointerException e) {
        }

    }//GEN-LAST:event_jButtonModificarCorredorActionPerformed

    private void jButtonCrearCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCarreraActionPerformed
        DatosCarrera datosCarrera = new DatosCarrera(this, true);
        datosCarrera.setVisible(true);
    }//GEN-LAST:event_jButtonCrearCarreraActionPerformed

    private void jButtonListarCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonListarCarrerasActionPerformed
        ListadoCarreras listadoCarreras = new ListadoCarreras(this, true);
        listadoCarreras.setVisible(true);
    }//GEN-LAST:event_jButtonListarCarrerasActionPerformed

    private void jButtonConsultarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarCarreraActionPerformed
        String dato = JOptionPane.showInputDialog(this, "NOMBRE CARRERA", JOptionPane.QUESTION_MESSAGE);
        try {
            if (dato != "" || dato != null) {
                carrera = logCarrera.buscarCarrera(dato);
                if (carrera != null) {
                    MostrarUnaCarrera mostrarUnaCarrera = new MostrarUnaCarrera(this, true, carrera);
                    mostrarUnaCarrera.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "La carrera no existe", "", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NullPointerException e) {

        }
    }//GEN-LAST:event_jButtonConsultarCarreraActionPerformed

    private void jButtonAnularCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnularCarreraActionPerformed
        String dato = JOptionPane.showInputDialog(this, "NOMBRE CARRERA", JOptionPane.QUESTION_MESSAGE);
        if (dato != "" && dato != null) {
            carrera = logCarrera.buscarCarrera(dato);
            int confirmar = JOptionPane.showConfirmDialog(this, "Anular carrera: " + dato, "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                boolean borrado = logCarrera.anularCarrera(carrera);
                if (borrado) {
                    JOptionPane.showMessageDialog(this, "carrera eliminada", "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonAnularCarreraActionPerformed

    private void jButtonModificarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarCarreraActionPerformed
        String dato = JOptionPane.showInputDialog(this, "Nombre carrera", "", JOptionPane.QUESTION_MESSAGE);
        try {
            if (dato != "" && dato != null) {
                carrera = logCarrera.buscarCarrera(dato);
                if (carrera != null) {
                    ModificarCarrera modificarCarrera = new ModificarCarrera(this, true, carrera);
                    modificarCarrera.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "NO EXISTE", "ERROR", JOptionPane.ERROR);
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButtonModificarCarreraActionPerformed

    private void jButtonGuardarRegistrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarRegistrosActionPerformed
       boolean respuestaCorredor= lf.abrirFicheroCSVEscrituraCorredor("corredor.csv", lc.getListaCorredores());
       boolean respuestaCarrera=lf.abrirFicheroCSVEscrituraCarrera("carreras.csv", logCarrera.getListaCarreras());
       if(respuestaCorredor && respuestaCarrera){
           JOptionPane.showMessageDialog(this, "GUARDADO", "", JOptionPane.INFORMATION_MESSAGE);
       }else{
           JOptionPane.showMessageDialog(this, "ERROR AL GUARDAR", "", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButtonGuardarRegistrosActionPerformed

    private void jButtonCarrerasFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCarrerasFinalizadasActionPerformed
         ListadoCarrerasTerminadas listadoCarrerasTerminadas=new ListadoCarrerasTerminadas(this, true);
         listadoCarrerasTerminadas.setVisible(true);
    }//GEN-LAST:event_jButtonCarrerasFinalizadasActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAltaCorredor;
    private javax.swing.JButton jButtonAnularCarrera;
    private javax.swing.JButton jButtonBajaCorredor;
    private javax.swing.JButton jButtonCarrerasFinalizadas;
    private javax.swing.JButton jButtonConsultarCarrera;
    private javax.swing.JButton jButtonConsultarCorredor;
    private javax.swing.JButton jButtonCrearCarrera;
    private javax.swing.JButton jButtonGuardarRegistros;
    private javax.swing.JButton jButtonListarCarreras;
    private javax.swing.JButton jButtonListarCorredores;
    private javax.swing.JButton jButtonModificarCarrera;
    private javax.swing.JButton jButtonModificarCorredor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private timersavedata.TimerData timerData;
    // End of variables declaration//GEN-END:variables
}
