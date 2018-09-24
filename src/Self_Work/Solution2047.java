package Self_Work;


import java.util.*;

public class Solution2047 {
    public static void main(String[] args) {
        ArrayList <String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int max = 0;
       while (scanner.hasNextLine()) {
           strings.add(scanner.nextLine());
       }
        for (Object string : strings) {
            if (string.toString().length() > max) {
                max = string.toString().length();
            }
        }
        String sbuffer = "";
        for (int i = 0; i < strings.size(); i++) {
            if ((max - strings.get(i).toString().length()) % 2 == 0) {
                sbuffer += '*';
                for (int j = 0; j < (max - strings.get(i).length()) / 2; j++) {
                    sbuffer += ' ';
                }
                sbuffer += strings.get(i).toString();
                for (int j = 0; j < (max - strings.get(i).toString().length()) / 2; j++) {
                    sbuffer += ' ';
                }
                sbuffer += '*';
                strings.set(i,sbuffer);
            }
            else {
                sbuffer += '*';
                for (int j = 0; j < (max - strings.get(i).toString().length()) / 2; j++) {
                    sbuffer += ' ';
                }
                sbuffer += strings.get(i).toString();
                for (int j = 0; j < (max - strings.get(i).toString().length()) / 2 + 1; j++) {
                    sbuffer += ' ';
                }
                sbuffer += '*';
                strings.set(i,sbuffer);
            }
            sbuffer = "";
        }
        String s1 = new String();
        for (int i = 0; i <= max+1; i++) {
            s1 += '*';
        }
        strings.add(0, s1);
        strings.add(strings.size(), s1);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
