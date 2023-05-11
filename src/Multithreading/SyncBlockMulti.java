package Multithreading;

public class SyncBlockMulti {
    public void show(String name) {
        //100 line of codes
        synchronized(this){
            for (int i = 0; i < 3; i++) {
                System.out.println(name + "hello there");
            }
        }
        //100 line of code
    }
}
class OurThread extends Thread{
    SyncBlockMulti m;
    String name;
    OurThread(SyncBlockMulti m, String name){
        this.m=m;
        this.name=name;
    }
    public void run(){
        m.show(name);
    }
}

class SynBlock{
    public static void main(String[] args){
        SyncBlockMulti m = new SyncBlockMulti();
        OurThread t1 = new OurThread(m,"Shubham ");
        OurThread t2 = new OurThread(m,"singh ");
        t1.start();t2.start();
    }
}