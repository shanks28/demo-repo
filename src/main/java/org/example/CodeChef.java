package org.example;

import java.util.Scanner;
import static java.lang.System.exit;

public class CodeChef {
    public static  void main(String [] args){
            /**Scanner scanner=new Scanner(System.in);
            //System.out.println("enter the number of test cases\n");
            int T=scanner.nextInt();
            if (T>=1&&T<=1000) {
                int[] A = new int[T];
                int sum;
                for (int i = 0; i < T; i++) {
                    sum = 0;
                    //System.out.println("enter the price for first 10 contestants :\n");
                    int x = scanner.nextInt();
                    //System.out.println("enter the price for the next 90 contestants\n");
                    int y = scanner.nextInt();
                    if(x>=1&&x<=1000&&y>=1&&y<=1000) {
                        sum = (x * 10) + (90 * y);
                        A[i] = sum;
                    }else{
                        exit(0);
                    }
                }
                for (int j = 0; j < T; j++) {
                    System.out.println(A[j]);
                }
            }
            else{
                exit(0);
            }*/
            /**Scanner scanner=new Scanner(System.in);
            int T=scanner.nextInt();
            String[] A= new String[T];
            for(int i=0;i<T;i++){
                int x=scanner.nextInt();
                int h=scanner.nextInt();
                if(x>=h){
                    A[i]="YES";
                }
                else{
                    A[i]="NO";
                }
            }
            for(int j=0;j<T;j++){
                System.out.println(A[j]);
            }*/
        /**Scanner scanner=new Scanner(System.in);
        int T=scanner.nextInt();
        int[] A=new int[T];
        double ans;
        for(int i=0;i<T;i++) {
            ans = 0;
            //System.out.println("enter the number of friends");
            int n = scanner.nextInt();
            //System.out.println("enter the number of slices each person wants");
            int x = scanner.nextInt();
            ans = (x * n);
            if (ans % 4 == 0) {
                A[i] = (int) ans/4;
            } else {
                A[i] = (int) Math.ceil(ans/4);//manual type casting
            }
        }
            for (int j = 0; j < T; j++) {
                System.out.println(A[j]);
            }**/
            Scanner scanner=new Scanner(System.in);
            System.out.println("enter the number of trials");
            int T=scanner.nextInt();
            int[] A=new int[T];
            for(int i=0;i<T;i++){
                System.out.println("enter the chef's current rating");
                int x=scanner.nextInt();
                System.out.println("enter the rating that the chef is currently solving");
                int y=scanner.nextInt();
                if()
            }








    }
}
