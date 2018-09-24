package Cycles;

import java.util.Scanner;

public class Solution2016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a = scanner.nextShort(), b = scanner.nextShort(), c = scanner.nextShort();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) System.out.println(-1);
                else System.out.println(0);
            } else System.out.println(1);
        } else {
            if (b * b - 4 * a * c != 0) {
                if (b * b - 4 * a * c < 0) System.out.println(0);
                else System.out.println(2);
            } else System.out.println(1);
        }
    }
}