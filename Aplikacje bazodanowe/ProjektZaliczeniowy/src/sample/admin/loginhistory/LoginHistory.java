package sample.admin.loginhistory;


import javafx.fxml.FXML;

import javax.xml.soap.Text;

public class LoginHistory {

    @FXML
    private Text id;
    @FXML
    private Text logDate;
    @FXML
    private Text logHour;
    @FXML
    private Text login;

    public void setId(Text id) {
        this.id = id;
    }

    public void setLogDate(Text logDate) {
        this.logDate = logDate;
    }

    public void setLogHour(Text logHour) {
        this.logHour = logHour;
    }

    public void setLogin(Text login) {
        this.login = login;
    }
}
