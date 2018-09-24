package Cycles;

import java.util.Scanner;

public class Solution2006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = n / 36;
        int b = n % 36;
        if (b % 3 == 0 || b % 3 == 1)  b = b / 3;
        else b = b / 3 + 1;
        System.out.print(a + " " + b);
    }
}
