package Abstraction;

public interface inter {
    int a=10;
    void m1();
}
class C implements inter{
    public void m1(){
        System.out.println(10);
    }
}

class Main{
    public static void main(String[] args) {
        inter r = new C();
        r.m1();
    }
}
