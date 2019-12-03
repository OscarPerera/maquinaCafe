/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;

/**
 * Clase encargada del control de las órdenes.
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class ControladorOrdenes {
    private double ganancias = 0;
    private Cambio cambio;
    private ControladorReportes controladorReportes;
    /**
     * Constructor de la clase ControladorOrdenes
     * @param nuevoCambio Parametro de tipo Cambio el cuál servirá para determinar
     * el cambio final del usuario
     */
    public ControladorOrdenes(Cambio nuevoCambio) {
        this.cambio = nuevoCambio;
        controladorReportes = new ControladorReportes();
    }
    /**
     * Metodo que generará una nueva orden y tras eso, determinará si se realizó 
     * de manera correcta o existio algun error en el  proceso.
     * @param nuevaOrden Orden que se recibe y tras la cual se genera el mensaje 
     * @return Devuelve una cadena que representará el mensaje a mostrar al usuario
     * dependiendo de las condiciones de su orden.
     */
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
                return "Error: Dinero ingresado es insuficiente";
            }   
        }
        else {
            return "Error: Por favor, seleccione un producto";
        }             
    }
    /**
     * Metodo que determina la cantidad de monedas de cada denominación a devolver
     * @param cambioNecesario double que representa el cambio total que se debe de
     * devolver en las diferentes denominaciones
     * @return Objeto con las diferentes denominaciones a devolver
     */
    public Cambio darCambio(double cambioNecesario){
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
    /**
     * Método que resta del total de monedas de cada denominación la cantidad de 
     * monedas a devolver tras cada orden
     * @param cambioDevuelto Objeto de tipo Cambio con la cantidad de monedas de cada
     * denominación que se devolverá al usuario
     */
    public void disminuirCambio(Cambio cambioDevuelto){
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
     /**
      * Metodo que retorna el reporte de las ordenes totales
     * @return String con el Reporte de las ordenes realizadas
      */
    public String obtenerReporteOrdenes(){        
        return controladorReportes.ObtenerReporteOrdenes();
    }
    /**
     * Metodo que retorna el reporte de los ingredientes totales usados
     * @return String con el Reporte de los ingredientes utilizados
     */
    public String obtenerReporteIngredientes(){        
        return controladorReportes.ObtenerReporteIngredientes();
    }
    /**
     * Metodo que retorna el reporte de los cambios totales
     * @return String con el reporte de los diferentes cambios devueltos
     */
    public String obtenerReporteCambio(){
        return "Cambio Inicial: \n" + cambio.cambioInicialToString()
                + "\nCambioDisponible: \n" + cambio.toString();        
    }
}