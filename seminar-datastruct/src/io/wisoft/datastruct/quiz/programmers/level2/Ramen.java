package io.wisoft.datastruct.quiz.programmers.level2;

public class Ramen {

    static class Node {
        public int data;

        public Node(int data) {
            this.data = data;
        }
    }

    static class Heap {

        private Node newNode;
        private Node[] heapArray;
        private int currentCount = 0;

        public void addNode(int data) {
            newNode = new Node(data);

            if (heapArray == null) {
                heapArray = new Node[1000];
                heapArray[++currentCount] = newNode;
            } else {
                heapArray[++currentCount] = newNode;
                for (int i = currentCount; i > 1; i /= 2) {
                    if (heapArray[i / 2].data < heapArray[i].data) {
                        Node temp;
                        temp = heapArray[i];
                        heapArray[i] = heapArray[i / 2];
                        heapArray[i / 2] = temp;
                    } else {
                        break;
                    }
                }
            }
        }

        public void print() {
            int i = 1;
            while (heapArray[i] != null) {
                System.out.print(heapArray[i++].data + " ");
            }
            System.out.println();
        }

        public int deleteNode() {
            Node result = heapArray[1];
            heapArray[1] = heapArray[currentCount];
            heapArray[currentCount--] = null;

            for (int i = 1; i * 2 < currentCount; ) {
                if (heapArray[i].data > heapArray[i * 2].data && heapArray[i].data > heapArray[i * 2 + 1].data) {
                    break;
                } else if (heapArray[i].data < heapArray[i * 2].data) {
                    Node temp = heapArray[i];
                    heapArray[i] = heapArray[i * 2];
                    heapArray[i * 2] = temp;
                    i *= 2;
                } else {
                    Node temp = heapArray[i];
                    heapArray[i] = heapArray[i * 2 + 1];
                    heapArray[i * 2 + 1] = temp;
                    i = i * 2 + 1;
                }
            }

            return result.data;
        }
    }

    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        int day = 0;

        Heap maxHeap = new Heap();

        for (int i = 0; i < k; i++) {
            if (day < dates.length && i == dates[day]) {
                maxHeap.addNode(supplies[day++]);
            }
            if (stock == 0) {
                stock += maxHeap.deleteNode();
                answer++;
            }
            stock -= 1;
        }
        return answer;

    }


    public static void main(String[] args) {
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};

        System.out.println(solution(4, dates, supplies, 30));
    }

}
