package Arrays;

import java.util.Scanner;

public class Solution2026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), a[] = new short[n], max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (a[j] > a[i]) {
                    max = a[j];
                    break;
                }
            }
            System.out.print(max + " ");
            max = 0;
        }
        System.out.print(0);
    }
}
