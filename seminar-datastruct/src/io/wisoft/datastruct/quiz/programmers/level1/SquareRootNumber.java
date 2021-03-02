package io.wisoft.datastruct.quiz.programmers.level1;

public class SquareRootNumber {

    private static long solution(long n) {
        long answer;
        int squareRoot, temp1;

        double root = Math.sqrt(n);
        double temp2 = root;
        if ((int)root > temp2) { temp2 -= 0.5; }
        squareRoot = (int) root;

        if (root == squareRoot) {
            temp1 = squareRoot + 1;
            answer = temp1 * temp1;
        } else {
            answer = -1;
        }

        return answer;
    }

    public static void main(String[] args) {
        long number = 12;
        System.out.println(solution(number));
    }

}
