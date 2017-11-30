/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import dao.database.VehiculoDaoJdbc;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import models.Vehiculo;

/**
 * Form que nos ayuda a borrar Vehiculos.
 *
 * @author melissa
 * @since 20/11/2017
 * @version 2.0
 *
 */
public class FrmborrarVehiculo extends javax.swing.JFrame {

    /**
     * Crea un nuevo frame FrmborrarVehiculo.
     */
    public FrmborrarVehiculo() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
        frm_renta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        btn_borrarVehiculo = new javax.swing.JButton();
        btn_BVehiculo1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        frm_vehiculos = new javax.swing.JTable();

        frm_renta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Direccion", "Email", "Celular", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        frm_renta.setOpaque(false);
        jScrollPane1.setViewportView(frm_renta);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Borrar Vehiculo");

        jLabel2.setText("Id Del Vehiculo:");

        btn_borrarVehiculo.setBackground(new java.awt.Color(255, 255, 255));
        btn_borrarVehiculo.setText("Borrar");
        btn_borrarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarVehiculoActionPerformed(evt);
            }
        });

        btn_BVehiculo1.setBackground(new java.awt.Color(255, 255, 255));
        btn_BVehiculo1.setText("Busca Vehiculo");
        btn_BVehiculo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BVehiculo1ActionPerformed(evt);
            }
        });

        frm_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Marca", "Modelo", "Color", "Precio", "No. Serie"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        frm_vehiculos.setOpaque(false);
        jScrollPane2.setViewportView(frm_vehiculos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_borrarVehiculo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btn_BVehiculo1))
                        .addComponent(jLabel1)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_BVehiculo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_borrarVehiculo)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarVehiculoActionPerformed

        /**
         * Metodo que nos permite borrar un vehiculo de la base de datos, invocando el
         * metodo de Delete del VehiculoDaoJdbc.
         */
        DefaultTableModel v = (DefaultTableModel) frm_vehiculos.getModel();
        String id = (String) v.getValueAt(0, 0).toString();

        VehiculoDaoJdbc vehiculoEliminado = new VehiculoDaoJdbc();
        vehiculoEliminado.Delete(Integer.parseInt(id));

        v.removeRow(0);

    }//GEN-LAST:event_btn_borrarVehiculoActionPerformed

    private void btn_BVehiculo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BVehiculo1ActionPerformed

        /**
         * Metodo que nos permite buscar un vehiculo por medio del id para asi mostrarlo en
         * una tabla, invocando el metodo de findById del VehiculoDaoJdbc.
         */
        Integer id = Integer.parseInt(txt_id.getText());
        VehiculoDaoJdbc buscar = new VehiculoDaoJdbc();
        Vehiculo vehiculo = buscar.findByID(id);
        DefaultTableModel venta = (DefaultTableModel) frm_vehiculos.getModel();

        Object[] row = {vehiculo.getId(), vehiculo.getMarca(), vehiculo.getModelo(),
            vehiculo.getColor(), vehiculo.getPrecio(), vehiculo.getNumeroSerie()};

        venta.addRow(row);

    }//GEN-LAST:event_btn_BVehiculo1ActionPerformed

    /**
     * Metodo main de la clase.
     *
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
            java.util.logging.Logger.getLogger(FrmborrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmborrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmborrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmborrarVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmborrarVehiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BVehiculo1;
    private javax.swing.JButton btn_borrarVehiculo;
    static javax.swing.JTable frm_renta;
    static javax.swing.JTable frm_vehiculos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTextField txt_id;
    // End of variables declaration//GEN-END:variables
}
