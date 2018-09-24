package Strings;

import java.util.Scanner;

public class Solution2037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(), b = "";
        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(input);
            return;
        }
        for (String word : input.split(",")) if (word.length() >= n) b += word + ",";
        System.out.println(b.length() > 0 ? b.substring(0, b.length() - 1) : b);
    }
}