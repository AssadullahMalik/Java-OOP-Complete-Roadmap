class Task extends Thread {
    private String taskName;

    Task(String name) {
        this.taskName = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i);
        }
    }
}

public class 29_MultiThreadingExample {
    public static void main(String[] args) {
        Task t1 = new Task("Thread-1");
        Task t2 = new Task("Thread-2");

        t1.start();
        t2.start();
    }
}
