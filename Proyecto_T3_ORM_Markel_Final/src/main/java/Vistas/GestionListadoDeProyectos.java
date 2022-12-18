/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;


import com.mycompany.ProveedoresEntity;
import com.mycompany.ProyectosEntity;
import com.mycompany.proyecto_t3_orm_markel_final.Acciones;


import javax.swing.*;
import java.util.ArrayList;

/**
 * @author 9fdam05
 */
public class GestionListadoDeProyectos extends javax.swing.JFrame {
    static Acciones acciones = new Acciones();

    static ArrayList<ProyectosEntity> listaProyectos;

    static int contador = 1;

    /**
     * Creates new form GestionProyectos
     */
    public GestionListadoDeProyectos() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ciudadProy = new javax.swing.JTextField();
        nombreProy = new javax.swing.JTextField();
        insertarBoton = new javax.swing.JButton();
        modificarBoton = new javax.swing.JButton();
        limpiarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        codProy = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ciudadProy2 = new javax.swing.JTextField();
        nombreProy2 = new javax.swing.JTextField();
        anteriorBoton = new javax.swing.JButton();
        siguienteBoton = new javax.swing.JButton();
        primeroBoton = new javax.swing.JButton();
        ultimoBoton = new javax.swing.JButton();
        numero = new javax.swing.JLabel();
        codigoProy2 = new javax.swing.JTextField();
        eliminarBoton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Codigo del proyecto: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Ciudad: ");

        nombreProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProyActionPerformed(evt);
            }
        });

        insertarBoton.setText("Insertar");
        insertarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBotonActionPerformed(evt);
            }
        });

        modificarBoton.setText("Modificar");
        modificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBotonActionPerformed(evt);
            }
        });

        limpiarBoton.setText("Limpiar");
        limpiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setText("Eliminar");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        codProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(codProy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudadProy, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertarBoton)
                    .addComponent(eliminarBoton))
                .addGap(116, 116, 116))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ciudadProy, nombreProy});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ciudadProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarBoton)
                    .addComponent(insertarBoton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarBoton)
                    .addComponent(eliminarBoton))
                .addGap(32, 32, 32))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jTabbedPane1.addTab("Gestion de proyectos", jPanel1);

        jLabel5.setText("Codigo del proveedor: ");

        jLabel6.setText("Nombre: ");

        jLabel7.setText("Ciudad: ");

        ciudadProy2.setEditable(false);

        nombreProy2.setEditable(false);
        nombreProy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProy2ActionPerformed(evt);
            }
        });

        anteriorBoton.setText("<<");
        anteriorBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorBotonActionPerformed(evt);
            }
        });

        siguienteBoton.setText(">>");
        siguienteBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBotonActionPerformed(evt);
            }
        });

        primeroBoton.setText("|<<");
        primeroBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primeroBotonActionPerformed(evt);
            }
        });

        ultimoBoton.setText(">>|");
        ultimoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ultimoBotonActionPerformed(evt);
            }
        });

        numero.setText("1/2");

        codigoProy2.setEditable(false);
        codigoProy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProy2ActionPerformed(evt);
            }
        });

        eliminarBoton2.setText("Eliminar");
        eliminarBoton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBoton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(numero))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(53, 53, 53)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(codigoProy2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(anteriorBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(primeroBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(12, 12, 12)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ciudadProy2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(eliminarBoton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(siguienteBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ultimoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(nombreProy2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nombreProy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ciudadProy2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numero)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(primeroBoton)
                            .addComponent(ultimoBoton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siguienteBoton)
                            .addComponent(anteriorBoton))
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(eliminarBoton2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Listado de proyectos", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProyActionPerformed

    private void insertarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBotonActionPerformed
        if (!codProy.getText().equals("") && !nombreProy.getText().equals("") && !ciudadProy.getText().equals("")) {
            ProyectosEntity proyectos = new ProyectosEntity();
            proyectos.setCodigo(codProy.getText().toUpperCase());
            proyectos.setNombre(nombreProy.getText());
            proyectos.setCiudad(ciudadProy.getText());
            switch (acciones.anadirProyecto(proyectos)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Se ha insertado el nuevo proveedor correctamente >>");
                    break;
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< Error al insertar proveedor >>", "Error de insercion", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< Proveedor existente con ese codigo >>", "Codigo existente", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Faltan datos para insertar >>", "Faltan datos", JOptionPane.ERROR_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_insertarBotonActionPerformed

    private void modificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBotonActionPerformed
        ProyectosEntity proyectos = new ProyectosEntity();
        if (!codProy.getText().equals("")) {
            proyectos.setCodigo(codProy.getText());
            proyectos.setNombre(nombreProy.getText());
            proyectos.setCiudad(ciudadProy.getText());
            switch (acciones.actualizarProyecto(proyectos)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Actualizado correctamente >>");
                    break;
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< No se ha encontrado proveedor >>", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< Error al actualizar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Introduce un codigo para modificar un proyecto >>", "Falta de codigo", JOptionPane.WARNING_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_modificarBotonActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_limpiarBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        ProyectosEntity proyectos = new ProyectosEntity();
        if (!codProy.getText().equals("")) {
            int opcion = JOptionPane.showConfirmDialog(this, "<< ¿Estas seguro de eliminar? >>", "Borrado", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                proyectos.setCodigo(codProy.getText());
                switch (acciones.eliminarProyecto(proyectos)) {
                    case 0 :
                        JOptionPane.showMessageDialog(this, "<< Se ha eliminado el proyecto correctamente >>");
                        break;
                    case 1 :
                        JOptionPane.showMessageDialog(this, "<< No hay proyecto con el codigo intoducido", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                        break;
                    case 2 :
                        JOptionPane.showMessageDialog(this, "<< Error al eliminar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(this, "<< Se ha cancelado la accion >>", "Cancelacion de accion", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Falta codigo para eliminar un proyecto >>", "Codigo vacio", JOptionPane.WARNING_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void limpiarDatos() {
        nombreProy.setText("");
        ciudadProy.setText("");
        codProy.setText("");
    }

    private void nombreProy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProy2ActionPerformed

    private void anteriorBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorBotonActionPerformed
        if (contador > 0 ){
            contador--;
            cargarProyecto(contador);
        }
    }//GEN-LAST:event_anteriorBotonActionPerformed

    private void siguienteBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBotonActionPerformed
        if (contador < (listaProyectos.size() - 1) ){
            contador++;
            cargarProyecto(contador);
        }
    }//GEN-LAST:event_siguienteBotonActionPerformed

    private void primeroBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primeroBotonActionPerformed
        contador = 0;
        cargarProyecto(contador);
    }//GEN-LAST:event_primeroBotonActionPerformed

    private void ultimoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ultimoBotonActionPerformed
        contador = listaProyectos.size() - 1;
        cargarProyecto(contador);
    }//GEN-LAST:event_ultimoBotonActionPerformed

    private void codProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProyActionPerformed

    private void codigoProy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProy2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProy2ActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        cargarDatos();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void eliminarBoton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBoton2ActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this, "<< ¿Estas seguro de eliminar? >>", "Confirmacion de borrado", JOptionPane.YES_NO_OPTION);
        if (opcion == 0){
            ProveedoresEntity p = new ProveedoresEntity();
            p.setCodigo(listaProyectos.get(contador).getCodigo());
            switch (acciones.eliminarProveedor(p)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Se ha eliminado correctamente >>");
                    cargarDatos();
                    break;
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< No se ha encontrado nada >>", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                    break;
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< Error al eliminar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Se ha cancelado la accion >>");
        }
    }//GEN-LAST:event_eliminarBoton2ActionPerformed

    private void cargarDatos() {
        listaProyectos = acciones.mostrarProyectos();
        contador = 0;
        cargarProyecto(contador);
    }

    private void cargarProyecto(int contador) {
        if (!listaProyectos.isEmpty()) {
            numero.setText(contador + 1 + "////" + listaProyectos.size());
            codigoProy2.setText(listaProyectos.get(contador).getCodigo());
            nombreProy2.setText(listaProyectos.get(contador).getNombre());
            ciudadProy2.setText(listaProyectos.get(contador).getCiudad());
        }
    }

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
            java.util.logging.Logger.getLogger(GestionListadoDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionListadoDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionListadoDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionListadoDeProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GestionListadoDeProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anteriorBoton;
    private javax.swing.JTextField ciudadProy;
    private javax.swing.JTextField ciudadProy2;
    private javax.swing.JTextField codProy;
    private javax.swing.JTextField codigoProy2;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton eliminarBoton2;
    private javax.swing.JButton insertarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JButton modificarBoton;
    private javax.swing.JTextField nombreProy;
    private javax.swing.JTextField nombreProy2;
    private javax.swing.JLabel numero;
    private javax.swing.JButton primeroBoton;
    private javax.swing.JButton siguienteBoton;
    private javax.swing.JButton ultimoBoton;
    // End of variables declaration//GEN-END:variables
}
