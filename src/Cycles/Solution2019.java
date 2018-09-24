package Cycles;

import java.util.Scanner;

public class Solution2019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), groupLength = 1, groupCounter = 0;
        for (int i = 1; i <= n ; i++) {
            if (groupLength > groupCounter) {
                groupCounter++;
            }
            else {
                groupLength++;
                groupCounter = 1;
            }
        }
        System.out.println(groupLength);
    }
}