    class myThread extends Thread{

       public myThread(String name)
       {
        super(name);
       }


        public void run ()
        {
            int i=0; 
            while(i<10)
            {
                System.out.println("thread name is : "+  this.getName());
                System.out.println("HeLLO WORLD >>>>"+ i);
                i++;
            }

        }
    }

public class cwh_74ThreadPriority
{
    public static void main(String[] args)
    {

        myThread mth1= new myThread("SAJID_1");
        myThread mth2= new myThread("SAJID_2");
        myThread mth3= new myThread("SAJID_3");
        myThread mth4= new myThread("SAJID_4");
        myThread mth5= new myThread("SAJID_5");

        // mth1.setPriority(Threead.MAX_PRIORITY);
        mth1.setPriority(10);
        // mth5.setPriority(Thread.MIN_PRIORITY); 
        //   mth4.setPriority(7);

//byDefault NORM_PRIORITY

        mth1.start();
        mth2.start();
        // mth3.start();
        // mth4.start();
        // mth5.start();
        

        // System.out.println("priority="+ mth1.getPriority());
        // System.out.println("priority="+ mth5.getPriority());
        // System.out.println("priority="+ mth3.getPriority());



    }
}