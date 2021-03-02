package io.wisoft.datastruct.quiz.programmers.level1;

public class PhoneNumberHiden {

    private static String solution(String s) {
        String answer="";
        int starSize = s.length() - 4;
        String splitStrings = s.substring(starSize);

        for (int i=0; i < starSize; i++) {
            answer += "*";
        }
        answer += splitStrings;

        return answer;
    }

    public static void main(String[] args) {
        String phone_num = "01011114444";
        System.out.println(solution(phone_num));
    }

}
