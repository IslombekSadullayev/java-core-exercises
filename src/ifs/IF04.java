package ifs;

import java.util.Scanner;

public class IF04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int a= sc.nextInt();
        System.out.print("Please enter b number: ");
        int b= sc.nextInt();
        System.out.print("Please enter c number: ");
        int c= sc.nextInt();
        int sanoq=0;
        if(a>0){
            sanoq++;
        }if(b>0){
            sanoq++;
        }if(c>0){
            sanoq++;
        }
        System.out.printf("Musbat sonlar: "+sanoq);

    }

}
