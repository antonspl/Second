package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2031 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[scanner.nextInt()], counter = 0;
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
            for (int j = 0; j < i; j++) {
                if (a[j] == a[i]) {
                    boolean flag = true;
                    for (int k = 0; k < counter; k++) {
                        if (b[k] == a[i]) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) b[counter++] = a[i];
                    break;
                }
            }
        }
        int[] c = Arrays.copyOfRange(b, 0, counter);
        Arrays.sort(c);
        System.out.println(counter);
        for ( int element: c){
            System.out.print(element + " ");
        }
    }
}