package HogwartLibrary;


public class User implements IHaveId{
    
    int idUser;
    String login;
    String password;
    String name;
    String surname;
    String status;
    String house;
    int idHistory;

    public int getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }
    

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setHouse(String house) {
        this.house = house;
    }
    

    public int getIdUser() {
        return idUser;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getStatus() {
        return status;
    }

    public String getHouse() {
        return house;
    }
  
    public void History() {
    
    
    }

    @Override
    public int getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}