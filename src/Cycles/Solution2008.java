package Cycles;

import java.util.Scanner;

public class Solution2008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), ai, wk = 0, counter = 0;
        int w = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            ai = scanner.nextInt();
            if (w - ai >= 0) {
                wk = wk + ai;
                counter++;
                w = w - ai;
            }
        }
        System.out.println(counter + " " + wk);
    }
}
