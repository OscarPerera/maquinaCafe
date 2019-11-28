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
 *
 * @author zeusj
 */
 /*Podemos observar que en esta clase se mandan tanto el tipo de café como el costo del café,
  Es debatible si solo se mandarán esos valores o se debería mandar el objeto*/
public class Orden {
    
    private double dineroIngresado;
    private double costoOrden;
    private String tipoCafe;
    private int cucharadasAzucar;
    private String fecha;
    private double dineroCambio;
    
    

    public Orden(double dineroIngresado, double costoOrden, String tipoCafe, int cucharadasAzucar) {
        this.dineroIngresado = dineroIngresado;
        this.costoOrden = costoOrden;
        this.tipoCafe = tipoCafe;
        this.cucharadasAzucar = cucharadasAzucar;
        fecha = FechaConHora();
        dineroCambio = CantidadCambio();
    }  
    
   public String FechaConHora()
    {
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
       return hourdateFormat.format(date);
       
    }
   
   
  
   public double CantidadCambio()
   {
       double cambio = dineroIngresado - costoOrden;
       return cambio;
   }
   
}
