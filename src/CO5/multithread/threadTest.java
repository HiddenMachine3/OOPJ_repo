package CO5.multithread;

public class threadTest implements Runnable{

    public void run(){
        try {
            for(int i=0;i<5;Thread.sleep(500), System.out.println(i++));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Thread t = new Thread(new threadTest());
        Thread t2 = new Thread(new threadTest());

        t.start();
        System.out.println("is t alive : "+t.isAlive());
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("is t alive after joining: "+t.isAlive());
        t2.start();
    }
}