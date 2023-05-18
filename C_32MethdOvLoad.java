
public class C_32MethdOvLoad
{
 
    static int change(int x)
    {
        x=50;
        return x;
        
        // System.out.println("value of x inside change="+x);
    }
    public static void main(String[] args)
    {
        int x=40;
        int c=change(x);
    System.out.println("value of x after call change= "+c);
    }

}


