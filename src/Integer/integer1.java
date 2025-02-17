package Integer;

import java.util.Scanner;

public class integer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("L santimetrni kiriting ");
        double L = sc.nextDouble();
        double metr=L/100;
        System.out.print(metr+"metr");
    }
}
