/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 * Clase encargada del manejo del dinero en todo el sistema
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class Cambio {
    
    final int MONEDAS_PESO_INICIALES; 
    final int MONEDAS_DOS_INICIALES;
    final int MONEDAS_CINCO_INICIALES;
    final int MONEDAS_DIEZ_INICIALES;   
    int monedasPeso;
    int monedas2Pesos;
    int monedas5Pesos;
    int monedas10Pesos;
    /**
     * Constructor que genera los objetos de tipo cambio los cuales representan
     * el dinero a devolver al cliente.
     * @param MonedasPeso int que representa la cantidad de monedas de peso 
     * existentes en el cambio para el comprador
     * @param Monedas2Pesos int que representa la cantidad de monedas de peso 
     * existentes en el cambio para el comprador
     * @param Monedas5Pesos  int que representa la cantidad de monedas de 5 pesos 
     * existentes en el cambio para el comprador   
     * @param Monedas10Pesos  int que representa la cantidad de monedas de 10
     * pesos existentes en el cambio para el comprador   
     */
    public Cambio(int MonedasPeso, int Monedas2Pesos, int Monedas5Pesos, 
            int Monedas10Pesos) {      
        this.monedasPeso = MonedasPeso ;
        this.monedas2Pesos =  Monedas2Pesos;
        this.monedas5Pesos =  Monedas5Pesos ;
        this.monedas10Pesos =   Monedas10Pesos;        
        MONEDAS_PESO_INICIALES = MonedasPeso; 
        MONEDAS_DOS_INICIALES = Monedas2Pesos;
        MONEDAS_CINCO_INICIALES = Monedas5Pesos;
        MONEDAS_DIEZ_INICIALES = Monedas10Pesos;   
    }

    public int getMonedasPeso() {
        return monedasPeso;
    }
    
    public int getMonedas2Pesos() {
        return monedas2Pesos;
    }

    public int getMonedas5Pesos() {
        return monedas5Pesos;
    }

    public int getMonedas10Pesos() {
        return monedas10Pesos;
    }

    public void setMonedasPeso(int MonedasPeso) {
        this.monedasPeso = MonedasPeso;
    }

    public void setMonedas2Pesos(int Monedas2Pesos) {
        this.monedas2Pesos = Monedas2Pesos;
    }

    public void setMonedas5Pesos(int Monedas5Pesos) {
        this.monedas5Pesos = Monedas5Pesos;
    }

    public void setMonedas10Pesos(int Monedas10Pesos) {
        this.monedas10Pesos = Monedas10Pesos;
    }

    @Override
    public String toString() {
        String respuesta = "";
        
        if(monedasPeso > 0){
            respuesta = respuesta + "Monedas de 1 Peso: " + monedasPeso + "\n";
        }
        if(monedas2Pesos > 0){
            respuesta = respuesta + "Monedas de 2 Pesos: " + monedas2Pesos + "\n";
        }
        if(monedas5Pesos > 0){
            respuesta = respuesta + "Monedas de 5 Pesos: " + monedas5Pesos + "\n";
        }
        if(monedas10Pesos > 0){
            respuesta = respuesta + "Monedas de 10 Pesos: " + monedas10Pesos + "\n";
        }
        return respuesta;
    }
     /**
     * Metodo que transforma las monedas iniciales de cada denominacion a una 
     * cadena para su impresion.
     * @return Cadena que representa la cantidad de monedas de cada denominación
     * iniciales
     */
    public String cambioInicialToString() {
        String respuesta = "";
        
        if(MONEDAS_PESO_INICIALES > 0){
            respuesta = respuesta + "Monedas de 1 Peso: " 
                    + MONEDAS_PESO_INICIALES + "\n";
        }
        if(MONEDAS_DOS_INICIALES > 0){
            respuesta = respuesta + "Monedas de 2 Pesos: " 
                    + MONEDAS_DOS_INICIALES + "\n";
        }
        if(MONEDAS_CINCO_INICIALES > 0){
            respuesta = respuesta + "Monedas de 5 Pesos: " 
                    + MONEDAS_CINCO_INICIALES + "\n";
        }
        if(MONEDAS_DIEZ_INICIALES > 0){
            respuesta = respuesta + "Monedas de 10 Pesos: " 
                    + MONEDAS_DIEZ_INICIALES + "\n";
        }
        return respuesta;
    }
}