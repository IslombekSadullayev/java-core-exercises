package Integer;

import java.util.Scanner;

public class integer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Ogirlikni kg da kirgizing: ");
        int  num=sc.nextInt();
        int  result=(num/1000);
        System.out.print(result+"tonna");
    }
}
