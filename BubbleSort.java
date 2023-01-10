package DSA;

public class BubbleSort {//The time complexity of this is O(n^2)
    public static void main(String[] aregs)
    {
        int[] array={20,35,-15,7,55,1,-22};
        for(int index=array.length-1;index>0;index--)
        {
            for(int i=0;i<index;i++)
            {
                if(array[i]>array[i+1])
                {
                    swap(array,i,i+1);
                }
            }
        }
        for(Integer integer:array)
        {
            System.out.println(integer);
        }

    }
    public static void swap(int[] array,int i,int j)
    {
        if(i==j)
        {
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }

}
