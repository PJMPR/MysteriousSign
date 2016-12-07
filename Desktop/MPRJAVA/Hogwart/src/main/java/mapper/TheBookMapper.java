/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import Repository.IRepository;
import HogwartLibrary.TheBook;

    public class TheBookMapper implements IMapResultSetIntoEntity<TheBook>{


	public TheBook map(ResultSet rs) throws SQLException {

		TheBook theBook = new TheBook();

                theBook.setIdBook(rs.getInt("ID_Book"));

		theBook.setISBN(rs.getInt("ISBN"));

		theBook.setTitle(rs.getString("Name"));

		theBook.setSection(rs.getString("Surname"));
                
                theBook.setAvailability(rs.getBoolean("Surname"));

               
                return theBook;

        }



}

