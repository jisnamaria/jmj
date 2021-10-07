package com.example;
//import java.util.logging;
class tryit{
    public static void main(String[] args) throws ArithmeticException {
        int a=10, b=0, c;
//        try{
            c=a/b;           //ArithmeticException i.e. Divide by zero exception is thrown here
            //logger.info(c);
            System.out.println(c);
//        }
//        catch(ArithmeticException ariExp) {//matching ArithmeticExcecption is declared in "catch block"
//            //logger.info("We have an Exception - "+ariExp); //message related to caught exception is printed
//            System.out.println("We have an Exception");
//        }
    }
}
