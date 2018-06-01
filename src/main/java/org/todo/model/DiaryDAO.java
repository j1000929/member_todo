package org.todo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DiaryDAO {
	
	private static final String URL = "jdbc:mysql://192.168.0.212/member_todo?useSSL=no&characterEncoding=utf8";
	private static final String USER = "jungmin";
	private static final String PW = "joeun911!";
	
	private Connection conn = null;
	private PreparedStatement ps;
	
	public Connection getConnection() {
	
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USER, PW);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
		
		return conn;
	}//getConnection()
	
	public void disConnection() {
		try 
        { 
            if(ps != null) ps.close(); 
            if(conn != null) conn.close(); 
        } 
        catch(Exception ex) 
        { 
            System.out.println("Diary disConnection():"+ex.getMessage()); 
        } 

	}//disConnection()
	
	//
	
}
