/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion_1.gui.tableModelCorredores;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import practica1Evaluacion_1.modelo.Corredor;

/**
 *
 * @author USER
 */
public class CorredoresTableModel extends AbstractTableModel {

    private List<Corredor> lista;
    private String[] nomColumnas={"Nombre","DNI","Fecha Nacimiento","Dirección","Telefono"};
    
    public CorredoresTableModel(List<Corredor> listaCorredores) {
        this.lista = listaCorredores;
    }
    
    
    @Override
    public int getRowCount() {
       return lista.size();
    }

    @Override
    public int getColumnCount() {
        return nomColumnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
       switch(columna){
           case 0:
              return lista.get(fila).getNombre();
           case 1:
              return lista.get(fila).getDni();
           case 2:
              return lista.get(fila).getFechaNacimiento();
           case 3:
              return lista.get(fila).getDireccion();
           case 4:
              return lista.get(fila).getTelefono();            
       }
        return null;
    }

    @Override
    public String getColumnName(int columna) {
         return nomColumnas[columna];
    }
    
}
