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
package Ventana_Principales;

import Login.IniciarSesion;
import Ventana_PrincipalesEmpleados.Ordenes_Empleados;
import Ventana_PrincipalesEmpleados.Pedidos_Empleados;
import Ventana_PrincipalesEmpleados.Principal_Empleados;
import Ventana_PrincipalesEmpleados.Productos_Empleados;
import Ventanas_Secundarias.Clientes_Agregar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Ventana_Empleados extends javax.swing.JFrame {

    
    public Ventana_Empleados() {
        initComponents();
        this.setLocationRelativeTo(null); //Sirve para que la ventana este centrada
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icon.png")));
        
        
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Bienvenido De Nuevo Hoy Es "+dia+" De "+meses[month - 1]+" De "+year);
        
        Principal_Empleados p1 = new Principal_Empleados();
        p1.setSize(860, 560);
        p1.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(p1, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Izq = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Productos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Pedidos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_Ordenes = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_cs = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        Sesion_in = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        rojo_sqr = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Contenido_Empleados = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu_Izq.setBackground(new java.awt.Color(13, 71, 171));
        Menu_Izq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Menu_Izq.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 71, 170, 21));

        btn_Principal.setBackground(new java.awt.Color(21, 101, 192));
        btn_Principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_PrincipalMousePressed(evt);
            }
        });
        btn_Principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Principal");
        btn_Principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 98, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_Principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 50));

        Menu_Izq.add(btn_Principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 104, 281, 70));

        btn_Productos.setBackground(new java.awt.Color(19, 90, 173));
        btn_Productos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ProductosMousePressed(evt);
            }
        });
        btn_Productos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Productos");
        btn_Productos.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Product.png"))); // NOI18N
        btn_Productos.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 60));

        Menu_Izq.add(btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 280, 60));

        btn_Pedidos.setBackground(new java.awt.Color(19, 90, 173));
        btn_Pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_PedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_PedidosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_PedidosMousePressed(evt);
            }
        });
        btn_Pedidos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pedidos");
        btn_Pedidos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Pedido.png"))); // NOI18N
        btn_Pedidos.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 60, 60));

        jLabel15.setText("jLabel15");
        btn_Pedidos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 170, 160));

        Menu_Izq.add(btn_Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 60));

        btn_Ordenes.setBackground(new java.awt.Color(19, 90, 173));
        btn_Ordenes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ordenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_OrdenesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_OrdenesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_OrdenesMousePressed(evt);
            }
        });
        btn_Ordenes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ordenes");
        btn_Ordenes.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Orden.png"))); // NOI18N
        btn_Ordenes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        Menu_Izq.add(btn_Ordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 60));

        btn_cs.setBackground(new java.awt.Color(19, 90, 173));
        btn_cs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_csMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_csMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_csMouseExited(evt);
            }
        });
        btn_cs.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cerrar Sesion");
        btn_cs.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/log-out.png"))); // NOI18N
        btn_cs.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 230, 50));

        Menu_Izq.add(btn_cs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 280, 60));

        jLabel17.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LOVE TACOS!");
        Menu_Izq.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        Sesion_in.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Sesion_in.setForeground(new java.awt.Color(255, 255, 255));
        Sesion_in.setText("USER");
        Menu_Izq.add(Sesion_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 736, 200, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_in.png"))); // NOI18N
        Menu_Izq.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 730, 50, 60));

        getContentPane().add(Menu_Izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 800));

        Title.setBackground(new java.awt.Color(255, 255, 255));

        rojo_sqr.setBackground(new java.awt.Color(255, 255, 255));
        rojo_sqr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        salir.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        salir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        salir.setText(" X");
        salir.setMaximumSize(new java.awt.Dimension(33, 32));
        salir.setMinimumSize(new java.awt.Dimension(33, 32));
        salir.setPreferredSize(new java.awt.Dimension(33, 32));
        salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                salirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                salirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                salirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout rojo_sqrLayout = new javax.swing.GroupLayout(rojo_sqr);
        rojo_sqr.setLayout(rojo_sqrLayout);
        rojo_sqrLayout.setHorizontalGroup(
            rojo_sqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rojo_sqrLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        rojo_sqrLayout.setVerticalGroup(
            rojo_sqrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(0, 1107, Short.MAX_VALUE)
                .addComponent(rojo_sqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rojo_sqr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenido_Empleados.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Contenido_EmpleadosLayout = new javax.swing.GroupLayout(Contenido_Empleados);
        Contenido_Empleados.setLayout(Contenido_EmpleadosLayout);
        Contenido_EmpleadosLayout.setHorizontalGroup(
            Contenido_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        Contenido_EmpleadosLayout.setVerticalGroup(
            Contenido_EmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(Contenido_Empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

        Header.setBackground(new java.awt.Color(25, 118, 210));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Administracion De La Taqueria San Jose");

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        fecha.setForeground(new java.awt.Color(255, 255, 255));
        fecha.setText("Bienvido El Dia de Hoy Es Tal Con Fecha Tal");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 791, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addComponent(fecha)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 860, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       
    }//GEN-LAST:event_formWindowActivated

    private void btn_csMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_csMouseEntered
        setColor(btn_cs);
    }//GEN-LAST:event_btn_csMouseEntered

    private void btn_csMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_csMouseExited
        resetColor(btn_cs);
    }//GEN-LAST:event_btn_csMouseExited

    private void btn_csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_csMouseClicked
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Esta Seguro que desea Cerrar la Sesion ","Exit",dialog); //Dar un mensaje para verificar que desea salir
            if(result==0){
            IniciarSesion acceso = new  IniciarSesion();
            acceso.setVisible(true);
            dispose();
            }
    }//GEN-LAST:event_btn_csMouseClicked

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Esta Seguro de que quiere Cerrar? El Sistema se Cerrara ","Exit",dialog); //Dar un mensaje para verificar que desea salir
        if(result==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_salirMousePressed

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        rojo_sqr.setBackground(new Color(255,255,255));
        salir.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        rojo_sqr.setBackground(new Color(204,0,0));
        salir.setForeground(Color.white);
    }//GEN-LAST:event_salirMouseEntered

    private void btn_PrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrincipalMousePressed
        //Establece y reestablece colores
        setColor(btn_Principal);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        resetColor(btn_Ordenes);
        // ABRE LA SECCION 
        Principal_Empleados p1 = new Principal_Empleados();
        p1.setSize(860, 560);
        p1.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(p1, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_btn_PrincipalMousePressed

    private void btn_ProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMousePressed
         //Establece y reestablece colores
        setColor(btn_Productos);
        resetColor(btn_Principal);
        resetColor(btn_Pedidos);
        resetColor(btn_Ordenes);
        // ABRE LA SECCION 
        Productos_Empleados prin = new Productos_Empleados();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(prin, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_btn_ProductosMousePressed

    private void btn_PedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PedidosMousePressed
        //Establece y reestablece colores
        setColor(btn_Pedidos);
        resetColor(btn_Principal);
        resetColor(btn_Productos);
        resetColor(btn_Ordenes);
        // ABRE LA SECCION 
        Pedidos_Empleados prin = new Pedidos_Empleados();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(prin, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_btn_PedidosMousePressed

    private void btn_OrdenesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OrdenesMousePressed
        //Establece y reestablece colores
        setColor(btn_Ordenes);
        resetColor(btn_Principal);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        // ABRE LA SECCION 
        Ordenes_Empleados fac = new Ordenes_Empleados();
        fac.setSize(860, 560);
        fac.setLocation(0,0);
        
        Contenido_Empleados.removeAll();
        Contenido_Empleados.add(fac, BorderLayout.CENTER);
        Contenido_Empleados.revalidate();
        Contenido_Empleados.repaint();
    }//GEN-LAST:event_btn_OrdenesMousePressed

    private void btn_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseEntered
         //Metodo que de color cuando el mouse entra
        if(btn_Productos.getBackground().getRGB() == -15574355)
            setColor(btn_Productos);
    }//GEN-LAST:event_btn_ProductosMouseEntered

    private void btn_PedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PedidosMouseEntered
         //Metodo que de color cuando el mouse entra
        if(btn_Pedidos.getBackground().getRGB() == -15574355)
            setColor(btn_Pedidos);
    }//GEN-LAST:event_btn_PedidosMouseEntered

    private void btn_OrdenesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OrdenesMouseEntered
        //Metodo que de color cuando el mouse entra
        if(btn_Ordenes.getBackground().getRGB() == -15574355)
            setColor(btn_Ordenes);
    }//GEN-LAST:event_btn_OrdenesMouseEntered

    private void btn_PrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrincipalMouseEntered
        //Metodo que de color cuando el mouse entra
        if(btn_Principal.getBackground().getRGB() == -15574355)
            setColor(btn_Principal);
    }//GEN-LAST:event_btn_PrincipalMouseEntered

    private void btn_PrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrincipalMouseExited
        //Metodo que de color cuando el mouse Salga
        if(btn_Ordenes.getBackground().getRGB() != -15574355 || btn_Pedidos.getBackground().getRGB() != -15574355|| btn_Productos.getBackground().getRGB() != -15574355)
            resetColor(btn_Principal);
    }//GEN-LAST:event_btn_PrincipalMouseExited

    private void btn_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseExited
        //Metodo que de color cuando el mouse Salga
        if(btn_Ordenes.getBackground().getRGB() != -15574355 || btn_Pedidos.getBackground().getRGB() != -15574355|| btn_Principal.getBackground().getRGB() != -15574355)
            resetColor(btn_Productos);
    }//GEN-LAST:event_btn_ProductosMouseExited

    private void btn_PedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PedidosMouseExited
        //Metodo que de color cuando el mouse Salga
        if(btn_Ordenes.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Principal.getBackground().getRGB() != -15574355)
            resetColor(btn_Pedidos);
    }//GEN-LAST:event_btn_PedidosMouseExited

    private void btn_OrdenesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OrdenesMouseExited
        //Metodo que de color cuando el mouse Salga
        if(btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Principal.getBackground().getRGB() != -15574355)
            resetColor(btn_Ordenes);
    }//GEN-LAST:event_btn_OrdenesMouseExited

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
            java.util.logging.Logger.getLogger(Ventana_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Empleados().setVisible(true);
                new Clientes_Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Contenido_Empleados;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu_Izq;
    public javax.swing.JLabel Sesion_in;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel btn_Ordenes;
    private javax.swing.JPanel btn_Pedidos;
    private javax.swing.JPanel btn_Principal;
    private javax.swing.JPanel btn_Productos;
    private javax.swing.JPanel btn_cs;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel rojo_sqr;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables

    

    private void setColor(JPanel panel) {
       panel.setBackground(new Color(21,101,192));
    }

    private void resetColor(JPanel panel) {
      panel.setBackground(new Color(18,90,173));
    }

    
}
