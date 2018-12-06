/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_segundaIdea.logica;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.openide.util.Exceptions;
import practica_segundaIdea.dto.Carrera;

/**
 *
 * @author USER
 */
public class LogicaFicherosObjetos {

    //Atributos
    File fichero = null;
    ObjectOutputStream escribe = null;
    ObjectInputStream lee = null;

    /**
     * Método que realiza la apertura de un fichero de objetos para grabar
     * registros.
     *
     * @param f nombre del fichero.
     * @param lista ArrayList con las carreras.
     */
    public void abrirFicheroObjetosGrabar(String f, List<Carrera> lista) {
        fichero = new File(f);
        try {
            escribe = new ObjectOutputStream(new FileOutputStream(fichero));
            for (Carrera c : lista) {
                escribe.writeObject(c);
            }
            escribe.close();
        } catch (FileNotFoundException ex) {
            Exceptions.printStackTrace(ex);
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    /**
     * Método para abrir un fichero de objetos para su lectura.
     *
     * @param fichero
     * @return Un ArrayList de carreras
     */
    public List<Carrera> abrirFicheroObjetosLeer(File fichero) {
        List<Carrera> lista = new ArrayList<>();
        if (fichero.exists()) {
            try {
                lee = new ObjectInputStream(new FileInputStream(fichero));
                Carrera c = (Carrera) lee.readObject();
                while (c != null) {
                    lista.add(c);
                    c = (Carrera) lee.readObject();
                }
                lee.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Fichero no encontrado.");
            } catch (ClassNotFoundException ex) {
                System.out.println("Clase no encontrada");
            } catch (EOFException e) {
            } catch (IOException ex) {
                Exceptions.printStackTrace(ex);
            }
        } else {
            lista = null;
        }
        return lista;
    }
}
