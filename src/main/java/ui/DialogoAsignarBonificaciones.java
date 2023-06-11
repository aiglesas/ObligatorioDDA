/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import ui.interfaces.AsignarBonificacionesVista;
import dominio.Asignacion;
import dominio.Bonificacion;
import dominio.Propietario;
import dominio.Puesto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ui.controladores.ControladorAsignarBonificacion;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class DialogoAsignarBonificaciones extends javax.swing.JFrame implements AsignarBonificacionesVista {

    /**
     * Creates new form DialogoAsignarBonificaciones
     */
    private ControladorAsignarBonificacion controlador;

    public DialogoAsignarBonificaciones() {
        initComponents();
        this.controlador = new ControladorAsignarBonificacion(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbBonificaciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCedula = new java.awt.TextField();
        cbPuesto = new javax.swing.JComboBox<>();
        btnBuscarCedula = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lblNombreCompleto = new javax.swing.JLabel();
        btnAsignarBonificacion = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAsignacionesPropietario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bonificaciones:");

        cbBonificaciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBonificaciones.setSelectedItem(null);
        cbBonificaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBonificacionesActionPerformed(evt);
            }
        });

        jLabel2.setText("Puesto:");

        jLabel3.setText("Cedula:");

        tfCedula.setText("textField1");

        cbPuesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPuesto.setSelectedItem(null);

        btnBuscarCedula.setText("Buscar");
        btnBuscarCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCedulaActionPerformed(evt);
            }
        });

        jLabel4.setText("Propietario:");

        lblNombreCompleto.setText("NombreCompleto");

        btnAsignarBonificacion.setText("Asignar");
        btnAsignarBonificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarBonificacionActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");

        tAsignacionesPropietario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Bonificacion", "Puesto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tAsignacionesPropietario.setColumnSelectionAllowed(true);
        tAsignacionesPropietario.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tAsignacionesPropietario);
        tAsignacionesPropietario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(btnAsignarBonificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addContainerGap(107, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbBonificaciones, 0, 207, Short.MAX_VALUE)
                                        .addComponent(cbPuesto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNombreCompleto)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbBonificaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(tfCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnBuscarCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNombreCompleto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAsignarBonificacion)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnCerrar)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBonificacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBonificacionesActionPerformed

    }//GEN-LAST:event_cbBonificacionesActionPerformed

    private void btnBuscarCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCedulaActionPerformed
        buscarCedula(tfCedula.getText());
    }//GEN-LAST:event_btnBuscarCedulaActionPerformed

    private void btnAsignarBonificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarBonificacionActionPerformed
        String nombreBonificacion = "";
        String nombrePuesto = "";
        if(cbBonificaciones.getSelectedItem() != null){
            nombreBonificacion = cbBonificaciones.getSelectedItem().toString();
        }
        if(cbPuesto.getSelectedItem() != null){
            nombrePuesto = cbPuesto.getSelectedItem().toString();
        }
        asignarBonificacion(nombreBonificacion, nombrePuesto);
    }//GEN-LAST:event_btnAsignarBonificacionActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarBonificacion;
    private javax.swing.JButton btnBuscarCedula;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cbBonificaciones;
    private javax.swing.JComboBox<String> cbPuesto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNombreCompleto;
    private javax.swing.JTable tAsignacionesPropietario;
    private java.awt.TextField tfCedula;
    // End of variables declaration//GEN-END:variables
    @Override
    public void buscarCedula(String cedula) {
        controlador.buscarCedula(cedula);
    }

    @Override
    public void asignarBonificacion(String nombreBonificacion, String nombrePuesto) {
        controlador.asignarBonificacion(nombreBonificacion, nombrePuesto);
    }

    @Override
    public void mostrarAsignarBonificacion(ArrayList<Bonificacion> bonificaciones, ArrayList<Puesto> puestos) {
        mostrarBonificaciones(bonificaciones);
        mostrarPuestos(puestos);
    }

    @Override
    public void mostrarBonificaciones(ArrayList<Bonificacion> bonificaciones) {
        for (Bonificacion b : bonificaciones) {
            cbBonificaciones.addItem(b.getNombre());
        }
    }

    @Override
    public void mostrarPuestos(ArrayList<Puesto> puestos) {
        for (Puesto p : puestos) {
            cbPuesto.addItem(p.getNombre());
        }
    }

    @Override
    public void mostrarMensajeDeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error de datos", JOptionPane.ERROR_MESSAGE);
    }

    @Override
    public void mostrarPropietario(Propietario propietario) {
        mostrarNombreCompleto(propietario.getNombreCompleto());
        mostrarAsignaciones(propietario.getAsignaciones());
    }

    @Override
    public void mostrarNombreCompleto(String nombreCompleto) {
        lblNombreCompleto.setText(nombreCompleto);
    }

    @Override
    public void mostrarAsignaciones(ArrayList<Asignacion> asignaciones) {
        DefaultTableModel model = obtenerTablaPorDefecto();
        tAsignacionesPropietario.setModel(model);
        for (Asignacion a : asignaciones) {
            model.addRow(new Object[]{a.getBonificacion().getNombre(), a.getPuesto().getNombre()});
        }
    }

    private DefaultTableModel obtenerTablaPorDefecto() {
        return new DefaultTableModel(
                new String[]{
                    "Bonificacion", "Puesto"
                }, 0
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class
            };

            boolean[] canEdit = new boolean[]{
                false, false
            };

        };
    }
}
