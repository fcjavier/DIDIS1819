/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1Evaluacion.log;

 
import java.util.List;
import java.util.Scanner;
import practica1Evaluacion.modelo.Corredor;

/**
 *
 * @author USER
 */
public class LogicaAplicacion {
    Scanner sc=new Scanner(System.in);
    Corredor corredor;
    
    public int  menu(){
        int opcion=0;
        System.out.println("-------------MENU---------------");
        System.out.println("1. Alta corredor.");
        System.out.println("2. Baja corredor.");
        System.out.println("3. Modificar datos corredor.");
        System.out.println("3. Ver corredor");
        System.out.println("4. Salvar datos Corredores.");
        System.out.println("5. Cargar datos Corredores.");
        System.out.println("6. Ordenar corredores.");
        System.out.println("7. Mostrar lista corredores");
        opcion=sc.nextInt();
        return opcion;
    }
    
    public boolean validarOpcion(int op){
        boolean aceptar=false;
        if(op>=1 && op<=7){
            aceptar=true;
        }
        return aceptar;
    }
    
    public Corredor datosParaCorredor(){
        System.out.println("Introduzca datos del corredor:");
        System.out.print("Nombre: ");
        String nombre=sc.nextLine();
        System.out.print("DNI: ");
        String dni=sc.nextLine();
        System.out.print("Fecha nacimiento (dd/mm/yyyy): ");
        String fecha=sc.nextLine();
        System.out.print("Dirección: ");
        String direccion=sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono=sc.nextLine();
        Corredor c=new Corredor(nombre, dni, fecha, direccion, telefono);
        return c;
    }
    
    public void bajaCorredor(Corredor c,List<Corredor> lista){         
         if(lista.remove(c)){
             System.out.println("El corredor ha sido eliminado.");
         }else{
             System.out.println("No se ha podido eleminar el corredor");
         }
    }
    
    public void comprobarCorredor(Corredor c,List<Corredor> lista){
        if(lista.contains(c)){
            System.out.println(c.toString());
        }else{
            System.out.println("El corredor "+c.getNombre()+" no existe.");
        }
    }
    
    public void altaCorredor(Corredor c,List<Corredor> lista){
        if(lista.contains(c)){
            System.out.println("El corredor ya existe.");
        }else{
             lista.add(c);
             if(lista.contains(c)){
                 System.out.println("El corredor ha sido añadido.");
             }else{
                 System.out.println("No se ha podido añadir el corredor.");
             }
        }
    }
    
     public void listarCorredores(List<Corredor> lista){
         for(Corredor c: lista){
             System.out.println(c.toString());
         }
     }
     
     public void modificarDatosCorredor(List<Corredor> lista){
         Corredor corredor=null;
         int pos =0;
         System.out.print("Introduzca dni del corredor: ");
         String dni=sc.nextLine();
         for(Corredor c: lista){
             if(dni.equalsIgnoreCase(c.getDni())){
                 corredor=c;
                 pos=lista.indexOf(c);                
             }
         }
         if(corredor==null){
             System.out.println("El corredor no existe.");
         }else{
             System.out.println("Datos actuales:");
             System.out.println(corredor.toString());
             System.out.println("Nuevos datos: ");
             corredor=datosParaCorredor();
             lista.set(pos, corredor);
         }   
     }
     
    
     
}
