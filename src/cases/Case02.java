package cases;

import java.util.Scanner;

public class Case02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a mark : ");
        int mark = sc.nextInt();
        switch (mark) {
            case 1:
                System.out.println("The mark is bad ");
                break;
            case 2:
                System.out.println("The mark is poor");
                break;
            case 3:
                System.out.println("The mark is right");
                break;
            case 4:
                System.out.println("The mark is good");
                break;
            case 5:
                System.out.println("The mark is excellent");
                break;
            default:
                System.out.println("The mark is wrong");

        }

    }
}
