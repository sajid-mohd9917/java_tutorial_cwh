

class EkClass
{
    int i;
    public int returnon() {
        return 1;
    }

    EkClass(int i)          //constructor
    {
        this.i=i;
    }

    public int getA() {
        return i;
    }
}
public class C_47This_Super
{
    public static void main(String[] args)
    {
        EkClass e=new EkClass(8);
        System.out.println("vlue of i = "+e.getA());

    }
}
