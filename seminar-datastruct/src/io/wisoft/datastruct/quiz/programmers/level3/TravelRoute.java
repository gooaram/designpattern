package io.wisoft.datastruct.quiz.programmers.level3;

import java.util.LinkedList;
import java.util.Queue;

public class TravelRoute {

    public static String[] solution(String[][] tickets) {
        String[] answer = {};

        Queue<String[]> route = new LinkedList();

        for (int i = 0; i < tickets.length; i++) {
            route.add(tickets[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        System.out.println(tickets[0]);
        System.out.println(solution(tickets));
    }

}