package io.wisoft.datastruct.quiz.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class StringReverse {

    public static String solution(String s) {
        String answer = "";
        char[] chars = s.toCharArray();
        ArrayList<Character> list = new ArrayList<>();

        for (char ch : chars) { list.add(ch); }

        Collections.sort(list);
        Collections.reverse(list);

        for (char ch : list) { answer += ch; }

        return answer;
    }

    public static void main(String[] args) {
        String s = "ZAbcdefg";
        System.out.println(solution(s));
    }

}
