package Encapsulation;

public class A {
    private int a;
    public void setValue(int a){
        this.a=a;
    }
    public void getValue(){
        System.out.println("value of a is "+a);
    }
}


//we can have only one public class in one java file with the same name as file name
class B{
    public static void main(String[] args) {
        A r= new A();
        r.setValue(10);
        r.getValue();
    }
}
