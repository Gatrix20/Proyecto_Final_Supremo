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
package Ventanas_Secundarias_Empleados;

import Metodos_SQL.Conexion_SQL;
import Metodos_SQL.IniciarSesion_BD;

import static Ventana_Principales.Ventana_Empleados.Contenido_Empleados;
import Ventana_PrincipalesEmpleados.Productos_Empleados;
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


public class Productos_Actualizar extends javax.swing.JPanel {

    /**
     * Creates new form Empleados_Gerente
     */
    public Productos_Actualizar() {
        initComponents();
        
        //Mostrar Productos_Gerente Registrados
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            Actualizar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT idProductos, Nombre_producto, Descripcion, Precio FROM productos";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID Produto");
            modelo.addColumn("Nombre del Producto");
            modelo.addColumn("Descipcion");
            modelo.addColumn("Precio");
            
            
            
            
            
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

        Titulo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Regresar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Actualizar_pro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Nombre_txt = new javax.swing.JTextField();
        Descripcion_txt = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        Domicilio = new javax.swing.JLabel();
        Precio_txt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Actualizar = new javax.swing.JTable();
        id = new javax.swing.JLabel();
        id_txt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Actualizar Producto");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(jLabel10)
                .addContainerGap(257, Short.MAX_VALUE))
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

        Actualizar_pro.setBackground(new java.awt.Color(19, 90, 173));
        Actualizar_pro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Actualizar_pro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Actualizar_proMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Actualizar_proMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Actualizar_proMousePressed(evt);
            }
        });
        Actualizar_pro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Actualizar Producto");
        Actualizar_pro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(Actualizar_pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 210, 50));

        Nombre.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Nombre.setForeground(new java.awt.Color(13, 71, 171));
        Nombre.setText("Nombre:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        Nombre_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Nombre_txt.setForeground(new java.awt.Color(204, 204, 204));
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setBorder(null);
        Nombre_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Nombre_txtMousePressed(evt);
            }
        });
        Nombre_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nombre_txtActionPerformed(evt);
            }
        });
        Nombre_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Nombre_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Nombre_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 490, -1));

        Descripcion_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Descripcion_txt.setForeground(new java.awt.Color(204, 204, 204));
        Descripcion_txt.setText("Ingrese La Descripcion");
        Descripcion_txt.setBorder(null);
        Descripcion_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Descripcion_txtMousePressed(evt);
            }
        });
        Descripcion_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Descripcion_txtActionPerformed(evt);
            }
        });
        Descripcion_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Descripcion_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Descripcion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 490, -1));

        Apellido.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Apellido.setForeground(new java.awt.Color(13, 71, 171));
        Apellido.setText("Descripcion:");
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        Domicilio.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Domicilio.setForeground(new java.awt.Color(13, 71, 171));
        Domicilio.setText("Precio:");
        jPanel1.add(Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        Precio_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Precio_txt.setForeground(new java.awt.Color(204, 204, 204));
        Precio_txt.setText("Ingrese el Precio");
        Precio_txt.setBorder(null);
        Precio_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Precio_txtMousePressed(evt);
            }
        });
        Precio_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Precio_txtActionPerformed(evt);
            }
        });
        Precio_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Precio_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Precio_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 490, -1));

        jSeparator2.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 490, 10));

        jSeparator4.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 490, 10));

        jSeparator5.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 490, 10));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        jLabel1.setText("$");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 20, 30));

        Actualizar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Actualizar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Productos", "Nombre", "Descripcion", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Actualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ActualizarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Actualizar);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 800, 180));

        id.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        id.setForeground(new java.awt.Color(13, 71, 171));
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, -1, -1));

        id_txt.setEditable(false);
        id_txt.setBackground(new java.awt.Color(255, 255, 255));
        id_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
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
        jPanel1.add(id_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 190, -1));

        jSeparator3.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 190, 10));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 460));
    }// </editor-fold>//GEN-END:initComponents

    private void Actualizar_proMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualizar_proMouseEntered
        setColor(Actualizar_pro);
    }//GEN-LAST:event_Actualizar_proMouseEntered

    private void Actualizar_proMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualizar_proMouseExited
       resetColor(Actualizar_pro);
    }//GEN-LAST:event_Actualizar_proMouseExited

    private void RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseEntered
        setColor(Regresar);
    }//GEN-LAST:event_RegresarMouseEntered

    private void RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMouseExited
        resetColor(Regresar);
    }//GEN-LAST:event_RegresarMouseExited

    private void RegresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarMousePressed
        /////REGRESAR A LA SECCION/////
        Productos_Empleados p = new Productos_Empleados();
        p.setSize(860, 560);
        p.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(p, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_RegresarMousePressed

    private void Nombre_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_txtActionPerformed

    private void Nombre_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_txtMousePressed
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Nombre_txt.getText().equals("Ingrese un Nombre"))
        Nombre_txt.setText("");
        Nombre_txt.setForeground(Color.black);
        
        if(String.valueOf(Descripcion_txt.getText()).isEmpty()){
        Descripcion_txt.setText("Ingrese La Descripcion");
        Descripcion_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Precio_txt.getText()).isEmpty()){
        Precio_txt.setText("Ingrese el Precio");
        Precio_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Nombre_txtMousePressed

    private void Descripcion_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Descripcion_txtMousePressed

        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Descripcion_txt.getText().equals("Ingrese La Descripcion"))
        Descripcion_txt.setText("");
        Descripcion_txt.setForeground(Color.black); 
        
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Precio_txt.getText()).isEmpty()){
        Precio_txt.setText("Ingrese el Precio");
        Precio_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Descripcion_txtMousePressed

    private void Precio_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Precio_txtMousePressed

        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Precio_txt.getText().equals("Ingrese el Precio"))
        Precio_txt.setText("");
        Precio_txt.setForeground(Color.black); 
        
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Descripcion_txt.getText()).isEmpty()){
        Descripcion_txt.setText("Ingrese La Descripcion");
        Descripcion_txt.setForeground(new Color(204,204,204));
        }
        
        
    }//GEN-LAST:event_Precio_txtMousePressed

    private void Precio_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Precio_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Precio_txtActionPerformed

    private void Descripcion_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Descripcion_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Descripcion_txtActionPerformed

    private void Actualizar_proMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualizar_proMousePressed
        //Metodo para agregar un Producto
        IniciarSesion_BD Productos_up = new IniciarSesion_BD();
        String Nombre = Nombre_txt.getText();
        String Descripcion = Descripcion_txt.getText();
        String Precio = Precio_txt.getText();
        String id =id_txt.getText();
        
        if(Nombre.equals("")||Descripcion.equals("")||Precio.equals("")||
                Nombre.equals("Ingrese un Nombre")||Descripcion.equals("Descripcion_txt")||Precio.equals("Ingrese el Precio")){
           JOptionPane.showMessageDialog(null, "Por Favor Relleno todos los Campos Son Necesarios");
        }
        else{
            Productos_up.UpProducto(Nombre,Descripcion,Precio,id);
            JOptionPane.showMessageDialog(this, "Los datos del Producto Actualizados Correctamente");
            Product_up_ref();
        }
       
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_Actualizar_proMousePressed

    private void Precio_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Precio_txtKeyTyped
        //Valida el ingreso de solo numeros
        Character n = evt.getKeyChar();
        
        if(!Character.isDigit(n)){
            evt.consume();
        
        }
        if(Precio_txt.getText().length() >=3){
            evt.consume();
        }
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Precio_txt.getText().equals("Ingrese el Precio"))
        Precio_txt.setText("");
        Precio_txt.setForeground(Color.black); 
        
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Descripcion_txt.getText()).isEmpty()){
        Descripcion_txt.setText("Ingrese La Descripcion");
        Descripcion_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Precio_txtKeyTyped

    private void Nombre_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_txtKeyTyped
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Nombre_txt.getText().equals("Ingrese un Nombre"))
        Nombre_txt.setText("");
        Nombre_txt.setForeground(Color.black);
        
        if(String.valueOf(Descripcion_txt.getText()).isEmpty()){
        Descripcion_txt.setText("Ingrese La Descripcion");
        Descripcion_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Precio_txt.getText()).isEmpty()){
        Precio_txt.setText("Ingrese el Precio");
        Precio_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Nombre_txtKeyTyped

    private void Descripcion_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Descripcion_txtKeyTyped
       //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Descripcion_txt.getText().equals("Ingrese La Descripcion"))
        Descripcion_txt.setText("");
        Descripcion_txt.setForeground(Color.black); 
        
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Precio_txt.getText()).isEmpty()){
        Precio_txt.setText("Ingrese el Precio");
        Precio_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Descripcion_txtKeyTyped

    private void ActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ActualizarMouseClicked
        int fila = Actualizar.rowAtPoint(evt.getPoint());
        id_txt.setText(Actualizar.getValueAt(fila, 0).toString());
        Nombre_txt.setText(Actualizar.getValueAt(fila, 1).toString());
        Descripcion_txt.setText(Actualizar.getValueAt(fila, 2).toString());
        Precio_txt.setText(Actualizar.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_ActualizarMouseClicked

    private void id_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_id_txtMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtMousePressed

    private void id_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtActionPerformed

    private void id_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_txtKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_id_txtKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Actualizar;
    private javax.swing.JPanel Actualizar_pro;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Descripcion_txt;
    private javax.swing.JLabel Domicilio;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JTextField Precio_txt;
    private javax.swing.JPanel Regresar;
    private javax.swing.JPanel Titulo;
    private javax.swing.JLabel id;
    private javax.swing.JTextField id_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
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
    public void Product_up_ref(){
        //Mostrar Productos_Gerente Registrados
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            Actualizar.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT idProductos, Nombre_producto, Descripcion, Precio FROM productos";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID Produto");
            modelo.addColumn("Nombre del Producto");
            modelo.addColumn("Descipcion");
            modelo.addColumn("Precio");
            
            
            
            
            
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
    
}
