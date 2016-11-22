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


public class AuthorRepository {
    
    private Statement createTable; 
    
    private String insertSql = "INSERT INTO Author(stringName, stringSurname, keyID) VALUES (?,?,?)";
    private String deleteSql = "DELETE FROM Author WHERE ID = ?"; 
    private String updateSql = "UPDATE FROM Author WHERE ID = ?"; 

    private PreparedStatement insert; 
    private PreparedStatement delete; 
    private PreparedStatement update; 

    public AuthorRepository(Connection connection){
        
       // this.connection = connection;
        
    }
}
      /// if(!tableExists){ 
   // createTable.executeUpdate(createTableSql); 

   // selectById = connection.prepareStatement(selectByIdSql); 
   // selectAll = connection.prepareStatement(selectAllSql); 
    

   // catch (SQLException e) { 
    //   e.printStackTrace(); 
   // }


//}
