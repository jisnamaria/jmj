package com.example;

// Java program to get file size
// and file path

import java.io.File;

public class assign2 {
    public static void main(String args[]) {
        final String fileName = "DSC00916.jpg";
        try {
            //File Object
            File objFile = new File(fileName);

            //getting file path
            System.out.println("File path is: " + objFile.getAbsolutePath());
            //getting filesize
            System.out.println("File size is: " + objFile.length() + " bytes.");
        } catch (Exception Ex) {
            System.out.println("Exception: " + Ex.toString());
        }

    }
}
