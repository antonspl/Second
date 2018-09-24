package Arrays;

import java.util.Scanner;

public class Solution2028 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short n = scanner.nextShort(), a[] = new short[n], counter = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < n; j++) {
                if (a[j] == i) {
                    counter++;
                }
            }
            if (counter > 0) System.out.println(i + " " + counter);
            counter = 0;
        }
    }
}
