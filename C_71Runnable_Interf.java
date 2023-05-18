class ThreadRun1 implements Runnable
{
    public void run()
    {
        int i=0;
        while(i<100)
        {
        System.out.println("i'm a tread ONE not a threat!"+i);
        i++;
        }
       
    }
}

class ThreadRun2 implements Runnable
{
    @Override
   public  void run()
    {
        int i =0;
        while(i<100)
        {
        System.out.println("i'm a tread TWO >>"+ i);
         i++;
        } 
    }
}
public class C_71Runnable_Interf
{
    public static void main(String[] args)
    {

        ThreadRun1 bullet1 = new  ThreadRun1();
        Thread gun1 = new Thread(bullet1);

        ThreadRun2 bullet2 = new  ThreadRun2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
