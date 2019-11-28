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
    
    int cantidadMonedasPeso;
    int cantidadMonedas2Pesos;
    int cantidadMonedas5Pesos;
    int cantidadMonedas10Pesos;

    public Cambio(int cntdMonedasPeso, int cntdMonedas2Pesos, int cntdMonedas5Pesos, int cntdMonedas10Pesos) {
        this.cantidadMonedasPeso = cntdMonedasPeso;
        this.cantidadMonedas2Pesos = cntdMonedas2Pesos;
        this.cantidadMonedas5Pesos = cntdMonedas5Pesos;
        this.cantidadMonedas10Pesos = cntdMonedas10Pesos;
    }

    public int getCntdMonedasPeso() {
        return cantidadMonedasPeso;
    }

    public void setCntdMonedasPeso(int cntdMonedasPeso) {
        this.cantidadMonedasPeso = cntdMonedasPeso;
    }

    public int getCntdMonedas2Pesos() {
        return cantidadMonedas2Pesos;
    }

    public void setCntdMonedas2Pesos(int cntdMonedas2Pesos) {
        this.cantidadMonedas2Pesos = cntdMonedas2Pesos;
    }

    public int getCntdMonedas5Pesos() {
        return cantidadMonedas5Pesos;
    }

    public void setCntdMonedas5Pesos(int cntdMonedas5Pesos) {
        this.cantidadMonedas5Pesos = cntdMonedas5Pesos;
    }

    public int getCntdMonedas10Pesos() {
        return cantidadMonedas10Pesos;
    }

    public void setCntdMonedas10Pesos(int cntdMonedas10Pesos) {
        this.cantidadMonedas10Pesos = cntdMonedas10Pesos;
    }
    
    
    //Posiblemente varios inline method.
    public void disminuirMonedasPeso(){
        cantidadMonedasPeso = cantidadMonedasPeso-1;
    }
     public void disminuirMonedas2Pesos(){
        cantidadMonedas2Pesos = cantidadMonedas2Pesos-1;
    }
     public void disminuirMonedas5Pesos(){
        cantidadMonedas5Pesos = cantidadMonedas5Pesos-1;
    }
     public void disminuirMonedas10Pesos(){
       cantidadMonedas10Pesos = cantidadMonedas10Pesos-1;
    }
    
    
        
}
