package Cycles;

import java.util.Scanner;

public class Solution2013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), ai = 0, counter = 0, min = 10000;
        for (int i = 0; i < n; i++) {
            ai = scanner.nextInt();
            if (ai < min) {
                min = ai;
                counter = 1;
            }
            else if (ai == min) counter++;
        }
        System.out.println(counter);
    }
}
