package Oops.concepts;

import java.io.*;

public class WriteInFile {
    public static void main(String[] args) {

        //Below is the code for creating file
        try{
            File f = new File("/Users/shubhamsingh/Developer/Java_OOps/Opps/Hello.txt");
            if(f.createNewFile())
            {
            System.out.println("File Created");
            }
            else
            {
            System.out.println("File already exist");
            }
        }
        catch (IOException i){
            System.out.println(i);
        }

//Below Block of code is for writing File
        try{
            FileWriter w = new FileWriter("/Users/shubhamsingh/Developer/Java_OOps/Opps/Hello.txt");
            try{
                w.write("Hello There ! 🥸 ");
            }finally {
                w.close();
            }
            System.out.println("File written successfully");
        }catch (IOException i){
            System.out.println(i);
        }

//Below Block of code is for reading File
        try{
            FileReader r = new FileReader("/Users/shubhamsingh/Developer/Java_OOps/Opps/Hello.txt");
            try{
                int i;
                while((i=r.read())!=-1){
                    System.out.print((char)i);
                }
            }finally {
                r.close();
            }
        }catch (IOException i){
            System.out.println(i);
        }
    }
}
