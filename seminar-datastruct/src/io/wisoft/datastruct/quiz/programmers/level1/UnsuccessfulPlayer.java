package io.wisoft.datastruct.quiz.programmers.level1;

import java.util.HashMap;

public class UnsuccessfulPlayer {

    public static String solution(String[] participant, String[] completion) {
        String answer="";
        HashMap<String, Integer> map = new HashMap<>();

        for (String participants : participant) {
            if (map.containsKey(participants)) {
                int count = map.get(participants);
                map.put(participants, ++count);
            } else {
                map.put(participants, 1);
            }
        }

        for (String completions : completion) {
            if (map.containsKey(completions)) {
                int count = map.get(completions);
                map.put(completions, --count);
                if (map.get(completions) == 0) {
                    map.remove(completions);
                }
            }
        }

        for (String key : map.keySet()) {
            answer += key;
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(solution(participant, completion));
    }

}
