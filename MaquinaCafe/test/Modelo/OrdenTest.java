/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorReportes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeusj
 */
public class OrdenTest {
    
    public OrdenTest() {
    }

    @Test
    public void testDevolverCambio() {
        Orden orden = new Orden(50, 37, "capuccino", 4);
        double resultadoEsperado = 13;
        double resultadoReal = orden.devolverCambio();
        assertEquals(resultadoEsperado, resultadoReal, .1);
    }

    @Test
    public void testToString() {
        Orden orden = new Orden(40, 37, "capuccino", 4);
        String resultadoEsperado = "\nDinero Ingresado: 40.0\nCosto de la Orden:"
                + " 37.0\nTipo de Cafe: capuccino\nCucharadas de Azucar: 4\n"
                + "Fecha: " + orden.getFechaConHora() + "\nDinero de Cambio: 3.0\n";
        String resultadoReal = orden.toString();
        assertEquals(resultadoEsperado, resultadoReal);
    }
    
}
