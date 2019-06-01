package sample;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import sample.admin.loginhistory.History;
import sample.admin.loginhistory.LoginHistory;
import sun.plugin.javascript.navig.Anchor;

import java.io.IOException;
import java.sql.*;


public class Controller {

    @FXML
    private StackPane container;
    @FXML
    private TextField loginField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button logout;
    @FXML
    private Button closeButton;
    @FXML
    private Button addUserButton;
    @FXML
    private Button deleteUserButton;
    @FXML
    private AnchorPane adminForms;
    @FXML
    private TextField adminPanelUserName;
    @FXML
    private PasswordField adminPanelPassword;
    @FXML
    private CheckBox adminCheck;
    @FXML
    private AnchorPane fullContainer;
    @FXML
    private StackPane addDeleteStackPane;


    private ObservableList<History> logins;


    @FXML
    public void close(){
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void loging() throws ClassNotFoundException, SQLException, IOException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6703D54\\PROJEKTSQL;databaseName=master", "nowyUser", "gienek123");
        PreparedStatement query = con.prepareStatement("SELECT * FROM Uzytkownik WHERE nazwa_uzytkownika = ? AND haslo_uzytkownika = ?");
        query.setString(1,getLoginField().getText());
        query.setString(2,getPasswordField().getText());
        ResultSet result = query.executeQuery();
        if(result.next()){
            Data data = new Data(getLoginField().getText());
            if(result.getString(4).equals("1")){
                logout.setVisible(true);
                AnchorPane adminPanel = FXMLLoader.load(getClass().getResource("admin/AdminPanel.fxml"));
                container.getChildren().clear();
                container.getChildren().addAll(adminPanel);
            } else {
                logout.setVisible(true);
                AnchorPane userPanel = FXMLLoader.load(getClass().getResource("user/UserPanel.fxml"));
                container.getChildren().clear();
                container.getChildren().addAll(userPanel);
            }
        }
    }



    @FXML
    public void logOut() throws IOException {
        container.getChildren().clear();
        AnchorPane logOut = FXMLLoader.load(getClass().getResource("sample.fxml"));
        fullContainer.getChildren().add(logOut);
        logout.setVisible(false);
    }

    @FXML
    public void addUser(){
        addDeleteStackPane.getChildren().clear();
        addDeleteStackPane.getChildren().add(adminForms);
        adminForms.setVisible(true);
        adminCheck.setVisible(true);
        addUserButton.setVisible(true);
        deleteUserButton.setVisible(false);
    }
    @FXML
    public void deleteUser(){
        addDeleteStackPane.getChildren().clear();
        addDeleteStackPane.getChildren().add(adminForms);
        adminForms.setVisible(true);
        adminCheck.setVisible(false);
        addUserButton.setVisible(false);
        deleteUserButton.setVisible(true);

    }
    @FXML
    public void editUser() throws IOException {
        addDeleteStackPane.getChildren().clear();
        AnchorPane editUserPane = FXMLLoader.load(getClass().getResource("admin/editUser.fxml"));
        addDeleteStackPane.getChildren().add(editUserPane);

    }
    @FXML
    public void showLogs(){
        addDeleteStackPane.getChildren().clear();


    }

    @FXML
    public void addUserToBase() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6703D54\\PROJEKTSQL;databaseName=master", "nowyUser", "gienek123");
        PreparedStatement query = con.prepareStatement("INSERT INTO Uzytkownik(nazwa_uzytkownika,haslo_uzytkownika,czy_admin) VALUES" +
                "(?,?,?)");
        query.setString(1,adminPanelUserName.getText());
        query.setString(2,adminPanelPassword.getText());
        if(adminCheck.isSelected()){
            query.setString(3,"1");
        }else{
            query.setString(3,"0");
        }
        query.executeUpdate();
        con.close();
        adminPanelUserName.clear();
        adminPanelPassword.clear();
        adminCheck.setSelected(false);
    }

    @FXML
    public void deleteUserFromBase() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6703D54\\PROJEKTSQL;databaseName=master", "nowyUser", "gienek123");
        PreparedStatement query = con.prepareStatement("DELETE FROM Uzytkownik WHERE nazwa_uzytkownika = ? AND haslo_uzytkownika = ?");
        query.setString(1,adminPanelUserName.getText());
        query.setString(2,adminPanelPassword.getText());
        query.executeUpdate();
        con.close();
        adminPanelUserName.clear();
        adminPanelPassword.clear();
    }

    public TextField getLoginField() {
        return loginField;
    }

    public void setLoginField(TextField loginField) {
        this.loginField = loginField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(PasswordField passwordField) {
        this.passwordField = passwordField;
    }
}

