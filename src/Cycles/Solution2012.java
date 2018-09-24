package Cycles;

import java.util.Scanner;

public class Solution2012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int [4];
        for (int i = 0; i < 4; i++) {
            a[i] = scanner.nextInt();
        }
        if ((a[0] == a[2] && a[0] == a[1] + a[3]) || (a[0] == a[3] && a[0] == a[1] + a[2]) || (a[1] == a[2] && a[1] == a[0] + a[3]) || (a[1] == a[3] && a[1] == a[0] + a[2]))
            System.out.println("YES");
        else System.out.println("NO");
    }
}
