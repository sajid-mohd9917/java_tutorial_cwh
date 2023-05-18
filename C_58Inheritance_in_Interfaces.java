interface sampleInterface
{
   void meth1();
   void meth2();
}
interface  child_sampleInterface extends  sampleInterface
{
    void meth3();
   void meth4();
}

class SampleClass implements child_sampleInterface
{
   public void meth1()
    {
        System.out.println("method one");
    }
   public void meth2()
   {
    System.out.println("method two");
   }
  public void meth3()
   {
    System.out.println("method three");
   }
  public void meth4()
   {
    System.out.println("method four");
   }
}

public class C_58Inheritance_in_Interfaces
{
    public static void main(String[] args)
    {

        // SampleClass  smc = new SampleClass();
        // smc.meth1();
        // smc.meth2();
        // smc.meth3();
        // smc.meth4();

        child_sampleInterface csi = new SampleClass();
        csi.meth1();
        csi.meth2();
        csi.meth3();
        csi.meth4();
    }
}
