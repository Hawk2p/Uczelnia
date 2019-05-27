package sample.admin;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import javax.xml.soap.Text;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AdminPanel {

    @FXML
    TextField oldUserName;
    @FXML
    PasswordField oldUserPassword;
    @FXML
    TextField newUserName;
    @FXML
    PasswordField newUserPassword;
    @FXML
    CheckBox adminCheck;
    @FXML
    Button editUser;

    public void editUser() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6703D54\\PROJEKTSQL;databaseName=master", "nowyUser", "gienek123");
        PreparedStatement query = con.prepareStatement("UPDATE Uzytkownik SET nazwa_uzytkownika = ?, haslo_uzytkownika = ?, czy_admin = ? WHERE" +
                " nazwa_uzytkownika = ? AND haslo_uzytkownika = ?");
        query.setString(1,newUserName.getText());
        query.setString(2,newUserPassword.getText());
        if(adminCheck.isSelected()){
            query.setString(3,"1");
        }else{
            query.setString(3,"0");
        }
        query.setString(4,oldUserName.getText());
        query.setString(5,oldUserPassword.getText());
        query.executeUpdate();
        con.close();
    }





}
