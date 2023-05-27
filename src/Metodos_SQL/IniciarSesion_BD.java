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
package Metodos_SQL;

import Login.IniciarSesion;
import Metodos_SQL.Conexion_SQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*;
public class IniciarSesion_BD {

   
    public static void main(String[] args) {
        new IniciarSesion().setVisible(true);
        
        
    }
    //Metodo para agregar un cliente
    public boolean Agregarcliente(String Direccion,String Nombre,String Apellido,String Telefono){
        String sql = "INSERT INTO clientes(Direccion,Nombre,Apellido,Telefono) VALUES (?,?,?,?)";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Direccion);
            pst.setString(2,Nombre);
            pst.setString(3,Apellido);
            pst.setString(4,Telefono);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para agregar un pedido
    public boolean Agregarpedido(String NumMesa,String Fecha,String idClientes){
        String sql = "INSERT INTO pedidos(Numero_Mesa,Fecha_Pedido,idClientes) VALUES (?,?,?)";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,NumMesa);
            pst.setString(2,Fecha);
            pst.setString(3,idClientes);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para agregar una factura
    public boolean AgregarFactura(String idPedido,String Fecha,String MetodoPago){
        String sql = "INSERT INTO facturas(idPedidos,Fecha_Factura,Metodo_Pago) VALUES (?,?,?)";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,idPedido);
            pst.setString(2,Fecha);
            pst.setString(3,MetodoPago);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //metodo para agregar una orden
    public boolean Agregarorden(String Nombre,String precio,String Cantidad,String Pedido){
        String sql = "INSERT INTO orden(Nombre_Producto,Precio,Cantidad,idPedido) VALUES (?,?,?,?)";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Nombre);
            pst.setString(2,precio);
            pst.setString(3,Cantidad);
            pst.setString(4,Pedido);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    
    //metodo para eliminar cliente
    public boolean eliminarClientes(int id){
        String sql = "DELETE FROM clientes WHERE idClientes = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //metodo para veridficar si existe un cliente
    public int existeClientes(String id){
        String sql = "SELECT count(idClientes) FROM clientes WHERE idClientes = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
    //metodo para verificar la existencia de un empleado
     public int existeEmpleado(String id){
        String sql = "SELECT count(idEmpleados) FROM empleados WHERE idEmpleados = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
     public int existeEmpleado1(String id){
        String sql = "SELECT count(idEmpleados) FROM empleados WHERE Usuario = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
     //metodo para verificar si existe un prodicto
    public int existeProducto(String id){
        String sql = "SELECT count(idProductos) FROM productos WHERE idProductos = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    } 
    //metodo para verificar si existe un pedido
    public int existePedido(String id){
        String sql = "SELECT count(idPedidos) FROM pedidos WHERE idPedidos = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    } 
    //Metodo para agregar un producto
    public boolean AgregarProducto(String Nombre,String Descripcion,String Precio){
        String sql = "INSERT INTO productos(Nombre_producto,Descripcion,Precio) VALUES (?,?,?)";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Nombre);
            pst.setString(2,Descripcion);
            pst.setString(3,Precio);
            
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //metodo para agregar empleado
    public boolean AgregarEmpleado(String Nombre,String Apellido,String Fecha,String Direccion,String Telefono,String Usuario,String Contrasena,String Privilegio ){
        String sql = "INSERT INTO empleados(Nombres_empleados,Apellidos_empleados,Fecha_contrato,Direccion_empleado,Telefono,Usuario,Contrasena,Privilegio) VALUES (?,?,?,?,?,?,?,?)";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Nombre);
            pst.setString(2,Apellido);
            pst.setString(3,Fecha);
            pst.setString(4,Direccion);
            pst.setString(5,Telefono);
            pst.setString(6,Usuario);
            pst.setString(7,Contrasena);
            pst.setString(8,Privilegio);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public boolean eliminarEmpleado(int id){
        String sql = "DELETE FROM empleados WHERE idEmpleados = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public boolean eliminarProducto(int id){
        String sql = "DELETE FROM productos WHERE idProductos = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public boolean eliminarPedido(int id){
        String sql = "DELETE FROM pedidos WHERE idPedidos = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public boolean eliminarFactura(int id){
        String sql = "DELETE FROM facturas WHERE idFacturas = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    public boolean UpProducto(String Nombre, String Descripcion, String Precio,String id){
        String sql = "UPDATE  productos set Nombre_producto=?, Descripcion=?, Precio=? WHERE idProductos = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Nombre);
            pst.setString(2,Descripcion);
            pst.setString(3,Precio);
            pst.setString(4,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para actualizar pedido
    public boolean UpPedido(String Numero_Mesa, String Fecha, String idCliente,String id){
        String sql = "UPDATE  pedidos set Numero_Mesa=?, Fecha_Pedido=?, idClientes=? WHERE idPedidos = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Numero_Mesa);
            pst.setString(2,Fecha);
            pst.setString(3,idCliente);
            pst.setString(4,id);
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para actualizar cliente
    public boolean UPcliente(String Direccion,String Nombre,String Apellido,String Telefono,String id){
        String sql = "UPDATE clientes set Direccion=?, Nombre=?, Apellido=?, Telefono=? WHERE idClientes=?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Direccion);
            pst.setString(2,Nombre);
            pst.setString(3,Apellido);
            pst.setString(4,Telefono);
            pst.setString(5,id);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para eliminar la orden
    public boolean eliminarOrden(int id){
        String sql = "DELETE FROM orden WHERE id = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setInt(1,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para verificar la existencia d ela orden
    public int existeOrden(String id){
        String sql = "SELECT count(id) FROM orden WHERE id = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
    //Metodo para actualizar empleado
    public boolean UPempleado(String Nombre,String Apellido,String Fecha,String Direccion,String Telefono,String Usuario,String Contra,String Priv,String id){
        String sql = "UPDATE empleados set Nombres_Empleados=?, Apellidos_Empleados=?, Fecha_Contrato=?, Direccion_empleado=?, Telefono=?,Usuario=?,Contrasena=?,Privilegio=? WHERE idEmpleados=?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Nombre);
            pst.setString(2,Apellido);
            pst.setString(3,Fecha);
            pst.setString(4,Direccion);
            pst.setString(5,Telefono);
            pst.setString(6,Usuario);
            pst.setString(7,Contra);
            pst.setString(8,Priv);
            pst.setString(9,id);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para actualizar la orden
    public boolean UPorden(String Nombre,String Precio,String Cantidad,String idPedido,String id){
        String sql = "UPDATE orden set Nombre_Producto=?, Precio=?, Cantidad=?, idPedido=? WHERE id=?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,Nombre);
            pst.setString(2,Precio);
            pst.setString(3,Cantidad);
            pst.setString(4,idPedido);
            pst.setString(5,id);
            
            
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //Metodo para verificar la existencia de la factura
    public int existeFactura(String id){
        String sql = "SELECT count(idFacturas) FROM facturas WHERE idFacturas = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
    //Metodo para actualizar la factura
    public boolean UpFactura(String idPedido, String Metodo,String id){
        String sql = "UPDATE  facturas set idPedidos=?, Metodo_Pago=? WHERE idFacturas = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,idPedido);
            pst.setString(2,Metodo);
            pst.setString(3,id);
            pst.execute();
            return true;
        }catch(SQLException e){
            System.err.println(e);
            return false;
        }
    }
    //metodo para verificar si existe un cliente
    public int existeCliente(String id){
        String sql = "SELECT count(Nombre) FROM clientes WHERE Nombre = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
    //metodo para veridficar si existe un cliente
    public int existeClientesP(String id){
        String sql = "SELECT count(idClientes) FROM pedidos WHERE idClientes = ?;";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            pst.setString(1,id);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    }
    //metodo para verificar la existencia de un empleado
     public int existeEmpleadoADMINISTRRADOR(String Priv){
        String sql = "SELECT count(Privilegio) FROM empleados WHERE Privilegio = 'ADMINISTRADOR';";
        Connection conectar = Conexion_SQL.getConnection();
        PreparedStatement pst = null;
        ResultSet rs=null;
        try{
            pst = conectar.prepareStatement(sql);
            rs = pst.executeQuery();
            
            if(rs.next()){
                return rs.getInt(1);
            }
            return 1;
            
            
        }catch(SQLException e){
            System.err.println(e);
            return 1;
        }
    
    
    
    
     
    
    }
}
