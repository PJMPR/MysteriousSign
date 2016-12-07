/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relationship;

import HogwartLibrary.IHaveId;

/**
 *
 * @author Lenovo
 */
public class BookToAuthor implements IHaveId {
    
    int IdBookToAuthor;
    int idBook;
    int idAuthor;

    public int getIdBook() {
        return idBook;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    public int getIdBookToAuthor() {
        return IdBookToAuthor;
    }

    public void setIdBookToAuthor(int IdBookToAuthor) {
        this.IdBookToAuthor = IdBookToAuthor;
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
