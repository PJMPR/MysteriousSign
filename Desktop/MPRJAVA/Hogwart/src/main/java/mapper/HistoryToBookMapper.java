/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import Relationship.HistoryToBook;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class HistoryToBookMapper implements IMapResultSetIntoEntity<HistoryToBook>{
    
    
	public HistoryToBook map(ResultSet rs) throws SQLException {

		HistoryToBook historyToBook = new HistoryToBook();

		historyToBook.setIdHistoryToBook(rs.getInt("IdHistoryToBook"));

		historyToBook.setIdHistory(rs.getInt("IdHistory"));

		historyToBook.setIdBook(rs.getInt("IdBook"));

               
                return historyToBook;

        }
    
}
    

