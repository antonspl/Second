package Cycles;

import java.util.Scanner;

public class Solution2011 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Short n = scanner.nextShort();
        if (n < 7) System.out.println("preschool child");
        if (n >= 7 && n < 14) System.out.println("schoolchild " + (n % 7 + 1));
        if (n >= 14 && n < 18) System.out.println("schoolchild " + (n % 7 + 8));
        if (n >= 18 && n < 23) System.out.println("student " + (n % 18 + 1));
        if (n >= 23) System.out.println("specialist");
    }
}

