/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeusj
 */
public class ControladorOrdenesTest {
    
    public ControladorOrdenesTest() {
    }

    @Test
    public void testGenerarNuevaOrden() {
        Cambio cambio = new Cambio(0, 0, 0, 0);
        Orden orden = new Orden(40, 37, "capuccino", 4);
        ControladorOrdenes controlador = new ControladorOrdenes(cambio);
        String resultadoEsperado = "Error: No es posible entregar el cambio exacto";
        String resultadoReal = controlador.generarNuevaOrden(orden);
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
    @Test
    public void testDarCambio() {
        Cambio cambio = new Cambio(0, 0, 0, 0);
        ControladorOrdenes controlador = new ControladorOrdenes(cambio);
        Cambio resultadoEsperado = null;
        Cambio resultadoReal = controlador.darCambio(20);
        assertEquals(resultadoEsperado, resultadoReal);
    }


    @Test
    public void testObtenerReporteCambio() {
        Cambio cambio = new Cambio(0, 0, 0, 0);
        ControladorOrdenes controlador = new ControladorOrdenes(cambio);
        String resultadoEsperado = "Cambio Inicial: \n\nCambioDisponible: \n";
        String resultadoReal = controlador.obtenerReporteCambio();
        assertEquals(resultadoEsperado, resultadoReal);
    }   
}
