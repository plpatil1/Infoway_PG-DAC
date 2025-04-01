import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Two Numbers  :-  ");
       int n=sc.nextInt();
       int m=sc.nextInt();
       
       //swapping this two Numbers;
       n=n+m;
       m=n-m;
       n=n-m;
       
       
       System.out.println("Swapped Numbers: - "+n+" "+m);
       
    }
}
