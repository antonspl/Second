package Arrays;

import java.util.Scanner;

public class Solution2035 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        short n = scanner.nextShort(), a[] = new short[n], per = 0, k = 0;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextShort();
        }
        for (per = 1; per <= n; per++) {
            if (n % per == 0){
                for (int i = 0; i < n-per ; i++) {
                    if (a[i] != a[i+per]) flag = false;
                }
                if (flag) break;
            }
            flag = true;
        }
        System.out.println(per);

    }
}
