
package classWork;
import java.util.ArrayList;

public class CrudOperation {
	 public static void main(String[] args) {
	  
	        ArrayList<String> fruits = new ArrayList<>();

	        
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Grapes");
	        System.out.println("CREATE: " + fruits);

	        
	        String firstFruit = fruits.get(0);
	        System.out.println("READ: " + firstFruit);
  
	        fruits.set(2, "Orange");
	        System.out.println("UPDATE: " + fruits);

	        fruits.remove("Cherry");
	        System.out.println("DELETE: " + fruits);

	        System.out.println("Final ArrayList: " + fruits);
	    }
}

