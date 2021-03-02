package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.Scanner;

public class ExpressionOfNumber {

    public static int solution(int n) {
        int answer = 1;
        int sum;
        for (int i=1; i<=(n/2)+1; i++) {
            sum = 0;
            for (int j=i; j<=(n/2)+1; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        int number = scanner.nextInt();
        int result = solution(number);
        System.out.println(result);
    }

}