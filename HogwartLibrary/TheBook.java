package HogwartLibrary;

import java.util.List;


public class TheBook extends Library {
    
    int ISBN;
    String title;
    String section;
    boolean availability;
    private List<Author> author;
    
    
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


    
}
