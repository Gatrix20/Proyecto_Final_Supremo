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
import Metodos_SQL.IniciarSesion_BD;


import static Ventana_Principales.Ventana_Gerente.Contenido_Gerente;
import Ventana_Principales_Gerente.Clientes_Gerente;
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


public class Clientes_Actualizar extends javax.swing.JPanel {
    DefaultTableModel modelo;
    
    public Clientes_Actualizar() {
        initComponents();
        
        
        //Mostrar Clientes Registrados
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            UpCliente.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT * FROM clientes";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID Clientes");
            modelo.addColumn("Direccion");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            
            
            
            
            
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
        Agregar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Nombre_txt = new javax.swing.JTextField();
        Apellido_txt = new javax.swing.JTextField();
        Apellido = new javax.swing.JLabel();
        Domicilio = new javax.swing.JLabel();
        Domicilio_txt = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        Telefono_txt = new javax.swing.JTextField();
        id = new javax.swing.JLabel();
        ID_txt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        UpCliente = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(13, 71, 171));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Actualizar Cliente");

        javax.swing.GroupLayout TituloLayout = new javax.swing.GroupLayout(Titulo);
        Titulo.setLayout(TituloLayout);
        TituloLayout.setHorizontalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TituloLayout.createSequentialGroup()
                .addContainerGap(303, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(270, 270, 270))
        );
        TituloLayout.setVerticalGroup(
            TituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TituloLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10)
                .addContainerGap(29, Short.MAX_VALUE))
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
        jLabel2.setText("Actualizar Cliente");
        Agregar.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 200, 50));

        Nombre.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Nombre.setForeground(new java.awt.Color(13, 71, 171));
        Nombre.setText("Nombre:");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));

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
        jPanel1.add(Nombre_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 490, -1));

        Apellido_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Apellido_txt.setForeground(new java.awt.Color(204, 204, 204));
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setBorder(null);
        Apellido_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Apellido_txtMousePressed(evt);
            }
        });
        Apellido_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Apellido_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Apellido_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, 490, -1));

        Apellido.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Apellido.setForeground(new java.awt.Color(13, 71, 171));
        Apellido.setText("Apellido:");
        jPanel1.add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        Domicilio.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Domicilio.setForeground(new java.awt.Color(13, 71, 171));
        Domicilio.setText("Domicilio:");
        jPanel1.add(Domicilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        Domicilio_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Domicilio_txt.setForeground(new java.awt.Color(204, 204, 204));
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setBorder(null);
        Domicilio_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Domicilio_txtMousePressed(evt);
            }
        });
        Domicilio_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Domicilio_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Domicilio_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 490, -1));

        Telefono.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        Telefono.setForeground(new java.awt.Color(13, 71, 171));
        Telefono.setText("Telefono:");
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        Telefono_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        Telefono_txt.setForeground(new java.awt.Color(204, 204, 204));
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setBorder(null);
        Telefono_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Telefono_txtMousePressed(evt);
            }
        });
        Telefono_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Telefono_txtKeyTyped(evt);
            }
        });
        jPanel1.add(Telefono_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 210, -1));

        id.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        id.setForeground(new java.awt.Color(13, 71, 171));
        id.setText("ID:");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, -1, -1));

        ID_txt.setEditable(false);
        ID_txt.setBackground(new java.awt.Color(255, 255, 255));
        ID_txt.setFont(new java.awt.Font("Roboto", 0, 22)); // NOI18N
        ID_txt.setBorder(null);
        jPanel1.add(ID_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 210, -1));

        jSeparator2.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 490, 10));

        jSeparator3.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 210, 10));

        jSeparator4.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 490, 10));

        jSeparator5.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 490, 10));

        jSeparator7.setForeground(new java.awt.Color(13, 71, 171));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 210, 10));

        UpCliente.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        UpCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Direccion", "Nombre", "Apellido", "Telefono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UpCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UpCliente);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 790, 200));

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
        Clientes_Gerente c = new Clientes_Gerente();
        c.setSize(860, 560);
        c.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(c, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_RegresarMousePressed

    private void Nombre_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nombre_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nombre_txtActionPerformed

    private void Nombre_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Nombre_txtMousePressed

        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Nombre_txt.getText().equals("Ingrese un Nombre"))
        Nombre_txt.setText("");
        Nombre_txt.setForeground(Color.black);
        
        if(String.valueOf(Domicilio_txt.getText()).isEmpty()){
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Apellido_txt.getText()).isEmpty()){
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Telefono_txt.getText()).isEmpty()){
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Nombre_txtMousePressed

    private void Apellido_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Apellido_txtMousePressed

        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Apellido_txt.getText().equals("Ingrese un Apellido"))
        Apellido_txt.setText("");
        Apellido_txt.setForeground(Color.black);
        
        if(String.valueOf(Domicilio_txt.getText()).isEmpty()){
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Telefono_txt.getText()).isEmpty()){
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Apellido_txtMousePressed

    private void Domicilio_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Domicilio_txtMousePressed
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Domicilio_txt.getText().equals("Ingrese el Domicilio"))
        Domicilio_txt.setText("");
        Domicilio_txt.setForeground(Color.black);
        
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Apellido_txt.getText()).isEmpty()){
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Telefono_txt.getText()).isEmpty()){
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Domicilio_txtMousePressed

    private void Telefono_txtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Telefono_txtMousePressed

        
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Telefono_txt.getText().equals("Ingrese un Telefono"))
        Telefono_txt.setText("");
        Telefono_txt.setForeground(Color.black);
        
        if(String.valueOf(Domicilio_txt.getText()).isEmpty()){
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Apellido_txt.getText()).isEmpty()){
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setForeground(new Color(204,204,204));
        }
        
        
    }//GEN-LAST:event_Telefono_txtMousePressed

    private void AgregarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMousePressed
        //Metodo para agregar un Cliente
        IniciarSesion_BD Clientes = new IniciarSesion_BD();
        String Direccion = Domicilio_txt.getText();
        String Nombre = Nombre_txt.getText();
        String Apellido = Apellido_txt.getText();
        String Telefono = Telefono_txt.getText();
        String id = ID_txt.getText();
        if(Direccion.equals("")||Nombre.equals("")||Apellido.equals("")||Telefono.equals("")||
                Direccion.equals("Ingrese el Domicilio")||Nombre.equals("Ingrese un Nombre")||Apellido.equals("Ingrese un Apellido")||Telefono.equals("Ingrese un Telefono")){
           JOptionPane.showMessageDialog(null, "Todo los Campos son Requeridos");
           Domicilio_txt.setText("Ingrese el Domicilio");
           Nombre_txt.setText("Ingrese un Nombre");
           Apellido_txt.setText("Ingrese un Apellido");
           Telefono_txt.setText("Ingrese un Telefono");
        }
        else{
            Clientes.UPcliente(Direccion,Nombre,Apellido,Telefono,id);
           JOptionPane.showMessageDialog(this, "Los datos del Cliente fueron Actualizados Correctamente");
           Datos();
           Domicilio_txt.setText("Ingrese el Domicilio");
           Domicilio_txt.setForeground(Color.gray);
           Nombre_txt.setText("Ingrese un Nombre");
           Nombre_txt.setForeground(Color.gray);
           Apellido_txt.setText("Ingrese un Apellido");
           Apellido_txt.setForeground(Color.gray);
           Telefono_txt.setText("Ingrese un Telefono");
           Telefono_txt.setForeground(Color.gray);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_AgregarMousePressed

    private void Telefono_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Telefono_txtKeyTyped
        //Valida el ingreso de solo numeros
        Character n = evt.getKeyChar();
        
        if(!Character.isDigit(n)){
            evt.consume();
        
        }
        if(Telefono_txt.getText().length() >=10){
            evt.consume();
        }
        
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Telefono_txt.getText().equals("Ingrese un Telefono"))
        Telefono_txt.setText("");
        Telefono_txt.setForeground(Color.black);
        
        if(String.valueOf(Domicilio_txt.getText()).isEmpty()){
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Apellido_txt.getText()).isEmpty()){
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Telefono_txtKeyTyped

    private void Nombre_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Nombre_txtKeyTyped
        //Valida el ingreso de solo letras
        Character n = evt.getKeyChar();
        
        if(Character.isDigit(n)){
            evt.consume();
        
        }
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Nombre_txt.getText().equals("Ingrese un Nombre"))
        Nombre_txt.setText("");
        Nombre_txt.setForeground(Color.black);
        
        if(String.valueOf(Domicilio_txt.getText()).isEmpty()){
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Apellido_txt.getText()).isEmpty()){
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Telefono_txt.getText()).isEmpty()){
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Nombre_txtKeyTyped

    private void Apellido_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Apellido_txtKeyTyped
        //Valida el ingreso de solo letras
        Character n = evt.getKeyChar();
        
        if(Character.isDigit(n)){
            evt.consume();
        
        }
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Apellido_txt.getText().equals("Ingrese un Apellido"))
        Apellido_txt.setText("");
        Apellido_txt.setForeground(Color.black);
        
        if(String.valueOf(Domicilio_txt.getText()).isEmpty()){
        Domicilio_txt.setText("Ingrese el Domicilio");
        Domicilio_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Telefono_txt.getText()).isEmpty()){
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setForeground(new Color(204,204,204));
        }
        
    }//GEN-LAST:event_Apellido_txtKeyTyped

    private void Domicilio_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Domicilio_txtKeyTyped
        //Metodo Cuando Cambiamos de Campo no pierda la estructura
        if(Domicilio_txt.getText().equals("Ingrese el Domicilio"))
        Domicilio_txt.setText("");
        Domicilio_txt.setForeground(Color.black);
        
        if(String.valueOf(Nombre_txt.getText()).isEmpty()){
        Nombre_txt.setText("Ingrese un Nombre");
        Nombre_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Apellido_txt.getText()).isEmpty()){
        Apellido_txt.setText("Ingrese un Apellido");
        Apellido_txt.setForeground(new Color(204,204,204));
        }
        if(String.valueOf(Telefono_txt.getText()).isEmpty()){
        Telefono_txt.setText("Ingrese un Telefono");
        Telefono_txt.setForeground(new Color(204,204,204));
        }
    }//GEN-LAST:event_Domicilio_txtKeyTyped

    private void UpClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpClienteMouseClicked
        int fila = UpCliente.rowAtPoint(evt.getPoint());
        ID_txt.setText(UpCliente.getValueAt(fila, 0).toString());
        Domicilio_txt.setText(UpCliente.getValueAt(fila, 1).toString());
        Nombre_txt.setText(UpCliente.getValueAt(fila, 2).toString());
        Apellido_txt.setText(UpCliente.getValueAt(fila, 3).toString());
        Telefono_txt.setText(UpCliente.getValueAt(fila, 4).toString());
        
    }//GEN-LAST:event_UpClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Agregar;
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextField Apellido_txt;
    private javax.swing.JLabel Domicilio;
    private javax.swing.JTextField Domicilio_txt;
    private javax.swing.JTextField ID_txt;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField Nombre_txt;
    private javax.swing.JPanel Regresar;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField Telefono_txt;
    private javax.swing.JPanel Titulo;
    private javax.swing.JTable UpCliente;
    private javax.swing.JLabel id;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    // End of variables declaration//GEN-END:variables

    private void setColor(JPanel panel) {
        panel.setBackground(new Color(21,101,192));
    }

    private void resetColor(JPanel panel) {
         panel.setBackground(new Color(18,90,173));
    }
    public void Datos(){
        //Mostrar Clientes Registrados
        try{
            DefaultTableModel modelo = new DefaultTableModel();
            UpCliente.setModel(modelo);
            PreparedStatement ps = null;
            ResultSet rs = null;
            Connection conectar = Conexion_SQL.getConnection();
            
            String sql = "SELECT * FROM clientes";
            
            ps = conectar.prepareStatement(sql);
            rs = ps.executeQuery();
            
            ResultSetMetaData rsMd = rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();
            
            modelo.addColumn("ID Clientes");
            modelo.addColumn("Direccion");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Telefono");
            
            
            
            
            
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
