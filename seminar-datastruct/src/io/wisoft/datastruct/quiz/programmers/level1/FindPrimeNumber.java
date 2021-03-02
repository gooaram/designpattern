package io.wisoft.datastruct.quiz.programmers.level1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class FindPrimeNumber {

    public static int solution (String numbers) {
        int answer = 0;
        String num = "";
        Queue<String> number = new LinkedList();

        for (int i=0; i<numbers.length(); i++) {
            number.add(numbers.substring(i, i+1));
        }
        //한자리 수
        if (primeNumber(number.poll())) answer++;

        //
        while (num != numbers) {
            num += number.poll();

        }


        System.out.println(num);

        return answer;
    }

    public static boolean primeNumber (String number) {
        int num = Integer.parseInt(number);
        //자기자신의 루트까지만 확인하면 됨
        for (int i=2; i<=Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String numbers = "17";
        solution(numbers);

    }

}