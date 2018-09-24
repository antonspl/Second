package Cycles;

import java.util.Scanner;

public class Solution2015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), counter = 0;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == 0) System.out.println(i);
            counter = 0;
        }
    }
}
