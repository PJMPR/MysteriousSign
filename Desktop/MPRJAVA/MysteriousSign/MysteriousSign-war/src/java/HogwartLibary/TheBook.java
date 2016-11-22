
package HogwartLibary;


public class TheBook extends Library {
    
    String title;
    String section;
    boolean availability;

    public String getTitle() {
        return title;
    }

    public String getSection() {
        return section;
    }

    public boolean isAvailability() {
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
