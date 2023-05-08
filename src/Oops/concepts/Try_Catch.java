package Oops.concepts;

public class Try_Catch {
    static int a,b,c;

    public static void main(String[] args) {
        try{
            a=10;
            b=0;
            c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("can't divide");
        }
    }
}
