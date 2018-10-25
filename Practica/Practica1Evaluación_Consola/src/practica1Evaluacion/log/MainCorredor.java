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
        final String FICHERO="corredores.csv";
         int opcion;
         int contador=0;
         boolean ingresado=false;
         Corredor corredor=new Corredor();
         List<Corredor>listaCorredores=new ArrayList<Corredor>();        
         LogicaAplicacion la=new LogicaAplicacion();
         LogicaDeAlmacenamiento lda=new LogicaDeAlmacenamiento();
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
                      la.bajaCorredor(la.buscarCorredor(listaCorredores), listaCorredores);
                    break;
                  case 3:
                      Corredor c=new Corredor();
                      c=la.buscarCorredor(listaCorredores);
                      int pos=listaCorredores.indexOf(c);
                      corredor=la.modificarDatosCorredor(c);
                      listaCorredores.set(pos, corredor);                
                      break;
                  case 4:
                      lda.guardarDatosEnCSV(listaCorredores, FICHERO);
                      break;
                  case 5:
                      listaCorredores=lda.leerFicheroCSV(FICHERO);
                      if(listaCorredores!=null){
                          System.out.println("El fichero se ha cargado");
                      }else{
                          System.out.println("El fichero está vacío");
                      }
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
