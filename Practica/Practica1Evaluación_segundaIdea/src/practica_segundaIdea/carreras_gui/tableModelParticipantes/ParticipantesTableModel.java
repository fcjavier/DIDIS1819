/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.carreras_gui.tableModelParticipantes;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import practica_segundaIdea.dto.Participante;

/**
 *
 * @author USER
 */
public class ParticipantesTableModel extends AbstractTableModel {

    private List<Participante> listaParticipantes = new ArrayList<>();
    private String[] cabecera = {"Dni","Nombre","Dorsal", "Tiempo"};

    public ParticipantesTableModel(List<Participante> lista) {
        this.listaParticipantes = lista;
    }

    @Override
    public int getRowCount() {
        return listaParticipantes.size();
    }

    @Override
    public int getColumnCount() {
        return cabecera.length;
    }

    @Override
    public Object getValueAt(int fila, int columna) {
        switch (columna) {
            case 0:
                return listaParticipantes.get(fila).getDni();
            case 1:
                return listaParticipantes.get(fila).getNombre();
            case 2:
                return listaParticipantes.get(fila).getDorsal();
            case 3:
                return listaParticipantes.get(fila).getTiempo();
        }
        return null;
    }

    @Override
    public String getColumnName(int columna) {
        return cabecera[columna];
    }

}
