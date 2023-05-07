package OOps.Conecpts;

public class Exception_H {
    public static void main(String[] args) {
        int a,b,c;
        a=10;
        b=0;
        try{
            c=a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("can't devide");
        }
        System.out.println("main ended");
    }

}
