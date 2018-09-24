package Cycles;

import java.util.Scanner;

public class Solution2009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), ai, summ = 0;
        for (int i = 1; i <= n; i++) {
            ai = scanner.nextInt();
            switch (i) {
                case 1:
                    summ += ai;
                    break;
                case 2:
                    summ += ai;
                    break;
                case 4:
                    summ += ai;
                    break;
                case 8:
                    summ += ai;
                    break;
                case 16:
                    summ += ai;
                    break;
                case 32:
                    summ += ai;
                    break;
                case 64:
                    summ += ai;
                    break;
                case 128:
                    summ += ai;
                    break;
                case 256:
                    summ += ai;
                    break;
                case 512:
                    summ += ai;
                    break;
                case 1024:
                    summ += ai;
                    break;
                case 2048:
                    summ += ai;
                    break;
                case 4096:
                    summ += ai;
                    break;
                case 8192:
                    summ += ai;
                    break;
            }
        }
        System.out.println(summ);
    }
}
