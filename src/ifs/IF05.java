package ifs;

import java.util.Scanner;

public class IF05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("uchta butun son kirgizing");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int MusbatSonlar=0;
        int ManfiySonlar=0;
        if(a>0){
            MusbatSonlar++;
        }else if(a<0){
            ManfiySonlar++;
        }if(b>0){
            MusbatSonlar++;
        }else if(b<0){
            ManfiySonlar++;
        }if(c>0){
            MusbatSonlar++;
        }else if(c<0){
            ManfiySonlar++;

        }
        System.out.printf("MusbatSonlar "+MusbatSonlar+"\nManfiySonlar "+ManfiySonlar+"\n");



    }
}
