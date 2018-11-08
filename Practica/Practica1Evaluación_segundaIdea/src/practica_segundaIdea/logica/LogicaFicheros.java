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
import practica_segundaIdea.carreras_gui.ListadoCarreras;
import practica_segundaIdea.dto.Carrera;
import practica_segundaIdea.dto.Corredor;

/**
 *
 * @author USER
 */
public class LogicaFicheros {

    private List<Corredor> lista;
    private List<Carrera> carreras;

    public boolean abrirFicheroCSVEscrituraCorredor(String fichero, List<Corredor> lista) {
          boolean correcto=true;
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
            correcto=false;
        }
        return correcto;
    }

     public boolean abrirFicheroCSVEscrituraCarrera(String fichero, List<Carrera> carreras) {
          boolean correcto=true;
        FileWriter fw = null;      
        try {
           BufferedWriter escribe = new BufferedWriter(new FileWriter(fichero));
             for (Carrera c : carreras) {
             try {
                 escribe.write(c.getNomCarrera() + "," + c.getFecha() + "," + c.getLugar() + ","
                         + c.getMaxParticipantes() + "," + "\r\n");
             } catch (IOException ex) {
                 Exceptions.printStackTrace(ex);
             }
            }           
            escribe.close();
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
            correcto=false;
        }
        return correcto;
    }
    
    
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
    
    public List<Carrera> abrirFicheroCSVLecturaCarrera(String fichero) {
        carreras= new ArrayList<>();        
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
    private Carrera tokenizarCarrera(String linea){
        Carrera c=null;
        StringTokenizer st=new StringTokenizer(linea,",");
        while(st.hasMoreTokens()){
            String nombre=st.nextToken();
            String fecha=st.nextToken();
            String lugar=st.nextToken();
            int max=Integer.parseInt(st.nextToken());
            c=new Carrera(nombre, fecha, lugar, max);
        }
        return c;
    }
    
      
}
