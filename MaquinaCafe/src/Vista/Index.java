/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.*;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author zeusj
 */
public class Index extends javax.swing.JFrame {
    ControladorOrdenes controlador;
  
    /**
     * Creates new form index
     */
    public Index() {
        initComponents();
        inicializarAzucarComboBox();
        this.getContentPane().setBackground(java.awt.Color.getHSBColor(38, 48, 65));
        controlador = MainPrincipal.controlador;
    }

    private void inicializarAzucarComboBox(){
        cucharadasAzucarbox.removeAllItems();
        cucharadasAzucarbox.addItem("0");
        cucharadasAzucarbox.addItem("1");
        cucharadasAzucarbox.addItem("2");
        cucharadasAzucarbox.addItem("3");
        cucharadasAzucarbox.addItem("4");      
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        capuccinobtn = new javax.swing.JButton();
        descafeinadobtn = new javax.swing.JButton();
        negrobtn = new javax.swing.JButton();
        btnDiezPesos = new javax.swing.JButton();
        btnVeintePesos = new javax.swing.JButton();
        btnCincuentaPesos = new javax.swing.JButton();
        txtDineroIntroducido = new javax.swing.JTextField();
        dineroIntroducidolb = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        costoOrdenlb = new javax.swing.JLabel();
        txtCostoOrden = new javax.swing.JTextField();
        btnConfirmar = new javax.swing.JButton();
        cucharadasAzucarbox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        signoPesoslb = new javax.swing.JLabel();
        signoPesoslb2 = new javax.swing.JLabel();
        cafeSeleccionadolb = new javax.swing.JLabel();
        txtCafeSeleccionado = new javax.swing.JTextField();
        btnImprimirReportes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtReporteVentas = new javax.swing.JTextField();
        txtReporteCambio = new javax.swing.JTextField();
        txtReporteIngredientes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 51, 0));
        setFont(new java.awt.Font("Bradley Hand ITC", 0, 18)); // NOI18N
        setForeground(new java.awt.Color(102, 51, 0));

        capuccinobtn.setBackground(new java.awt.Color(165, 136, 85));
        capuccinobtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        capuccinobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/capuccino pequeño.jpg"))); // NOI18N
        capuccinobtn.setText("Capuccino $37");
        capuccinobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capuccinobtnMouseClicked(evt);
            }
        });
        capuccinobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                capuccinobtnActionPerformed(evt);
            }
        });

        descafeinadobtn.setBackground(new java.awt.Color(165, 136, 85));
        descafeinadobtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        descafeinadobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe_descafeinado.jpg"))); // NOI18N
        descafeinadobtn.setText("descafeinado $35");
        descafeinadobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descafeinadobtnMouseClicked(evt);
            }
        });

        negrobtn.setBackground(new java.awt.Color(165, 136, 85));
        negrobtn.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        negrobtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cafe_negro_1.jpg"))); // NOI18N
        negrobtn.setText("negro $33");
        negrobtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                negrobtnMouseClicked(evt);
            }
        });

        btnDiezPesos.setBackground(new java.awt.Color(165, 136, 85));
        btnDiezPesos.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnDiezPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/billete_diez_uruguay.jpg"))); // NOI18N
        btnDiezPesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDiezPesosMouseClicked(evt);
            }
        });

        btnVeintePesos.setBackground(new java.awt.Color(165, 136, 85));
        btnVeintePesos.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnVeintePesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/billete_veinte_uruguay_final.PNG"))); // NOI18N
        btnVeintePesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVeintePesosMouseClicked(evt);
            }
        });

        btnCincuentaPesos.setBackground(new java.awt.Color(165, 136, 85));
        btnCincuentaPesos.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnCincuentaPesos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/billete_cincuenta_uruguay.jpg"))); // NOI18N
        btnCincuentaPesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCincuentaPesosMouseClicked(evt);
            }
        });

        txtDineroIntroducido.setText("0.0");

        dineroIntroducidolb.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        dineroIntroducidolb.setText("Dinero Introducido:");

        btnCancelar.setBackground(new java.awt.Color(165, 136, 85));
        btnCancelar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar Operación");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        costoOrdenlb.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        costoOrdenlb.setText("Ingrese por favor:");

        txtCostoOrden.setText("0.0");

        btnConfirmar.setBackground(new java.awt.Color(165, 136, 85));
        btnConfirmar.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmarMouseClicked(evt);
            }
        });

        cucharadasAzucarbox.setBackground(new java.awt.Color(165, 136, 85));
        cucharadasAzucarbox.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cucharadasAzucarbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cucharadasAzucarbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cucharadasAzucarboxItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        jLabel1.setText("Seleccione la cantidad de cucharadas de azúcar:");

        signoPesoslb.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signoPesoslb.setText("$");

        signoPesoslb2.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        signoPesoslb2.setText("$");

        cafeSeleccionadolb.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        cafeSeleccionadolb.setText("Café seleccionado:");

        btnImprimirReportes.setBackground(new java.awt.Color(165, 136, 85));
        btnImprimirReportes.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnImprimirReportes.setText("Imprimir Reportes");

        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setText("Reportes");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel3.setText("Reporte de productos vendidos:");

        jLabel4.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel4.setText("Reporte de dinero existente para cambio:");

        jLabel5.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel5.setText("Reporte de ingredientes: ");


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReporteVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtReporteCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtReporteIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(capuccinobtn)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descafeinadobtn)
                                    .addComponent(jLabel1))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cucharadasAzucarbox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(negrobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCafeSeleccionado)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(signoPesoslb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtCostoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(dineroIntroducidolb))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(signoPesoslb2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtDineroIntroducido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(cafeSeleccionadolb)
                                        .addComponent(costoOrdenlb)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                        .addComponent(btnConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnImprimirReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnVeintePesos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDiezPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(btnCincuentaPesos, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(descafeinadobtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(capuccinobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(negrobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cucharadasAzucarbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cafeSeleccionadolb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCafeSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(costoOrdenlb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(signoPesoslb)
                                    .addComponent(txtCostoOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dineroIntroducidolb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(signoPesoslb2)
                                    .addComponent(txtDineroIntroducido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnDiezPesos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnVeintePesos)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConfirmar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnImprimirReportes)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCincuentaPesos)))
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtReporteIngredientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(txtReporteVentas)
                    .addComponent(txtReporteCambio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void capuccinobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_capuccinobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_capuccinobtnActionPerformed

    private void cucharadasAzucarboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cucharadasAzucarboxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_cucharadasAzucarboxItemStateChanged

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:

        txtDineroIntroducido.setText("0.0");
        txtCostoOrden.setText("0.0");
        txtCafeSeleccionado.setText("");
    }//GEN-LAST:event_btnCancelarMouseClicked


    private void btnDiezPesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDiezPesosMouseClicked
        // TODO add your handling code here:
        double dineroActual = Double.parseDouble(txtDineroIntroducido.getText());
        txtDineroIntroducido.setText(String.valueOf(dineroActual + 10));
    }//GEN-LAST:event_btnDiezPesosMouseClicked

    private void btnVeintePesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVeintePesosMouseClicked
        // TODO add your handling code here:
        double dineroActual = Double.parseDouble(txtDineroIntroducido.getText());
        txtDineroIntroducido.setText(String.valueOf(dineroActual + 20));
    }//GEN-LAST:event_btnVeintePesosMouseClicked

    private void btnCincuentaPesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCincuentaPesosMouseClicked
        // TODO add your handling code here:
        double dineroActual = Double.parseDouble(txtDineroIntroducido.getText());
        txtDineroIntroducido.setText(String.valueOf(dineroActual + 50));
    }//GEN-LAST:event_btnCincuentaPesosMouseClicked

    private void capuccinobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capuccinobtnMouseClicked
        // TODO add your handling code here:
        txtCostoOrden.setText("37.0");
        txtCafeSeleccionado.setText("capuccino");
    }//GEN-LAST:event_capuccinobtnMouseClicked

    private void descafeinadobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descafeinadobtnMouseClicked
        // TODO add your handling code here:
        txtCostoOrden.setText("35.0");
        txtCafeSeleccionado.setText("descafeinado");
    }//GEN-LAST:event_descafeinadobtnMouseClicked

    private void negrobtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_negrobtnMouseClicked
        // TODO add your handling code here:
        txtCostoOrden.setText("33.0");
        txtCafeSeleccionado.setText("negro");
    }//GEN-LAST:event_negrobtnMouseClicked

    private void btnConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmarMouseClicked
        // TODO add your handling code here:

        double dineroIngresado = Double.parseDouble(txtDineroIntroducido.getText());
        String tipoCafe = txtCafeSeleccionado.getText();
        int cucharadasAzucar = Integer.parseInt(cucharadasAzucarbox.getSelectedItem().toString());
        Orden nuevaOrden = new Orden(dineroIngresado, tipoCafe, cucharadasAzucar);
    }//GEN-LAST:event_btnConfirmarMouseClicked

    private void cafeSeleccionadotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cafeSeleccionadotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cafeSeleccionadotxtActionPerformed

    private void limpiarPantalla(){
        dineroIntroducidotxt.setText("0.0");
        costoOrdentxt.setText("0.0");
        cafeSeleccionadotxt.setText("");
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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCincuentaPesos;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnDiezPesos;
    private javax.swing.JButton btnImprimirReportes;
    private javax.swing.JButton btnVeintePesos;
    private javax.swing.JLabel cafeSeleccionadolb;
    private javax.swing.JButton capuccinobtn;
    private javax.swing.JLabel costoOrdenlb;
    private javax.swing.JComboBox<String> cucharadasAzucarbox;
    private javax.swing.JButton descafeinadobtn;
    private javax.swing.JLabel dineroIntroducidolb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton negrobtn;
    private javax.swing.JLabel signoPesoslb;
    private javax.swing.JLabel signoPesoslb2;
    private javax.swing.JTextField txtCafeSeleccionado;
    private javax.swing.JTextField txtCostoOrden;
    private javax.swing.JTextField txtDineroIntroducido;
    private javax.swing.JTextField txtReporteCambio;
    private javax.swing.JTextField txtReporteIngredientes;
    private javax.swing.JTextField txtReporteVentas;
    // End of variables declaration//GEN-END:variables
}
