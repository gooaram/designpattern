package io.wisoft.datastruct.quiz.programmers.level1;

import java.util.*;

public class NumberDsc {

    private static long solution(long n) {
        long answer = 0;
        ArrayList<String[]> list = new ArrayList<>();

        String str = String.valueOf(n);
        answer = Long.valueOf(str);
        System.out.println();


        return answer;
    }

    public static void main(String[] args) {
        long n = 118372;
        System.out.println(solution(n));
    }

}
