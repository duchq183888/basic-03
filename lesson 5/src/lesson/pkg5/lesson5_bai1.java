/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson.pkg5;

/**
 *
 * @author LaptopAZ.vn
 */
public class lesson5_bai1 {

    public static void main(String[] args) {
        String s = "qwertyuiooqưe";
        System.out.println(containSpecial(s));
    }

    static boolean containSpecial(String s) {
        char[] c = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (c[i] == '!' || c[i] == '@' || c[i] == '#' || c[i] == '%' || c[i] == '^' || c[i] == '&' || c[i] == '*' || c[i] == '('||c[i]==')') {

                return false;
            }

        }
        return true;

    }
}
