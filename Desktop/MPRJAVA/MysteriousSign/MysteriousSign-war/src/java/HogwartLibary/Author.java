/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HogwartLibary;


public class Author extends TheBook{
    
    private String name;
    private String surname;
    private int ID;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
        
    
}
