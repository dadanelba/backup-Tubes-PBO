/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ceazycoffeeshop.Connection;

/**
 *
 * @author M- Jeek
 */
import java.sql.Connection;
import java.sql.DriverManager;
 
public class Config {
 
    private static Connection conn;
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_NAME = "ceazy";
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/"+DB_NAME+"?serverTimezone=UTC";
    private static final String DB_UNAME = "root";
    private static final String DB_PASS = "";
    
    
    public static Connection getConnection(){
        if(conn == null){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_UNAME, DB_PASS);
            }
        catch (ClassNotFoundException e){
            System.err.format("Class not Found");
            }
        catch (Exception e){
            e.printStackTrace();
            }
        }
        return conn;
    }
}