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
public class Orden {
    private double dineroIngresado;
    private String tipoCafe;
    private int cucharadasAzucar;

    public Orden(double dineroIngresado, String tipoCafe, int cucharadasAzucar) {
        this.dineroIngresado = dineroIngresado;
        this.tipoCafe = tipoCafe;
        this.cucharadasAzucar = cucharadasAzucar;
    }  
    
}
