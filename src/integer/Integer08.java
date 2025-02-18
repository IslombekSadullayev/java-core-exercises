package integer;

import java.util.Scanner;

public class Integer08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ikki xonali son kirgizing: ");
        int x = sc.nextInt();
        int r1=x%10;
        int r10=x/10%10;
        int result=r1*10+r10*1;
        System.out.println(result);


    }
}
