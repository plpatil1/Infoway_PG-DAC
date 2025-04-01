import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Number  :-  ");
       int n=sc.nextInt();
       //reversing the Number
       while(n!=0)
       {
           int a=n%10;
           System.out.print(a);
           n=n/10;
       }
    //   Reverse thee Number
       
    }
}
