package vista;

//import Imagenes.fondovistas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Creado por Fernando Tobar 9959-19-930
/**
 *
 * @author Tobar Arèvalo
 */
public class ModificacionesNomE extends javax.swing.JInternalFrame {
    String cod;
    /**
     * Creates new form ModEmpleados
     */
    public ModificacionesNomE() {
        initComponents();
        //jPanel1.setBorder(new fondovistas());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ESTADO = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_codigo = new javax.swing.JTextField();
        txt_fechaI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_fechaF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setVisible(true);

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jButton2.setText("CANCELAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jButton3.setText("CONFIRMAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel1.setText("Codigo:");

        txt_fechaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fechaIActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel2.setText("Fecha I.");

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 12)); // NOI18N
        jLabel3.setText("Fecha F.");

        jLabel6.setFont(new java.awt.Font("Javanese Text", 1, 20)); // NOI18N
        jLabel6.setText("Modificaciones NominaE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txt_fechaF, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jButton2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(56, 56, 56))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(172, 172, 172)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(ESTADO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ESTADO))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:  
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sin", "root", "");//Conecta con la base de datos sin
            PreparedStatement pst = cn.prepareStatement("select * from nominaE where codigo_nomina = ?");//Busca la variable puesto en la tabla de la base de datos
            pst.setString(1, txt_codigo.getText().trim());
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){//Captura las variables string y las convertimos a txt
                txt_fechaI.setText(rs.getString("fecha_inicial_nomina"));
                txt_fechaF.setText(rs.getString("fecha_final_nomina"));
                cod=txt_codigo.getText();
            } else {
                JOptionPane.showMessageDialog(null, "Puesto no registrado.");//Si no lo encuentra envia un mensaje de erros
            txt_codigo.setText("");
            }
            
        }catch (Exception e){
            System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             try {
            String ID = txt_codigo.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sin", "root", "");
            PreparedStatement pst = cn.prepareStatement("update nominaE set fecha_inicial_nomina = ?, fecha_final_nomina = ? where codigo_nomina=?");//Aqui especificamos que vamos a actualizar la base de datos
          
            pst.setString(1, txt_fechaI.getText().trim());
            pst.setString(2, txt_fechaF.getText().trim());
            pst.setString(3, cod.trim());
            pst.executeUpdate();
            txt_codigo.setText("");
            txt_fechaI.setText("");
            txt_fechaF.setText("");
            ESTADO.setText("Modificación exitosa.");//CONFIRMACION DE QUE SE REALIZO CON EXITO LA ACTUALIZACION
            ESTADO.setText("");
            
        } catch (Exception e) {
             System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            try {
            String ID = txt_codigo.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/sin", "root", "");
            PreparedStatement pst = cn.prepareStatement("update nominaE set fecha_inicial_nomina = ?, fecha_final_nomina = ? where codigo_nomina=?");//Aqui especificamos que vamos a actualizar la base de datos
          
            pst.setString(1, txt_fechaI.getText().trim());
            pst.setString(2, txt_fechaF.getText().trim());
            pst.setString(3, cod.trim());
            pst.executeUpdate();
            txt_codigo.setText("");
            txt_fechaI.setText("");
            txt_fechaF.setText("");
            ESTADO.setText("Modificación exitosa.");//CONFIRMACION DE QUE SE REALIZO CON EXITO LA ACTUALIZACION
            ESTADO.setText("");
            
        } catch (Exception e) {
             System.out.print(e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_fechaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fechaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechaIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ESTADO;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_codigo;
    private javax.swing.JTextField txt_fechaF;
    private javax.swing.JTextField txt_fechaI;
    // End of variables declaration//GEN-END:variables
}
