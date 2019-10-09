/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

import java.util.Scanner;

/**
 *
 * @author LaptopAZ.vn
 */
public class Lesson5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String p = "haquangDuc162";
        boolean w = false;
        System.out.println(validPassword(p));
        /*     Scanner x = new Scanner(System.in);
        String s = x.nextLine();
        char[] a = s.toCharArray();
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char mid = a[i];
                    a[i] = a[j];
                    a[j] = mid;

                }
            }
        }
        String e = String.valueOf(a);
        System.out.println(e)
        String s = "Ha Quang Duc";
        int mssv = 20183888;
        int mssvvt = mssv % 1000000;
        String mssv1 = String.valueOf(mssvvt);
        int indexOfSpace = s.lastIndexOf(' ');
        String ten = s.substring(indexOfSpace + 1);
        String viettatho = String.valueOf(s.charAt(0));
        int indexOfFirstSpace = s.indexOf(' ');
        String viettatdem = String.valueOf(s.charAt(indexOfFirstSpace + 1));
        String emailsv = ten + "." + viettatho + viettatdem + mssv1 + "@hust.edu.vn";
        System.out.println(emailsv.toLowerCase());
    }

    static String rev(String s2) {
        char[] s3=new char[s2.length()];
        for (int j = s2.length(); j >= 0; j--) {
            s2[j]=s3[s2.length()-i];

        }

        return s3;
    }*/
    }

    static boolean validPassword(String p) {
        int g = 0, d = 0, e = 0;
        char[] c = p.toCharArray();
        if (p.length() >= 8 && p.length() <= 32) {
            for (int i = 0; i < p.length(); i++) {
                if (c[i] <= 'Z' && c[i] >= 'A') {
                    g = 1;

                }
                if (c[i] <= '9' && c[i] >= '0') {
                    d = 1;

                }
                if (c[i] <= 'z' && c[i] >= 'a') {
                    e = 1;

                }

            }
        }
        if (g * d * e == 0) {
            return false;
        }
        return true;

    }
}
