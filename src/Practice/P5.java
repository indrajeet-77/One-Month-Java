package Practice;

import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {
        /*
         * 5!= 5*4*3*2*1=120
         * 
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find the factorial: ");
        int num = sc.nextInt();
        int total = 1;
        for (; num >= 1; num--) {
            total *= num;

        }
        System.out.println(total);
        sc.close();
    }

}
