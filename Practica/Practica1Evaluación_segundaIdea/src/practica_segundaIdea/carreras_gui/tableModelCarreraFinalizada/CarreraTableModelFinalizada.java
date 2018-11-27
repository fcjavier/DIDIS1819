/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.carreras_gui.tableModelCarreraFinalizada;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import practica_segundaIdea.dto.Carrera;

/**
 *
 * @author USER
 */
public class CarreraTableModelFinalizada extends AbstractTableModel {

    private List<Carrera> listaCarreras = new ArrayList<>();
    private String[] nomColumnas = {"Nombre", "Fecha", "Lugar", "Max Corredores"};

    public CarreraTableModelFinalizada(List<Carrera> lista) {
        this.listaCarreras = lista;
    }

    @Override
    public int getRowCount() {
        return listaCarreras.size();
    }

    @Override
    public int getColumnCount() {
        return nomColumnas.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return listaCarreras.get(fila).getNomCarrera();
            case 1:
                return listaCarreras.get(fila).getFecha();
            case 2:
                return listaCarreras.get(fila).getLugar();
            case 3:
                return listaCarreras.get(fila).getMaxParticipantes();
        }
        return null;
    }

    @Override
    public String getColumnName(int columna) {
        return nomColumnas[columna];
    }

}
