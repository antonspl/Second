package Cycles;

import java.util.Scanner;

public class Solution2005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = 10000, i2 = 1;
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            int s1 = scanner.nextInt();
            if (s1 < s) {i2 = i;
            s = s1;}
        }
        System.out.println(i2);
    }
}
