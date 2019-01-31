/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocodsobrecarga;

/**
 *
 * @author Samuel
 */
import javax.swing.JOptionPane;
public interface MetodosComunes {
    /**
     * Muestra un mensaje
     * @param msg cadena de texto que queremos mostrar 
     */
    public void mostrar(String msg);
    class WinDialogo extends Dialogo implements MetodosComunes{

    @Override
    public void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);              
    }
    
}
}