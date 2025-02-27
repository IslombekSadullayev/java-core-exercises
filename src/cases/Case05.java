package cases;

import java.util.Scanner;

public class Case05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        double n = sc.nextDouble();
        System.out.printf("Amalni kirgizing: ");
        char ch = sc.next().charAt(0);
        System.out.printf("Enter another number: ");
        double m = sc.nextDouble();
        switch(ch){
            case '+':
                System.out.printf("Yigindi:"+(n+m));
                break;
            case'-':
                 System.out.printf("Ayirma:"+(n-m));
                 break;
            case '/':
                  System.out.printf("Bo'linma:"+(n/m));
                  break;
            case '*':
                  System.out.printf("Ko'paytma:"+(n*m));
                  break;


        }
    }
}
