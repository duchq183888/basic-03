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
public class function {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(check(a));

    }

    static String[] lietke(String[] ds, int[] diem) {
        String[] result = new String[ds.length];
        for (int i = 0; i < ds.length; i++) {
            result[i] = ds[i] + " duoc " + diem[i];
        }
        return result;

    }

    static boolean check(int []a) {
        boolean k=true;
        for (int i = 0; i < a.length-1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                    k=true;
                }
                else{
                    k=false;
                }
            }
        }
        return k;
    }

}
