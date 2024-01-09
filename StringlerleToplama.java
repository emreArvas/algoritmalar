import java.util.ArrayList;
import java.util.Scanner;
/*
*Büyük sayıların toplanması için Stringlerle toplama işlemi sld
* */
public class Main {
    public static void main(String[] args) {
        String s1 = "999999";
        String s2 = "999999";
        String s3 = "";
        // ters çevirip basamak sayısını eşitleme
        if (s1.length() != s2.length()) {
            int x = 0;
            if (s1.length() > s2.length()) {
                x = s1.length() - s2.length();
                for (int i = s2.length() - 1; i >= 0; i--) {
                    s3 = s3 + s2.charAt(i);
                }
                s2 = s3;
                for (int i = 0; i < x; i++)
                    s2 = s2 + "0";
                //tekrardan ters çeviriyoruz
                String s5 = "";
                for (int i = s2.length() - 1; i >= 0; i--)
                    s5 = s5 + s2.charAt(i);
                s2 = s5;
                System.out.println(s2);

            } else if (s1.length() < s2.length()) {
                x = s2.length() - s1.length();
                for (int i = s1.length() - 1; i >= 0; i--) {
                    s3 = s3 + s1.charAt(i);
                }
                s1 = s3;
                for (int i = 0; i < x; i++)
                    s1 = s1 + "0";
                //tekrardan ters çeviriyoruz
                String s5 = "";
                for (int i = s1.length() - 1; i >= 0; i--)
                    s5 = s5 + s1.charAt(i);
                s1 = s5;
            }
        }
        System.out.println(s1); //07
        System.out.println(s2); //18
        String toplam = "";
        int kalan = 0;
        for (int i = s1.length() - 1; i >= 0; i--) {
            int x = Character.getNumericValue(s1.charAt(i)) + Character.getNumericValue(s2.charAt(i)) + kalan;
            kalan = 0;
            if (x > 9) {
                if (i == s1.length() - 1) {
                    x = x % 10;
                    String b = Integer.toString(x);
                    toplam = toplam + b;
                    kalan++;
                } else if (i != s1.length() - 1 && i != 0) {
                    x = x % 10;
                    String b = Integer.toString(x);
                    toplam = toplam + b;
                    kalan++;
                } else if (i == 0) {
                    String b = Integer.toString(x);
                    String str = "";
                    for (int j = b.length() - 1; j >= 0; j--) {
                        str = str + b.charAt(j);
                    }
                    b = str;
                    toplam = toplam + b;
                }
            } else if (x <= 9) {
                toplam = toplam + Integer.toString(x);
            }
        }

        String tersSayi = "";
        for (int i = toplam.length() - 1; i >= 0; i--)
            tersSayi = tersSayi + toplam.charAt(i);
        System.out.println(tersSayi);
    }
}












































