package com.example;

class errorsrr {
    public static void test(int i) {
        // No correct as base condition leads to
        // non-stop recursion.
        if (i == 0)
            return;
        else {
            test(i++);
        }
    }
}
public class errors {
    public static void main(String[] args) {
        // eg of StackOverflowError
        errorsrr.test(5);
    }
}

