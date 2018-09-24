package Arrays;

import java.util.Scanner;

public class Solution2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), counter = 0;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n-i-1]) counter++;
        }
        System.out.println(counter);
    }
}
