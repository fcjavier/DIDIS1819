/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.logica;

import java.util.ArrayList;
import java.util.List;
import practica_segundaIdea.dto.Carrera;

/**
 *
 * @author USER
 */
public class LogicaCarrera {

    private static List<Carrera> listaCarreras = new ArrayList<Carrera>();
    private static List<Carrera> listaCarrerasFinalizadas = new ArrayList<Carrera>();

    private int aux;

    /**
     * Método que agrega una carrera a la lista de carreras
     *
     * @param carrera
     * @return boolean
     */
    public boolean agregarCarrera(Carrera carrera) {
        boolean agregado = false;
        if (!carrera.isIniciada()) {
            agregado = listaCarreras.add(carrera);
        }
        return agregado;
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    /**
     * Carga una lista de carreras. Recibe un parámetro de tipo List.
     *
     * @param carreras
     */
    public void cargarListaCarreras(List<Carrera> carreras) {
        listaCarreras = carreras;
    }

    public List<Carrera> getListaCarrerasFinalizadas() {
        return listaCarrerasFinalizadas;
    }

    public void cargarListaCarrerasFinalizadas(List<Carrera> listaCarrerasFinalizadas) {
         this.listaCarrerasFinalizadas = listaCarrerasFinalizadas;
    }

    
    /**
     * Método que busca una carrera en la lista por su nombre recibe un
     * parámetro tipo String con el nombre de la carrera.
     *
     * @param nomCarrera
     * @return Carrera tipo (Object).
     */
    public Carrera buscarCarrera(String nomCarrera) {
        Carrera carrera = null;
        for (Carrera c : listaCarreras) {
            if (c.getNomCarrera().equalsIgnoreCase(nomCarrera)) {
                carrera = c;
            }
        }
        return carrera;
    }

    /**
     * Método para la eliminación de una carrera en concreto dentro de una lista
     * de carreras.Recibe un parámetro tipo (object) con la carrera.
     *
     * @param c
     * @return boolean.
     */
    public boolean anularCarrera(Carrera c) {
        boolean anular = false;
        if (!c.isIniciada()) {
            anular = listaCarreras.remove(c);
        }
        return anular;
    }

    public boolean agregarCarreraFinalizada(Carrera carrera) {
        boolean agregado = false;
        if (carrera.isIniciada()) {
            agregado = listaCarrerasFinalizadas.add(carrera);
        }
        return agregado;
    }

}
