package integer;

import java.util.Scanner;

public class Integer03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Faylning hajmini baytda kiriting: ");
        int a = sc.nextInt();
        int KB=a/1024;
        System.out.print("Faylning hajmi: "+ KB + " KB");


    }
}
