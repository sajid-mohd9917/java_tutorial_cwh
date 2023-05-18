class A {
    public int a;

    public int harry() {
        return 4;
    }

    
    public void meth2() {
        System.out.println("i'm a method2 in class A");
    }
}

class B extends A {
    public void meth3() {
        System.out.println("i'm a method 3 in class B");
    }
    
    @Override                    // override notation
    public void meth2() {
        System.out.println("i'm a method2 in class B");
    }
}

public class C_48MethodOverriding {
    public static void main(String[] args) {
        // A a = new A();
        // a.meth2();       
        // System.out.println(a.harry()); 
        
        
        B b = new B();
        b.meth2();
        // b.meth3();
    }
}
