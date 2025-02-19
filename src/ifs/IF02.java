package ifs;

import java.util.Scanner;

public class IF02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a positive number: ");
        int n = sc.nextInt();
        if (n>0){
            int result=n+1;
            System.out.print("Result:"+result);
        }else
            System.out.print("Result:"+(n-2));
    }
}
