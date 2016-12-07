/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapper;

import Relationship.HistoryToUser;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class HistoryToUserMapper implements IMapResultSetIntoEntity<HistoryToUser>{
    
    
	public HistoryToUser map(ResultSet rs) throws SQLException {

		HistoryToUser historyToUser = new HistoryToUser();

		historyToUser.setIdHistoryToUser(rs.getInt("IdHistoryToUser"));

		historyToUser.setIdHistory(rs.getInt("IdHistory"));

		historyToUser.setIdUser(rs.getInt("IdUser"));

               
                return historyToUser;

        }
}
    
