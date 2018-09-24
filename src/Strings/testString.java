package Strings;



public class testString {
    public static void main(String[] args) {
        String s = new String ("qwe");
//для удобства в java сделели возможным создание строк так: String s = "qwe"; практически одно и тоже
        s.replaceAll("q"," ");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("qwe");
        sb.delete(0,1);
        System.out.println(sb);
    }
}
