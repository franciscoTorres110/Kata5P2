package view;

import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import model.Mail;

public class MailListReaderBD {

    private Connection connect() {
        Connection conn = null;
        try {
            // parámetros de la BD
            String url = "jdbc:sqlite:mail.db";
            // creamos una conexión a la BD
            conn = DriverManager.getConnection(url);
            System.out.println("Connexión a SQLite establecida");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
    }

    public List<Mail> selectAll(){
        List<Mail> mails = new ArrayList<>();
        String sql = "SELECT * FROM direcc_email";
        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            // Bucle sobre el conjunto de registros.
            while (rs.next()) {
                Mail m = new Mail(rs.getString("direccion"));
                mails.add(m);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return mails;
    }
}
