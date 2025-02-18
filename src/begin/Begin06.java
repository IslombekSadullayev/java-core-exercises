package begin;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a= ");
        double a = sc.nextDouble();
        System.out.print("Enter b= ");
        double b = sc.nextDouble();
        System.out.print("Enter c= ");
        double c = sc.nextDouble();

        double V=a*b*c;
        double S=2*(a*b+b*c+a*c);
        System.out.println("Parallelipiped hajmi V="+V);
        System.out.println("Parallelipipedning to'la siri S="+S);
    }
}
