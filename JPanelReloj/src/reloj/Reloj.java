/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
 
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Reloj extends JLabel implements Serializable{
    private boolean formato24h;
    private Alarma alarma;

    private SimpleDateFormat sdf24h=new SimpleDateFormat("HH:mm:ss");
    private SimpleDateFormat sdf12h=new SimpleDateFormat("hh:mm:ss a");
    
    private AlarmaListener alarmaListener;
    
    public Reloj() {
     Timer timer=new Timer();
         timer.schedule(new TimerTask() {
             @Override
             public void run() {
                  Date horaActual=new Date();
                  if(formato24h){
                      setText(sdf24h.format(horaActual));
                  }else{
                      setText(sdf12h.format(horaActual));
                  }
                  if(alarma!=null){
                      if(alarma.isActivar() && horasCoinciden(horaActual,alarma.getHoraAlarma())){
                          if(alarmaListener!=null){
                              alarmaListener.suenaAlarma();
                          }
                      }
                  }
             }
         }, 0, 1000);
    }

    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }

    public boolean isFormato24h() {
        return formato24h;
    }

    public void setFormato24h(boolean formato24h) {
        this.formato24h = formato24h;
    }
    
     public void setAlarmaListener(AlarmaListener alarmaListener) {
        this.alarmaListener = alarmaListener;
    }
    public void addAlarmaListener(AlarmaListener alarmaListener){
        this.alarmaListener=alarmaListener;
    }
    private boolean horasCoinciden(Date horaActual,Date horaAlarma){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(horaActual);
        int horasActual,minActual,segActual,horasAlarma,minAlarma,segAlarma;
        horasActual=calendar.get(Calendar.HOUR_OF_DAY);
        minActual=calendar.get(Calendar.MINUTE);
        segActual=calendar.get(Calendar.SECOND);
        calendar.setTime(horaAlarma);
        horasAlarma=calendar.get(Calendar.HOUR_OF_DAY);
        minAlarma=calendar.get(Calendar.MINUTE);
        segAlarma=calendar.get(Calendar.SECOND);
        if(horasActual==horasAlarma && minActual==minAlarma && segActual==segAlarma){
            return true;
        }else{
            return false;
        }
    }
    
    
}
