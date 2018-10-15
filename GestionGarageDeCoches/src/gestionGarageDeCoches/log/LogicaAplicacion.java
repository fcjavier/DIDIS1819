/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package garage.log;

 
/**
 *
 * @author Javier
 */
public class LogicaAplicacion {
    
    public boolean controlVehiculo(String tipo){
         boolean control=false;
        if(tipo.equalsIgnoreCase("Camión")){
            control=true;
        }
        return control;
    }
    
    public boolean comprobarDNI(String dni){
        boolean control=true;
        if(dni.length()!=9){control=false;}
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
        return control;
    }
    
    public boolean comprobarTelefono(String tlf){
        boolean control=true;
        if(tlf.length()!=9){control=false;}
        for(int i=0;i<tlf.length();i++){
            if(tlf.codePointAt(i)<48 || tlf.codePointAt(i)>57){
                control=false;
            }
        }
        return control;
    }
}
