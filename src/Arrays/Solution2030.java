package Arrays;

import java.util.Scanner;

public class Solution2030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), a[] = new short[n],  sum = 0;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                    sum += a[j];
                if (sum == 0) counter++;
            }
            sum = 0;
        }
        System.out.println(counter);
    }
}