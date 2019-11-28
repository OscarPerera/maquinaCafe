/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Oscar Perera
 */
public class Cafe{

    private Capsula descafeinado;
    private Capsula negro;
    private Capsula capuccino;
    
    public Cafe() {       
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
    
    
}
