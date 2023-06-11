/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.interfaces.EmularAprobacionRecargaVista;
import dominio.Administrador;
import dominio.RecargaSaldo;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import ui.controladores.ControladorEmularAprobacionRecarga;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DialogoEmularAprobacionRecarga extends javax.swing.JFrame implements EmularAprobacionRecargaVista {

    private final ControladorEmularAprobacionRecarga controlador;

    /**
     * Creates new form DialogoRecargaSaldo
     */
    public DialogoEmularAprobacionRecarga(Administrador administrador) {
        initComponents();
        this.controlador = new ControladorEmularAprobacionRecarga(this, administrador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAprobar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        lblRecargasPendientes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tRecargaSaldo = new javax.swing.JTable();

        btnAprobar.setText("Aprobar");
        btnAprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAprobarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        lblRecargasPendientes.setText("Recargas Pendientes");

        tRecargaSaldo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Propietario", "Monto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tRecargaSaldo.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tRecargaSaldo);
        tRecargaSaldo.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblRecargasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(152, 152, 152)
                                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                        .addComponent(btnAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblRecargasPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAprobarActionPerformed
        aprobarRecarga();
    }//GEN-LAST:event_btnAprobarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        cerrar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAprobar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRecargasPendientes;
    private javax.swing.JTable tRecargaSaldo;
    // End of variables declaration//GEN-END:variables

    public DefaultTableModel obtenerTablaPorDefecto() {
        return new DefaultTableModel(
                new String[]{
                    "Fecha", "Propietario", "Monto"
                }, 0
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean[]{
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        };
    }

    @Override
    public void aprobarRecarga() {
        int seleccionado = tRecargaSaldo.getSelectedRow();
        controlador.aprobarRecarga(seleccionado);
    }

    @Override
    public void cerrar() {
        dispose();
    }

    @Override
    public void mostrarRecargasPendientes(ArrayList<RecargaSaldo> recargasSaldo) {
        DefaultTableModel model = obtenerTablaPorDefecto();
        tRecargaSaldo.setModel(model);
        for (RecargaSaldo rs : recargasSaldo) {
            model.addRow(new Object[]{rs.getFechaInicio().toString(), rs.getPropietario().getNombreCompleto(), rs.getMonto()});
        }
    }
}
