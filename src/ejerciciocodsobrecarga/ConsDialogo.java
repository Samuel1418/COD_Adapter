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
class ConsDialogo extends Dialogo implements MetodosComunes{

    @Override
    public void mostrar(String msg) {
        System.out.println("Consola:"+msg);
    }
    
}