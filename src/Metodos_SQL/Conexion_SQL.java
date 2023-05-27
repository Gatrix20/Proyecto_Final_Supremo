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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


//Metodo Para conectar la base de datos
public class Conexion_SQL {
    public static Connection getConnection(){
        Connection con=null;
    //        String bd = "taqueria";
    //        String url = "jdbc:mysql://localhost:3306/"+bd;
    //        String user = "root";
    //        String pass = "root";
    
            try{
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/taqueria","root","root");

                }catch (ClassNotFoundException | SQLException e){
                    JOptionPane.showMessageDialog(null,"Error al crear la conexión "+e.getMessage());

                    throw new RuntimeException("Error al crear la conexión");
                }
        return con;
    }
}
