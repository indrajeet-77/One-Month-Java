package Basics;
/*
byte   → tiny numbers
int    → normal integers
long   → huge integers
float  → small decimals
double → precise decimals
char   → single character
boolean → yes/no
 */

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Following are the data types in java");

        byte age=24;
        short year=2025;
        int population =1400000000;

        long PhoneNumber= 987654321L;

        float height=5.9f;
        double cgpa=7.91;

        char grade='A';

        boolean is_passed=true;
        System.out.println("Age: " + age);
        System.out.println("Year: " + year);
        System.out.println("Population: " + population);
        System.out.println("Phone Number: " + PhoneNumber);

        System.out.println("Height: " + height);
        System.out.println("CGPA: " + cgpa);

        System.out.println("Grade: " + grade);

        System.out.println("Is Java Fun? " + is_passed);

    }
    
}
