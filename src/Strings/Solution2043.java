package Strings;

import java.util.Scanner;

public class Solution2043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine(), space = "";
        int counter = 0, i = 0;
        while (i <= string.length() - 4) {
            if (string.charAt(i + 2) == '>') {
                System.out.println(space + string.substring(i, i + 3));
                i += 3;
                space += "  ";
            } else {
                if (space.length() > 0) space = space.substring(2);
                System.out.println(space + string.substring(i, i + 4));
                i += 4;
            }
        }
    }
}
