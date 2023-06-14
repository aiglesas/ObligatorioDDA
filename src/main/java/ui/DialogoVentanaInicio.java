/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author usuario
 */
public class DialogoVentanaInicio extends javax.swing.JFrame {

    /**
     * Creates new form VentanaInicio
     */
    public DialogoVentanaInicio() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mPropietario = new javax.swing.JMenuItem();
        mAdministrador = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Login");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        mPropietario.setText("Propietario");
        mPropietario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPropietarioActionPerformed(evt);
            }
        });
        jMenu1.add(mPropietario);

        mAdministrador.setText("Administrador");
        mAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mAdministradorActionPerformed(evt);
            }
        });
        jMenu1.add(mAdministrador);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void mPropietarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPropietarioActionPerformed
        this.loginPropietario();
    }//GEN-LAST:event_mPropietarioActionPerformed

    private void mAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mAdministradorActionPerformed
        this.loginAdministrador();
    }//GEN-LAST:event_mAdministradorActionPerformed

    /**
     * @param args the command line arguments
     */
    private void loginPropietario() {
        new DialogoLoginPropietario(this, false).setVisible(true);
    }

    private void loginAdministrador() {
        new DialogoLoginAdministrador(this, false).setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mAdministrador;
    private javax.swing.JMenuItem mPropietario;
    // End of variables declaration//GEN-END:variables
}