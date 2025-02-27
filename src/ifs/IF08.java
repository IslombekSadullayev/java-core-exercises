package ifs;

import java.util.Scanner;

public class IF08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ikkita butun son kirgizing: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
      if (n > m) {
          System.out.printf(n+" "+m);
      } else if (n < m) {
          System.out.printf(m+" " +n);

      }

    }
}
