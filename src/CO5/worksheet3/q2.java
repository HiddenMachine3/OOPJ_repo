package CO5.worksheet3;

public class q2 {

    public static void main(String... args){
        Thread goodMorningThread = new Thread(() -> {
            while (true) {
                System.out.println("Good morning");
            }
        });
        
        Thread welcomeThread = new Thread(()->{
            while(true){
                System.out.println("Welcome");

                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        goodMorningThread.start();
        welcomeThread.start();

    }
    
}
