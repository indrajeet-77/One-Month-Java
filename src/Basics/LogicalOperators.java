package Basics;
/*

| Operator | Meaning |
| -------- | ------- |
| &&       | AND     |
| ||       | OR      |
| !        | NOT     |


Understanding
AND &&

# Both conditions must be true.

OR ||

At least one true.

NOT !

Reverses result.

*/
public class LogicalOperators {
    public static void main(String[] args){
        int age=22;
        System.out.println(age>18 && age<30);
        System.out.println(age>30 || age<25);
        System.out.println(!(age>18));
    }
}
