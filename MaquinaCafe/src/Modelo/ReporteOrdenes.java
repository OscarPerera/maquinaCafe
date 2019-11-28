/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Oscar Perera
 */
public class ReporteOrdenes {
  
  ArrayList<Orden> listaOrdenes = new ArrayList<>();

  
   public ReporteOrdenes() {
       
    }
 
  
public void AgregarOrden(Orden nuevaOrden){
    listaOrdenes.add(nuevaOrden);
}
  
public void ObtenerReporte(){
   Iterator<Orden> ordenActual = listaOrdenes.iterator();
// mientras al iterador queda proximo juego
while(ordenActual.hasNext()){
    Orden objeto=ordenActual.next();
    System.out.println(objeto.toString());
    
}
}
}
  
  

