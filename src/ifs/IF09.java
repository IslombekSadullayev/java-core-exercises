package ifs;

import java.util.Scanner;

public class IF09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  numbers : ");
        System.out.print("a=");
        int a= sc.nextInt();
        System.out.print("b=");
        int b= sc.nextInt();
        if(a>b){
            System.out.printf(b+" "+a);
        } else if (a<b) {
            System.out.printf(a+" "+b);

        }


    }
}
