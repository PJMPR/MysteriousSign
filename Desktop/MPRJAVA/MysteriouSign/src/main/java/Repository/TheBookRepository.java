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

public class TheBookRepository {
    
     private Statement createTable; 
    
    private String insertSql = "INSERT INTO TheBook(\"INSERT INTO book(isbn, title, section, availability) VALUES (9782452657412, A History of Magic , History, 1)\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9786255282050, Olde and Forgotten Bewitchments and Charmes, History, 0 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9782014505860, One Thousand Magical Herbs and Fungi, Herbology, 0)\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9786297785837, A Beginner's Guide to Transfiguration, Transfiguration, 0)\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9783012114459, Advanced Potion-Making, Potions, 1 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9783712545851, Magical Drafts and Potions, Potions, 1 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9785865203202, The Essential Defence Against the Dark Arts, Defensive/Offensive Spells, 0 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9786303562978, The Dark Forces: A Guide to Self-Protection, Defensive/Offensive Spells, 1 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9786903566572, Defensive Magical Theory, Defensive/Offensive Spells, 0 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9786453820522, Charms of Defence and Deterrence, Defensive/Offensive Spells, 0 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9780105050557, Curses and Counter-Curses, Defensive/Offensive Spells, 0 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9783820052783, Protection Charm Your Mind: A Practical Guide to Counter Legilimensy, Defensive/Offensive Spells, 1 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9786752786862, The Dream Oracle, Divination, 0 )\"\n" +
"\"INSERT INTO book(isbn, title, section, availability) VALUES (9782011857722, Unfogging the Future, Divination, 0 )\")";
    private String deleteSql = "DELETE FROM TheBook WHERE ID = ?"; 
    private String updateSql = "UPDATE FROM TheBook WHERE ID = ?"; 

    private PreparedStatement insert; 
    private PreparedStatement delete; 
    private PreparedStatement update; 
    
    

    
    
    
    public TheBookRepository(Connection connection){
        
       // this.connection = connection;
        
    }
    
}