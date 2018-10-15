/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ingresosGastos.log;

import ingresosGastos.dto.Movimiento;

/**
 *
 * @author Javier 
 */
public class Logica {
    Movimiento m=new Movimiento();
     
    public double restar(double balance,double cantidad){
        return balance-cantidad;
    }
    public double sumar(double balance,double cantidad){
        return balance+cantidad;
    }
     
    
}
