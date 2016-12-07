/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartLibrary;

import Repository.AuthorRepository;
import Repository.BookToAuthorRepository;
import Repository.HistoryRepository;
import Repository.HistoryToBookRepository;
import Repository.HistoryToUserRepository;
import Repository.TheBookRepository;
import Repository.UserRepository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import mapper.AuthorMapper;
import mapper.BookToAuthorMapper;
import mapper.HistoryMapper;
import mapper.HistoryToBookMapper;
import mapper.HistoryToUserMapper;
import mapper.TheBookMapper;
import mapper.UserMapper;

public class App 

{

    public static void main( String[] args )

    {
    	String url = "jdbc:hsqldb:hsql://localhost/hogwartlibrary";

    	try {
			
                        Connection connection = DriverManager.getConnection(url);
                        
			
			UserRepository userRepo = new UserRepository(connection, new UserMapper());

			HistoryRepository historyRepo = new HistoryRepository(connection, new HistoryMapper());

			AuthorRepository authorRepo = new AuthorRepository(connection, new AuthorMapper());

			TheBookRepository theBookRepo = new TheBookRepository(connection, new TheBookMapper());
                        
                        BookToAuthorRepository bookToAuthor = new BookToAuthorRepository(connection, new BookToAuthorMapper());
                        
                        HistoryToBookRepository historyToBook = new HistoryToBookRepository(connection, new HistoryToBookMapper());
                        
                        HistoryToUserRepository historyToUser = new HistoryToUserRepository(connection, new HistoryToUserMapper());
 
			
		} catch (SQLException e) {

			e.printStackTrace();

		}


        

    }

}
