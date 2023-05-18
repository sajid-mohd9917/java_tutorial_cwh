

class EkClass
{
    int i;
    public int returnon() {
        return 1;
    }

    // EkClass()
    // {
    //     System.out.println("i'm a constructor inside ekclass");
    // }

    EkClass(int i)
    {
        this.i=i;
    }
    public int getA() {
        return i;
    }
}
class DoClass extends EkClass
{
    DoClass(int i)
    {
        super(i);
        System.out.println("i'm a constructor");
    }

}
public class C_471Super
{
    public static void main(String[] args)
    {
        
        EkClass e=new EkClass(8);
        System.out.println("vlue of i = "+ e.getA());
        
        DoClass dc = new DoClass(9);
    }
}
