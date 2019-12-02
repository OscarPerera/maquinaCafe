/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase que se encarga de las capsulas de café, las cuales componen el 
 * producto orden final.
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class Capsula extends Ingrediente{
    /** 
     * Constructor que genera los objetos de tipo cápsula de café,los cuales sirven
     * para generar los objetos de tipo orden.
     * @param cantidadInicial int que determina la cantidad de cápsulas de café con
     * las que cuenta la máquina al comienzo de la ejecución
     */
    public Capsula(int cantidadInicial) {
        super(cantidadInicial);
    }

    public void PrepararCafe(){
        super.setCantidadDisponible(super.getCantidadDisponible() - 1);
    }

    @Override
    public String toString() {
        return super.toString() + "\n";
    } 
}