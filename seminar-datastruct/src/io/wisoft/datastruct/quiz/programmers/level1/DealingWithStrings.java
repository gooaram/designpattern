package io.wisoft.datastruct.quiz.programmers.level1;

public class DealingWithStrings {

    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            try {
                int a = Integer.parseInt(s);
                System.out.println(a);
            } catch (Exception e) {
                System.out.println("error");
                answer = false;
            }
        } else
            answer = false;
        return answer;
    }

    public static void main(String[] args) {
        String s = "a234";
        solution(s);
    }

}
