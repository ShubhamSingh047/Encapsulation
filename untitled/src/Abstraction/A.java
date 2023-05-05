package Abstraction;

interface D {
    void show();
}
interface E{
    void disp();
}
class Demo implements D,E{
    public void disp(){
        System.out.println("method for B");
    }
    public void show(){
        System.out.println("method for A");
    }

    public static void main(String[] args) {
        Demo m=new Demo();
        m.disp();m.show();
    }
}