package Integer;

import java.util.Scanner;

public class integer10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uch xonali son kirgizing: ");
        int num = sc.nextInt();
        int r1=num%10;
        int r10=num/10%10;
        int r100=num/100%10;
        System.out.println("Birliklar xonasidagi raqam: "+r1);
        System.out.printf("O'nliklar xonasidagi raqam: "+r10);
    }
}
