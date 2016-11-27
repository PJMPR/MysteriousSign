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
import HogwartLibrary.Author;
import HogwartLibrary.TheBook;



public class AuthorMapper implements IMapResultSetIntoEntity<Author>{


	public Author map(ResultSet rs) throws SQLException {

		Author author = new Author();

		author.setID(rs.getInt("ID"));

		author.setName(rs.getString("Name"));

		author.setSurname(rs.getString("Surname"));

               
                return author;

        }



}