package Strings;

import java.util.Scanner;

public class Solution2039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int  cntW = 0, cntNW = 0, grW = 0, grNW = 0;
        for (int i = 0; i < a.length(); i++) {
            if (((int) a.charAt(i) >= 65 && (int) a.charAt(i) <= 90) || ((int) a.charAt(i) <= 122 && (int) a.charAt(i) >= 97)) {
            if(i == 0 || cntNW != 0) grW++;
                cntW++;
                cntNW = 0;
            } else {
                cntNW++;
                cntW = 0;
            }
        }
        System.out.println(grW);
    }
}
