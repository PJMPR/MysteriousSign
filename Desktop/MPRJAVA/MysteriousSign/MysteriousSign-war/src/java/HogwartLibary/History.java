
package HogwartLibary;


public class History extends User {
    
    int hire;
    int tooLongHire;
    int reservation;
    int punishment;

    public int getHire() {
        return hire;
    }

    public int getTooLongHire() {
        return tooLongHire;
    }

    public int getReservation() {
        return reservation;
    }

    public int getPunishment() {
        return punishment;
    }

    public void setHire(int hire) {
        this.hire = hire;
    }

    public void setTooLongHire(int tooLongHire) {
        this.tooLongHire = tooLongHire;
    }

    public void setReservation(int reservation) {
        this.reservation = reservation;
    }

    public void setPunishment(int punishment) {
        this.punishment = punishment;
    }
    
    
}
