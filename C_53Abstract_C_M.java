abstract class  parents{

    parents() {
        System.out.println("i'm aconstructor in parents class");
    }
    
    public void sayHello() {
        System.out.println("Hello base!");

    }

    abstract public void greet();       
    abstract public void greet1();   
}

class child extends parents {
    @Override
    public void greet() {
        System.out.println("Good Morning,");
    }
    @Override
    public void greet1()
    {
        System.out.println("Good Afternoon!");
    }
}

abstract class child2 extends parents
{
    public void th(){
     System.out.println("i am good");   
    }
   

}

public class C_53Abstract_C_M {
    public static void main(String[] args) {

      //  parents p = new parents();     not allowed,cn't be created obect of abstracted class
      child c=new child();             // allowed, child class is contrete class

    //  child2 c = new child2();             not allowed,cn't be created obect of abstracted class

        c.sayHello();
        c.th();
    
        c.greet();



        
    }
}
