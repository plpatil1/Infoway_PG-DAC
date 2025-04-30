package DsaStack;

import java.util.Scanner;

public class MyStack {
  public static void main(String[] args) {
	intStack i = new intStack();
	int cd;
	do {
		System.out.println("Menu");
		System.out.println("Enter 1. for push()");
		System.out.println("Enter 2. for pop()");
		System.out.println("Enter 3. for peek()");
		System.out.println("Enter 4. for isEmpty()");
		System.out.println("Enter 5. for isFull()");
		System.out.println("Enter 6. for size()");
		System.out.println("Enter 7. for Exit!");
		
		Scanner sc = new Scanner(System.in);
		 cd =sc.nextInt();
		
		switch(cd) {
		case 1:{
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Enter Value: ");
			int push = sc.nextInt();
			i.push(push);
			System.out.println("Value Pushed Sucessfully ");
			System.out.println("-------------------------------------------------------------------------------------------------");
			break;
		}
		case 2: {
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Are you Sure to Pop Element (y/n): ");
			char ch = sc.next().charAt(0);
			if(ch=='y')
			{
				
				System.out.println("Element Pop Sucessfully "+i.pop());
				break;
				
			} else {
				System.out.println("Thanks!");
				System.out.println("-------------------------------------------------------------------------------------------------");

				continue;
			}
			
		
		}
		case 3: {
			System.out.println("-------------------------------------------------------------------------------------------------");
			
			System.out.println("Peek Element: "+i.peek());
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			break;
			
		}
		case 4: {
            System.out.println("-------------------------------------------------------------------------------------------------");
			
			System.out.println(i.isEmpty());
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			break;
		}
		case 5: {
            System.out.println("-------------------------------------------------------------------------------------------------");
			
			System.out.println(i.isFull());
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			break;
		}
		case 6: {
            System.out.println("-------------------------------------------------------------------------------------------------");
			
			System.out.println(i.size());
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			break;
		}
		default :{
			System.out.println("----------------------------------------------------------------------------");
			System.out.println("OPPSSSS!!!!  Invalid Entery...........");
			System.out.println("----------------------------------------------------------------------------");
		}
		}




	} while(cd!=7);
	System.out.println("Thanks.......!!");
}
}
