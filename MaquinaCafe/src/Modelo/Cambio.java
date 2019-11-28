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
public class Cambio {
    
    final int  MonedasPesoIniciales;
    final int  Monedas2PesosIniciales;
    final int  Monedas5PesosIniciales;
    final int  Monedas10PesosIniciales;
    int MonedasPesoDisponible;
    int Monedas2PesosDisponible;
    int Monedas5PesosDisponible;
    int Monedas10PesosDisponible;
        
    
    public Cambio(int MonedasPesoIniciales, int Monedas2PesosIniciales, int Monedas5PesosIniciales, int Monedas10PesosIniciales) {
        this.MonedasPesoIniciales = MonedasPesoIniciales;
        this.Monedas2PesosIniciales = Monedas2PesosIniciales;
        this.Monedas5PesosIniciales = Monedas5PesosIniciales;
        this.Monedas10PesosIniciales = Monedas10PesosIniciales;
        
         this.MonedasPesoDisponible = MonedasPesoIniciales ;
         this.MonedasPesoDisponible =  Monedas2PesosIniciales;
         this.MonedasPesoDisponible =  Monedas5PesosIniciales ;
         this.MonedasPesoDisponible =   Monedas10PesosIniciales;
        
    }

    public int getMonedasPesoDisponible() {
        return MonedasPesoDisponible;
    }

    public void setMonedasPesoDisponible(int MonedasPesoDisponible) {
        this.MonedasPesoDisponible = MonedasPesoDisponible;
    }

    public int getMonedas2PesosDisponible() {
        return Monedas2PesosDisponible;
    }

    public void setMonedas2PesosDisponible(int Monedas2PesosDisponible) {
        this.Monedas2PesosDisponible = Monedas2PesosDisponible;
    }

    public int getMonedas5PesosDisponible() {
        return Monedas5PesosDisponible;
    }

    public void setMonedas5PesosDisponible(int Monedas5PesosDisponible) {
        this.Monedas5PesosDisponible = Monedas5PesosDisponible;
    }

    public int getMonedas10PesosDisponible() {
        return Monedas10PesosDisponible;
    }

    public void setMonedas10PesosDisponible(int Monedas10PesosDisponible) {
        this.Monedas10PesosDisponible = Monedas10PesosDisponible;
    }

    
    //Posiblemente varios inline method.
    public void disminuirMonedasPeso(){
        MonedasPesoDisponible = MonedasPesoDisponible-1;
    }
     public void disminuirMonedas2Pesos(){
        Monedas2PesosDisponible = Monedas2PesosDisponible-1;
    }
     public void disminuirMonedas5Pesos(){
        Monedas5PesosDisponible = Monedas5PesosDisponible-1;
    }
     public void disminuirMonedas10Pesos(){
       Monedas10PesosDisponible = Monedas10PesosDisponible-1;
    }
    
    
        
}
