package Cycles;

import java.util.Scanner;

public class Solution2020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), groupLength = 1, groupCounter = 1, prev = 0, freq = 1, a1 = 0, counter = 1;
        if (n != 1) {
            for (int i = 0; i < n; i++) {
                if (counter == 1) {
                    a1 = scanner.nextInt();
                   counter++;
                        prev = a1;
                        groupCounter = 1;

                } else {
                    int a = scanner.nextInt();
                    if (a == prev) {
                        groupCounter++;
                        if (groupCounter > groupLength) {
                            groupLength = groupCounter;
                            freq = a;
                        }
                    } else {
                        prev = a;
                        groupCounter = 1;
                    }
                }
            }
              if (freq > 1)  System.out.print(freq + " " + groupLength);
            else System.out.println(a1 + " " + groupLength);
            } else System.out.print(scanner.nextInt() + " " + 1);
        }
    }
