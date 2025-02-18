package integer;

import java.util.Scanner;

public class Integer04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("A kesmani uzunligini kirgizing: ");
        int a = sc.nextInt();
        System.out.print("B kesmani uzunligini kirgizing: ");
        int b = sc.nextInt();
        int n=a/b;
        System.out.println("A kesmada B ni: "+n+" marta joylashtish mumkin");

    }
}
