/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *Clase encargada del manejo del café y sus tres tipos:
 * Negro,Descafeinado y Capuccino
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class Cafe{

    private Capsula descafeinado;
    private Capsula negro;
    private Capsula capuccino;
    /**
     * Constructor que genera un objeto de tipo café, el cual esta compuesto
     * por los 3 posibles tipos de café disponibles, estos en forma de cápsulas.
     * @param descafeinado Variable de tipo cápsula que representa una capsula
     * de tipo descafeinado
     * @param negro Variable de tipo cápsula que representa una capsula
     * de tipo negro
     * @param capuccino Variable de tipo cápsula que representa una capsula
     * de tipo capuccino
     */
    public Cafe(Capsula descafeinado, Capsula negro, Capsula capuccino) {
        this.descafeinado = descafeinado;
        this.negro = negro;
        this.capuccino = capuccino;
    }

    public Capsula getDescafeinado() {
        return descafeinado;
    }

    public void setDescafeinado(Capsula descafeinado) {
        this.descafeinado = descafeinado;
    }

    public Capsula getNegro() {
        return negro;
    }

    public void setNegro(Capsula negro) {
        this.negro = negro;
    }

    public Capsula getCapuccino() {
        return capuccino;
    }

    public void setCapuccino(Capsula capuccino) {
        this.capuccino = capuccino;
    }

    @Override
    public String toString() {      
        return "Café Descafeinado :\n" + descafeinado.toString()+ "Café Negro: \n" + 
                negro.toString() + "Café Capuccino: \n" + capuccino.toString();
    }
             
}