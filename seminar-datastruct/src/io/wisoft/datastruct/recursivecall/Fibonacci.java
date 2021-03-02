package io.wisoft.datastruct.recursivecall;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int number = scanner.nextInt();
        System.out.println(fibonacci(number));
    }

    private static int fibonacci(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }

}