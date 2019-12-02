/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *Clase de tipo ingrediente encargada del manejo de la Azucar en el sistema.
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class Azucar extends Ingrediente{
   /** 
     * Constructor que genera los objetos de tipo azucar, los cuales sirven
     * para generar los objetos de tipo orden.
     * @param cantidadInicial int que determina la cantidad de azucar para café 
     * con las que cuenta la máquina al comienzo de la ejecución
     */
    public Azucar(int cantidadInicial) {
        super(cantidadInicial);
    }
    /**
     * Metodo que se encarga de añadir la cantidad deseada de azucar 
     * @param cantidadDeCucharadas Int que representa la cantidad de cucharadas
     * que se desean agregar a la orden.
     */
    public void agregarCucharadas(int cantidadDeCucharadas){
        super.setCantidadDisponible(super.getCantidadDisponible() 
                - cantidadDeCucharadas);
    }

    @Override
    public String toString() {
        return "Azucar: \n " + super.toString(); 
    //To change body of generated methods, choose Tools | Templates.
    }
}