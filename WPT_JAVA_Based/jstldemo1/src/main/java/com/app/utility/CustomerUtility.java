package com.app.utility;

import com.app.bean.*;
import java.util.ArrayList;
import java.util.List;
import com.app.bean.*;

public class CustomerUtility {
	
	public static List<Customer> getCustomer(){
		List<Customer> l = new ArrayList<Customer>();
		l.add(new Customer("Pawan", "Lekurwale", "plpatil1151@gmail.com", true));
		l.add(new Customer("Himanshu", "Dhoble", "hdoble@gmail.com", true));
		l.add(new Customer("Yash", "Mundhe", "yash@gmail.com", true));
		l.add(new Customer("Prasad", "Patil", "ppatil@gmail.com", false));
		l.add(new Customer("Sagar", "Mali", "hagar@gmail.com", true));
		
		
		return l;
	}
	
	
	

}
