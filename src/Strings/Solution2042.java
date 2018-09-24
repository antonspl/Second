package Strings;

import java.util.Scanner;

public class Solution2042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(), pattern = scanner.nextLine();
        pattern = pattern.replaceAll("\\?", ".");
        for (int i = 0; i < string.length() - pattern.length() + 1; i++) {
            if (string.substring(i, i+pattern.length()).matches("(.*)" + pattern + "(.*)")) System.out.print(i + 1 + " ");
        }
    }
}
