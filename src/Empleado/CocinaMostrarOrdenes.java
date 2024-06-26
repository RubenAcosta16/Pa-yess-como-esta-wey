/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import ArrayLists.CocinaArrayList;
import ArrayLists.OrdenArrayList;
import ArrayLists.PlatillosArrayList;
import ArrayLists.ReservacionArrayList;
import ClasesArrayList.Cocina;
import ClasesArrayList.Orden;
import ClasesArrayList.Platillo;
import Empleado.*;
import Empleado.Editar.Crear_Platillo;
import Empleado.Editar.Crear_Platillo;
import Empleado.Editar.Editar_Platillo;
import Empleado.Editar.Editar_Platillo;
import java.util.List;

/**
 *
 * @author ACER A314
 */
public class CocinaMostrarOrdenes extends javax.swing.JFrame {

    /**
     * Creates new form Cocina
     */
    public CocinaMostrarOrdenes() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnCrearPlatillo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        textIdCocina = new Otros.FocoBtn();
        textidOrden = new Otros.FocoBtn();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(163, 147, 253));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Lucida Sans Typewriter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(67, 56, 117));
        jLabel1.setText("COCINA");
        jPanel2.add(jLabel1);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(181, 154, 200));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        jButton2.setText("<------");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setBackground(new java.awt.Color(193, 204, 229));

        btnCrearPlatillo.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N
        btnCrearPlatillo.setText("Esta listo");
        btnCrearPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPlatilloActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Pedido", "Descripcion", "Estado en cocina", "Revisado por"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        textIdCocina.setText("idCocina");
        textIdCocina.setCambiarColor(true);
        textIdCocina.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        textidOrden.setText("idOrden");
        textidOrden.setCambiarColor(true);
        textidOrden.setFont(new java.awt.Font("Franklin Gothic Heavy", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearPlatillo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textidOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textIdCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(textIdCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(textidOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearPlatillo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPlatilloActionPerformed

        CocinaArrayList cocinas = new CocinaArrayList();

        try {
            int idCocinaInt = Integer.parseInt(textIdCocina.getText());
            int idOrdenInt = Integer.parseInt(textIdCocina.getText());
            List<Cocina> cocinaBuscadas = cocinas.buscarCocinaPorId(idCocinaInt);

            for (Cocina cocinaBuscada : cocinaBuscadas) {
                cocinas.actualizarCocina(idCocinaInt, idOrdenInt, cocinaBuscada.getIdOrden(), "Listo", cocinaBuscada.getRevision());

            }
        } catch (NumberFormatException e) {
            // Maneja la situación donde el string no puede ser convertido a int.
            System.out.println("El string no es un número válido: " + e.getMessage());
        }

    }//GEN-LAST:event_btnCrearPlatilloActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Administracion backP = new Administracion();
        backP.setVisible(true);
        backP.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CocinaMostrarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CocinaMostrarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CocinaMostrarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CocinaMostrarOrdenes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CocinaMostrarOrdenes().setVisible(true);

//                CocinaArrayList cocinas = new CocinaArrayList();
//                PlatillosArrayList platillos = new PlatillosArrayList();
//                OrdenArrayList ordenes = new OrdenArrayList();
//
//                System.out.println("imp cocina todo");
//                List<Cocina> cocinaCargada = cocinas.getTodasLasCocinas();
//                System.out.println("Todos los ordnees cargados:");
//                for (Cocina cocina : cocinaCargada) {
//                    System.out.println(cocina);
//
//                    System.out.println("imp ordenes de la cocina");
//                    List<List<Orden>> ordenesDeLaCocina = cocinas.getOrdenesParaLaCocina(cocina.getIdCocina());
//                    for (List<Orden> ordenesObtenidas : ordenesDeLaCocina) {
//
//                        //obviamente esta idOrden debe estar dentro de las ordenes de la cocina
//                        int idOrdenDeLaQueQuieroPlatillos = 1;
//                        int contadorYaPaso = 0;
//
//                        for (Orden orden : ordenesObtenidas) {
//                            System.out.println(orden.toString());
//                            System.out.println("");
//                            System.out.println("");
//                            System.out.println("");
//                            System.out.println("");
////                
//                            //---------------------ya si quieres obtener los platillos copiar y pegar el ejemplo 
//                            //---------------------del orden de arriba o usa esto we
//                            if (idOrdenDeLaQueQuieroPlatillos == orden.getIdOrden() && contadorYaPaso == 0) {
//                                contadorYaPaso++;
////                     idPlatillosOrdenes=orden.getIdOrden();
//
//                                System.out.println("imp platiloos de la orden " + idOrdenDeLaQueQuieroPlatillos);
//                                List<Platillo> platillosDeLaOrdenCargados = ordenes.getPlatillosDeLaOrden(idOrdenDeLaQueQuieroPlatillos);
////                  System.out.println(platillosDeLaOrdenCargados);
//                                for (Platillo platillo : platillosDeLaOrdenCargados) {
//                                    System.out.println(platillo.toString());
//                                }
//                            }
//
//                        }
//                    }
//                }
//
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearPlatillo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private Otros.FocoBtn textIdCocina;
    private Otros.FocoBtn textidOrden;
    // End of variables declaration//GEN-END:variables
}
