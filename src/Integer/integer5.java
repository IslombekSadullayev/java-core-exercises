package java;
import java.util.Scanner;
public class integer5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A kesmani uzunligini kirgizing: ");
        int a = sc.nextInt();
        System.out.println("B kesmani uzunligini kirgizing: ");
        int b = sc.nextInt();
        int n=a/b;
        System.out.println("A kesmada B kesmani :"+n+" marta joylash mumkin");

        double k=a%b;
        System.out.println("A kesmada B kesmani joylashmagan qismi "+k);

}
    }
