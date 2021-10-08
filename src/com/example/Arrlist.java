package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Arrlist {
    public static void main(String[] arg)
    {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Joji");
        list.add("Dinna");
        list.add("Jisna");
        list.add("Pauls");
        list.add("Anna");
        System.out.println(list);
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(list1);
        ArrayList<Integer> l = new ArrayList<Integer>(Collections.nCopies(10,9));
        System.out.println(l);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
        list.remove("Jisna");
        System.out.println(list);

        for(int i=0;i<list.size();i++)
        {
            if(list.contains("Anna"))
            System.out.println(list.get(i));
        }



    }
}
