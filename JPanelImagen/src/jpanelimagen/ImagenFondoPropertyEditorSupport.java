/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author USER
 */
public class ImagenFondoPropertyEditorSupport extends PropertyEditorSupport{

    ImagenFondoPanel imagenFondoPanel=new ImagenFondoPanel();
    CambiarSeparadores cambiarSeparadores=new CambiarSeparadores();
    @Override
    public boolean supportsCustomEditor() {
        return  true; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Component getCustomEditor() {       
        return imagenFondoPanel; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getJavaInitializationString() {
        ImagenFondo imagenFondo=imagenFondoPanel.getSelectedValue();
        String ruta=cambiarSeparadores.cambiarSeparador(imagenFondo.getRutaImagen().getAbsolutePath());
        return  "new jpanelimagen.ImagenFondo("+"new java.io.File(\""+
           ruta+"\"),"+imagenFondo.getOpacidad()+"f)"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValue() {
        return imagenFondoPanel.getSelectedValue() ; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
