/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;


import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Producto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Byron PC
 * @since 16-Mayo-2019
 * Controladores
 */
public class ControladorProducto {
    private Set<Producto>lista;
    private int codigo;
            

    public ControladorProducto() {
        lista=new HashSet<>();
        codigo=0;
    }
    public int getCodigo() {
        return codigo;
    }
    
     public void create(Producto objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Producto read(int codigo){
        for(Producto producto : lista){
            if(codigo == producto.getCodigo()){
                return producto;
            }
        }
        return null;
    }
    
    public void update(Producto objeto){
        if(lista.contains(objeto)){
            lista.remove(objeto);
            lista.add(objeto);
        }
    }
    
    public void delete(int codigo){
        
        for(Producto objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
        
    }
    
    public void imprimir(){
        for (Producto producto : lista) {
            System.out.println(producto.toString());
        }
    }
     public Set<Producto> getLista(){
        return lista;
    }
}
