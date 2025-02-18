package begin;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kubning tamonini kirgizing: a= ");
        double a=scanner.nextDouble();
        double V=a*a*a;
        double S=6*a*a;
        System.out.println("Kubning hajmi: v= "+V);
        System.out.println("Kubning to'la sirti: S= "+S);
    }
}
