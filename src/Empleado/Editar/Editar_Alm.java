/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado.Editar;

import Empleado.Editar.*;
import ArrayLists.IngredientesArrayList;
import ClasesArrayList.Ingrediente;
import Empleado.Almacen;
import Empleado.Platillos;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER A314
 */
public class Editar_Alm extends javax.swing.JFrame {

    /**
     * Creates new form Editar_Alm
     */
    public Editar_Alm() {
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

        focoBtn8 = new Otros.FocoBtn();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        btnCargar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        textIdIngrediente = new Otros.FocoBtn();
        jPanel4 = new javax.swing.JPanel();
        textCantidad = new Otros.FocoBtn();
        textNombre = new Otros.FocoBtn();
        textProveedor = new Otros.FocoBtn();
        textUnidadMedida = new Otros.FocoBtn();
        textPrecioUnidad = new Otros.FocoBtn();
        textPuntoReorden = new Otros.FocoBtn();
        jLabel2 = new javax.swing.JLabel();

        focoBtn8.setText("Punto de reorden");
        focoBtn8.setCambiarColor(true);
        focoBtn8.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(163, 147, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setBackground(new java.awt.Color(67, 56, 117));
        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(67, 56, 117));
        jLabel1.setText("Almacen");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(181, 154, 200));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setPreferredSize(new java.awt.Dimension(124, 515));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jButton4.setText("<------");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        btnCargar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });
        jPanel3.add(btnCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, -1));

        btnActualizar.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel3.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 110, -1));

        textIdIngrediente.setText("id");
        textIdIngrediente.setCambiarColor(true);
        textIdIngrediente.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jPanel3.add(textIdIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 100, -1));

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_END);

        jPanel4.setBackground(new java.awt.Color(193, 204, 229));

        textCantidad.setText("Cantidades");
        textCantidad.setCambiarColor(true);
        textCantidad.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        textNombre.setText("Ingrediente");
        textNombre.setCambiarColor(true);
        textNombre.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        textProveedor.setText("Proveedor");
        textProveedor.setCambiarColor(true);
        textProveedor.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        textUnidadMedida.setText("Unidad de medida");
        textUnidadMedida.setCambiarColor(true);
        textUnidadMedida.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        textPrecioUnidad.setText("Precio por unidad");
        textPrecioUnidad.setCambiarColor(true);
        textPrecioUnidad.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        textPuntoReorden.setText("Punto de reorden");
        textPuntoReorden.setCambiarColor(true);
        textPuntoReorden.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        jLabel2.setBackground(new java.awt.Color(67, 56, 117));
        jLabel2.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(67, 56, 117));
        jLabel2.setText("Crear Ingrediente");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPuntoReorden, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(jLabel2)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(330, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textPrecioUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textPuntoReorden, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUnidadMedida, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(144, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(textNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(331, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Almacen back = new Almacen();
        back.setVisible(true);
        back.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed

        // TODO add your handling code here:
        IngredientesArrayList ingredientes = new IngredientesArrayList();

        try {
            // Intenta convertir el String a int.
            int idInt = Integer.parseInt(textIdIngrediente.getText());

            Ingrediente ingredienteBuscado = ingredientes.buscarIngrediente(idInt);
            if (ingredienteBuscado == null) {
                JOptionPane.showMessageDialog(null, "Ingrediente no encontrado.");
            } else {
                textNombre.setText(ingredienteBuscado.getNombre());
                textCantidad.setText(ingredienteBuscado.getCantidad() + "");
                textUnidadMedida.setText(ingredienteBuscado.getUnidadTipo());
                textPrecioUnidad.setText(ingredienteBuscado.getPrecio() + "");
                textPuntoReorden.setText(ingredienteBuscado.getPuntoReorden());
                textProveedor.setText(ingredienteBuscado.getProveedor());
            }

//            Platillo platilloBuscado = platillos.buscarPlatillo(idInt); //para actualizar
//            if (platilloBuscado == null) {
//                JOptionPane.showMessageDialog(null, "Platillo no encontrado.");
//            } else {
//                double precioDouble = Double.parseDouble(textPrecio.getText());
//                platillos.actualizarPlatillo(idInt, new Platillo(idInt, textNombre.getText(), precioDouble, "ham.jpg", textDescripcion.getText()));
//            JOptionPane.showMessageDialog(null, "Platillo actualizado.");
//            }
        } catch (NumberFormatException e) {
            // Maneja la situación donde el string no puede ser convertido a int.
            System.out.println("El string no es un número válido: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:

        IngredientesArrayList ingredientes = new IngredientesArrayList();

        try {
            int plId = Integer.parseInt(textIdIngrediente.getText());
            int cantidadInt = Integer.parseInt(textCantidad.getText());
            double precioDouble = Double.parseDouble(textPrecioUnidad.getText());

            ingredientes.actualizarIngrediente(plId,new Ingrediente(plId, textNombre.getText(), textUnidadMedida.getText(), precioDouble, textPuntoReorden.getText(), textProveedor.getText(), cantidadInt));

            JOptionPane.showMessageDialog(null, "Ingrediente añadido.");
        } catch (NumberFormatException e) {
            // Maneja la situación donde el string no puede ser convertido a double.
            System.out.println("El string no es un número válido: " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Editar_Alm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Alm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Alm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Alm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Alm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCargar;
    private Otros.FocoBtn focoBtn8;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private Otros.FocoBtn textCantidad;
    private Otros.FocoBtn textIdIngrediente;
    private Otros.FocoBtn textNombre;
    private Otros.FocoBtn textPrecioUnidad;
    private Otros.FocoBtn textProveedor;
    private Otros.FocoBtn textPuntoReorden;
    private Otros.FocoBtn textUnidadMedida;
    // End of variables declaration//GEN-END:variables
}
