package dimka.blinb.collection.utilities;

import java.sql.*;

public class ORM_API {
    private static final String url = "jdbc:postgresql://localhost:5432/studs";
    private static final String user = "admin";
    private static final String password = "admin";
    private static Connection connection;
    private static Statement stmt;
    private static PreparedStatement preparedStatement;
    private static ResultSet rs;

    
}
