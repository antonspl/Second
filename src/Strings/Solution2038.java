package Strings;

import java.util.Scanner;

public class Solution2038 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int max = 0, counter = 0;
        for (int i = 0; i < a.length(); i++) {
         if (((int) a.charAt(i) >= 65 && (int) a.charAt(i) <= 90) || ((int) a.charAt(i) <= 122 && (int) a.charAt(i) >= 97)) {
          counter++;
         } else {
             if (counter > max) {
                 max = counter;
             }
             counter = 0;
         }
        }
        System.out.println(max);
    }
}
