 /*  
   class MyThred extends Thread{
      

        public MyThred(String name)
        {
            super(name);
        }

        public void run()
        {
            int i=0;
            while(i<10)
            {
                System.out.println(">>>>>COOKING");
                i++;
            }
        }

    }

public class cwh_73ConstructorsfromThread 
{
    public static void main(String[] args)
    {

        MyThred th= new MyThred("sajid");
        th.start();

System.out.println("thresd id is = " + th.getId());
System.out.println("thresd name is = " + th.getName());
    }
}

*/


class MyThred implements Runnable{

// public MyThred(String name)
// {
//     // super();
// }

    public void run()
    {
        int i=0; 
        while(i<10)
        {
            System.out.println("<<<COOKING__"+ i);
            i++;
        }
    }
} 

public class cwh_73ConstructorsfromThread 
{
    public static void main(String[] args)
    {

        MyThred mth=new MyThred();

        Thread th=new Thread(mth,"sajid");

        th.start();

        System.out.println("Thread id is = "+ th.getId());
        System.out.println("thred Name is = "+ th.getName());
    }
}