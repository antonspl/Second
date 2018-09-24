package Cycles;

import java.util.Scanner;

public class Solution2017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short a = scanner.nextShort(), b = scanner.nextShort(), counter = 0, quant = 0, max = a, c = 0; // c -количество чисел
        for (short i = a; i <= b; i++) {
            for (short j = 1; j <= i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter >= quant) {
                if (counter > quant) {
                    quant = counter;
                    c = 1;
                    max = i;
                }
                else {
                    c++;
                    max = i;
                }
            }
            counter = 0;
        }
        System.out.println(c);
        counter = 0;
        for (short i = a; i <= b; i++) {
            for (short j = 1; j <= i; j++) {
                if (i % j == 0) counter++;
            }
            if (counter == quant) {
                if (i != max) System.out.print(i + ",");
                else System.out.print(i);
            }
            counter = 0;
        }
    }
}