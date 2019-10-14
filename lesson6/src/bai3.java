import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LaptopAZ.vn
 */
public class bai3 {

    public static void main(String[] args) {
        int d = 0;
        int n = 5;int seglen;
        Scanner x = new Scanner(System.in);
        System.out.println("nhap do dai: ");
        seglen=x.nextInt();
        int a[] = new int[5];
        System.out.println("nhap day a: ");
        for (int i = 0; i < 5; i++) {

            a[i] = x.nextInt();

        }
        for(int i=0;i<n-1;i++){
            for(int j=1+i;j<n;j++){
                if(a[i]>a[j]){
                    int k=a[i];
                    a[i]=a[j];
                    a[j]=k;
                }
            }
        }
        d=(a[a.length-1]-a[0])/seglen;
                
        
        System.out.println("seglen min: " + d);

    }
}