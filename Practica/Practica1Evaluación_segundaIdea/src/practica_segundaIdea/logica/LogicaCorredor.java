/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.logica;

import java.util.ArrayList;
import java.util.List;
import practica_segundaIdea.dto.Corredor;

/**
 *
 * @author USER
 */
public class LogicaCorredor {

    private static List<Corredor> listaCorredores = new ArrayList<>();

    /**
     * Agrega un nuevo corredor en la lista de corredores.
     *
     * @param corredor tipo (object).
     */
    public void agregarCorredor(Corredor corredor) {
        listaCorredores.add(corredor);
    }

    /**
     * Devuelve una lista de corredores.
     *
     * @return List
     */
    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void cargarListaCorredor(List<Corredor> lista) {
        listaCorredores = lista;
    }

    /**
     * Método que comprueba que la longitud del dni sea la correcta y que esté
     * compuesta de ocho números y una letra mayúscula.
     *
     * @param dni Recibe un parámetro en forma de String con el valor del dni.
     * @return boolean
     */
    public boolean comprobarDNI(String dni) {
        boolean control = true;
        if (dni.length() != 9) {
            control = false;
        }
        if (control == true) {
            for (int i = 0; i < dni.length() - 1; i++) {
                if (dni.codePointAt(i) >= 48 && dni.codePointAt(i) <= 57) {
                } else {
                    control = false;
                }
            }
            if (dni.codePointAt(dni.length() - 1) >= 65 && dni.codePointAt(dni.length() - 1) <= 90) {
            } else {
                control = false;
            }
        }
        return control;
    }

    /**
     * Método para comprobar que el número de teléfono tiene 9 dígitos.
     *
     * @param tlf Recibe un String con el valor del teléfono.
     * @return boolean.
     */
    public boolean comprobarTelefono(String tlf) {
        boolean control = true;
        if (tlf.length() != 9) {
            control = false;
        }
        for (int i = 0; i < tlf.length(); i++) {
            if (tlf.codePointAt(i) < 48 || tlf.codePointAt(i) > 57) {
                control = false;
            }
        }
        return control;
    }

    /**
     * Metodo que busca un corredor dentro de una lista por su dni.
     *
     * @param dato String con el valor del dni.
     * @return un valor de tipo (object) con un corredor, (null) si no existe.
     */
    public Corredor buscarCorredor(String dato) {
        Corredor corredor = null;
        for (Corredor c : listaCorredores) {
            if (c.getDni().equalsIgnoreCase(dato)) {
                corredor = c;
            }
        }
        return corredor;
    }

    /**
     * Método para dar de baja un corredor.
     *
     * @param c Parámetro de tipo (object) con los datos del corredor.
     * @return boolean.
     */
    public boolean bajaCorredor(Corredor c) {
        return listaCorredores.remove(c);
    }
}
