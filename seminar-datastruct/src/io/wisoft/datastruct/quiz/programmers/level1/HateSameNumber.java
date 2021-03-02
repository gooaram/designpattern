package io.wisoft.datastruct.quiz.programmers.level1;

import java.util.HashSet;
import java.util.Iterator;

public class HateSameNumber {

    public static int[] solution(int[] arr) {
        int[] number = new int[arr.length];
        int count = 0;
        number[count++] = arr[0];

        for (int i=1; i<arr.length; i++) {
            if (number[count-1] != arr[i]) {
                number[count++] = arr[i];
            }
        }

        int[] answer = new int[count];

        for (int i = 0; i<answer.length; i++) {
            answer[i] = number[i];

        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,1};
        System.out.println(solution(arr));
    }

}
