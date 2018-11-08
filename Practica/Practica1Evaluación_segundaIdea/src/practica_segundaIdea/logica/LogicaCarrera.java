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
    
    private static List<Carrera>listaCarreras=new ArrayList<Carrera>();
    
    public boolean agregarCarrera(Carrera carrera){
       return listaCarreras.add(carrera);
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public void cargarListaCarreras(List<Carrera> carreras){
        listaCarreras=carreras;
    }
    
    public Carrera buscarCarrera(String nomCarrera){
        Carrera carrera=null;
        for(Carrera c: listaCarreras){
            if(c.getNomCarrera().equalsIgnoreCase(nomCarrera)){
                carrera=c;
            }
        }
        return carrera;
    }
    public boolean anularCarrera(Carrera c){
        return listaCarreras.remove(c);
    }
}
