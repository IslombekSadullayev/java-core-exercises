package begin;

import java.util.Scanner;

public class begin9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a= ");
        double a = sc.nextDouble();
        System.out.print("Enter b= ");
        double b = sc.nextDouble();
        double c=Math.sqrt(a*b);
        double d=Math.PI*(a-b);
        System.out.println("Ikkita sonning o'rta geometriki = "+c);
        System.out.println("Ikkita sonning o'rta geometriki = "+d);
    }
}
