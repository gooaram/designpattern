package io.wisoft.datastruct.quiz.programmers.level2;

public class Tower {

    private static int top;

    private static int pop(int[] heights) {
        int result = heights[top];
        heights[top] = 0;
        top--;
        return result;
    }

    private static int[] solution(int[] heights) {
        top = heights.length - 1;
        int[] answer = new int[top+1];

        while(top != 0) {
            int result = pop(heights);
            for(int i=top; i>-1; i--) {
                if(result < heights[i]) {
                    answer[top+1] = i+1;
                    break;
                } else {
                    answer[top+1] = 0;
                }
            }
        }
        return answer;
    }

    private  static void print(int[] answer) {
        for (int value : answer) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] heights = {6, 9, 5, 7, 4};
        print(solution(heights));

    }

}