package Cycles;

import java.util.Scanner;

public class Solution2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), summ = 0, groupLength = 1, groupCounter = 0, k = 1;
        for (int i = 1; i <= n ; i++) {
            if (groupLength > groupCounter) {
                summ += k * scanner.nextInt();
                groupCounter++;
            }
            else {
                groupLength++;
                groupCounter = 1;
                k *= -1;
                summ += k * scanner.nextInt();
            }
        }
        System.out.println(summ);
    }
}