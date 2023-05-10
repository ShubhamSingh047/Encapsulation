package Oops.concepts;
import java.io.*;

public class PrintInformation {
    public static void main(String[] args) {
        File f= new File("/Users/shubhamsingh/Developer/Java_OOps/Opps/hello.txt");
        if(f.exists()){
            System.out.println("File Name: "+f.getName());
            System.out.println("File Location: "+f.getAbsolutePath());
            System.out.println("File Writabale: "+f.canWrite());
            System.out.println("File Readable: "+f.canRead());
            System.out.println("File Size: "+f.length());
            System.out.println("File Removed: "+f.delete());
        }else{
            System.out.println("File does not exist");
        }
    }
}
