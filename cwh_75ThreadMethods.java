class myThread extends Thread {
    public myThread(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 200) {
            System.out.println("ThankYou!..." + i + this.getName());

            // try{
            // Thread.sleep(10);
            // }
            // catch (InterruptedException e)
            // {
            // e.printStackTrace();
            // }

            i++;
        }
    }
}

class myThread2 extends Thread {

    public myThread2(String name) {
        super(name);
    }

    public void run() {
        int i = 0;
        while (i < 100) {

            System.out.println("\tmy Thankyou!..." + i + this.getName());
            // try{
            // Thread.sleep(50);
            // }
            // catch (Exception e)
            // {
            // System.out.println(e);
            // }

            i++;
        }
    }
}

public class cwh_75ThreadMethods {
    public static void main(String[] args) {
        myThread th1 = new myThread("thread_1");
        myThread2 th2 = new myThread2("thread_2");

        th1.start();
        // System.out.println("th1 state- "+th1.getState());
        // System.out.println("th2 state- "+th2.getState());

        // try{
        // th1.join();
        // }

        // catch(Exception e)
        // {
        // System.out.println( e );
        // }

        // before creating obj state will be NEW
        // after creating obj state will be runnable
        // after choosing thread scheduler state will be running

        System.out.println( myThread2.currentThread().getState());
        th2.start();

        // System.out.println(th1.getState());
        // System.out.println(th2.getState());

        System.out.println( myThread.currentThread().getState());
        System.out.println(Thread.currentThread());
    }
}