package SahanaHS_QATtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
		String username = "SYSTEM";
		String password = "sahanahs";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		
		String createQuery="CREATE TABLE employee (emplid NUMBER(2),FNAME VARCHAR(20),LNAME VARCHAR(20),ADDR VARCHAR(20))";
		stmt.executeUpdate(createQuery);
		String insertRecord1="INSERT INTO employee VALUES(1,'ANU','L','Hassan')";
		stmt.executeUpdate(insertRecord1);
		String insertRecord2="INSERT INTO employee VALUES(2,'aa','raj','Mumbai')";
		stmt.executeUpdate(insertRecord2);
		String insertRecord3="INSERT INTO employee VALUES(3,'manu','raj','dehli')";
		stmt.executeUpdate(insertRecord3);
		String insertRecord4="INSERT INTO employee VALUES(4,'sanu','raj','beng')";
		stmt.executeUpdate(insertRecord4);
		
		String UpdateQuery=" Update employee SET lname='HS' where emplid=3 " ;
		stmt.executeQuery(UpdateQuery);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM employee ");
		System.out.println("Records of table are");
		
		while(rs.next()) {
			
			System.out.println(rs.getString("emplid") + " : " +  rs.getString("fname") + " : "+rs.getString("lname") + " : " +  rs.getString("addr") + " : " );
		}
		con.close();
		
	}

}
