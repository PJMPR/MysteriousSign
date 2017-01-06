package HogwartLibrary;


public class History extends User {
    
    int id;
    int userId;
    boolean hire;
    boolean tooLongHire;
    boolean reservation;
    int punishment;


    public void setId(int id) {
        this.id = id;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public boolean getHire() {
        return hire;
    }

    public boolean getTooLongHire() {
        return tooLongHire;
    }

    public boolean getReservation() {
        return reservation;
    }

    public int getPunishment() {
        return punishment;
    }

    public void setHire(boolean hire) {
        this.hire = hire;
    }

    public void setTooLongHire(boolean tooLongHire) {
        this.tooLongHire = tooLongHire;
    }

    public void setReservation(boolean reservation) {
        this.reservation = reservation;
    }

    public void setPunishment(int punishment) {
        this.punishment = punishment;
    }
    
    
}
