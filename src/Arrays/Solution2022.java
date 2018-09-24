package Arrays;

import java.util.Scanner;

public class Solution2022 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), counter = 0;
        int a[] = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i] % a[j] == 0) counter++;
            }
        }
        System.out.println(counter);
    }
}
