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
        this.MonedasPeso =  Monedas2Pesos;
        this.MonedasPeso =  Monedas5Pesos ;
        this.MonedasPeso =   Monedas10Pesos;    
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
    
    //Posiblemente varios inline method.
    public int disminuirMonedasPeso(){
        MonedasPeso = MonedasPeso - 1;
        return MonedasPeso;
    }
     public int disminuirMonedas2Pesos(){
        Monedas2Pesos = Monedas2Pesos - 1;
        return Monedas2Pesos;
    }
     public int disminuirMonedas5Pesos(){
        Monedas5Pesos = Monedas5Pesos - 1;
        return Monedas5Pesos;
    }
     public int disminuirMonedas10Pesos(){
       Monedas10Pesos = Monedas10Pesos - 1;
       return Monedas10Pesos;
    }
     
     
     
     public void ReportarCambio(){
         
         System.out.println("Datos Iniciales:");
         System.out.println("Cantidad de monedas de peso:");
         System.out.println("Cantidad de monedas de 2 pesos:");
         System.out.println("Cantidad de monedas de 5 pesos:");
         System.out.println("Cantidad de monedas de 10 pesos:");
     }
    
}
