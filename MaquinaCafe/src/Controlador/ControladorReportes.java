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
 * Clase encargada del control de los reportes
 * @author Equipo Guadalupe,Jorge,Oscar,Riad,Zeus
 * @version 1.0
 * @since 2019-12-01
 */
public class ControladorReportes {
    private Cafe cafe;
    private Azucar azucar;
    private ArrayList<Orden> ListaOrdenes = new ArrayList<>();
    /**
     * Constructor de la clase en la que se inicializan las variables de instancia
     */
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
    /**
     * Metodo en el que se registra la orden en el arreglo de órdenes de la clase,
     * ademas se prepara el café, y se agregan las cucharadas de azucar, para finalizar
     * determinando un valor booleano a utilizar en la clase ControladorOrdenes
     * @param nuevaOrden Orden a agregar
     * @return Retorna un valor booleano que servirá en el metodo GenerarNuevasOrdenes
     * de la clase ControladorOrdenes
     */
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
    /**
     * Metodo en el que se agrega un objeto de tipo Orden al arreglo de Ordenes
     * @param nuevaOrden Orden a agregar en el arreglo de órdenes a imprimir
     */
    public void registrarOrden(Orden nuevaOrden){
        ListaOrdenes.add(nuevaOrden);
    }  
    /**
     * Metodo que devuelve todas las ordenes y sus datos para su uso posterior
     * @return String que representa el reporte de todas las ordenes hasta el momento
     */
    public String ObtenerReporteOrdenes(){
        Iterator<Orden> ordenActual = ListaOrdenes.iterator();
        int indice = 1;
        String reporteOrdenes = "";
        Orden ordenIndice;
        
        while(ordenActual.hasNext()){
            ordenIndice = ordenActual.next();
            reporteOrdenes = reporteOrdenes + "Orden " + indice 
                    + ordenIndice.toString()+  "\n";
            indice++;
        }
        return reporteOrdenes;
    }
    /**
     * Metodo que obtiene y devuelve los datos de los ingredientes utilizados en un cafe.
     * @return String que representa los datos de los ingredientes usados en el café.
     */
    public String ObtenerReporteIngredientes(){       
        String reporteIngredientes;       
        reporteIngredientes = cafe.toString() + azucar.toString();
        return reporteIngredientes;
    }   
}