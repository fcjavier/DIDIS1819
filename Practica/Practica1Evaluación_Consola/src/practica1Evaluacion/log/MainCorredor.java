/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion.log;

import java.util.ArrayList;
import java.util.List;
import practica1Evaluacion.modelo.Corredor;

/**
 *
 * @author USER
 */
public class MainCorredor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion;
        int contador=0;
        boolean ingresado=false;
         Corredor corredor=new Corredor();
         List<Corredor>listaCorredores=new ArrayList<Corredor>();        
         LogicaAplicacion la=new LogicaAplicacion();
         
          do{
             opcion = la.menu();
              switch(opcion){
                  case 1: 
                    corredor=la.datosParaCorredor();
                   ingresado= la.altaCorredor(corredor, listaCorredores);
                   if(ingresado==true){
                      corredor.setDorsal(la.asignarDorsal());
                   }
                    break;
                  case 2:                      
                    break;
                  case 3:
                      break;
                  case 4:
                      break;
                  case 5:
                      break;
                  case 6:
                      break;
                  case 7:
                      la.listarCorredores(listaCorredores);
                      break;
                  case 8:
                      System.out.println("Hasta pronto!!!\n");
                      break;
                  default :
                      System.out.println("\nError repita la selección (1-8).\n");
                      break;
              }             
          }while(opcion!=8);    
    }
    
}
