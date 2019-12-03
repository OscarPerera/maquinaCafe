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
public class ControladorReportesTest {
    
    public ControladorReportesTest() {
    }

    @Test
    public void testAgregarOrden() {
        Orden orden = new Orden(40, 37, "capuccino", 4);
        ControladorReportes controlador = new ControladorReportes();
        controlador.setAzucar(new Azucar(3));
        boolean resultadoEsperado = false;
        boolean resultadoReal = controlador.AgregarOrden(orden);
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testObtenerReporteOrdenes() {
        Orden orden = new Orden(40, 37, "capuccino", 4);
        ControladorReportes controlador = new ControladorReportes();
        controlador.AgregarOrden(orden);
        String resultadoEsperado = "Orden 1\nDinero Ingresado: 40.0\nCosto de la Orden:"
                + " 37.0\nTipo de Cafe: capuccino\nCucharadas de Azucar: 4\n"
                + "Fecha: " + orden.getFechaConHora() + "\nDinero de Cambio: 3.0\n\n";
        String resultadoReal = controlador.ObtenerReporteOrdenes();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testObtenerReporteIngredientes() {
        Cafe cafe = new Cafe(new Capsula(5), new Capsula(6), new Capsula(7));
        ControladorReportes controlador = new ControladorReportes();
        controlador.setCafe(cafe);
        String resultadoEsperado = "Café Descafeinado:\nCantidad Inicial: 5\n" +
                            "Cantidad Disponible: 5\n\nCafé Negro: \nCantidad Inicial: " +
                            "6\nCantidad Disponible: 6\n\nCafé Capuccino: \n" +
                            "Cantidad Inicial: 7\nCantidad Disponible: 7\n\n" +
                            "Azucar: \nCantidad Inicial: 20\nCantidad Disponible: 20\n";
        String resultadoReal = controlador.ObtenerReporteIngredientes();
        assertEquals(resultadoEsperado, resultadoReal);
    } 
}
