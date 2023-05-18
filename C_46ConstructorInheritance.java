
class base {

    base() {
        System.out.println("i'm a constructor With_out_args inside base class");
    }

    base(int x) {
        System.out.printf("i'm a constructor 1Arg inside base class value x =%d  \n", x);
    }

    base(int x, int y) {
        System.out.printf("i'm a constructor2arg inside base class value x =%d & y =%d \n", x, y);
    }
}

class derived extends base {

    derived() {
        // super(6);
        // super(8,9);
        System.out.println("i am  wargs constructor in drived class");
    }

    derived(int x, int y) {
        // super(x);
        System.out.printf("i am am constructor overloaded in drived class x=%d  y=%d", x, y);
    }
}

class child extends derived
{

    child() 
    {
        super(1,2);
        System.out.printf("iam a wargs constructor in child class");
    }

    child(int x, int y, int z)
     {
        // super(x, y);
        System.out.printf("\n im constructor in child class  x y z= %d %d %d", x,y,z);
    }
}

public class C_46ConstructorInheritance {
    public static void main(String[] args) {

        // base b=new base(1,2);
        // derived d=new derived(9,18);
        child cd = new child();

    }

}