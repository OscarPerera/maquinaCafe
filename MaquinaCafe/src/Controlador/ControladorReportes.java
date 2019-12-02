  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author zeusj
 */
public class ControladorReportes {
    private Cafe cafe;
    private Azucar azucar;
    private ArrayList<Orden> ListaOrdenes = new ArrayList<>();

    public ControladorReportes() {
        Capsula descafeinado = new Capsula(10);
        Capsula negro = new Capsula(10);
        Capsula capuccino = new Capsula(10);
        cafe = new Cafe(descafeinado, negro, capuccino);
        azucar = new Azucar(20);
    }

    public Cafe getCafe() {
        return cafe;
    }

    public void setCafe(Cafe cafe) {
        this.cafe = cafe;
    }

    public Azucar getAzucar() {
        return azucar;
    }

    public void setAzucar(Azucar azucar) {
        this.azucar = azucar;
    }
    
    public boolean AgregarOrden(Orden nuevaOrden){
        Orden newOrden=nuevaOrden;
        int cucharadasAzucar = nuevaOrden.getCucharadasAzucar();
        String tipoCafe;
        final int CANTIDAD_MINIMA=0;
        
        if(getAzucar().getCantidadDisponible() >= cucharadasAzucar){
            tipoCafe = newOrden.getTipoCafe();
            
            switch (tipoCafe) {
                case "capuccino":
                    if(getCafe().getCapuccino().getCantidadDisponible() > CANTIDAD_MINIMA){
                        registrarOrden(newOrden);
                        getCafe().getCapuccino().PrepararCafe();
                        getAzucar().agregarCucharadas(cucharadasAzucar);
                        return true;
                    }else {
                        return false;
                    }
                case "negro":
                    if(getCafe().getNegro().getCantidadDisponible() > CANTIDAD_MINIMA){
                        registrarOrden(newOrden);
                        getCafe().getNegro().PrepararCafe();
                        getAzucar().agregarCucharadas(cucharadasAzucar);
                        return true;
                    }else {
                        return false;
                    }
                default:
                    if(getCafe().getDescafeinado().getCantidadDisponible() > CANTIDAD_MINIMA){
                        registrarOrden(newOrden);
                        getCafe().getDescafeinado().PrepararCafe();
                        getAzucar().agregarCucharadas(cucharadasAzucar);
                        return true;
                    }else {
                        return false;
                    }
            }
        }
        else {
            return false;
        }
    }
    
    public void registrarOrden(Orden nuevaOrden){
        ListaOrdenes.add(nuevaOrden);
    }  
    
    public String ObtenerReporteOrdenes(){
        Iterator<Orden> ordenActual = ListaOrdenes.iterator();
        int indice = 1;
        String reporteOrdenes="";
        Orden ordenIndice;
        
        while(ordenActual.hasNext()){
            ordenIndice = ordenActual.next();
            reporteOrdenes = reporteOrdenes + "Orden " + indice 
                    + ordenIndice.toString()+  "\n";
            indice++;
        }
        return reporteOrdenes;
    }
    
    public String ObtenerReporteIngredientes(){       
        String reporteIngredientes;       
        return reporteIngredientes=cafe.toString() + azucar.toString();
    }   
}