package com.example;


import java.text.SimpleDateFormat;
import java.util.Date;


public class OOPs
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        String strDate= formatter.format(date);
        System.out.println(strDate);

        vamsi v=new vamsi();
        System.out.println("for vamsi class");
        v.Add(2,3); //addition of two integers
        v.Add(2.3f,2.7f); // addition of two floats
        manoj m=new manoj();
        System.out.println("for manoj which is inherited from vamsi class");
        m.Add(2,3); // multiplication of two integers
        pavan p=new pavan();// constructor created, object Instantiation
        p.run();
        p.walk();
        p.run2();
        p.walk2();
        peeyush o=new peeyush();// constructor created, object Instantiation
        o.run();
        o.walk();
    }
}
class vamsi// Encapsulation
{
    public void Add(int a,int b)
    {
        int c=a+b;
        System.out.println("ths int sum "+c);
    }
    public void Add(float a,float b)// Overload
    {
        float c=a+b;
        System.out.println("ths float sum "+c);
    }
}
class manoj extends vamsi
{
    public void Add(int a,int b)// Override
    {
        int c=a+a+b+b;
        System.out.println(" overriding Add function "+c);
    }
}
interface aaa// Abstraction
{
    void run();
    void walk();
}
interface  bbb
{
    void run2();
    void walk2();
}

class pavan implements aaa,bbb
{
    public void run()
    {
        System.out.println(" aaa Interface pavan");
    }
    public void walk()
    {
        System.out.println(" aaa Interface pavan ");
    }
    public void run2()
    {
        System.out.println("bbb Interface pavan");
    }
    public void walk2()
    {
        System.out.println(" bbb Interface pavan ");
    }

}
class peeyush implements  aaa
{
    public void run()
    {
        System.out.println(" aaa Interface Peeyush");
    }
    public void walk()
    {
        System.out.println("aaa Interface Peeyush ");
    }
}