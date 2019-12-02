/*
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
    private double ganancias = 0;
    private Cambio cambio;
    private ControladorReportes controladorReportes;
    
    public ControladorOrdenes(Cambio nuevoCambio) {
        this.cambio = nuevoCambio;
        controladorReportes = new ControladorReportes();
    }
    
    public String generarNuevaOrden(Orden nuevaOrden){
        Orden ordenEntrante=nuevaOrden;
        Cambio cambioDeOrden = darCambio(ordenEntrante.devolverCambio());
        if(!ordenEntrante.getTipoCafe().equals("")){
            if(ordenEntrante.devolverCambio()>=0){
                if(cambioDeOrden!=null){
                    boolean ingredientesSuficientes = 
                        controladorReportes.AgregarOrden(ordenEntrante);
                    if(ingredientesSuficientes){
                        ganancias = ganancias + ordenEntrante.getCostoOrden();
                        return "Disfrute su café! Su cambio es:\n" 
                                + cambioDeOrden.toString();
                    }
                    else {
                        return "Error: Ingredientes insuficientes para esta orden";
                    }
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
    
    private Cambio darCambio(double cambioNecesario){
        int cambioNecesarioParcial = (int)cambioNecesario;
        int monedas10Necesarias = (int)cambioNecesario / 10;
        int monedas5Necesarias;
        int monedas2Necesarias;
        int monedas1Necesarias;
        if(cambio.getMonedas10Pesos() < monedas10Necesarias){
            monedas10Necesarias = cambio.getMonedas10Pesos();
        }
        cambioNecesarioParcial = cambioNecesarioParcial 
                                - (monedas10Necesarias * 10);
        monedas5Necesarias = (int)cambioNecesarioParcial / 5;  
        if(cambio.getMonedas5Pesos() < monedas5Necesarias){
            monedas5Necesarias = cambio.getMonedas5Pesos();
        }
        cambioNecesarioParcial = cambioNecesarioParcial
                                - (monedas5Necesarias * 5);
        monedas2Necesarias = (int)cambioNecesarioParcial / 2;
        if(cambio.getMonedas2Pesos() < monedas2Necesarias){
            monedas2Necesarias = cambio.getMonedas2Pesos();
        }
        cambioNecesarioParcial = cambioNecesarioParcial 
                                - (monedas2Necesarias * 2);
        monedas1Necesarias = (int)cambioNecesarioParcial / 1;
        if(cambio.getMonedasPeso() < monedas1Necesarias){
            monedas1Necesarias = cambio.getMonedasPeso();
        }
        cambioNecesarioParcial = cambioNecesarioParcial - monedas1Necesarias;
        
        if(cambioNecesarioParcial == 0){
            Cambio cambioParaDevolver = new Cambio(monedas1Necesarias, 
                                        monedas2Necesarias,monedas5Necesarias,
                                        monedas10Necesarias);
            disminuirCambio(cambioParaDevolver);
            return cambioParaDevolver;
        }
        else {
            return null;
        }
    }   
    
    private void disminuirCambio(Cambio cambioDevuelto){
        Cambio cambioFinal=cambioDevuelto;
        cambio.setMonedas10Pesos(cambio.getMonedas10Pesos() - 
                cambioFinal.getMonedas10Pesos());
        cambio.setMonedas5Pesos(cambio.getMonedas5Pesos() - 
                cambioFinal.getMonedas5Pesos());
        cambio.setMonedas2Pesos(cambio.getMonedas2Pesos() - 
                cambioFinal.getMonedas2Pesos());
        cambio.setMonedasPeso(cambio.getMonedasPeso() - 
                cambioFinal.getMonedasPeso());
    }
     
    public String obtenerReporteOrdenes(){        
        return controladorReportes.ObtenerReporteOrdenes();
    }
    
    public String obtenerReporteIngredientes(){        
        return controladorReportes.ObtenerReporteIngredientes();
    }
    
    public String obtenerReporteCambio(){
        return "Cambio Inicial: \n" + cambio.setCambioInicialToString()
                + "\nCambioDisponible: \n" + cambio.toString();        
    }
}