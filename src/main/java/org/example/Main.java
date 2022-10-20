package org.example;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        /**Scanner scanner=new Scanner(System.in);
        int flag=0;
        //System.out.println("enter the input for x");
        int x=scanner.nextInt();
        //System.out.println("enter the input for y");
        int y=scanner.nextInt();
        ///IntStream intStream=IntStream.range(x,y+1);
        int k=(x>=1&&x<=100)?1:0;
        int j=(y>=1&&y<=100)?1:0;
        if (k==1&&j==1){

            if(x>y){

                System.out.println("NO");
            }
            else {


                System.out.println("YES");
            }
        }
        /**if(flag==1){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }**/
        /**System.out.println(Random.addNumbers(1,3));
        System.out.println(Random.multiplyNumbers(2,4));
        int [] numbers={1,2,3,4};
        String [] words={"Ignitions sequence start","liftoff"};
        System.out.println(words[0]);
        for(int i=0;i<numbers.length;i++){
            System.out.println(i);
        }
        System.out.println(words[1]);

    }**/
        /**int lucky=0,unlucky=0,N,j,i;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of elements");
        N=scanner.nextInt();
        int[] A=new int[N];
        //int res1=(1<=N&&100>=N)?1:0;
        //int res2=(1<=A&&100>=A)?1:0;
        if (N>=1&&N<=100) {
            for (i = 0; i < N; i++) {
                System.out.println("enter the " + i + "element");
                A[i] = scanner.nextInt();
                if (A[i] >= 1 && A[i] <= 100) {
                    //System.out.println("correct inputs");
                    continue;
                }
                else {
                    exit(0);
                }
            }
            for (j = 0; j < N; j++) {
                if (A[j] % 2 == 0) {
                    lucky++;
                }else{
                    unlucky++;
                }
            }


        if (lucky>unlucky) {
            System.out.println("READY FOR BATTLE");
        }else {
            System.out.println("NOT READY");
        }


        }
        else{
            exit(0);
        }**/
        /**Scanner scanner=new Scanner(System.in);
        //System.out.println("enter the number of test cases\n");
        int T=scanner.nextInt();
        float[] x=new float[T];
        float [] y=new float[T];
        if(T>=1&&T<=20000) {
            for (int i = 0; i < T; i++) {
                //System.out.println("enter the values for the Fastest time\n");
                x[i] = scanner.nextFloat();
                //System.out.println("Enter the values for the chefs time:\n");
                y[i] = scanner.nextFloat();
                if (x[i] >= 1 && x[i] <= 200 && y[i] >= 1 && y[i] <= 200) {
                    continue;
                } else {
                    exit(0);
                }
            }
            for (int j = 0; j < T; j++) {
                x[j] *= 1.07;
                if (x[j] >= y[j]) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        else{
            exit(0);
        }**/
        Scanner scanner=new Scanner(System.in);
        //System.out.println("enter the number of test cases");
        int T=scanner.nextInt();
        String[] A= new String[T];
        if(T>=1&&T<=100){
            for (int i = 0; i < T; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                if(x>=1&&x<=100&&y>=1&&y<=100) {
                    if (x >= y) {
                        A[i] = "YES";
                    } else {
                        A[i] = "NO";
                    }
                }
                else {
                    exit(0);

                }
            }
            for (int j = 0; j < T; j++) {
                System.out.println(A[j]);
            }
        }
        else{
            exit(0);
        }





    }
}
