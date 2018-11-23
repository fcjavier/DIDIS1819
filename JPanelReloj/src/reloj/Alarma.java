/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author USER
 */
public class Alarma implements Serializable{
    private Date horaAlarma;
    private boolean activar;

    public Alarma(Date fecha, boolean activar) {
        this.horaAlarma = fecha;
        this.activar = activar;
    }

    public Date getHoraAlarma() {
        return horaAlarma;
    }

    public void setHoraAlarma(Date horaAlarma) {
        this.horaAlarma = horaAlarma;
    }
    public boolean isActivar() {
        return activar;
    }

    public void setActivar(boolean activar) {
        this.activar = activar;
    }
    
    
    
    
}
