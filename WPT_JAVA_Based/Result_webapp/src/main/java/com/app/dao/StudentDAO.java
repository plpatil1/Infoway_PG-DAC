package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.bean.Student;

public class StudentDAO {
	
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Connection con=null;
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/group027", "root", "");
		return con;
	}
	
	public static int registerStudent(Student s) throws ClassNotFoundException, SQLException {
		int i=0; 
		try {
			Connection con =getConnection();
			PreparedStatement stmt = con.prepareStatement("insert into result(prn,name, sub1, sub2, sub3) values(?,?,?,?,?)");
			stmt.setInt(1, s.getPrn());
			stmt.setString(2, s.getName());
			stmt.setFloat(3, s.getS1());
			stmt.setFloat(4, s.getS2());
			stmt.setFloat(5, s.getS3());
			i=stmt.executeUpdate();
			return i;
		}catch(Exception e) { return i;}
		
		
	}
	
	public static Student getStudentByPrn(int prn) throws ClassNotFoundException, SQLException{
		
		Student s = new Student();
		
		Connection con = getConnection();
		PreparedStatement stmt = con.prepareStatement("select * from student where prn=?");
		stmt.setInt(1, prn);
		ResultSet sr = stmt.executeQuery();
		boolean status = sr.next();
		if(status) {
			s.setPrn(sr.getInt(1));
			s.setName(sr.getString(2));
			s.setS1(sr.getFloat(3));
			s.setS2(sr.getFloat(4));
			s.setS3(sr.getFloat(5));
			
		} else {
			return null;
		}
		return s;
	}

}
