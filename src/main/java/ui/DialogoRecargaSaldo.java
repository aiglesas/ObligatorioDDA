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
public class DialogoRecargaSaldo extends javax.swing.JDialog implements RecargaSaldoVista {

    /**
     * Creates new form DialogoRecargaSaldo
     */
    private final ControladorRecargaSaldo controlador;

    /**
     * Creates new form DialogoRecargaSaldo
     */
    public DialogoRecargaSaldo(javax.swing.JFrame parent, boolean modal, Propietario propietario) {
        super(parent, modal);
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
        setTitle("Recarga de saldo");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jMonto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucas\\OneDrive - Facultad de Ingenieria - Universidad ORT Uruguay\\Escritorio\\DDA\\OBLIGATORIO\\Dinero.jpg")); // NOI18N
        jMonto.setText("monto");

        jNombreCompleto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Lucas\\OneDrive - Facultad de Ingenieria - Universidad ORT Uruguay\\Escritorio\\DDA\\OBLIGATORIO\\usuario.jpg")); // NOI18N
        jNombreCompleto.setText("NombreCompleto");

        jLabel1.setText("Monto a recargar:");

        TFMontoRecargar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

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
                .addGap(45, 45, 45)
                .addComponent(jMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(jNombreCompleto)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TFMontoRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMonto)
                    .addComponent(jNombreCompleto))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(TFMontoRecargar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnAceptar)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        recargarSaldo(TFMontoRecargar.getText());
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.controlador.desuscribirYSalir();
    }//GEN-LAST:event_formWindowClosed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField TFMontoRecargar;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jMonto;
    private javax.swing.JLabel jNombreCompleto;
    // End of variables declaration//GEN-END:variables
    @Override
    public void recargarSaldo(String saldo) {
        if (saldo != "") {
            controlador.recargarSaldo(saldo);
        }
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

    @Override
    public void cerrarVista() {
        dispose();
    }

}
