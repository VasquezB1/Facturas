/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author Eduardo Ayora
 */
public class FacturaDetalle {
    
    private int codigo;
    private int cantidad;
    private Producto producto;
    private double total1;

    public FacturaDetalle() {
    }

    public FacturaDetalle(int codigo, int cantidad, Producto producto, double total1) {
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.producto = producto;
        this.total1 = total1;
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

   

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + this.codigo;
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
        final FacturaDetalle other = (FacturaDetalle) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" + "codigo=" + codigo + ", cantidad=" + cantidad + ", producto=" + producto + ", total1=" + total1 + '}';
    }
    
    
    
}
