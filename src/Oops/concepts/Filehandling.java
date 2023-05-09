package Oops.concepts;

import java.io.*;
public class Filehandling {
    public static void main(String[] args) {
        File f= new File("/Users/shubhamsingh/Developer/Java_OOps/Opps/hello.txt");
        try {
            if (f.createNewFile()) {
                System.out.println("file has been created Successfully..!");
            } else {
                System.out.println("file already exist with similar name.. !");
            }
        }catch(Exception e){
            System.out.println(e+ "inside catch block");
        }
    }
}
