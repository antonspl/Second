package Cycles;

import java.util.Scanner;

public class Solution2014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt(), counter = 0;
        while (a > 0 & b > 0) {
            if (a > b) {
                counter += a / b;
                a = a % b;
            } else {
                counter +=  b / a;
                b = b % a;
            }
        }
        if (a > 0) System.out.println(counter + " " + a);
        else System.out.println(counter + " " + b);
    }
}