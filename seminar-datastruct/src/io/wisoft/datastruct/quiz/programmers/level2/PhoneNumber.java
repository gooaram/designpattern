package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.HashMap;

public class PhoneNumber {

    public static boolean solution(String[] phoneBook) {
        boolean answer = true;
        HashMap<Integer, String> phoneNumber = new HashMap<>();
        String minString = phoneBook[0];

        for (int i=1; i<phoneBook.length; i++) {
            if (minString.length() > phoneBook[i].length()) {
                minString = phoneBook[i];
            }
        }

        for (int i=0; i<phoneBook.length; i++) {
            if (!minString.equals(phoneBook[i])) {
                phoneNumber.put(i, phoneBook[i].substring(0,minString.length()));
                if (phoneNumber.get(i).equals(minString)) {
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] phoneBook = {"12","1263","1235","567","88"};
        System.out.println(solution(phoneBook));
    }

}
