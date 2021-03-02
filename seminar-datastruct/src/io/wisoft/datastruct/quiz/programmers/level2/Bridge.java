package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.LinkedList;

public class Bridge {

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        LinkedList queue = new LinkedList<>();

        for(int data : truck_weights) {
            queue.add(data);
            System.out.print(queue);
        }

        while(!queue.isEmpty()) {
                int x = (int)queue.poll();
                if(!queue.isEmpty()) {
                    if (x + (int) queue.peek() <= weight) {
                        answer += bridge_length*2;
                        queue.poll();
                    } else {
                        answer += bridge_length;
                    }
                }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] truck_weights = {10};
        Bridge bridge = new Bridge();
        int result = bridge.solution(10,100, truck_weights);
        System.out.println(result);
    }

}
