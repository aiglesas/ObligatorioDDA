/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dominio.Propietario;
import javax.swing.JOptionPane;
import ui.controladores.ControladorRecargaSaldo;
import ui.interfaces.RecargaSaldoVista;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DialogoRecargaSaldo extends javax.swing.JDialog implements RecargaSaldoVista{

    /**
     * Creates new form DialogoRecargaSaldo
     */
    private final ControladorRecargaSaldo controlador;
    /**
     * Creates new form DialogoRecargaSaldo
     */
    public DialogoRecargaSaldo(Propietario propietario) {
        initComponents();
        this.controlador = new ControladorRecargaSaldo(this, propietario);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonto = new javax.swing.JLabel();
        jNombreCompleto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TFMontoRecargar = new java.awt.TextField();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMonto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucas\\OneDrive - Facultad de Ingenieria - Universidad ORT Uruguay\\Escritorio\\DDA\\OBLIGATORIO\\Dinero.jpg")); // NOI18N
        jMonto.setText("monto");

        jNombreCompleto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucas\\OneDrive - Facultad de Ingenieria - Universidad ORT Uruguay\\Escritorio\\DDA\\OBLIGATORIO\\usuario.jpg")); // NOI18N
        jNombreCompleto.setText("NombreCompleto");

        jLabel1.setText("Monto a recargar:");

        TFMontoRecargar.setText("textField1");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jMonto)
                        .addGap(31, 31, 31)
                        .addComponent(jNombreCompleto))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TFMontoRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMonto)
                    .addComponent(jNombreCompleto))
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TFMontoRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(btnAceptar)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        recargarSaldo(TFMontoRecargar.getText());
    }//GEN-LAST:event_btnAceptarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField TFMontoRecargar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMonto;
    private javax.swing.JLabel jNombreCompleto;
    // End of variables declaration//GEN-END:variables
        @Override
    public void recargarSaldo(String saldo) {
        controlador.recargarSaldo(saldo);
    }
    @Override
    public void mostrarMensajeDeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }
    
    @Override
    public void mostrarNombreCompleto(String nombreCompleto) {
        jNombreCompleto.setText(nombreCompleto);
    }

    @Override
    public void mostrarSueldoActual(String monto) {
        jMonto.setText(monto);
    }
}
