/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Factura;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Eduardo Ayora
 */
public class ControladorFactura {
    
    private Set<Factura> lista;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }
    
    public ControladorFactura() {
        lista = new HashSet<>();
        codigo = 0;
    }
    
    public void create(Factura facturadetalle){
        facturadetalle.setNumeroFactura(codigo);
        codigo++;
        lista.add(facturadetalle);
    }
    
    public Factura read(int numero){
        for (Factura factura : lista) {
            if(factura.getNumeroFactura()== numero){
                return factura;
            }
        }
        return null;
    }
    
    public void update(Factura facturadetalle){
        if(lista.contains(facturadetalle)){
            lista.remove(facturadetalle);
            lista.add(facturadetalle);
        }
    }
    
    public void delete(int numero){
        for (Factura facturadetalle : lista) {
            if(facturadetalle.getNumeroFactura()== numero){
                lista.remove(facturadetalle);
                break;
            }
        }
    }
    
    public void imprimir(){
        for (Factura facturadetalle : lista) {
            System.out.println(facturadetalle.getNumeroFactura());
        }
    }
    
}
