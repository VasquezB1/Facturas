/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.Date;

/**
 *
 * @author Byron PC
 * @since 16-Mayo-2019
 * Modelos
 */
public class Producto {
    private int codigo;
    private String producto;
    private double precio;
    private String descripcion;
     private int cantidad;
private double total1;
   
   public Producto(){
    
}

    public Producto(int codigo, String producto, double precio, String descripcion, int cantidad, double total1) {
        this.codigo = codigo;
        this.producto = producto;
        this.precio = precio;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.total1 = total1;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal1() {
        return total1;
    }

    public void setTotal1(double total1) {
        this.total1 = total1;
    }

   

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", producto=" + producto + ", precio=" + precio + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", total1=" + total1 + '}';
    }

    
}


   