
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
        String[] networklist = { "\n harry5G","sajid-4GVi", "CodeWithHarry" };
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

public class C_59Polymorphism {
    public static void main(String[] args) {

        SmartPhone smp = new  SmartPhone();

        smp.callNumber(99174489);
        smp.pickCall();
        smp.takeSnap();
        smp.recordingVideo();
    smp.connectToNetwwork("sajid");
    
/* 
       camera cm=new SmartPhone();
        cm.takeSnap();
        cm.recordingVideo();
       // cm.greet();    not allowed private access
       cm.record4Kvideo();      // if method overrride ,then latest method executed

      // cm. connectToNetwwork();     not allowed, camera is as a referance

*/


/*
      wifi wf = new SmartPhone();
      String[] str=wf. getNetworkL();
      for(String s:str)
      {
        System.out.println(s);
      }


      wf.connectToNetwwork("sajid_Vi4G");

*/



    }

}
