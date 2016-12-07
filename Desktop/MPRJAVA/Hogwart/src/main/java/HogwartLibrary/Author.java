/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartLibrary;

import java.awt.print.Book;
import java.util.List;


public class Author implements IHaveId{
    
    private String name;
    private String surname;
    private int idAuthor;
    private List<Book> book;

    public List<Book> getBook() {
        return book;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public void setBook(List<Book> book) {
        this.book = book;
    }
    

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


        
    
}
