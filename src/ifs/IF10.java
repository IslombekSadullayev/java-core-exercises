package ifs;

import java.util.Scanner;

public class IF10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int a = sc.nextInt();
        System.out.printf("Enter b number: ");
        int b = sc.nextInt();
        if (a != b) {
            int sum = a + b;
            a = sum;
            b = sum;
        } else {
            a = 0;
            b = 0;
        }
        System.out.println("A:" + a +"  B:" + b);
    }
}

