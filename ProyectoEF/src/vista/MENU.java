/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

// import Imagenes.imagendefondo;
import modelo.Usuarios;

/**
 *
 */
public class MENU extends javax.swing.JFrame {

    Usuarios mod;
   // private BajasEmpleados formBajasEmpleado;
    // private ModificacionesPuesto formModPuesto;
    // private Mostrar mostrarN;
    private AltasPuesto formAltasPuesto;
    private AltasDepartamento formAltasDepartamento;
    private AltasConcepto formAltasConcepto;
    private AltasNominaE formAltasNominaE;
    private ModificacionesPuesto formModPuesto;
    // private ChequesEmpleados formChequesEmpleados;
    // private buscar BuscarE;

    public MENU() {
        initComponents();
    }

    MENU(Usuarios mod) {
        initComponents();
        //jDesktopPane1.setBorder(new imagendefondo());
        this.setExtendedState(MENU.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        this.mod = mod;

         if (mod.getIdTipo() == 1) {
            MANTENIMIENTO.setVisible(true);
            FUNCIONES.setVisible(false);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
         if (mod.getIdTipo() == 2) {
            MANTENIMIENTO.setVisible(false);
            FUNCIONES.setVisible(true);
            jMenuItem5.setVisible(true);
            jMenuItem6.setVisible(false);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
          if (mod.getIdTipo() == 3) {
            MANTENIMIENTO.setVisible(false);
            FUNCIONES.setVisible(true);
            jMenuItem5.setVisible(false);
            jMenuItem6.setVisible(true);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
           if (mod.getIdTipo() < 1||mod.getIdTipo() > 3){
            MANTENIMIENTO.setVisible(false);
            FUNCIONES.setVisible(false);
            SALIR.setVisible(true);
            AYUDA.setVisible(true);
            HERRAMIENTAS.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        FuncionUsuarioMantenimiento = new javax.swing.JMenuBar();
        MANTENIMIENTO = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        FUNCIONES = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        AYUDA = new javax.swing.JMenu();
        HERRAMIENTAS = new javax.swing.JMenu();
        SALIR = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
        );

        MANTENIMIENTO.setText("ALTAS");

        jMenuItem1.setText("Altas de puesto");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem1);

        jMenuItem8.setText("Altas de Departamento");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem8);

        jMenuItem9.setText("Altas de Concepto");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem9);

        jMenuItem10.setText("Altas de NominaE");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        MANTENIMIENTO.add(jMenuItem10);

        FuncionUsuarioMantenimiento.add(MANTENIMIENTO);

        jMenu2.setText("MODIFICACIONES");

        jMenuItem11.setText("Modificaciones de Puesto");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setText("Modificaciones de Departamento");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setText("Modificaciones de Concepto");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuItem14.setText("Modificaciones de NominaE");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        FuncionUsuarioMantenimiento.add(jMenu2);

        FUNCIONES.setText("FUNCIONES");

        jMenuItem5.setText("Cheque Empleado");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        FUNCIONES.add(jMenuItem5);

        jMenuItem6.setText("Mostrar Nomina");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        FUNCIONES.add(jMenuItem6);

        FuncionUsuarioMantenimiento.add(FUNCIONES);

        AYUDA.setText("AYUDA");
        FuncionUsuarioMantenimiento.add(AYUDA);

        HERRAMIENTAS.setText("HERRAMIENTAS");
        FuncionUsuarioMantenimiento.add(HERRAMIENTAS);

        SALIR.setText("SALIR");

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        SALIR.add(jMenuItem4);

        FuncionUsuarioMantenimiento.add(SALIR);

        setJMenuBar(FuncionUsuarioMantenimiento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        dispose();//Codigo  para  salir del Programa
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       // formChequesEmpleados = new ChequesEmpleados();
        // jDesktopPane1.add(formChequesEmpleados);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
         //mostrarN = new Mostrar();
         //jDesktopPane1.add(mostrarN);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        formAltasPuesto = new AltasPuesto();
        jDesktopPane1.add(formAltasPuesto);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        formAltasDepartamento = new AltasDepartamento();
        jDesktopPane1.add(formAltasDepartamento);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        formAltasConcepto = new AltasConcepto();
        jDesktopPane1.add(formAltasConcepto);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        formAltasNominaE = new AltasNominaE();
        jDesktopPane1.add(formAltasNominaE);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        formModPuesto = new ModificacionesPuesto();
        jDesktopPane1.add(formModPuesto);
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem14ActionPerformed

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
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AYUDA;
    private javax.swing.JMenu FUNCIONES;
    private javax.swing.JMenuBar FuncionUsuarioMantenimiento;
    private javax.swing.JMenu HERRAMIENTAS;
    private javax.swing.JMenu MANTENIMIENTO;
    private javax.swing.JMenu SALIR;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}
