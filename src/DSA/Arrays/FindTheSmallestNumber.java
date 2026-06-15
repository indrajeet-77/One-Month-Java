package DSA.Arrays;

public class FindTheSmallestNumber {
    public static void main(String[] args) {
        int[] numbers = { 902, 86, 652, -1, 88, 76, 35 };
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
    }
}

