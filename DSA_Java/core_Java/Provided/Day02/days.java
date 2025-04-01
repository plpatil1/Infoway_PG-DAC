import java.util.*;

class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Days :-  ");
       int days=sc.nextInt();
       
       int month, year;
       month=days/30;
       year=days/365;
       month=month-year*12;
       days=days-((month*30)+(year*365));
       
       System.out.println("Year:-  "+year+"   Months:-   "+month+"    Days:-   "+days);
       
    }
}
