package booleans;

import java.util.Scanner;

public class Boolean02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Butun sonni kirgizing : ");
        int number = sc.nextInt();
        boolean result=(number>0&&number%2==1);
        System.out.println(result);

    }

}
