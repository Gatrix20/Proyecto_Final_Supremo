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

import Metodos_SQL.Conexion_SQL;
import Ventana_Principales.Empleados;
import Ventana_Principales.Facturas;
import Ventana_Principales.Pedidos;
import Ventana_Principales.Productos;
import Ventana_Principales.Ventana_Admin;
import static Ventana_Principales.Ventana_Admin.Contenido;
import static Ventana_Principales.Ventana_Gerente.Contenido_Gerente;
import Ventana_Principales_Gerente.Facturas_Gerente;
import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;



public class Facturas_Registrados extends javax.swing.JPanel {

   
    public Facturas_Registrados() {
        initComponents();
        
        //Mostrar Facturas_Gerente Registradas 
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            Facts.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT * FROM facturas";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID Factura");
            modelo.addColumn("ID Pedido");
            modelo.addColumn("Fecha Factura");
            modelo.addColumn("Metodo de Pago");
            
            
            
            
            
            
            while(rs.next()){
                
                Object[] filas = new Object[cantidadColumnas];
                for (int i=0; i< cantidadColumnas; i++){
                    filas[i] = rs.getObject(i+1);
                }
                modelo.addRow(filas);
            }
            
        }catch (SQLException ex){
            System.err.println(ex.toString());
            
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Regresar = new javax.swing.JPanel();
        lblRegresar = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Facts = new javax.swing.JTable();
        total_panel = new javax.swing.JPanel();
        tot_f = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        id_txt = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Facturas Registradas");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel10)
                .addContainerGap(253, Short.MAX_VALUE))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel10)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        lblRegresar.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        lblRegresar.setForeground(new java.awt.Color(255, 255, 255));
        lblRegresar.setText("Regresar");
        Regresar.add(lblRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 160, 50));

        lblNombre.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(13, 71, 171));
        lblNombre.setText("Facturas");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Facts.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        Facts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Factura", "ID Pedido", "Fecha Factura", "Metodo De Pago"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Facts.setSelectionBackground(new java.awt.Color(0, 102, 255));
        Facts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FactsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Facts);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 810, 290));

        total_panel.setBackground(new java.awt.Color(19, 90, 173));

        tot_f.setFont(new java.awt.Font("Roboto", 1, 40)); // NOI18N
        tot_f.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout total_panelLayout = new javax.swing.GroupLayout(total_panel);
        total_panel.setLayout(total_panelLayout);
        total_panelLayout.setHorizontalGroup(
            total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, total_panelLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(tot_f, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        total_panelLayout.setVerticalGroup(
            total_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tot_f, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(total_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 180, 50));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setText("TOTAL A PAGAR:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(19, 90, 173));
        jLabel3.setText("ID Pedido:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(19, 90, 173));
        jSeparator1.setForeground(new java.awt.Color(19, 90, 173));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 430, 80, 20));

        id_txt.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jPanel2.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, 80, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMousePressed
       /////REGRESAR A LA SECCION/////
        Facturas_Gerente p1 = new Facturas_Gerente();
        p1.setSize(860, 560);
        p1.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(p1, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_RegresarMousePressed

    private void RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseExited
        resetColor(Regresar);
    }//GEN-LAST:event_RegresarMouseExited

    private void RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseEntered
        setColor(Regresar);
    }//GEN-LAST:event_RegresarMouseEntered

    private void FactsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FactsMouseClicked
        //Insertar los datos de la fila 
        int fila = Facts.rowAtPoint(evt.getPoint());
        id_txt.setText(Facts.getValueAt(fila, 1).toString());
            
            // METODO PARA EJECUTAR LA CONSULTA Y NOS ARROJE EL TOTAL DEL PEDIDO
            String id=id_txt.getText();
            //String url="select Usuario,Contrasena,Privilegio from empleados where Usuario='"+user+"' ";
            String Url="SELECT SUM(Precio * Cantidad) as 'TOTAL' FROM orden where idPedido='"+id+"' ";
            try {
                
                Connection con = Conexion_SQL.getConnection();
                PreparedStatement ps = con.prepareStatement(Url);
                ResultSet rs = ps.executeQuery();
                
                if(rs.next()){
                    String tot = rs.getString(1);
                    tot_f.setText(tot+"$");
                }
                
                
                
                
                
                
         } catch (SQLException ex) {
                System.out.println(ex.toString());
         }
        
    }//GEN-LAST:event_FactsMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Facts;
    private javax.swing.JPanel Regresar;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel id_txt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblRegresar;
    private javax.swing.JLabel tot_f;
    private javax.swing.JPanel total_panel;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
       panel.setBackground(new Color(21,101,192));
    }

    private void resetColor(JPanel panel) {
         panel.setBackground(new Color(18,90,173));
    }
}
