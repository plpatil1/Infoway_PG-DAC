package com.app;
import java.util.List;
import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.app.entity.Student;
public class App {
public static void main(String[] args) {
	//1. Create SessionFactory
	SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
	//2. Create Session
	Session session = factory.openSession();
	//3. Begin Transaction
	session.beginTransaction();
	//4. Save the Entity
	Scanner sc = new Scanner(System.in);
	
	//get Entity on Basis of ID
//	
//	System.err.println("Enter id ");
//	
//	int id = sc.nextInt();
//	Student student = session.get(Student.class, id);
//	System.out.println(student);
	
	//Update by id
	
//	System.out.println("Enter id :- ");
//	int id = sc.nextInt();
//	Student stud  = session.get(Student.class, id);
//	System.out.println(stud);
//	System.out.println("Enter First_Name: ");
//	stud.setFirstName(sc.next());
//	System.out.println("Enter Last_Name: ");
//    stud.setLastName(sc.next());
//    System.out.println("Enter EmailID: ");
//    stud.setEmail(sc.next());
//    
//    session.update(stud);
	
	
	// Delete by id
//	System.out.println("Enter Id here: ");
//	int id = sc.nextInt();
//	
//	Student stud = session.get(Student.class, id);
//	session.delete(stud);
	
	//List of Student
	
	Query query = session.createQuery("from Student");
	List<Student> list = query.list();
	
	list.forEach(x -> System.out.println(x));
	
	
	//5. Commit
	session.getTransaction().commit();
	//6. Session Close
	session.close();
	//7. SessionFactory Close
	factory.close();
}
}
