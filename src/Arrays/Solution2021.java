package Arrays;

import java.util.Scanner;

public class Solution2021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), max = 1;
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (a[i] > max) max = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == max) a[i] = a[i] / 2;
        }
        max = max / 2;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) max = a[i];
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == max) a[i] = a[i] / 2;
            System.out.print(a[i] + " ");
        }
        }
    }

