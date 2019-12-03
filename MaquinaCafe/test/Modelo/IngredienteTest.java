/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author zeusj
 */
public class IngredienteTest {
    
    public IngredienteTest() {
    }

    @Test
    public void testToString() {
        Ingrediente ingrediente = new Ingrediente(10);
        ingrediente.setCantidadDisponible(3);
        String resultadoEsperado = "Cantidad Inicial: 10\nCantidad Disponible: 3\n";
        String resultadoReal = ingrediente.toString();
        assertEquals(resultadoEsperado, resultadoReal);
    }   
}
