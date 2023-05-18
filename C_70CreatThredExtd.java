class MYthread1 extends Thread {
    
    public void run() {
        int i = 0;
        while (i <100) {
            System.out.println("<<<<<chatting....."+i);
            // System.out.println("thread 1 is running....");
            i++;
        }

    }
}

class MYthread2 extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 100) {
            // System.out.println("\tTHread two is running....");
            System.out.println("\t..... COOKING>>>>" +i);
            i++;
        }
    }
}
public class C_70CreatThredExtd
{
    public static void main(String[] args)
    {

        MYthread1 th1 = new MYthread1();
        MYthread2 th2 = new MYthread2();
        th1.start();
        th2.start();
    }
}
