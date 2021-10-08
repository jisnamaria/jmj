package com.example;

public class Sample {
    public static void main(String[] arg)
    {
        int[] a={12,6,4,9,98,8,32,1,-20,11};
        for(int i=0;i<10;i++)
        {
            for(int j=i+1;j<10;j++)
            {
                if(a[i]+a[j]== 12)
                {
                    System.out.println(a[i]+","+a[j]);
                }
            }
        }
    }
}
