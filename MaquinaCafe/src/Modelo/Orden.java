/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Clase encargada de la produccion de las diferentes órdenes, estas se componen
 * del tipo de café, la cantidad de azucar, el costo y el dinero ingresado por el
 * usuario
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class Orden {
    
    private double dineroIngresado;
    private double costoOrden;
    private String tipoCafe;
    private int cucharadasAzucar;
    private String fecha;
    private double dineroCambio;
    /**
     * Constructor de la clase Orden
     * @param dineroIngresado Double que representa el total de dinero ingresado
     * por el usuario para la orden
     * @param costoOrden Double que representa el costo total del café
     * @param tipoCafe String que nos indica el tipo de café pedido por el usuario
     * @param cucharadasAzucar int que indica la cantidad de azucar elegida por el
     * usuario
     */
    public Orden(double dineroIngresado, double costoOrden, String tipoCafe, 
            int cucharadasAzucar) {
        this.dineroIngresado = dineroIngresado;
        this.costoOrden = costoOrden;
        this.tipoCafe = tipoCafe;
        this.cucharadasAzucar = cucharadasAzucar;
        fecha = getFechaConHora();
        dineroCambio = devolverCambio();
    }  
    /**
     * Método que genera la fecha y hora en la que la orden es generada
     * @return Retorna la fecha y hora en la que se genera la orden
     */
   public String getFechaConHora(){
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        
       return hourdateFormat.format(date); 
    }

    public double getDineroIngresado() {
        return dineroIngresado;
    }

    public void setDineroIngresado(double dineroIngresado) {
        this.dineroIngresado = dineroIngresado;
    }

    public double getCostoOrden() {
        return costoOrden;
    }

    public void setCostoOrden(double costoOrden) {
        this.costoOrden = costoOrden;
    }

    public String getTipoCafe() {
        return tipoCafe;
    }

    public void setTipoCafe(String tipoCafe) {
        this.tipoCafe = tipoCafe;
    }

    public int getCucharadasAzucar() {
        return cucharadasAzucar;
    }

    public void setCucharadasAzucar(int cucharadasAzucar) {
        this.cucharadasAzucar = cucharadasAzucar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDineroCambio() {
        return dineroCambio;
    }

    public void setDineroCambio(double dineroCambio) {
        this.dineroCambio = dineroCambio;
    }
    /**
     * Metodo que devuelve el dinero resultante tras la compra del café
     * @return Devuelve una variable double que representa el dinero devuelto al
     * cliente tras la compra del café.
     */
   public double devolverCambio(){
       double cambio;
       cambio = dineroIngresado - costoOrden;
       return cambio;
   }

    @Override
    public String toString() {
        return "\nDinero Ingresado: " + dineroIngresado + "\nCosto de la Orden: " 
                + costoOrden + "\nTipo de Cafe: " + tipoCafe 
                + "\nCucharadas de Azucar: " + cucharadasAzucar + "\nFecha: " 
                + fecha + "\nDinero de Cambio: " + dineroCambio  + "\n";
    }
}