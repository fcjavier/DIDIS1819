/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion_1.logica;

import java.util.ArrayList;
import java.util.List;
import practica1Evaluacion_1.modelo.Corredor;

/**
 *
 * @author USER
 */
public class LogicaCorredor {
   public static List<Corredor>listaCorredores=new ArrayList<>();

    public static List<Corredor> getListaCorredores() {
        return listaCorredores;
    }
    public void agregarCorredor(Corredor c){
        listaCorredores.add(c);
    }
    public Corredor buscarCorredor(String dato){
        Corredor corredor=new Corredor();
        for(Corredor c: listaCorredores){
            if(c.getDni().equalsIgnoreCase(dato)){
                corredor=c;
            }
        }
        return corredor;
    }
    public boolean bajaCorredor(Corredor c){
         return listaCorredores.remove(c);
    }
    
}