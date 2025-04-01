import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base Salary  :-  ");
        int bsal = sc.nextInt();

        double gsal, HRA, DA;

        if (bsal < 1500) {
            HRA = bsal * 0.90;  // 90% of bsal
            DA = bsal * 0.90;   // 90% of bsal
        } else {
            HRA = 500;          // Fixed HRA for bsal >= 1500
            DA = bsal * 0.98;   // 98% of bsal
        }

        gsal = bsal + HRA + DA;

        System.out.println("Gross Salary :-  "+ gsal);
        sc.close();
    }
}
