package org.example;

import java.util.Scanner;

public class PGM3 {
    public static int fibo(int a){
        if(a==0){
            return 0;
        } else if (a==1) {
            return 1;
        }
        else{
            return fibo(a-1)+fibo(a-2);
        }
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int b=scanner.nextInt();
        System.out.println("the required range is");
        for(int i=0;i<b;i++){
            System.out.println(fibo(i));
        }
        System.out.println(fibo(b));


    }
}
