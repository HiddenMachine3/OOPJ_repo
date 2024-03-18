package CO5.worksheet3;

public class q1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            while (true) {
                System.out.println("Good morning");
            }
        });

        Thread thread2 = new Thread(() -> {
            while (true) {
                System.out.println("Welcome");
            }
        });

        thread1.start();
        thread2.start();
    }
}
