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
public class HistoryToUser implements IHaveId {
    
    int idHistoryToUser;
    int idUser;
    int idHistory;

    public int getIdUser() {
        return idUser;
    }

    public int getIdHistory() {
        return idHistory;
    }


    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }

    public int getIdHistoryToUser() {
        return idHistoryToUser;
    }

    public void setIdHistoryToUser(int idHistoryToUser) {
        this.idHistoryToUser = idHistoryToUser;
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       
    
    
    
}
