package Arrays;

import java.util.Scanner;

public class Solution2023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short na = scanner.nextShort(), counter = 0;
        int a[] = new int[na], c[] = new int [10000];
        for (int i = 0; i < na; i++) {
            a[i] = scanner.nextInt();
        }
        short nb = scanner.nextShort();
        int b[] = new int[nb];
        for (int i = 0; i < nb; i++) {
            b[i] = scanner.nextInt();
        }
        for (int i = 0; i < na; i++) {
            for (int j = 0; j < nb; j++) {
                if (a[i] == b[j]) {
                    c[counter] = a[i];
                    counter++;
                    break;
                }
            }
        }
        System.out.println(counter);
        for (int i = 0; i < counter; i++) {
            if (i != counter - 1)  System.out.print(c[i] + " ");
            else System.out.print(c[i]);
        }
    }
}