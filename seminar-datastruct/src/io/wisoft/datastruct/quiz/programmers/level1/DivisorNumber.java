package io.wisoft.datastruct.quiz.programmers.level1;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class DivisorNumber {

    public static int[] solution(int[] arr, int divisor) {
        int[] tmp = new int[arr.length];
        int size = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                tmp[size] = arr[i];
                size++;
            }
        }

        int[] answer;

        if (size != 0) {
            answer = new int[size];
            for (int i = 0; i < size; i++) {
                answer[i] = tmp[i];
                System.out.println(answer[i]);
            }
        } else {
            answer = new int[1];
            answer[0] = -1;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 35, 7, 10};
        solution(arr, 1);
    }

}
