/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase padre de todos los ingredientes del sistema, de este extienden
 * Azucar y cápsula
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class Ingrediente {
    private final int cantidadInicial;
    private int cantidadDisponible;
    /**
     * Constructor encargado de la creacion de los objetos de tipo ingrediente
     * @param cantidadInicial int que determina la cantidad inicial con la que
     * se crean los diferentes tipos de ingredientes (capsula,azucar).
     */
    public Ingrediente(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
        this.cantidadDisponible = cantidadInicial;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    } 

    @Override
    public String toString() {
        return  "Cantidad Inicial: " + cantidadInicial + "\nCantidad Disponible: " 
                + cantidadDisponible  + "\n";
    }
}