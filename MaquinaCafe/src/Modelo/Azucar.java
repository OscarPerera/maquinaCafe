/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author zeusj
 */
public class Azucar extends Ingrediente{
    
    public Azucar(int cantidadInicial, int cantidadDisponible) {
        super(cantidadInicial, cantidadDisponible);
    }
    
    public void agregarCucharadas(int cantidadDeCucharadas){
        super.setCantidadDisponible(super.getCantidadDisponible() - cantidadDeCucharadas);
    }
}