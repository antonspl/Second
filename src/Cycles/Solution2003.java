package Cycles;

import java.util.Scanner;

public class Solution2003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (i % 2 == 0)
                summ += a;
            else summ -= a;
        }
        System.out.println(summ);
    }
}
