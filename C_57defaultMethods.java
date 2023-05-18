interface camera {

    void takeSnap();
 void recordingVideo();

    private void greet()
    {
        System.out.println("Good Morning!");
    }

    default void record4Kvideo()
    {
        greet();
        System.out.println("recording in 4K vidio");
    }
}

interface wifi {
    String[] getNetworkL();

    void connectToNetwwork(String network);

}

class CellPhone {
    void callNumber(int number) {
    System.out.println("calling to " + number);
    }

    void pickCall() {
        System.out.println("connecting....");
    }
}
 
class SmartPhone extends CellPhone implements camera, wifi {
    public void takeSnap() {
        System.out.println("please taking snap");
    }

    public void recordingVideo() {
        System.out.println("plaes recording video!");
    }

    public String[] getNetworkL() {
        String[] networklist = { "harry5G","sajid4GVi", "CodeWithHarry" };
        return networklist;
    }

    public void connectToNetwwork(String network) {
        System.out.println("connecting to " + network);
    }

 
    //  public void record4Kvideo()
    // {
    //     System.out.println(" enjoy recording in 4K vidio (latest method)");
    // } 
}

public class C_57defaultMethods {
    public static void main(String[] args) {

        SmartPhone sm = new  SmartPhone();

       String [] str_nl= sm.getNetworkL();

       for(String i: str_nl)
       { 
           System.out.println(i);
       }

       sm.record4Kvideo();  // latest method execute hoga

      // sm.greet();  ---> not allowed due to private
    }

}
