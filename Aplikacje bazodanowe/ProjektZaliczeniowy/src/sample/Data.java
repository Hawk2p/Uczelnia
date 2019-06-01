package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Data {

    public Data(String login) throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-6703D54\\PROJEKTSQL;databaseName=master", "nowyUser", "gienek123");
        PreparedStatement query = con.prepareStatement("INSERT INTO Logowanie(data_logowania,godzina_logowania,nazwa_logowania) VALUES" +
                "(getdate(),concat(DATEPART(hour,getdate()),':',DATEPART(minute,GETDATE())),?)");
        query.setString(1,login);
        query.executeUpdate();
        con.close();
    }

}
