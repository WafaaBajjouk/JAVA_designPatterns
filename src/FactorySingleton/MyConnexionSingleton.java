package FactorySingleton;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.SQLException;


public class MyConnexionSingleton  {
	
	private static Connection conn;

	private MyConnexionSingleton() {
		
	}
	
		
			public static Connection getInstance(){
		
			
			// charger le driver
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			
			//Ouvrir le connexion
			conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/GestionCabinet","root","");
//			System.out.println("Connected to DB");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return conn;
				
				}
	}

