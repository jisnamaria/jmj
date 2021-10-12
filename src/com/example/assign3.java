package com.example;

// Java program to print all files
// in a folder(and sub-folders)

import java.io.File;
import java.util.*;

public class assign3 {
    private static long getFolderSize(File folder)
    {
        long length = 0;

        // listFiles() is used to list the
        // contents of the given folder
        File[] files = folder.listFiles();

        int count = files.length;

        // loop for traversing the directory
        for (int i = 0; i < count; i++) {
            if (files[i].isFile()) {
                length += files[i].length();
            }
            else {
                length += getFolderSize(files[i]);
            }
        }
        return length;
    }
    static void RecursivePrint(File[] arr, int index, int level)
    {
        // terminate condition
        if (index == arr.length)
            return;

        // tabs for internal levels
        for (int i = 0; i < level; i++)
            System.out.print("\t");

        // for files
        if (arr[index].isFile())
            System.out.println(arr[index].getName()+"---"+arr[index].length()+"Bytes");

            // for sub-directories
        else if (arr[index].isDirectory()) {
            System.out.println("[" + arr[index].getName()
                    +"(size-"+getFolderSize(arr[index])+"Bytes)"+ "]");

            // recursion for sub-directories
            RecursivePrint(arr[index].listFiles(), 0,
                    level + 1);
        }

        // recursion for main directory
        RecursivePrint(arr, ++index, level);
    }

    // Driver Method
    public static void main(String[] args)
    {
        // Provide full path for directory(change
        // accordingly)
//        String maindirpath
//                = "C:\\Users\\user\\Desktop\\FLYCATCH";

        // File object
        Scanner sc= new Scanner(System.in); //System.in is a standard input stream
        System.out.print("Enter a path: ");
        String str= sc.nextLine();
//        File maindir = new File(maindirpath);
        File maindir = new File(str);

        if (maindir.exists() && maindir.isDirectory()) {

            // array for files and sub-directories
            // of directory pointed by maindir
            File arr[] = maindir.listFiles();


            System.out.println(
                    "Files from main directory : " + maindir);


            // Calling recursive method
            RecursivePrint(arr, 0, 0);
        }
    }
}

