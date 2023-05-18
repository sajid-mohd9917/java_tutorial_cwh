class C1 {
    public int x = 5;
    protected int y = 10;
    int z = 15; // no modifier
    private int a = 30;

    public void meth1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class C_66AccessModifiersInjava {
    public static void main(String[] args) {

        C1 c = new C1();
        c.meth1(); // same class m use kar sakte

        /* System.out.println(c.a); same package m private ko 
                                     access nahi kar sakte  */


    }
}




