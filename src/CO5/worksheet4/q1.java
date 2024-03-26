public class q1 {
    public static void main(String[] args) {
        StudentA studentA = new StudentA();
        StudentB studentB = new StudentB();

        Thread threadA = new Thread(studentA);
        Thread threadB = new Thread(studentB);

        threadA.start();
        threadB.start();
    }
}

class StudentA implements Runnable {
    public synchronized void courseTeacher() {
        System.out.println("Student A's course teacher is Mr. Smith");
    }

    @Override
    public void run() {
        courseTeacher();
    }
}

class StudentB implements Runnable {
    public synchronized void courseTeacher() {
        System.out.println("Student B's course teacher is Mrs. Johnson");
    }

    @Override
    public void run() {
        courseTeacher();
    }
}