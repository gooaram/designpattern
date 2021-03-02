package io.wisoft.datastruct.recursivecall;
import java.util.Scanner;

//1부터 10까지 역순으로 출력하는 재귀호출

public class TowerOfHanoi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n : ");
        int number = scanner.nextInt();
        function(number);
    }

    public static void function(int n) {
        if(n==0) {
            return;
        } else {
            function(n-1);
        }
        System.out.println(n);
    }

}
