/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gina
 */
public class BasedeDatos {
    
    private Connection conexion = null;
    private String Servidor;
    private String Database;
    private String Usuario;
    private String Password;
    
    public BasedeDatos(String servidor, String database, String usuario, String password){
        try{
           this.Servidor = servidor;
           this.Database = database;
           
           Class.forName("com.mysql.jdbc.Driver");
           conexion = DriverManager.getConnection("jdbc:mysql://localhost:8080/Sesion");
           System.out.println("Conexion a base de datos exitosa");
        }
        catch(SQLException ex){
            System.out.println(ex);
        }
        catch(ClassNotFoundException ex){
            System.out.println(ex);
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    public Connection cerrarConexion(){
        try{
            conexion.close();
            System.out.println("Cerrando conexion");
        } catch (SQLException ex){
            System.out.println(ex);
        }
        conexion = null;
        return conexion;
    }
}
