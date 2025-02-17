package Boolean;

import java.util.Scanner;

public class boolean1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        boolean result = (num>0) ? true : false;
        System.out.println(result);
    }
}
