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
    
    private String insertSql = "INSERT INTO User(\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (1, HarryPotter, Potter35, Harry, Potter, student, Gryffindor)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (2, HermioneGranger, Granger12, Hermione, Granger, student, Gryffindor)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (3, RonWeasley, WeasleyRon9, Ron, Weasley, student, Gryffindor)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (4, MinerwaMcGonagall, McGonagallM, Minerwa, McGonagall, teacher, Gryffindor)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (5, RubeusHagrid, Hagrid14, Rubeus, Hagrid, teacher, Gryffindor)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (6, AlbusDumbledore, Albus45, Albus, Dumbledore, teacher, Gryffindor)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (7, DracoMalfoy, MalfoySlitherin3, Draco, Malfoy, student, Slytherin)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (8, ClaudiaRingroyal, ClaudiaR12, Claudia, Ringroyal, student, Slytherin )\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (9, BlaiseZabini, Zabini89, Blaise, Zabini, student, Slytherin)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (10, PansyParkinson, ParkinsonP2, Pansy, Parkinson, student, Slytherin )\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (11, SeverusSnape, SevSnape10, Severus, Snape, teacher, Slytherin)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (12, DoloresUmbridge, Umbridge01, Dolores, Umbridge, teacher, Slytherin)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (13, ChoChang, Cho1978, Cho, Chang, student, Ravenclaw)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (14, LunaLovegood, LoveLuna, Luna, Lovegood, student, Ravenclaw)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (15, SybillTrelawney, Sybill076, Sybill, Trelawney, teacher, Ravenclaw)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (16, CedrikDiggory, Diggory7, Cedrik, Diggory, student, Hufflepuff)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (17, HannahAbbott, HannahAbb9, Hannah, Abbott, student, Hufflepuff)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (18, PomonaSprout, PomonaS7, Pomona, Sprout, teacher, Hufflepuff)\"\n" +
"\"INSERT INTO user(id,login, password, name, surname, status, house) VALUES (19, IrmaPince, IrmaPince142, Irma, Pince, librarian, Ravenclaw)\"";
    private String deleteSql = "DELETE FROM User WHERE ID = ?"; 
    private String updateSql = "UPDATE FROM User WHERE ID = ?"; 

    private PreparedStatement insert; 
    private PreparedStatement delete; 
    private PreparedStatement update; 

    public UserRepository(Connection connection){
        
       // this.connection = connection;
        
    }
    
}
