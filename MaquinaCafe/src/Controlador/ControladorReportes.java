/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.*;
import java.util.ArrayList;

/**
 *
 * @author zeusj
 */
public class ControladorReportes {
    ArrayList<Orden> ListaOrdenes = new ArrayList<>();
    Cafe cafe;
    Azucar azucar;

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
        int cucharadasAzucar = nuevaOrden.getCucharadasAzucar();
        if(getAzucar().getCantidadDisponible() >= cucharadasAzucar){
            String tipoCafe = nuevaOrden.getTipoCafe();
            if(tipoCafe == "capuccino"){
                if(getCafe().getCapuccino().getCantidadDisponible() > 0){
                    registrarOrden(nuevaOrden);
                    getCafe().getCapuccino().PrepararCafe();
                    getAzucar().agregarCucharadas(cucharadasAzucar);
                    return true;
                }
                else {
                    return false;
                }
            }
            else if(tipoCafe == "negro") {
                    if(getCafe().getNegro().getCantidadDisponible() > 0){
                    registrarOrden(nuevaOrden);
                    getCafe().getNegro().PrepararCafe();
                    getAzucar().agregarCucharadas(cucharadasAzucar);
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                if(getCafe().getDescafeinado().getCantidadDisponible() > 0){
                    registrarOrden(nuevaOrden);
                    getCafe().getDescafeinado().PrepararCafe();
                    getAzucar().agregarCucharadas(cucharadasAzucar);
                    return true;
                }
                else {
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
}
