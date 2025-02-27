


package ifs;

import java.util.Scanner;

public class IF06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ikkita butun son kirgizing");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.printf("Kattasi:"+a);

        }else if(a<b){
            System.out.printf("Kattasi:"+b);
        }else
            if(a==b){
                System.out.printf("Bu sonlar teng:" );
            }




    }
}

