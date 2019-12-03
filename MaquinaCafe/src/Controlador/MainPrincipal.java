/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cambio;
import Vista.Index;

/**
 * Clase encargada de la ejecucion del programa y los valores iniciales de algunas clases
 * @author Equipo Guadalupe,Jorge,Oscar,Riad, Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class MainPrincipal {
    
    public static ControladorOrdenes controlador;
    /**
     * Metodo main para la ejecucion del programa
     * @param args
     */
    public static void main(String[] args) {
        Cambio cambio = new Cambio(10, 10, 10, 10);
        controlador = new ControladorOrdenes(cambio);
        Index index = new Index();
        index.setVisible(true);
    }
}