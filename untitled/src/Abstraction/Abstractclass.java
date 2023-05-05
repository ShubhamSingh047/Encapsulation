package Abstraction;

abstract class Abstractclass {
    abstract void m1();
}
class B extends Abstractclass{
    @Override
    void m1() {
        System.out.println("method is ovridden");
    }
}

class A extends B{
    public static void main(String[] args) {
        Abstractclass r= new B();
        r.m1();
    }
}
