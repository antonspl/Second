package Cycles;

import java.util.Scanner;

public class Solution2010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), counter = 0, c = 1;
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a - b;
                counter++;
            } else {
                b = b - a;
                counter++;
            }
        }
        if (a > 0) System.out.println(counter + " " + a);
        else System.out.println(counter + " " + b);
    }
}