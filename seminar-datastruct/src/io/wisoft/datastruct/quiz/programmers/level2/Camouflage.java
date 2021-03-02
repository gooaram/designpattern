package io.wisoft.datastruct.quiz.programmers.level2;

import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {

    public static int solution(String[][] clothes) {
        int numberOfCases = 1;
        HashMap<String, Integer> clothesCountTable = new HashMap<>();

        for (int i=0; i<clothes.length; i++) {
            if (clothesCountTable.containsKey(clothes[i][1])) {
                int count = clothesCountTable.get(clothes[i][1]);
                clothesCountTable.put(clothes[i][1], ++count);
            } else {
                clothesCountTable.put(clothes[i][1], 1);
            }
        }

        Iterator valueCount = clothesCountTable.values().iterator();

        while (valueCount.hasNext()) {
            int result = (int)valueCount.next();
            numberOfCases *= result+1; //고르는 경우와 안고르는 경우를 따로 생각해서 1을 더해서 곱해줌
        }

        return numberOfCases-1;
    }

    public static void main(String[] args) {
        String[][] clothes = {{"yellow_hat", "face"}, {"blue_sunglasses", "face"}, {"green_turban", "face"}, {"green_turban", "head"}, {"green_turban", "head"}, {"green_turban", "hand"}};
        System.out.println(solution(clothes));
    }

}