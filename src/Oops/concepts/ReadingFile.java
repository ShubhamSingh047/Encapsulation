package Oops.concepts;
import java.util.*;
import java.io.*;
public class ReadingFile {
    public static void main(String[] args) {
        try{
            File f = new File("/Users/shubhamsingh/Developer/Java_OOps/Opps/Hello.txt");
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException i){
            System.out.println(i);
        }

    }
}
