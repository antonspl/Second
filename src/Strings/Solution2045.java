package Strings;

import java.util.Scanner;

public class Solution2045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(), b = "";
        for (String word: input.split(" +")) {
            b = b + word + " ";
        }
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == ',' || b.charAt(i) == '!' || b.charAt(i) == '?' || b.charAt(i) == '.') {
                if (b.charAt(i+1) != ' ') b = b.substring(0, i+1) + " " + b.substring(i+1);
                if (b.charAt(i-1) == ' ') b = b.substring(0, i-1) + b.substring(i);
            }
        }
        System.out.println(b.substring(0, b.length() - 1));
    }
}
