package integer;

import java.util.Scanner;

public class Integer07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ikki xonali son kiriting: ");
        int x = sc.nextInt();
        int r1=x%10;
        int r10=x/10%10;
        System.out.printf("Raqamlar yigindidi: "+(r1+r10));

    }
}
