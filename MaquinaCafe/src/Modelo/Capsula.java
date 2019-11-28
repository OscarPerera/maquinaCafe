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
public abstract class Capsula {
    int cantidadInicial;
    int cantidadDisponible;
    int precioCapsula;

    public Capsula(int cantidadInicial, int cantidadDisponible, int precioCapsula) {
        this.cantidadInicial = cantidadInicial;
        this.cantidadDisponible = cantidadDisponible;
        this.precioCapsula = precioCapsula;
    }

    public int getCantidadInicial() {
        return cantidadInicial;
    }

    public void setCantidadInicial(int cantidadInicial) {
        this.cantidadInicial = cantidadInicial;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getPrecioCapsula() {
        return precioCapsula;
    }

    public void setPrecioCapsula(int precioCapsula) {
        this.precioCapsula = precioCapsula;
    }

    
    

   
    
    public void PrepararCafé(){
        cantidadDisponible=cantidadDisponible-1;
    }
        
}

