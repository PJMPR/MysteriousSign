package HogwartLibrary;

import java.util.List;


public class TheBook implements IHaveId{

    int idBook;
    int idHistory;
    int ISBN;
    String title;
    String section;
    boolean availability;
    private List<Author> author;
    
    
    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    public int getIdBook() {
        return idBook;
    }
    
    public int getIdHistory() {
        return idHistory;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }
    
    
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
  

    public List<HogwartLibrary.Author> getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(List<HogwartLibrary.Author> author) {
        this.author = author;
    }

    public String getSection() {
        return section;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
