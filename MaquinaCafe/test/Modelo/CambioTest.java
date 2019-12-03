/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.ControladorOrdenes;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeusj
 */
public class CambioTest {
    
    public CambioTest() {
    }

    @Test
    public void testToString() {
        Cambio cambio = new Cambio(0, 10, 0, 1);
        String resultadoEsperado = "Monedas de 2 Pesos: 10\nMonedas de 10 Pesos: 1\n";
        String resultadoReal = cambio.cambioInicialToString();
        assertEquals(resultadoEsperado, resultadoReal);
    }

    @Test
    public void testCambioInicialToString() {
        Cambio cambio = new Cambio(5, 0, 3, 0);
        String resultadoEsperado = "Monedas de 1 Peso: 5\nMonedas de 5 Pesos: 3\n";
        String resultadoReal = cambio.cambioInicialToString();
        assertEquals(resultadoEsperado, resultadoReal);
    }   
}
