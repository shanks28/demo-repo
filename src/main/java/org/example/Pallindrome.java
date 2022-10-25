package org.example;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args){
        try{
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int i;
        String b= String.valueOf(a);
        System.out.println(b);
        String rev="";
        int len=b.length();
        int j;
        for(j=len-1;j>=0;j--){
            rev+=b.charAt(j);

        }
        //System.out.println(rev);

            if(b.equals(rev)){
                System.out.println("EQUAL");
            }
            else{
                System.out.println("NOT EQUAL");
            }
        }catch (Exception exception){
            System.out.println("Invalid Input");
        }


    }

}
