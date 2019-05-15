/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controladores.ControladorCliente;
import ec.edu.ups.modelo.Cliente;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.Set;

/**
 *
 * @author Byron PC
 */
public class ListarClientes extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;

    /**
     * Creates new form ListarClientes
     *
     * @param controladorCliente
     */
    public ListarClientes(ControladorCliente controladorCliente) {
        this.controladorCliente = controladorCliente;
        initComponents();        
        llenarDatos();
    }

    public void llenarDatos() {
        DefaultTableModel modelo = (DefaultTableModel) tblCliente.getModel();
        Set<Cliente> lista = controladorCliente.getLista();
        for (Cliente cliente : lista) {
            Object[] datos = {cliente.getCodigo(),
                cliente.getNombre(),
                cliente.getCedula(),
                cliente.getTelefono(),
                cliente.getDireccion()};
            modelo.addRow(datos);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCliente = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        tblCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Cedula", "Telefono", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(tblCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCliente;
    // End of variables declaration//GEN-END:variables
}
