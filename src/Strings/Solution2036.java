package Strings;

import java.util.Scanner;

public class Solution2036 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a[] = new String[scanner.nextInt()];
        int counter = 0;
        boolean flag = true;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.next();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                char symbol = a[i].charAt(j);
                switch (symbol) {
                    case 'a':
                        counter++;
                        break;
                    case 'e':
                        counter++;
                        break;
                    case 'i':
                        counter++;
                        break;
                    case 'y':
                        counter++;
                        break;
                    case 'u':
                        counter++;
                        break;
                    case 'o':
                        counter++;
                        break;
                    default:
                        counter = 0;
                        break;
                }
                if (counter >= 3) {
                    flag = false;
                    break;
                }
            }
            if (flag) System.out.println(a[i]);
            flag = true;
            counter = 0;
        }
    }
}

