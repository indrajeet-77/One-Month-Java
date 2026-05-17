package DSA.Arrays;

public class SumOfArray {
                public static void main(String[] args) {
                    int[] arr={10,20,40,55,79,88,34,60,67,26};
                    int sum=0;
                    for (int num:arr){
                        sum+=num;
                    }
                    System.out.println("SUM of the array is "+ sum);
                }    
}
