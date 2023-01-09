/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import beans.Login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import trabalhobd.conexao.Conexao;

/**
 *
 * @author Alefe Filipe
 */
public class LoginDAO {
   private Conexao conexao;
   private Connection conn;

    public LoginDAO() {
        this.conexao = new Conexao();
        this.conn = this.conexao.getConexao();
    }
   public void inserir(Login login){
       String sql = "INSERT into login(nome,senha,frase) VALUES"+"(?, ?, ?)";
       try{
           PreparedStatement stmt = this.conn.prepareStatement(sql) ;
           stmt.setString(1, login.getNome());
           stmt.setString(2, login.getSenha());
           stmt.setString(3, login.getFrase());
           stmt.execute();
       }
       catch(Exception e){
           System.out.println("Erro ao inserir login: " +e);
       }
       
   }
}
