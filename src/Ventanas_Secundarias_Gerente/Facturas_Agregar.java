/*
Descripción: PROYECTO FINAL
Fecha: AGOSTO 2022
Equipo:
*Aguilar Brun Mario
*Lizárraga Moreno Ricardo
*Lopez Mora Alan Ignacio
*Meza Borrego Juan Manuel
*Pérez Pérez Joshua Mizraim
*Toledo Becerra Gustavo

 */
package Ventanas_Secundarias_Gerente;

import Metodos_SQL.IniciarSesion_BD;
import Ventana_Principales.Clientes;
import Ventana_Principales.Empleados;
import Ventana_Principales.Facturas;
import Ventana_Principales.Productos;
import static Ventana_Principales.Ventana_Admin.Contenido;
import static Ventana_Principales.Ventana_Gerente.Contenido_Gerente;
import Ventana_Principales_Gerente.Facturas_Gerente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author juani
 */
public class Facturas_Agregar extends javax.swing.JPanel {
    IniciarSesion_BD bd = new IniciarSesion_BD();
   //Metodo para optener la fecha actual
    public String FechaActual2(){
        Date fecha = new Date();
        SimpleDateFormat FechaActual = new SimpleDateFormat("YYYY-MM-dd");
        
        return FechaActual.format(fecha);
    
    }
    public Facturas_Agregar() {
        initComponents();
        Fecha_txt.setText(FechaActual2());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Regresar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        Fecha_txt = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        Domicilio = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        Pago_txt = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Agregar Facturas");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel10)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Regresar.setBackground(new java.awt.Color(19, 90, 173));
        Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RegresarMousePressed(evt);
            }
        });
        Regresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Regresar");
        Regresar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 200, 50));

        Agregar.setBackground(new java.awt.Color(19, 90, 173));
        Agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AgregarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AgregarMousePressed(evt);
            }
        });
        Agregar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Generar Factura");
        Agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 200, 50));

        Nombre.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Nombre.setForeground(new java.awt.Color(13, 71, 171));
        Nombre.setText("ID Pedido:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        id_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        id_txt.setForeground(new java.awt.Color(204, 204, 204));
        id_txt.setText("Ingrese el ID del Pedido");
        id_txt.setBorder(null);
        id_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                id_txtMousePressed(evt);
            }
        });
        id_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_txtActionPerformed(evt);
            }
        });
        id_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_txtKeyTyped(evt);
            }
        });
        jPanel1.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 490, -1));

        Fecha_txt.setEditable(false);
        Fecha_txt.setBackground(new java.awt.Color(255, 255, 255));
        Fecha_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Fecha_txt.setText("Ingrese La Fecha");
        Fecha_txt.setBorder(null);
        Fecha_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Fecha_txtMousePressed(evt);
            }
        });
        Fecha_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fecha_txtActionPerformed(evt);
            }
        });
        Fecha_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Fecha_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Fecha_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 490, -1));

        Apellido.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Apellido.setForeground(new java.awt.Color(13, 71, 171));
        Apellido.setText("Fecha de la Factura:");
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        Domicilio.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Domicilio.setForeground(new java.awt.Color(13, 71, 171));
        Domicilio.setText("Metodo De Pago:");
        jPanel1.add(Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        id.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        id.setForeground(new java.awt.Color(13, 71, 171));
        id.setText("ID Factura:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 120, -1));

        ID_txt.setEditable(false);
        ID_txt.setBackground(new java.awt.Color(204, 204, 204));
        ID_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        ID_txt.setBorder(null);
        jPanel1.add(ID_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 260, 210, -1));

        jSeparator2.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 540, 10));

        jSeparator3.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 210, 10));

        jSeparator4.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 460, 10));

        jSeparator5.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 490, 10));

        Pago_txt.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Pago_txt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TARJETA", "EFECTIVO", " " }));
        jPanel1.add(Pago_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 130, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseEntered
        setColor(Agregar);
    }//GEN-LAST:event_AgregarMouseEntered

    private void AgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseExited
       resetColor(Agregar);
    }//GEN-LAST:event_AgregarMouseExited

    private void RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseEntered
        setColor(Regresar);
    }//GEN-LAST:event_RegresarMouseEntered

    private void RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseExited
        resetColor(Regresar);
    }//GEN-LAST:event_RegresarMouseExited

    private void RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMousePressed
        /////REGRESAR A LA SECCION/////
        Facturas_Gerente p = new Facturas_Gerente();
        p.setSize(860, 560);
        p.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(p, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_RegresarMousePressed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void id_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMousePressed

        //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(id_txt.getText().equals("Ingrese el ID del Pedido"))
        id_txt.setText("");
        id_txt.setForeground(Color.black); 
        
        if(String.valueOf(Fecha_txt.getText()).isEmpty()){
        Fecha_txt.setText("Ingrese La Fecha");
        Fecha_txt.setForeground(new Color(204,204,204));
        }
        
        
        
    }//GEN-LAST:event_id_txtMousePressed

    private void Fecha_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Fecha_txtMousePressed
        //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(Fecha_txt.getText().equals("Ingrese La Fecha"))
        Fecha_txt.setText("");
        Fecha_txt.setForeground(Color.black); 
        
        if(String.valueOf(id_txt.getText()).isEmpty()){
        id_txt.setText("Ingrese el ID del Pedido");
        id_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_Fecha_txtMousePressed

    private void Fecha_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fecha_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Fecha_txtActionPerformed

    private void id_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyTyped
        //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(id_txt.getText().equals("Ingrese el ID del Pedido"))
        id_txt.setText("");
        id_txt.setForeground(Color.black); 
        
        if(String.valueOf(Fecha_txt.getText()).isEmpty()){
        Fecha_txt.setText("Ingrese La Fecha");
        Fecha_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_id_txtKeyTyped

    private void Fecha_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Fecha_txtKeyTyped
        //Metodo Cuando Cambiamos de Campo no pierda la estructura 
        if(Fecha_txt.getText().equals("Ingrese La Fecha"))
        Fecha_txt.setText("");
        Fecha_txt.setForeground(Color.black); 
        
        if(String.valueOf(id_txt.getText()).isEmpty()){
        id_txt.setText("Ingrese el ID del Pedido");
        id_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_Fecha_txtKeyTyped

    private void AgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMousePressed
         //Metodo para agregar una Factura
        if(bd.existePedido(id_txt.getText())==0){
            JOptionPane.showMessageDialog(null, "Por Favor verifique el ID del pedido no existe en la base de datos");
        }
        else{
        
        IniciarSesion_BD Facturas = new IniciarSesion_BD();
        String idPedido = id_txt.getText();
        String Fecha = Fecha_txt.getText();
        String MetodoPago = Pago_txt.getSelectedItem().toString();
       
        if(idPedido.equals("")||idPedido.equals("Ingrese el ID del Pedido")){
           JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
           id_txt.setText("Ingrese el ID del Pedido");
           id_txt.setForeground(new Color(203,203,203));
        }
        else{
            Facturas.AgregarFactura(idPedido,Fecha,MetodoPago);
            JOptionPane.showMessageDialog(this, "Los datos de la Factura  fueron Guardados Correctamente");
            id_txt.setText("Ingrese el ID del Pedido");
            id_txt.setForeground(new Color(203,203,203));
           
        }
      }
    }//GEN-LAST:event_AgregarMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JLabel Apellido;
    private javax.swing.JLabel Domicilio;
    private javax.swing.JTextField Fecha_txt;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JLabel Nombre;
    private javax.swing.JComboBox<String> Pago_txt;
    private javax.swing.JPanel Regresar;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(21,101,192));
    }

    private void resetColor(JPanel panel) {
         panel.setBackground(new Color(18,90,173));
    }
}
