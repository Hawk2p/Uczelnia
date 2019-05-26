package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6703D54\\PROJEKTSQL;databaseName=master", "nowyUser", "");
        PreparedStatement stm = con.prepareStatement("select * from Wypozyczenie");
        ResultSet wynik_zapytania = stm.executeQuery();

        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(root, 1024, 720));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
