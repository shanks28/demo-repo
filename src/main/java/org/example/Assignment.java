package org.example;

import javax.swing.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class Assignment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the operand 1");
        int a = scanner.nextInt();
        System.out.println("Enter the operand 2:");
        int b = scanner.nextInt();
        while (true) {
            try {
                System.out.println("1.ADd\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
                System.out.println("Enter the operator :");
                int c = scanner.nextInt();
                switch (c) {
                    case 1:
                        System.out.println("The sum is" + (a + b));
                        break;
                    case 2:
                        System.out.println("The difference is" + (a - b));
                        break;
                    case 3:
                        System.out.println("The Product is:" + (a * b));
                        break;
                    case 4:
                        System.out.println("The Quotient is:" + (a / b));
                        break;
                    case 5:
                        exit(0);
                }
            }catch(Exception e){
                    System.out.println("Error");
                    break;
                }
            }
    }

}


