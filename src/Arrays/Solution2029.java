package Arrays;

import java.util.Scanner;

public class Solution2029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), a[] = new short[n], counter = 0, min = 100;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                counter = 1;
                min = a[i];
            } else if (a[i] == min) counter++;
        }
        int c[] = new int[counter], j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == min) {
                c[j] = i + 1;
                j++;
            }
        }
        if (counter % 2 == 0) System.out.println(c[counter / 2 - 1]);
        else System.out.println(c[counter / 2]);
    }
}