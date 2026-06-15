package DSA.Arrays;

public class FindLargestNumber {
    public static void main(String[] args) {
        int[] arr = { 90, 987, 824, 8273, 268714, 9824 };

        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }

        }
        System.out.println(largest);
    }

}
