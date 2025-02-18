package integer;

import java.util.Scanner;

public class Integer09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Uch xonali sonni kirgizing:");
        int num=sc.nextInt();
        int r1=num%10;
        int r10=num/10%10;
        int r100=num/100%10;
        System.out.printf("Yuzlar xonasidagi raqam: "+r100);


    }

}
