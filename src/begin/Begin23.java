package begin;

import java.util.Scanner;

public class Begin23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");
        double a=sc.nextDouble();
        System.out.print("b= ");
        double b=sc.nextDouble();
        System.out.print("c= ");
        double c=sc.nextDouble();
         double number=a;
         a=b;
         b=c;
         c=number;
         System.out.println("a= "+a);
         System.out.println("b= "+b);
         System.out.println("c= "+c);
    }
}
