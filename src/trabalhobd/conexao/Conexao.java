/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabalhobd.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Alefe Filipe
 */
public class Conexao {
    public Connection getConexao(){
        try{
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java", 
                    "root", 
                    "12345678");
            System.out.println("SUCESSOPORRA");
            Statement stmt = conn.createStatement();
            return conn;
        }catch(Exception e){
            System.out.println("Erro ao conectar: "+e.getMessage());
            return null;
        }
    }
}
