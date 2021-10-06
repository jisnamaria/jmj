package com.example;
import java.util.*;
public class Collections{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();//Creating arraylist
        list.add("Ravi");//Adding object in arraylist
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        System.out.println("-----------List-------------");
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        System.out.println("---------Stack-------------");
        Iterator<String> it=stack.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        LinkedList<String> animals = new LinkedList<>();

        // add() method without the index parameter
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cow");
        System.out.println("-----------LinkedList--------");
        System.out.println( animals);

        // add() method with the index parameter
        animals.add(1, "Horse");
        System.out.println("add fun Updated LinkedList: " + animals);
        String str = animals.get(1);
        System.out.println("Element at index 1: " + str);
        Map<Integer,String> map=new HashMap<Integer,String>();
        System.out.println("-----------HashMap--------");
        System.out.println("--Using enhanced for--");
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(6,"Amit");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("---with while & hasNext function---");
        Set set=map.entrySet();
        Iterator i=set.iterator();
        while(i.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)i.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }


    }
}