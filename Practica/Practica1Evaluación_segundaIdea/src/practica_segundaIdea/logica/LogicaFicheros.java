/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.logica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import org.openide.util.Exceptions;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.dto.Corredor;
import practica_segundaIdea.dto.Llegadas;

/**
 *
 * @author USER
 */
public class LogicaFicheros {

    //Atributos
    private List<Corredor> lista;
    private List<Carrera> carreras;

    /**
     * Método que abre un fichero de caracteres para su escritura. Recibe dos
     * parámetros un String con el nombre del fichero en el que se quiere
     * escribir y otro con una lista de corredores de tipo List.
     *
     * @param fichero
     * @param lista
     * @return boolean
     */
    public boolean abrirFicheroCSVEscrituraCorredor(String fichero, List<Corredor> lista) {
        boolean correcto = true;
        FileWriter fw = null;
        try {
            BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
            for (Corredor c : lista) {
                try {
                    escribe.write(c.getNombre() + "," + c.getDni() + "," + c.getFechaNacimiento() + ","
                            + c.getDireccion() + "," + c.getTelefono() + "\r\n");
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto = false;
        }
        return correcto;
    }

    /**
     * Método que abre un fichero de caracteres para su escritura. Recibe dos
     * parámetros un String con el nombre del fichero en el que se quiere
     * escribir y otro con una lista de carreras de tipo List.
     *
     * @param fichero
     * @param carreras
     * @return boolean
     */
    public boolean abrirFicheroCSVEscrituraCarrera(String fichero, List<Carrera> carreras) {
        boolean correcto = true;
        FileWriter fw = null;
        try {
            BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
            for (Carrera c : carreras) {
                try {
                    escribe.write(c.getNomCarrera() + "," + c.getFecha() + "," + c.getLugar() + ","
                            + c.getMaxParticipantes() + "\r\n");
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto = false;
        }
        return correcto;
    }

    /**
     * Método para la lectura de un fichero de caracteres. Recibe un parámetro
     * con el nombre del fichero y guardando los datos en una colección de tipo
     * List.
     *
     * @param fichero con el nombre del fichero a leer.
     * @return List de corredores.
     */
    public List<Corredor> abrirFicheroCSVLecturaCorredor(String fichero) {
        lista = new ArrayList<>();
        FileReader fr = null;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(fichero));
            String linea = leer.readLine();
            while (linea != null) {
                lista.add(tokenizarCorredor(linea));
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return lista;
    }

    /**
     * Método para la lectura de un fichero de caracteres. Recibe un parámetro
     * con el nombre del fichero y guardando los datos en una colección de tipo
     * List.
     *
     * @param fichero con el nombre del fichero a leer.
     * @return List de carreras.
     */
    public List<Carrera> abrirFicheroCSVLecturaCarrera(String fichero) {
        carreras = new ArrayList<>();
        FileReader fr = null;
        try {
            BufferedReader leer = new BufferedReader(new FileReader(fichero));
            String linea = leer.readLine();
            while (linea != null) {
                carreras.add(tokenizarCarrera(linea));
                linea = leer.readLine();
            }
            leer.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
        return carreras;
    }

    /**
     * Método que extrae los tokens existentes, en una cadena de caracteres.
     * Recibe un String con la cadena a tokenizar.
     *
     * @param cadena
     * @return un corredor tipo (object).
     */
    private Corredor tokenizarCorredor(String cadena) {
        Corredor c = null;
        StringTokenizer st = new StringTokenizer(cadena, ",");
        while (st.hasMoreTokens()) {
            String nombre = st.nextToken();
            String dni = st.nextToken();
            String fecha = st.nextToken();
            String direccion = st.nextToken();
            String telefono = st.nextToken();
            c = new Corredor(nombre, dni, fecha, direccion, telefono);
        }
        return c;
    }

    /**
     * Método que extrae los tokens existentes en una cadena de caracteres.
     * Recibe un String con la cadena a tokenizar.
     *
     * @param cadena
     * @return una carrera tipo (object).
     */
    private Carrera tokenizarCarrera(String linea) {
        Carrera c = null;
        StringTokenizer st = new StringTokenizer(linea, ",");
        while (st.hasMoreTokens()) {
            String nombre = st.nextToken();
            String fecha = st.nextToken();
            String lugar = st.nextToken();
            int max = Integer.parseInt(st.nextToken());
            c = new Carrera(nombre, fecha, lugar, max);
        }
        return c;
    }

    /**
     * Método que abre un fichero para registrar los datos de llegada en una
     * carrera en un fichero csv. Con el nombre de la carrera y los datos del
     * participante dorsal,nombre y tiempo realizado.
     *
     * @param nomCarrera
     * @param fecha
     * @param fichero
     * @param llegadas
     * @return boolean
     */
    public boolean abrirFicheroCSVEscrituraLlegadas(String nomCarrera, String fecha, String fichero, List<Llegadas> llegadas) {
        boolean correcto = true;
        FileWriter fw = null;
        try {
            BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
            escribe.write(nomCarrera + "\r\n");
            escribe.write(fecha + "\r\n");
            for (Llegadas llegada : llegadas) {
                try {
                    escribe.write(llegada.getDorsal() + "," + llegada.getTiempo() + ","
                            + llegada.getNomCorredor() + "\r\n");
                } catch (IOException ex) {
                    Exceptions.printStackTrace(ex);
                }
            }
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto = false;
        }
        return correcto;
    }
}
