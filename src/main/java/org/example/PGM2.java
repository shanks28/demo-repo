package org.example;

import java.util.Scanner;

public class PGM2 {
    public static void main(String [] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int b = scanner.nextInt();
            System.out.println("the Factorial of " + b + " is " + factorial(b));

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public  static int factorial(int a){
        if(a==0){
            return 1;
        }
        else{
            return factorial(a-1)*a;
        }

    }
}
