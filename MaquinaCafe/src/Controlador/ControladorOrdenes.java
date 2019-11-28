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
    
    public String nuevaOrden(Orden nuevaOrden){   
        Cambio cambioDeOrden = darCambio(nuevaOrden.devolverCambio());
        if(!nuevaOrden.getTipoCafe().equals("")){
            if(nuevaOrden.devolverCambio()>=0){
                if(cambioDeOrden!=null){
                    return cambioDeOrden.toString();
                }
                else {
                    return "Error: No es posible entregar el cambio exacto";
                }
            }
            else{
                return "Error: Dinero ingresado es insuficiente, como tu calificación";
            }   
        }
        else {
            return "Error: Por favor, seleccione un producto";
        }             
    }
    
    private void registrarOrden(){
        
    }
    
    private Cambio darCambio(double cambioNecesario){
        int cambioNecesarioParcial = (int)cambioNecesario;
        int monedas10Necesarias = (int)cambioNecesario / 10;
        if(cambio.getMonedas10PesosDisponibles() < monedas10Necesarias){
            monedas10Necesarias = cambio.getMonedas10PesosDisponibles();
        }
        cambioNecesarioParcial = cambioNecesarioParcial - (monedas10Necesarias * 10);
        int monedas5Necesarias = (int)cambioNecesarioParcial / 5;  
        if(cambio.getMonedas5PesosDisponibles() < monedas5Necesarias){
            monedas5Necesarias = cambio.getMonedas5PesosDisponibles();
        }
        cambioNecesarioParcial = cambioNecesarioParcial - (monedas5Necesarias * 5);
        int monedas2Necesarias = (int)cambioNecesarioParcial / 2;
        if(cambio.getMonedas2PesosDisponibles() < monedas2Necesarias){
            monedas2Necesarias = cambio.getMonedas2PesosDisponibles();
        }
        cambioNecesarioParcial = cambioNecesarioParcial - (monedas2Necesarias * 2);
        int monedas1Necesarias = (int)cambioNecesarioParcial / 1;
        if(cambio.getMonedasPesoDisponibles() < monedas1Necesarias){
            monedas1Necesarias = cambio.getMonedasPesoDisponibles();
        }
        cambioNecesarioParcial = cambioNecesarioParcial - monedas1Necesarias;
        System.out.println(cambioNecesarioParcial);
        if(cambioNecesarioParcial == 0){
            Cambio cambioParaDevolver = new Cambio(monedas1Necesarias, monedas2Necesarias,
                                            monedas5Necesarias, monedas10Necesarias);
            return cambioParaDevolver;
        }
        else {
            return null;
        }
    }
}