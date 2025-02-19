package ifs;

import java.util.Scanner;

public class IF03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("please enter a number: ");
        int num = sc.nextInt();
        if (num >0) {
            int result=num+1;
            System.out.printf("Result :"+ result);
        } else if (num<0) {
            int result=num-2;
            System.out.printf("Result :"+ result);

        }else if(num==0){
            int result=10;
            System.out.printf("Result :"+ result);
        }else
            System.out.printf("Enter False number ");
    }
}
