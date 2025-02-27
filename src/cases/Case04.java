package cases;

import java.util.Scanner;

public class Case04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a month number: ");
        int month = sc.nextInt();
        switch (month) {
            case 1,3,5,7,8,10,12->{
                System.out.printf("31 kundan iborat");
            } case 4,6,9,11->{
                System.out.printf("30 kundan iborat");
            }case 2->{
                System.out.printf("28 yoki 29 kundan  iborat");
            }
        }
    }
}
