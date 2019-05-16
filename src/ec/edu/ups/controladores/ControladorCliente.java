/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controladores;

import ec.edu.ups.modelo.Cliente;
import java.awt.List;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Byron PC
 */
public class ControladorCliente {
    private Set<Cliente>lista;
    private int codigo;
            

    public ControladorCliente() {
        lista=new HashSet<>();
        codigo=0;
    }
    public int getCodigo() {
        return codigo;
    }
    
     public void create(Cliente objeto){
        codigo++;
        objeto.setCodigo(codigo);
        lista.add(objeto);
    }
    
    public Cliente read(int codigo){
        for(Cliente cliente : lista){
            if(cliente.getCodigo() == codigo){
                return cliente;
            }
        }
        return null;
    }
    public Cliente readcedula(String cedula){
        for(Cliente clientecedula : lista){
            if(clientecedula.getCedula().equals(cedula)){
                return clientecedula;
            }
        }
        return null;
    }
    
    public ControladorCliente update(Cliente objeto){
        objeto.setCodigo(codigo);
        lista.add(objeto);
        return null;
    }
    
    public void delete(int codigo){
        
        for(Cliente objeto : lista){
            if(objeto.getCodigo() == codigo){
                lista.remove(objeto);
                break;
            }
        }
        
    }
    
    public void imprimir(){
        for (Cliente cliente : lista) {
            System.out.println(cliente.toString());
        }
    }
    public Set<Cliente> getLista(){
        return lista;
    }
}
