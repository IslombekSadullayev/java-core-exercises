package ifs;

import java.util.Scanner;

public class IF07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ikkita butun son kirgizng");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tartibraqam=(a<b)?1:2;
        System.out.println("Eng kichik sonning tartib raqami: "+tartibraqam);

    }
}
