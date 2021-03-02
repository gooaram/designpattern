package io.wisoft.datastruct.quiz.programmers.level3;


public class DiskController {
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
                for (int i = currentCount; i>1; i/=2) {
                    if (heapArray[i/2].data > heapArray[i].data) {
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

            for (int i=1; i*2<currentCount;) {
                if (heapArray[i].data < heapArray[i*2].data && heapArray[i].data < heapArray[i*2+1].data) {
                    break;
                } else if (heapArray[i].data > heapArray[i*2].data) {
                    Node temp = heapArray[i];
                    heapArray[i] = heapArray[i*2];
                    heapArray[i*2] = temp;
                    i *= 2;
                } else {
                    Node temp = heapArray[i];
                    heapArray[i] = heapArray[i*2+1];
                    heapArray[i*2+1] = temp;
                    i = i*2+1;
                }
            }

            return result.data;
        }

    }

    public static int solution (int[][] jobs) {
        int answer = 0;
        int count = 0;
        int time = 0;
        int startTime = 0;
        Heap minHeap = new Heap();

        for (int i=0; i<=jobs[jobs.length-1][0]; i++) {
            if (jobs[count][0] == i) {
                minHeap.addNode(jobs[i][1]);
                System.out.println(i);
                count++;
            } else {
                answer += minHeap.deleteNode();
            }
        }
        // 내 말은 삭제되는 노드의 실행 시간에 다음 삭제되는 노드의 시작시간을 빼서 총합에 더해주는 것 현재 answer 에서 자신의 도착시간을 뺀것을 더함
        while (minHeap.currentCount != 0 ) {
            answer += minHeap.deleteNode();
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution(jobs));
    }

}
