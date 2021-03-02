package io.wisoft.datastruct.recursivecall;

//함수가 아직 끝나지 않았기때문에 스택에 쌓여서 다시 처리되어 올라감

public class printNumber {

    public static void printNumber(int n) {
        if (n == 0) {
            return;
        } else {
            printNumber(n-1);
        }
        System.out.println(n);
    }

    public static void reversePrintNumber(int n) {
        System.out.println(n);
        if (n == 1)
            return;
        else
            reversePrintNumber(n - 1);
    }

    public static void main(String[] args) {
        printNumber(10);
        System.out.println();
        reversePrintNumber(10);
    }

}
