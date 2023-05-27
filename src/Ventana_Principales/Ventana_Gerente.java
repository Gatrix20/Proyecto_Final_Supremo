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
import Ventana_Principales_Gerente.Clientes_Gerente;
import Ventana_Principales_Gerente.Empleados_Gerente;
import Ventana_Principales_Gerente.Facturas_Gerente;
import Ventana_Principales_Gerente.Ordenes_Gerente;
import Ventana_Principales_Gerente.Pedidos_Gerente;
import Ventana_Principales_Gerente.Principal_Gerente;
import Ventana_Principales_Gerente.Productos_Gerente;
import Ventanas_Secundarias.Clientes_Agregar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Ventana_Gerente extends javax.swing.JFrame {

    
    public Ventana_Gerente() {
        initComponents();
        this.setLocationRelativeTo(null); //Sirve para que la ventana este centrada
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Imagenes/icon.png")));
        
        //metodo para establecer ;a fecha
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto"," ;Septiembre"
            ,"Octubre","Noviembre","Diciemrbre"};
        fecha.setText("Bienvenido De Nuevo Hoy Es "+dia+" De "+meses[month - 1]+" De "+year);
        
        //CIANDO ENTRAMOS A LA VENTANA PRINCIPAL NOS INICIE EN LA VENTANA PRINCIPAL
        Principal p1 = new Principal();
        p1.setSize(860, 560);
        p1.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(p1, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu_Izq = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_Principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_empleados = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_Productos = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_Pedidos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        btn_Or = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_Facturas = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btn_cs = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_Clientes = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Sesion_in = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        rojo_sqr = new javax.swing.JPanel();
        salir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Contenido_Gerente = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VENTANA ADMINISTRADOR");
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

        btn_empleados.setBackground(new java.awt.Color(18, 90, 173));
        btn_empleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_empleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_empleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_empleadosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_empleadosMousePressed(evt);
            }
        });
        btn_empleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Empleados");
        btn_empleados.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Empleado.png"))); // NOI18N
        btn_empleados.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 110, 60));

        Menu_Izq.add(btn_empleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 281, 60));

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

        Menu_Izq.add(btn_Productos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 280, 60));

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

        Menu_Izq.add(btn_Pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 280, 60));

        btn_Or.setBackground(new java.awt.Color(19, 90, 173));
        btn_Or.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Or.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_OrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_OrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_OrMousePressed(evt);
            }
        });
        btn_Or.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ordenes");
        btn_Or.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Orden.png"))); // NOI18N
        btn_Or.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        Menu_Izq.add(btn_Or, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 60));

        btn_Facturas.setBackground(new java.awt.Color(19, 90, 173));
        btn_Facturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Facturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_FacturasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_FacturasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_FacturasMousePressed(evt);
            }
        });
        btn_Facturas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Facturas");
        btn_Facturas.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/qr.png"))); // NOI18N
        btn_Facturas.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 60));

        Menu_Izq.add(btn_Facturas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 280, 60));

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

        btn_Clientes.setBackground(new java.awt.Color(19, 90, 173));
        btn_Clientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_ClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_ClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_ClientesMousePressed(evt);
            }
        });
        btn_Clientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Clientes");
        btn_Clientes.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cuestumer.png"))); // NOI18N
        btn_Clientes.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 50));

        Menu_Izq.add(btn_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 280, 60));

        Sesion_in.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Sesion_in.setForeground(new java.awt.Color(255, 255, 255));
        Sesion_in.setText("USER TEST");
        Menu_Izq.add(Sesion_in, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 736, 210, 60));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_in.png"))); // NOI18N
        Menu_Izq.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 740, 50, 60));

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

        Contenido_Gerente.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Contenido_GerenteLayout = new javax.swing.GroupLayout(Contenido_Gerente);
        Contenido_Gerente.setLayout(Contenido_GerenteLayout);
        Contenido_GerenteLayout.setHorizontalGroup(
            Contenido_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        Contenido_GerenteLayout.setVerticalGroup(
            Contenido_GerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        jPanel1.add(Contenido_Gerente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, -1, -1));

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
        //estblece color
        setColor(btn_cs);
    }//GEN-LAST:event_btn_csMouseEntered

    private void btn_csMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_csMouseExited
        //Regresa el color
        resetColor(btn_cs);
    }//GEN-LAST:event_btn_csMouseExited

    private void btn_csMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_csMouseClicked
            //Metodo que nos ayuda a Cerrar la sesion
            int dialog = JOptionPane.YES_NO_OPTION;
            int result = JOptionPane.showConfirmDialog(null,"Esta Seguro que desea Cerrar la Sesion ","Exit",dialog); //Dar un mensaje para verificar que desea salir
            if(result==0){
            IniciarSesion acceso = new  IniciarSesion();
            acceso.setVisible(true);
            dispose();
            }
    }//GEN-LAST:event_btn_csMouseClicked

    private void salirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMousePressed
        //Cierra el Sistema
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null,"Esta Seguro de que quiere Cerrar? El Sistema se Cerrara ","Exit",dialog); //Dar un mensaje para verificar que desea salir
        if(result==0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_salirMousePressed

    private void salirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseExited
        //Metodo para el icono de salir con su juego de colores
        rojo_sqr.setBackground(new Color(255,255,255));
        salir.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_salirMouseExited

    private void salirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirMouseEntered
        //Metodo para el icono de salir con su juego de colores
        rojo_sqr.setBackground(new Color(204,0,0));
        salir.setForeground(Color.white);
    }//GEN-LAST:event_salirMouseEntered

    private void btn_empleadosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMousePressed
        //Color en los botones
        setColor(btn_empleados);
        resetColor(btn_Principal);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        resetColor(btn_Clientes);
        resetColor(btn_Facturas);
        resetColor(btn_Or);
        //Abre Seccion
        Empleados_Gerente p1 = new Empleados_Gerente();
        p1.setSize(860, 560);
        p1.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(p1, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_empleadosMousePressed

    private void btn_PrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrincipalMousePressed
        //Colores
        setColor(btn_Principal);
        resetColor(btn_empleados);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        resetColor(btn_Clientes);
        resetColor(btn_Facturas);
        resetColor(btn_Or);
        // ABRE LA SECCION 
        Principal_Gerente p1 = new Principal_Gerente();
        p1.setSize(860, 560);
        p1.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(p1, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_PrincipalMousePressed

    private void btn_ProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMousePressed
        //Metodo Colores
        setColor(btn_Productos);
        resetColor(btn_empleados);
        resetColor(btn_Principal);
        resetColor(btn_Pedidos);
        resetColor(btn_Clientes);
        resetColor(btn_Facturas);
        resetColor(btn_Or);
        // ABRE LA SECCION 
        Productos_Gerente prin = new Productos_Gerente();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(prin, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_ProductosMousePressed

    private void btn_PedidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PedidosMousePressed
        //COLORES
        setColor(btn_Pedidos);
        resetColor(btn_empleados);
        resetColor(btn_Productos);
        resetColor(btn_Principal);
        resetColor(btn_Clientes);
        resetColor(btn_Facturas);
        resetColor(btn_Or);
        // ABRE LA SECCION 
        Pedidos_Gerente prin = new Pedidos_Gerente();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(prin, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_PedidosMousePressed

    private void btn_ClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMousePressed
        //Colores
        setColor(btn_Clientes);
        resetColor(btn_empleados);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        resetColor(btn_Principal);
        resetColor(btn_Facturas);
        resetColor(btn_Or); 
        // ABRE LA SECCION 
        Clientes_Gerente prin = new Clientes_Gerente();
        prin.setSize(860, 560);
        prin.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(prin, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_ClientesMousePressed

    private void btn_FacturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturasMousePressed
        //Colores
        setColor(btn_Facturas);
        resetColor(btn_empleados);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        resetColor(btn_Clientes);
        resetColor(btn_Principal);
        resetColor(btn_Or);
        // ABRE LA SECCION 
        Facturas_Gerente fac = new Facturas_Gerente();
        fac.setSize(860, 560);
        fac.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(fac, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_FacturasMousePressed

    private void btn_OrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OrMousePressed
        //Colores
        setColor(btn_Or);
        resetColor(btn_empleados);
        resetColor(btn_Productos);
        resetColor(btn_Pedidos);
        resetColor(btn_Clientes);
        resetColor(btn_Facturas);
        resetColor(btn_Principal);
        // ABRE LA SECCION 
        Ordenes_Gerente fac = new Ordenes_Gerente();
        fac.setSize(860, 560);
        fac.setLocation(0,0);
        
        Contenido_Gerente.removeAll();
        Contenido_Gerente.add(fac, BorderLayout.CENTER);
        Contenido_Gerente.revalidate();
        Contenido_Gerente.repaint();
    }//GEN-LAST:event_btn_OrMousePressed

    private void btn_PrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrincipalMouseEntered
        //Metodo que de color cuando el mouse entra
        if(btn_Principal.getBackground().getRGB() == -15574355)
            setColor(btn_Principal);
    }//GEN-LAST:event_btn_PrincipalMouseEntered

    private void btn_PrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PrincipalMouseExited
        //Metodo que de color cuando el mouse salga
        if(btn_empleados.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Or.getBackground().getRGB() != -15574355||
             btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Clientes.getBackground().getRGB() != -15574355 || btn_Facturas.getBackground().getRGB() != -15574355)
            resetColor(btn_Principal);
    }//GEN-LAST:event_btn_PrincipalMouseExited

    private void btn_empleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMouseEntered
       //Metodo que de color cuando el mouse entra
        if(btn_empleados.getBackground().getRGB() == -15574355)
            setColor(btn_empleados);
    }//GEN-LAST:event_btn_empleadosMouseEntered

    private void btn_empleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_empleadosMouseExited
        
 //Metodo que de color cuando el mouse salga
        if(btn_Principal.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Or.getBackground().getRGB() != -15574355||
             btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Clientes.getBackground().getRGB() != -15574355 || btn_Facturas.getBackground().getRGB() != -15574355)
            resetColor(btn_empleados);
    }//GEN-LAST:event_btn_empleadosMouseExited

    private void btn_ProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseExited
        //Metodo que de color cuando el mouse salga
        if(btn_empleados.getBackground().getRGB() != -15574355 || btn_Principal.getBackground().getRGB() != -15574355|| btn_Or.getBackground().getRGB() != -15574355||
             btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Clientes.getBackground().getRGB() != -15574355 || btn_Facturas.getBackground().getRGB() != -15574355)
            resetColor(btn_Productos);
    }//GEN-LAST:event_btn_ProductosMouseExited

    private void btn_ProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ProductosMouseEntered
        //Metodo que de color cuando el mouse entra
        if(btn_Productos.getBackground().getRGB() == -15574355)
            setColor(btn_Productos);
    }//GEN-LAST:event_btn_ProductosMouseEntered

    private void btn_PedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PedidosMouseExited
         //Metodo que de color cuando el mouse salga
        if(btn_empleados.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Or.getBackground().getRGB() != -15574355||
             btn_Principal.getBackground().getRGB() != -15574355 || btn_Clientes.getBackground().getRGB() != -15574355 || btn_Facturas.getBackground().getRGB() != -15574355)
            resetColor(btn_Pedidos);
    }//GEN-LAST:event_btn_PedidosMouseExited

    private void btn_PedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_PedidosMouseEntered
        //Metodo que de color cuando el mouse entra
        if(btn_Pedidos.getBackground().getRGB() == -15574355)
            setColor(btn_Pedidos);
    }//GEN-LAST:event_btn_PedidosMouseEntered

    private void btn_ClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMouseExited
        //Metodo que de color cuando el mouse salga
        if(btn_empleados.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Or.getBackground().getRGB() != -15574355||
             btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Principal.getBackground().getRGB() != -15574355 || btn_Facturas.getBackground().getRGB() != -15574355)
            resetColor(btn_Clientes);

    }//GEN-LAST:event_btn_ClientesMouseExited

    private void btn_ClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_ClientesMouseEntered
        //Metodo que de color cuando el mouse entra
        if(btn_Clientes.getBackground().getRGB() == -15574355)
            setColor(btn_Clientes);
    }//GEN-LAST:event_btn_ClientesMouseEntered

    private void btn_FacturasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturasMouseExited
         //Metodo que de color cuando el mouse salga
        if(btn_empleados.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Or.getBackground().getRGB() != -15574355||
             btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Clientes.getBackground().getRGB() != -15574355 || btn_Principal.getBackground().getRGB() != -15574355)
            resetColor(btn_Facturas);
    }//GEN-LAST:event_btn_FacturasMouseExited

    private void btn_FacturasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_FacturasMouseEntered
       //Metodo que de color cuando el mouse entra
        if(btn_Facturas.getBackground().getRGB() == -15574355)
            setColor(btn_Facturas);
    }//GEN-LAST:event_btn_FacturasMouseEntered

    private void btn_OrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OrMouseExited
         //Metodo que de color cuando el mouse salga
        if(btn_empleados.getBackground().getRGB() != -15574355 || btn_Productos.getBackground().getRGB() != -15574355|| btn_Principal.getBackground().getRGB() != -15574355||
             btn_Pedidos.getBackground().getRGB() != -15574355 || btn_Clientes.getBackground().getRGB() != -15574355 || btn_Facturas.getBackground().getRGB() != -15574355)
            resetColor(btn_Or);
    }//GEN-LAST:event_btn_OrMouseExited

    private void btn_OrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_OrMouseEntered
       //Metodo que de color cuando el mouse entra
        if(btn_Or.getBackground().getRGB() == -15574355)
            setColor(btn_Or);

    }//GEN-LAST:event_btn_OrMouseEntered

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ventana_Gerente().setVisible(true);
                new Clientes_Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Contenido_Gerente;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu_Izq;
    public javax.swing.JLabel Sesion_in;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel btn_Clientes;
    private javax.swing.JPanel btn_Facturas;
    private javax.swing.JPanel btn_Or;
    private javax.swing.JPanel btn_Pedidos;
    private javax.swing.JPanel btn_Principal;
    private javax.swing.JPanel btn_Productos;
    private javax.swing.JPanel btn_cs;
    private javax.swing.JPanel btn_empleados;
    private javax.swing.JLabel fecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel rojo_sqr;
    private javax.swing.JLabel salir;
    // End of variables declaration//GEN-END:variables

    
    //Metodo que establece color 
    private void setColor(JPanel panel) {
       panel.setBackground(new Color(21,101,192));
    }
    //Metodo para establecer color
    private void resetColor(JPanel panel) {
      panel.setBackground(new Color(18,90,173));
    }
    

    
}
