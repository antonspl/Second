package Arrays;

import java.util.Scanner;

public class Solution2032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort();
        byte a[] = new byte[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextByte();
        }
        n = scanner.nextShort();
        byte b[] = new byte[n];
        for (int i = 0; i < n; i++) {
            b[i] = scanner.nextByte();
        }
        if (a.length > b.length) System.out.println(1);
        else if (a.length < b.length) System.out.println(-1);
        else if (a.length == b.length) {
            for (int i = 0; i < n; i++) {
                if (a[i] > b[i]) {
                    System.out.println(1);
                    break;
                }
                if (a[i] < b[i]) {
                    System.out.println(-1);
                    break;
                }
                if (i == n-1) System.out.println(0);
            }
        }
    }
}
