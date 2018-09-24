package Arrays;

import java.util.Scanner;

public class Solution2033 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        byte a[] = new byte[n+1];
        boolean flag = false;
        for (int i = n-1; i >= 0; i--) {
            a[i] = scanner.nextByte();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != 9) {
                a[i]++;
                break;
            }
            else a[i] = 0;
            if (i == n-1) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println(n+1);
            System.out.print(1 + " ");
            for (int i = 0; i < n; i++) {
                System.out.print(0 + " ");
            }
        }
        else {
            System.out.println(n);
            for (int i = n - 1; i >= 0; i--) {
                System.out.print(a[i] + " ");
            }
        }
    }
}