package hib.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class DataStorImpl {
	
	private static final Logger logger = LoggerFactory.getLogger(DataStorImpl.class);
	private static String DbDriverClass = "com.mysql.jdbc.Driver";
	private static String DbUrl = "jdbc:mysql://localhost:3306/";
	private static String userName = "root";
	private static String password = "root";
	
	private Connection connection = null;
	private String connectionUrl = null;
	
	public DataStorImpl(){
		
	}
	
	public void checkConnection(String dbName) throws SQLException {
		
            try {
				Class.forName(DbDriverClass);
				connectionUrl = DbUrl + dbName;
	            this.connection = DriverManager.getConnection(connectionUrl + "?" +"user="+userName+"&password="+password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
            logger.info("Database " + dbName + " connection created");
	}
	
	public void configure(String dbName) throws SQLException {
		
		String createQuery = "CREATE DATABASE "+dbName;
		String existsQuesry = "SELECT SCHEMA_NAME FROM INFORMATION_SCHEMA.SCHEMATA WHERE SCHEMA_NAME = " + "'"+dbName+"'";
		try{
			Statement statement = this.connection.createStatement();
			ResultSet result = statement.executeQuery(existsQuesry);
			if(result.next()){
				logger.error("Sorry..! Database " + dbName + " Already exists");
				System.exit(0);
			}else{
				statement.executeUpdate(createQuery);
			}
		} catch (SQLException e) {
			
		}
		logger.info("Database " + dbName + " created succsefully.");
	}
	
	public void inetial() {
		
		try {
        	connection = DriverManager.getConnection(DbUrl + "?" + "user="+userName+"&password="+password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		logger.info("Connection for Database server created succusefully ");
	}
	
}
