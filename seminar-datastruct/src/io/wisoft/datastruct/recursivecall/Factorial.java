package io.wisoft.datastruct.recursivecall;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        int result;
        Scanner scanner = new Scanner(System.in);
        System.out.print("n = ");
        int number = scanner.nextInt();
        result = factorial(number);
        System.out.println(number + "!" + " = " + result);
    }

    public static int fac(int n) {
        int ret =  1;
        int i;

        for(i = n; i>1; i--) {
            ret = ret * i;
        }
        return ret;
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        System.out.println(n);

        return n * factorial(n - 1);
    }

}