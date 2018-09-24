package Arrays;

import java.util.Scanner;

public class Solution2027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), a[] = new short[n], b[] = new short[n], counter = 0;
        int c[] = new int[4];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
            b[i] = a[i];
        }
        for (int i = 0; i < 4; i++) {
            c[i] = scanner.nextInt() - 1;
        }
        for (int i = c[0]; i <= c[1]; i++) {
            b[i] = a[c[1]-counter];
            counter++;
        }
        counter = 0;
        for (int i = 0; i < n; i++) {
            a[i] = b[i];
        }
        for (int i = c[2]; i <= c[3]; i++) {
            a[i] = b[c[3]-counter];
            counter++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}