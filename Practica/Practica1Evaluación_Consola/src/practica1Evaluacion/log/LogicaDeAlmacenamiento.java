/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion.log;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import practica1Evaluacion.modelo.Corredor;

/**
 *
 * @author USER
 */
public class LogicaDeAlmacenamiento {
    
    List<Corredor> corredoresList = new ArrayList<>();
    
    public void guardarDatosEnCSV(List<Corredor> lista,String f){
        
        File fichero = new File(f);
        FileWriter fw=null;
        try {
            BufferedWriter escribe=new BufferedWriter(new FileWriter(fichero));
             for(Corredor c: lista){
                  escribe.write(c.getNombre()+","+c.getDni()+","+c.getFechaNacimiento()+","+
                         c.getDireccion()+","+c.getTelefono()+","+c.getDorsal()+"\r\n");           
             }
             escribe.close();
             
             System.out.println("El fichero ha sido escrito");
            
        } catch (IOException ex) {
            Logger.getLogger(LogicaDeAlmacenamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Corredor> leerFicheroCSV(String f){
        Corredor corredor = new Corredor();
        File fichero = new File(f);
        if(fichero.exists()){
            try {
                BufferedReader lee = new BufferedReader(new FileReader(fichero));
                String cadena=lee.readLine();
                while(cadena!=null){
                corredor=tokenizar(cadena);
                corredoresList.add(corredor);
                cadena=lee.readLine();
                }
                lee.close();
            } catch (FileNotFoundException ex) {
                 System.out.println("Fichero no encontrado");
            } catch (IOException ex) {
                Logger.getLogger(LogicaDeAlmacenamiento.class.getName()).log(Level.SEVERE, null, ex);
            }                    
        }else{
            corredoresList=null;
        }
        return corredoresList;
    }
    
    public Corredor tokenizar(String linea){
        Corredor c=null;
        StringTokenizer token=new StringTokenizer(linea,",");
        while(token.hasMoreTokens()){
            String nombre=token.nextToken();
            String dni=token.nextToken();
            String fecha=token.nextToken();
            String direccion=token.nextToken();
            String telefono=token.nextToken();
            String dorsal=token.nextToken();
            c=new Corredor(nombre, dni, fecha, direccion, telefono);
            c.setDorsal(dorsal);
        }
        return c;
    }
    
    
    
    
}
