package Multithreading;

public class RunnanbleMulti implements Runnable{
    public void run(){
        try{
            for(int i=0; i<5; i++){
                System.out.println("Shubham");
                Thread.sleep(1000);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

class Parents{
    public static void main(String[] args) throws Exception{
        RunnanbleMulti r = new RunnanbleMulti();
        Thread t = new Thread(r);
        t.start();
        for (int i=0; i<5; i++){
            System.out.println("Singh");
            Thread.sleep(1000);
        }
    }
}
