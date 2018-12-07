/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpanelimagen;

import java.io.File;

/**
 *
 * @author USER
 */
public class CambiarSeparadores {

    private String ruta;

    public String cambiarSeparador(String fichero) {

        String separador = "\\";
        try {
            if (File.separator.equals(separador)) {
                separador = "/";
            }
            return ruta.replaceAll(separador, File.separator);
        } catch (Exception e) {
            return ruta.replaceAll(separador + separador, File.separator);
        }
    }

}
