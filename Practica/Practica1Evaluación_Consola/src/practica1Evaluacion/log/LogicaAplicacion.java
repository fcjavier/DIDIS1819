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
    int totalDorsales=0;
    
    public int  menu(){
        System.out.println("\n-------------MENU---------------");
        System.out.println("1. Alta corredor.");
        System.out.println("2. Baja corredor.");
        System.out.println("3. Modificar datos corredor.");
        System.out.println("3. Ver corredor");
        System.out.println("4. Salvar datos Corredores.");
        System.out.println("5. Cargar datos Corredores.");
        System.out.println("6. Ordenar corredores.");
        System.out.println("7. Mostrar lista corredores");
        System.out.println("8. Salir");
        System.out.print("   Opcion: ");
        int opcion=sc.nextInt();
        return opcion;
    }
      
     
    
    public Corredor datosParaCorredor(){
        System.out.println("Introduzca datos del corredor:");
        sc.nextLine();
        System.out.print("Nombre: ");
        String nombre=sc.nextLine();
        if(nombre==""){nombre=" ";}
        System.out.print("DNI: ");
        String dni=sc.nextLine();
        if(dni==""){dni=" ";}
        System.out.print("Fecha nacimiento (dd/mm/yyyy): ");
        String fecha=sc.nextLine();
        if(fecha==""){fecha=" ";}
        System.out.print("Dirección: ");
        String direccion=sc.nextLine();
        if(direccion==""){direccion=" ";}
        System.out.print("Teléfono: ");
        String telefono=sc.nextLine();
        if(telefono==""){telefono=" ";}
        sc.nextLine();
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
    
    public boolean altaCorredor(Corredor c,List<Corredor> lista){
        boolean confirmar=false;
        if(lista.contains(c)){
            System.out.println("El corredor ya existe.");
        }else{
             lista.add(c);
             if(lista.contains(c)){
                 System.out.println("El corredor ha sido añadido.");
                 confirmar=true;
             }else{
                 System.out.println("No se ha podido añadir el corredor.");
             }
        }
        return confirmar;
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
     public String asignarDorsal(){
        totalDorsales++;
        String dorsal;
        if(totalDorsales<10){
            dorsal="00"+totalDorsales;
        }else if(totalDorsales>=10 && totalDorsales<100){
            dorsal="0"+totalDorsales;
        }else{
            dorsal=""+totalDorsales;
        }
        return dorsal;
     }
     
     public Corredor buscarCorredor(List<Corredor> lista){
         Corredor corredor=null;
         sc.nextLine();
         System.out.println("Introduzca uno de los datos para la busqueda\n (nombre/dni/dorsal): ");
         String dato=sc.nextLine();
         for(Corredor c: lista){
             if(dato.equalsIgnoreCase(c.getNombre()) || dato.equalsIgnoreCase(c.getDni())
                     || dato.equalsIgnoreCase(c.getDorsal())){
                  corredor=c;
             }
         }
         return corredor;
     }
     
     public Corredor modificarDatosCorredor(Corredor c){      
         System.out.println(c.toString());
         System.out.println("Modifique los datos: ");
         corredor=datosParaCorredor();
         corredor.setDorsal(c.getDorsal());
         return corredor;
     }
     
}
