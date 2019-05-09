public class YieldDemo {

    /** The purpose of the yield() is to give opportunity for other threads to execute if
     *  the waiting threads have some OR higher priority than the current executing thread.
     *
     *  When the thread successfully yielded to other thread, the thread will pause its executing to
     *  give execution opportunities to other waiting thread IF the threads have same or higher priority
     *
     *  If there are no waiting threads or if the waiting threads have low priority, then the executing
     *  threads can continue to execute until it hits the yield() method and check again
     *
     */

    public static void main(String[] args) {
        System.out.println("Hello world");
    }


}


class MyThread_yield extends Thread {

    @Override
    public void run() {
        super.run();
    }


}
