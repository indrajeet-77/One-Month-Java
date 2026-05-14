package Basics;

public class NestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i=" + i);
            for (int j = i; j <= 10; j++) {
                System.out.println("j=" + j);
            }
        }
    }

}
