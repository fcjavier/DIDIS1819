/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;

import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.util.Date;

/**
 *
 * @author USER
 */
public class RelojPropertyEditorSupport extends PropertyEditorSupport {

    PanelAlarma panelAlarma=new PanelAlarma();
    
    @Override
    public boolean supportsCustomEditor() {
        return  true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {
        return  panelAlarma; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        Date horaAlarma=panelAlarma.getSelectedValues().getHoraAlarma();
        boolean activa=panelAlarma.getSelectedValues().isActivar();
        return "new reloj.Alarma(new java.util.Date("+horaAlarma.getTime()+"l),"+activa+")";
    }

    @Override
    public Object getValue() {
        return  panelAlarma.getSelectedValues(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
