package Arrays;

import java.util.Scanner;

public class Solution2034NS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[scanner.nextInt()], cntpos = 0, cntneg = 0, maxcntpos = 0, maxcntneg = 0, Ipos = 0, Ineg = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] - a[i + 1]) == 0 || (a[i] - a[i + 1]) == 1) {
                for (int j = i; j < a.length; j++) {
                    if ((a[i] - a[j]) == 0 || (a[i] - a[j]) == 1) cntpos++;
                    else {
                        if (cntpos > maxcntpos) {
                            maxcntpos = cntpos;
                            Ipos = i;
                        }
                        cntpos = 0;
                    }
                    if (j == a.length - 1) {
                        maxcntpos = cntpos;
                        Ipos = i;
                    }
                }
            }
        }
        for (int i = 0; i < a.length - 1; i++) {
            if ((a[i] - a[i + 1]) == 0 || (a[i] - a[i + 1]) == -1) {
                for (int j = i; j < a.length; j++) {
                    if ((a[i] - a[j]) == 0 || (a[i] - a[j]) == -1) cntneg++;
                    else {
                        if (cntneg > maxcntneg) {
                            maxcntneg = cntneg;
                            Ineg = i;
                        }
                        cntneg = 0;
                    }
                    if (j == a.length - 1) {
                        maxcntneg = cntneg;
                        Ineg = i;
                    }
                }
            }
        }
        System.out.println(Ineg + " " + Ipos + " " + maxcntneg + " " + maxcntpos);
        if (maxcntneg > maxcntpos) System.out.println(Ineg + 1 + " " + (Ineg + 1 + maxcntneg));
        else System.out.println(Ipos + 1 + " " + (Ipos + 1 + maxcntpos));
    }
}