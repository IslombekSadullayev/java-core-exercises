package ifs;

import java.util.Scanner;

public class IF01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Butun son kirgizing : ");
        int a = sc.nextInt();
        if (a >0){
            System.out.println(a+1);

        }else
            System.out.println(a);
    }
}
