package Strings;

import java.util.Scanner;

public class Solution2040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine(), b = a;
        int min = 300, sum = 0, number = 0, minSum = 100000000, minNumb = 0;
        for (char letter : a.toCharArray()) {
            if ((int) letter < min) {
                min = (int) letter;
                number = a.indexOf(letter);
            }
        }
        for (int i = number; i < a.length(); i++) {
            if ((int) a.charAt(i) == min) {
                if ((a.substring(i) + a.substring(0, i)).compareTo(b) < 0) b = a.substring(i) + a.substring(0, i);
            }
        }
        System.out.println(b);
    }
}