package cases;

import java.util.Scanner;

public class Case03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of month : ");
        int month = sc.nextInt();
        switch (month) {
            case 1: case 12: case 2:
                System.out.printf("Qish");
                break;
            case 3: case 4: case 5:
                System.out.printf("Bahor");
                break;
            case 6: case 7: case 8:
                System.out.printf("Yoz");
                break;
            case 9: case 10: case 11:
                System.out.printf("Kuz");
                break;
            default:
                System.out.println("Not a valid month");

        }
    }
}
