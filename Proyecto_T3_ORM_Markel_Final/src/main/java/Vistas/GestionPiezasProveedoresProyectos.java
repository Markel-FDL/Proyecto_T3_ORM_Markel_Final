/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

//import com.mycompany.proyecto.ad.final2.entity.*;

import com.mycompany.proyectos_t3_orm_markel_final.*;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author 9fdam05
 */
public class GestionPiezasProveedoresProyectos extends javax.swing.JFrame {

    static Operaciones operaciones = new Operaciones();
    static ArrayList<ProveedoresEntity> listaProveedores;
    static ArrayList<ProyectosEntity> listaProyectos;
    static ArrayList<PiezasEntity> listaPiezas;

    /**
     * Creates new form Gpp
     */
    public GestionPiezasProveedoresProyectos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        comboPieza = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboProyecto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        nombreProv = new javax.swing.JTextField();
        apellidosProv = new javax.swing.JTextField();
        nombrePie = new javax.swing.JTextField();
        precioPie = new javax.swing.JTextField();
        nombreProy = new javax.swing.JTextField();
        ciudadProy = new javax.swing.JTextField();
        anadirBoton = new javax.swing.JButton();
        modificarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        listadoBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        jLabel2.setText("Relaciones piezas, proveedores, proyectos");
        jToolBar1.add(jLabel2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Proveedor: ");

        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });

        comboPieza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPiezaActionPerformed(evt);
            }
        });

        jLabel3.setText("Pieza: ");

        comboProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProyectoActionPerformed(evt);
            }
        });

        jLabel4.setText("Proyecto: ");

        jLabel5.setText("Cantidad: ");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(comboPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        nombreProv.setEditable(false);

        apellidosProv.setEditable(false);

        nombrePie.setEditable(false);

        precioPie.setEditable(false);

        nombreProy.setEditable(false);

        ciudadProy.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidosProv, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precioPie, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombrePie, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ciudadProy, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apellidosProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(nombrePie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(precioPie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(nombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudadProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );

        anadirBoton.setText("Insertar");
        anadirBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        anadirBoton.setMargin(new java.awt.Insets(2, 30, 3, 30));
        anadirBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        anadirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anadirBotonActionPerformed(evt);
            }
        });

        modificarBoton.setText("Modificar");
        modificarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        modificarBoton.setMargin(new java.awt.Insets(2, 30, 3, 30));
        modificarBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        modificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setText("Eliminar");
        eliminarBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarBoton.setMargin(new java.awt.Insets(2, 30, 3, 30));
        eliminarBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        listadoBoton.setText("Listado");
        listadoBoton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        listadoBoton.setMargin(new java.awt.Insets(2, 30, 3, 30));
        listadoBoton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        listadoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listadoBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anadirBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listadoBoton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(anadirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listadoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void cargarDatos() {
        listaProyectos = operaciones.listarProyectos();
        String[] codigosOperacines = new String[listaProyectos.size()];
        for (int i = 0; i < listaProyectos.size(); i++) {
            codigosOperacines[i] = listaProyectos.get(i).getCodigo();
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(codigosOperacines);
        comboProyecto.setModel(defaultComboBoxModel);

        listaProveedores = operaciones.listarProveedores();
        String[] codigosProveedores = new String[listaProveedores.size()];
        for (int i = 0; i < listaProveedores.size(); i++) {
            codigosProveedores[i] = listaProveedores.get(i).getCodigo();
        }
        DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel(codigosProveedores);
        comboProveedor.setModel(defaultComboBoxModel2);

        listaPiezas = operaciones.listarPiezas();
        String[] codigosPiezas = new String[listaPiezas.size()];
        for (int i = 0; i < listaPiezas.size(); i++) {
            codigosPiezas[i] = listaPiezas.get(i).getCodigo();
        }
        DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel(codigosPiezas);
        comboPieza.setModel(defaultComboBoxModel3);
    }

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        ProveedoresEntity p;
        p = listaProveedores.get(comboProveedor.getSelectedIndex());
        nombreProv.setText(p.getNombre());
        apellidosProv.setText(p.getApellidos());
    }//GEN-LAST:event_comboProveedorActionPerformed

    private void comboPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPiezaActionPerformed
        PiezasEntity p;
        p = listaPiezas.get(comboPieza.getSelectedIndex());
        nombrePie.setText(p.getNombre());
        precioPie.setText(String.valueOf(p.getPrecio()));
    }//GEN-LAST:event_comboPiezaActionPerformed

    private void comboProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProyectoActionPerformed
        ProyectosEntity p;
        p = listaProyectos.get(comboProyecto.getSelectedIndex());
        nombreProy.setText(p.getNombre());
        ciudadProy.setText(p.getCiudad());
    }//GEN-LAST:event_comboProyectoActionPerformed

    private void anadirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anadirBotonActionPerformed
        int cant;
        try {
            cant = Integer.parseInt(cantidad.getText());
        } catch (NumberFormatException e) {
            cant = Integer.MIN_VALUE;
        }
        if (cant != Integer.MIN_VALUE) {
            if (cant > 0) {
                String[] codigos = new String[3];
                codigos[0] = comboPieza.getSelectedItem().toString();
                codigos[1] = comboProyecto.getSelectedItem().toString();
                codigos[2] = comboProveedor.getSelectedItem().toString();
                GestionEntity g = new GestionEntity();
                g.setPiezasCodigo(codigos[0]);
                g.setProyectosCodigo(codigos[1]);
                g.setProveedoresCodigo(codigos[2]);
                switch (operaciones.anadirGestion(g)) {
                    case 0 :
                        JOptionPane.showMessageDialog(this, "<< dato de gestion insertado correctamente >>");
                    case 1 :
                        JOptionPane.showMessageDialog(this, "<< Error al insertar el dato de gestion >>", "Error de insercion", JOptionPane.ERROR_MESSAGE);
                    case 2 :
                        JOptionPane.showMessageDialog(this, "<< Ya existe el codigo introducido >>", "Codigo existente", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<< La cantidad debe ser mayor de 0 >>", "Numero no valido", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Inserta cantidad >>", "Cantidad erronea", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_anadirBotonActionPerformed

    private void modificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBotonActionPerformed
        int cant;
        try {
            cant = Integer.parseInt(cantidad.getText());
        } catch (NumberFormatException e) {
            cant = Integer.MIN_VALUE;
        }
        if (cant != Integer.MIN_VALUE) {
            if (cant > 0) {
                String[] codigos = new String[3];
                codigos[0] = comboPieza.getSelectedItem().toString();
                codigos[1] = comboProyecto.getSelectedItem().toString();
                codigos[2] = comboProveedor.getSelectedItem().toString();
                switch (operaciones.actualizarGestion(codigos, cant)) {
                    case 0 :
                        JOptionPane.showMessageDialog(this, "<< Eliminado el dato correctamente >>");
                    case 1 :
                        JOptionPane.showMessageDialog(this, "<< No existe nada sobre el codigo intoducido >>", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                    case 2 :
                        JOptionPane.showMessageDialog(this, "<< Error al eliminar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<< La cantidad debe ser mayor de 0 >>", "Numero no valido", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Inserta cantidad >>", "Cantidad erronea", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_modificarBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        String[] codigos = new String[3];
        codigos[0] = comboPieza.getSelectedItem().toString();
        codigos[1] = comboProyecto.getSelectedItem().toString();
        codigos[2] = comboProveedor.getSelectedItem().toString();
        switch (operaciones.eliminarGestion(codigos)) {
            case 0 :
                JOptionPane.showMessageDialog(this, "<< Eliminado el dato correctamente >>");
            case 1 :
                JOptionPane.showMessageDialog(this, "<< No existe nada sobre el codigo intoducido >>", "Error de codigo", JOptionPane.ERROR_MESSAGE);
            case 2 :
                JOptionPane.showMessageDialog(this, "<< Error al eliminar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void limpiarDatos(){
        cantidad.setText("");
    }

    private void listadoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listadoBotonActionPerformed
        MostrarListadoDeGestion tablaListadoGestion = new MostrarListadoDeGestion();
        tablaListadoGestion.setLocationRelativeTo(null);
        tablaListadoGestion.setVisible(true);
    }//GEN-LAST:event_listadoBotonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionPiezasProveedoresProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPiezasProveedoresProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPiezasProveedoresProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPiezasProveedoresProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPiezasProveedoresProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anadirBoton;
    private javax.swing.JTextField apellidosProv;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField ciudadProy;
    private javax.swing.JComboBox<String> comboPieza;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JComboBox<String> comboProyecto;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton listadoBoton;
    private javax.swing.JButton modificarBoton;
    private javax.swing.JTextField nombrePie;
    private javax.swing.JTextField nombreProv;
    private javax.swing.JTextField nombreProy;
    private javax.swing.JTextField precioPie;
    // End of variables declaration//GEN-END:variables
}
