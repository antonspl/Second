package Strings;

import java.util.Scanner;

public class Solution2041 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < input.length(); i++) {
            if (((new StringBuffer(input.substring(0, i)).reverse().toString()) + new StringBuffer(input.substring(i)).reverse().toString()).compareTo(input) == 0) flag = true;
            if (flag) break;
        }
        if (flag) System.out.println("YES");
        else System.out.println("NO");
    }
}
