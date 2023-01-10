package DSA;

import java.nio.file.Paths;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int lastunsortedIndex=arr.length-1;lastunsortedIndex>0;lastunsortedIndex--)
        {
            int largest=0;
            for(int j=1;j<lastunsortedIndex;j++)
            {
                if(arr[j]>arr[largest])
                {
                    largest=j;
                }
            }
            swap(arr,largest,lastunsortedIndex);
        }
        for(Integer i:arr)
        {
            System.out.println(i);
        }

    }
    public static void swap(int[] arr,int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
