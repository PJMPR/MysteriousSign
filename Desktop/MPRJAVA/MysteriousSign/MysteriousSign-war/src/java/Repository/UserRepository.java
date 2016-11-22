/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;
import java.sql.Connection;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.sql.PreparedStatement;

public class UserRepository {
    
     private Statement createTable; 
    
    private String insertSql = "INSERT INTO User(bigintID, stringName, stringLogin, stringPassword, stringSurname, stringStatus, stringHouse) VALUES (?,?,?,?,?,?,?)";
    private String deleteSql = "DELETE FROM User WHERE ID = ?"; 
    private String updateSql = "UPDATE FROM User WHERE ID = ?"; 

    private PreparedStatement insert; 
    private PreparedStatement delete; 
    private PreparedStatement update; 

    public UserRepository(Connection connection){
        
       // this.connection = connection;
        
    }
    
}
