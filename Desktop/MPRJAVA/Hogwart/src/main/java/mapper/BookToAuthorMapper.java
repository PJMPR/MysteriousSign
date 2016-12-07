/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;
import Relationship.BookToAuthor;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BookToAuthorMapper implements IMapResultSetIntoEntity<BookToAuthor>{
    
    
	public BookToAuthor map(ResultSet rs) throws SQLException {

		BookToAuthor bookToAuthor = new BookToAuthor();

		bookToAuthor.setIdBookToAuthor(rs.getInt("IdBookToAuthor"));

		bookToAuthor.setIdBook(rs.getInt("IdBook"));

		bookToAuthor.setIdAuthor(rs.getInt("IdAuthor"));

               
                return bookToAuthor;

        }
    
}
