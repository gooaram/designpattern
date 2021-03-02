package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.Arrays;

public class MaxNumber {

    public static String solution(int[] numbers) {
        StringBuilder answer = new StringBuilder();
        String[] array = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            array[i] = String.valueOf(numbers[i]);
        }

//        Arrays.sort(array, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return (o2 + o1).compareTo(o1 + o2);
//            }
//        });


        Arrays.sort(array, (s1, s2) -> (s2 + s1).compareTo(s1 + s2)); // 두 객체를 합쳐 더 큰 값을 우선순위로 정렬하는 방법, 내림차순으로 정렬하기 위해서

        if (array[0].equals("0")) {
            return "0";
        }

        for (String s : array) {
            answer.append(s);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        System.out.println(solution(numbers));
    }

}


