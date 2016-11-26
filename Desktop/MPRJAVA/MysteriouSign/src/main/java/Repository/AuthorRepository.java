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
    
    private String insertSql = "INSERT INTO Author(\"INSERT INTO author(id, name, surname) VALUES (1, Bathilda, Bagshot)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (2, Eduardo, Limus)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (3, Phyllida, Spore)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (4, Emeric, Switch)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (5, Libatius, Borage )\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (6, Arsenius, Budge)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (7, Arsenius, Jigger)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (8, Quentin, Trimble)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (9, Wilbert, Slinkhard)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (10, Catullus, Spangle)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (11, Vindictus, Viridian)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (12, Franciscus, Fieldwake)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (13, Inigo, Imago)\"\n" +
"\"INSERT INTO author(id, name, surname) VALUES (14, Cassandra, Vablatsky)\"";
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
