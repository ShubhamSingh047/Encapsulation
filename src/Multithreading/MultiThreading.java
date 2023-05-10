package Multithreading;


//if this was not was multithreading then the same task would have taken
//10 sec just becouse of multi threading this task would be completed in
// 5 sec;
public class MultiThreading extends Thread{
    @Override
    public void run(){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Shubham");
                Thread.sleep(1000);
            }
        }catch(InterruptedException i){
            System.out.println(i);
        }
    }
}

class Parent{
    public static void main(String[] args) throws InterruptedException{
        MultiThreading m = new MultiThreading();
        m.start();
        for(int i=0; i<5; i++){
            System.out.println("singh");
            Thread.sleep(1000);
        }
    }
}
