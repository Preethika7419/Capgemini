package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	public static Connection getConnection() throws Exception {
		
	      String driverName = "org.postgresql.Driver";
		  Class.forName(driverName);
		  Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Evehicle","postgres", "preethi");
				
		return conn;
	}


}
