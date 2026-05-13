/*
| Method        | Used For             |
| ------------- | -------------------- |
| nextInt()     | Integer              |
| nextDouble()  | Decimal              |
| nextFloat()   | Float                |
| nextLong()    | Long                 |
| next()        | Single word          |
| nextLine()    | Full sentence/string |
| nextBoolean() | true/false           |

 */
package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.println("Enter Your Age : ");
        int age = sc.nextInt();

        System.out.println("Enter Your Phone CGPA : ");
        double cgpa = sc.nextDouble();

        System.out.println("Students Information");

        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
        System.out.println("Student CGPA : " + cgpa);
        if (agecheck(age)) {
            System.out.println("Student is adult");
        } else {
            System.out.println("Student is minor");
        }
        ;
        sc.close();
    }
// Here i have created a function which checks of student if hes minor or adult and returns true or false
    public static boolean agecheck(int age) {

        if (age >= 18) {
            return true;

        } else {
            return false;
        }

    }

}
