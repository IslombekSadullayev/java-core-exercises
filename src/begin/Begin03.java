package begin;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a= ");
        double a=scanner.nextDouble();
        System.out.print("Enter b= ");
        double b=scanner.nextDouble();

         double perimetr=(a+b)*2;
         double yuzasi=a*b;
         System.out.println("Perimetr = "+perimetr);
         System.out.println("Yuzasi = "+yuzasi);
    }
}

