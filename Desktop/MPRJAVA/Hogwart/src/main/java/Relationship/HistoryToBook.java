/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Relationship;

import HogwartLibrary.History;
import HogwartLibrary.IHaveId;
import HogwartLibrary.TheBook;

public class HistoryToBook implements IHaveId  {
    
    int idHistoryToBook;
    int idHistory;
    int idBook;

    public int getIdHistory() {
        return idHistory;
    }

    public int getIdBook() {
        return idBook;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdHistoryToBook() {
        return idHistoryToBook;
    }

    public void setIdHistoryToBook(int idHistoryToBook) {
        this.idHistoryToBook = idHistoryToBook;
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
