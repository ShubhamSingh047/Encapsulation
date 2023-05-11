package Multithreading;

public class SyncMultiMethod extends Thread {
    int seat=1,person;
    SyncMultiMethod(int person){
        this.person=person;
    }
    public synchronized void run(){

        String name = Thread.currentThread().getName();
        if(seat>=person){
            System.out.println(name+" Seat is alloted");
            seat-=person;
        }else{
            System.out.println(name+" seat Not Available");
        }
    }
}

class Runner{
    public static void main(String[] args) {
        SyncMultiMethod s = new SyncMultiMethod(1);
        Thread t = new Thread(s);
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);

        t.setName("rahul");
        t1.setName("vishal");
        t2.setName("Raj");

        t.start(); t1.start(); t2.start();
    }
}
