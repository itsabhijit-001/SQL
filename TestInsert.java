package domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class TestInsert {
 public static void main(String[] args) {
	 String urlMySQL="jdbc:mysql://localhost:3306/hr";
	 String username="root";
	 String password="1234";
	 String val="yes";
	 String name,address,course;
	 int age;
	 Scanner scn=new Scanner(System.in);
	 try {
			Connection conSQL=DriverManager.getConnection(urlMySQL,username,password);
			System.out.println("Connection success");
			do {
			System.out.println("Enter name ");
			name=scn.next();
			System.out.println("Enter age ");
			age=scn.nextInt();
			System.out.println("Enter address");
			address=scn.next();
			System.out.println("Course id ");
			course=scn.next();
			String query="insert into student(name,age,address,courseId) values('"+name+"',"+age+",'"+address+"',"+course+");";
			Statement stmt=conSQL.createStatement();
			int x=stmt.executeUpdate(query);
			System.out.println(x+" recorded.");
			System.out.println("Do you want to continue ('yes' or 'no')");
			val=scn.next();
			}while(val.equals("yes"));
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
	scn.close();
 }
}
