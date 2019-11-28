/*/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;

/**
 *
 * @author zeusj
 */
public class ControladorOrdenes {
    private final Cambio cambioInicial;
    private Cambio cambio;
    
    public ControladorOrdenes(Cambio cambio) {
        this.cambioInicial = cambio;
        this.cambio = cambio;
    }
    
    //public String nuevaOrden(Orden nuevaOrden){    
    //}
    
    private void registrarOrden(){
        
    }
    
    private boolean darCambio(){
        Cambio cambioActual = cambio;
        return true;
    }
}