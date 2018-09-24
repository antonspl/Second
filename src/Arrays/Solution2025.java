package Arrays;

import java.io.InputStream;
import java.util.Scanner;

public class Solution2025 {
    public static void main(String[] args) {
        InputStream in = System.in;
        Scanner scanner = new Scanner(in);
        short n = scanner.nextShort();
        int  min = 0, Ii = 0, ri = 0;
        short a[] = new short[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        short m = scanner.nextShort();
        for (int i = 0; i < m; i++) {
            Ii = scanner.nextShort() - 1;
            min = a[Ii];
            ri = scanner.nextShort() - 1;
            for (int j = Ii; j <= ri; j++) {
                if (a[j] < min) min = a[j];
            }
            int &ng;
            System.out.println(min);
        }
    }
}
