package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.Comparator;
import java.util.PriorityQueue;


public class RamenFactory {

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int day = 0;

        PriorityQueue<Integer> numberOfStock = new PriorityQueue<>(Comparator.reverseOrder());

        for (int i=0; i<k; i++) {
            if (day < dates.length && i == dates[day]) {
                numberOfStock.add(supplies[day++]);
            }
            if (stock == 0) {
                stock += numberOfStock.poll();
                answer++;
            }
            stock-=1;
        }
        return answer;

    }

    public static void main(String[] args) {
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};

        System.out.println(solution(4, dates, supplies,30));
    }

}
