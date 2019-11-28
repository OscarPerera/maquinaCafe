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
public class NivelAzucar {
    
    private int gramosAzucarExistentes;

    public NivelAzucar(int gramosExistentes) {
        this.gramosAzucarExistentes = gramosExistentes;
    }

    public int getGramosExistentes() {
        return gramosAzucarExistentes;
    }

    //Es posible actualizar
    public void setGramosExistentes(int gramosExistentes) {
        this.gramosAzucarExistentes = gramosExistentes;
    }
    
    public void reducirGramosAzucar(int gramosUsados){
        gramosAzucarExistentes = gramosAzucarExistentes-gramosUsados;
    }
    
}
