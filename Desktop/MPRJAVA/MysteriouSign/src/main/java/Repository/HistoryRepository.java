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

public class HistoryRepository {
    
     private Statement createTable; 
    
    private String insertSql = "INSERT INTO History(\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (1, 1, 0, 0, 1, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (2, 2, 1, 0, 1, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (3, 3, 0, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (4, 4, 0, 0, 1, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (5, 5, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (6, 6, 1, 0, 1, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (7, 7, 1, 1, 0, 2)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (8, 8, 1, 1, 0, 2)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (9, 9, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (10, 10, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (11, 11, 1, 0, 1, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (12, 12, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (13, 13, 1, 1, 0, 2)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (14, 14, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (15, 15, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (16, 16, 0, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (17, 17, 0, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (18, 18, 1, 0, 0, 0)\"\n" +
"\"INSERT INTO history(id, userId, hire, TooLongHire, reservation, punishment) VALUES (19, 19, 0, 0, 0, 0)\")";
    private String deleteSql = "DELETE FROM History WHERE ID = ?"; 
    private String updateSql = "UPDATE FROM History WHERE ID = ?"; 

    private PreparedStatement insert; 
    private PreparedStatement delete; 
    private PreparedStatement update; 

    public HistoryRepository(Connection connection){
        
       // this.connection = connection;
        
    }
    
}
