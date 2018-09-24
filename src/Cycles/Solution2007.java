package Cycles;

import java.util.Scanner;

public class Solution2007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), i = 0;
        int a = 0;
        while (a == 0) {
            a = n % 2;
            n = n / 2 + n % 2;
            i++;
        }
        System.out.println(i - 1);
    }
}
