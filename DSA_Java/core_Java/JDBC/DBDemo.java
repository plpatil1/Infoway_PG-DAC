import java.sql.*;
import java.util.Scanner;

public class DBDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Scanner sc=new Scanner(System.in);
	String name;
	double salary;
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver Found...");
	
	Connection con=DriverManager.getConnection("jdbc:mysql://192.168.100.80/group027", "group027", "welcome");
	
	System.out.println("COnnections Establish...");
	System.out.println("Enter the Name:- ");
	name=sc.next();
	System.out.println("Enter the Salary:-  ");
	salary=sc.nextDouble();
	
	PreparedStatement p=con.prepareStatement("insert into JDBC(name, salary) values(?,?)");
	p.setString(1, name);
	p.setDouble(2, salary);
	
	int i=p.executeUpdate();
	if(i==1)
	{
		System.out.println("SucessFully Inserted..........");
	}
	
}
}
