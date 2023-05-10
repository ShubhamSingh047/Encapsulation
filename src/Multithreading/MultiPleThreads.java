package Multithreading;

public class MultiPleThreads extends Thread{
    public void run() {
        String n = Thread.currentThread().getName();
        for(int i=0; i<3; i++){
            System.out.println(n);
        }
    }
}

class Father{
    public static void main(String[] args) {
        MultiPleThreads m1 =new MultiPleThreads();
        MultiPleThreads m2 =new MultiPleThreads();
        MultiPleThreads m3 =new MultiPleThreads();

        m1.setName("One");
        m2.setName("Two");
        m3.setName("Three");

        m1.start();m2.start();m3.start();

    }
}
