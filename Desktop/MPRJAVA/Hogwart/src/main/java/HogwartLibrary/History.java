package HogwartLibrary;


public class History implements IHaveId{
    
    int idHistory;
    int bookId;
    boolean hire;
    boolean tooLongHire;
    boolean reservation;
    int punishment;

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }

    public int getIdHistory() {
        return idHistory;
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

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
