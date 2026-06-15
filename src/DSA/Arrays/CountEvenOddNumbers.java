package.DSA.Arrays;
public class CountEvenOddNumbers{
public static void main(String[] args) {
    int [] arr= {1,2,3,4,5,6,7,8};
    int e=0;
    int o=0;
    for(int num : arr){
        if num%2==0{
            e++;
        }
        else{
            o++;
        }
    }
    System.out.println("Count of even nums "+e);
    System.out.println("Count of Odd nums :"+o);
}}