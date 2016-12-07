/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repository;
import HogwartLibrary.Author;
import java.sql.Connection;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import java.sql.PreparedStatement;
import mapper.UserMapper;
import HogwartLibrary.User;

public class UserRepository extends RepoBase<User>{
    
public UserRepository(Connection connection, 

			UserMapper mapper) {

		super(connection, mapper);
	

	}

	

	@Override
	protected String tableName() {

		// TODO Auto-generated method stub

		return "Useer";

	}

	@Override
	protected String createTableSql() {

		// TODO Auto-generated method stub

		return "CREATE TABLE User("

				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"

				+ "login VARCHAR(20)," 

				+ "spassword VARCHAR(20),"
                        
                                + "name VARCHAR(20),"
                        
                                + "surname VARCHAR(20),"
                        
                                + "status VARCHAR(20),"
                        
                                + "house VARCHAR(20),"
                        
                                + "PRIMARY_KEY (id),"

				+ ")";

	}

	@Override
	protected String insertSql() {

		// TODO Auto-generated method stub

		return "INSERT INTO User (id ,login, password, name, surname, status, house) VALUES (?, ?, ?, ?, ?, ?, ?)";
 
	}

	@Override
        protected String deleteSql() {

		// TODO Auto-generated method stub

		return "DELETE FROM User WHERE ID = ?";

	}

	@Override
	protected String updateSql() {

		// TODO Auto-generated method stub

		return "UPDATE User SET id = ?, name = ?, surname = ? WHERE id = ?";

	}

	@Override
	protected String selectByIdSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM User WHERE id=?";

	}

	@Override
	protected String selectAllSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM User";

	}

	

	@Override
        protected void setupInsert(User entity) throws SQLException {

		insert.setInt(1, entity.getId());

		insert.setString(2, entity.getLogin());

		insert.setString(3, entity.getPassword());
                
                insert.setString(4, entity.getName());
                
                insert.setString(5, entity.getSurname());
                
                insert.setString(6, entity.getStatus());
                
                insert.setString(7, entity.getHouse());

		

	}



	@Override
	protected void setupUpdate(User entity) throws SQLException {

		update.setInt(1, entity.getId());

		update.setString(2, entity.getName());

		update.setString(3, entity.getPassword());
                
                update.setString(4, entity.getName());
                
                update.setString(5, entity.getSurname());
                
                update.setString(6, entity.getStatus());
                
                update.setString(7, entity.getHouse());



}

}