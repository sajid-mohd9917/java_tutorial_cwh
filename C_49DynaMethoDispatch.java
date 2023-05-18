
class phone 
{

    public void showTime()
     {
        System.out.println("\n welcome! time is 8 am");
     }

    public void on1()
     {
        System.out.println("turning on phone");
    }
}

class smartPhone extends phone {

    public void music() {
        System.out.println("\n  playing music!");
    }

    public void on() {
        System.out.println("turning on smartphone");
    }
}

public class C_49DynaMethoDispatch {
    public static void main(String[] args) {

        // smartPhone obj=new smartPhone();
        // obj.showTime();
        // obj.on();             //  latest method execute hoga



        // phone obj = new phone();
        // obj.on1();
        // obj.showTime();
        
        
        // smartPhone obj = new phone(); Not allowed
        
     
      phone obj = new smartPhone();   // yes allowed, object run time par banta hai
        obj.showTime();
        obj.on1();

        // obj.music();   Not allowed
        // obj.on();     Not allowed
     

    }
}
