package sample.admin.loginhistory;

public class History {

    private int id;
    private String date;
    private String hour;
    private String login;

    public History(int id, String date, String hour, String login) {
        this.id = id;
        this.date = date;
        this.hour = hour;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
}
