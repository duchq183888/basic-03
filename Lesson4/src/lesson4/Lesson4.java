/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author LaptopAZ.vn
 */
public class Lesson4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] ds = {
            "a", "b", "c", "d", "e"};
        int[] diem = {4, 2, 5, 3, 1};
        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (diem[i] < diem[j]) {
                    diem[i] = diem[i] - diem[j];
                    diem[j] = diem[i] + diem[j];
                    diem[i] = diem[i] + diem[j];
                    String t = ds[i];
                    ds[i] = ds[j];
                    ds[j] = t;

                }
            }
        }
        System.out.println("");
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i] + "  " + diem[i]);
        }

    }

}
