import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  Celsius  :-  ");
        float  f = sc.nextInt();
        float c;
        c=5*(f-32)/9;
        System.out.println("Temperature in Celsius:  "+c);
        
        
        
        sc.close();
    }
}
