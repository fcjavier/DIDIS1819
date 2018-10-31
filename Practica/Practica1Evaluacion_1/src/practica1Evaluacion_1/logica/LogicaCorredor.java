/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion_1.logica;

import practica1Evaluacion_1.modelo.Corredor;

/**
 *
 * @author USER
 */
public class LogicaCorredor {
    
 Corredor c =new Corredor();
 
 /**
  * Método que agrega un nuevo corredor en el arrayList listaCorredores.
  * @param corredor 
  */
 public void agregarCorredor(Corredor corredor){
     c.getListaCorredores().add(corredor);
 }
 
}
