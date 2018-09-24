package Strings;

import java.util.Scanner;

public class Solution2044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), counter = 0;
        String symbol[] = new String[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            symbol[i] = scanner.nextLine();
        }
        String word = scanner.nextLine();
        while (word.length() > 0) {
            for (int i = 0; i < n; i++) {
                if (word.length() >= symbol[i].substring(2).length()) {
                    if (word.substring(0, symbol[i].substring(2).length()).compareTo(symbol[i].substring(2)) == 0) {
                        System.out.print(symbol[i].substring(0, 1));
                        word = word.substring(symbol[i].substring(2).length());
                        break;
                    }
                }
            }
        }
    }
}