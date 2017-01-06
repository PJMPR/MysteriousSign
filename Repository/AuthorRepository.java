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
import HogwartLibrary.Author;
import mapper.AuthorMapper;

public class AuthorRepository {

    private PreparedStatement insert; 
    private PreparedStatement delete; 
    private PreparedStatement update; 


	public AuthorRepository(Connection connection, 

			AuthorMapper mapper,

			IRepository<Author> AuthorRepository) {

		super(connection, mapper);
	

	}

	

	@Override
	protected String tableName() {

		// TODO Auto-generated method stub

		return "Author";

	}

	@Override
	protected String createTableSql() {

		// TODO Auto-generated method stub

		return "CREATE TABLE Author("

				+ "id bigint GENERATED BY DEFAULT AS IDENTITY,"

				+ "name VARCHAR(20)," 

				+ "surname VARCHAR(20),"

				+ ")";

	}

	@Override
	protected String insertSql() {

		// TODO Auto-generated method stub

		return "INSERT INTO Author (id, name, surname) VALUES (?, ?, ?)";

	}

	@Override
        protected String deleteSql() {

		// TODO Auto-generated method stub

		return "DELETE FROM Author WHERE ID = ?";

	}

	@Override
	protected String updateSql() {

		// TODO Auto-generated method stub

		return "UPDATE Author SET id = ?, name = ?, surname = ? WHERE id = ?";

	}

	@Override
	protected String selectByIdSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM Author WHERE id=?";

	}

	@Override
	protected String selectAllSql() {

		// TODO Auto-generated method stub

		return "SELECT * FROM Author";

	}

	

	@Override
        protected void setupInsert(Author entity) throws SQLException {

		insert.setInt(1, entity.getID());

		insert.setString(2, entity.getName());

		insert.setString(3, entity.getSurname());

		

	}



	@Override
	protected void setupUpdate(Author entity) throws SQLException {

		update.setDouble(1, entity.getID());

		update.setString(2, entity.getName());

		update.setString(3, entity.getSurname());



}

}