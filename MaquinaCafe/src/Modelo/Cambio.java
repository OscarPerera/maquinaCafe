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
    
    int MonedasPeso;
    int Monedas2Pesos;
    int Monedas5Pesos;
    int Monedas10Pesos;
          
    public Cambio(int MonedasPeso, int Monedas2Pesos, int Monedas5Pesos, int Monedas10Pesos) {      
        this.MonedasPeso = MonedasPeso ;
        this.Monedas2Pesos =  Monedas2Pesos;
        this.Monedas5Pesos =  Monedas5Pesos ;
        this.Monedas10Pesos =   Monedas10Pesos;    
    }

    public int getMonedasPesoDisponibles() {
        return MonedasPeso;
    }
    
    public int getMonedas2PesosDisponibles() {
        return Monedas2Pesos;
    }

    public int getMonedas5PesosDisponibles() {
        return Monedas5Pesos;
    }

    public int getMonedas10PesosDisponibles() {
        return Monedas10Pesos;
    }

    public void setMonedasPeso(int MonedasPeso) {
        this.MonedasPeso = MonedasPeso;
    }

    public void setMonedas2Pesos(int Monedas2Pesos) {
        this.Monedas2Pesos = Monedas2Pesos;
    }

    public void setMonedas5Pesos(int Monedas5Pesos) {
        this.Monedas5Pesos = Monedas5Pesos;
    }

    public void setMonedas10Pesos(int Monedas10Pesos) {
        this.Monedas10Pesos = Monedas10Pesos;
    }

    @Override
    public String toString() {
        return "1 Peso: " + MonedasPeso + "\n2 Pesos: " + Monedas2Pesos + "\n5 Pesos: " + Monedas5Pesos + "\n10 Pesos: " + Monedas10Pesos;
    }

}
