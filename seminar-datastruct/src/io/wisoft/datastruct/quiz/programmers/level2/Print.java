package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.*;

public class Print {

    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue printQueue = new LinkedList();

        for (int i=0; i<priorities.length; i++) {
            printQueue.add(i);
        }

        for (int i=0 ;i<priorities.length-1; i++) {
            for (int j=i+1; j<priorities.length; j++) {
                if (priorities[i] < priorities[j]) {
                    int result = (int)printQueue.poll();
                    printQueue.add(result);
                    break;
                } else {
                    printQueue.poll();
                    answer++;
                }
            }
        }
        while (printQueue.size() != 0) {
            int result = (int)printQueue.poll();
            if (result == location) {
                answer++;
                return answer;
            } else {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Print print = new Print();
        int[] priorities = {1,2,3,4,5};
        int result = print.solution(priorities,0);
        System.out.println(result);

    }

}
