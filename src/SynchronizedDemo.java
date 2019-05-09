public class SynchronizedDemo {

    public static void main(String[] args) {
        Display d = new Display();
        MyThread_sync t1 = new MyThread_sync(d, "Brendon");
        MyThread_sync t2 = new MyThread_sync(d, "Jason");
        MyThread_sync t3 = new MyThread_sync(d, "Peter");
        MyThread_sync t4 = new MyThread_sync(d, "Jamie");
        MyThread_sync t5 = new MyThread_sync(d, "Sherry");

        t1.start();
        t2.start();
    }
}

class Display {

    synchronized public void wish(String name) {

        for(int i = 0; i < 10; i++) {

            System.out.print("Good morning: ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}

class MyThread_sync extends Thread {

    Display d;
    String name;

    MyThread_sync(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}