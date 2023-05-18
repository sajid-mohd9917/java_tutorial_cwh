import java.util.Scanner;

class base {
    int x;

    public void setX(int x) {
        System.out.println("i'm in base and setting x now");
        this.x = x;
    }

    public int getX() {

        return x;
    }

    public void printMe() {

        System.out.println("i'm a method inside base");

    }
}

class derived extends base {
    public int y;

    public void setY(int y) {
        System.out.println("i'm setting y now inside derived");
        this.y = y;
    }

    public int getY() {
        return y;
    }
}

public class C_wh45Inheritanc

{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        base b = new base();
        b.setX(5);
        System.out.println("value of X = " + b.getX());
        
        derived d=new  derived();
        d.setY(10);
        System.out.println("value of y = " + d.getY());

        d.setX(25);
        System.out.println("getting value of x by d class "+d.getX());

        b.printMe(); // access from base class

        d.printMe();  // access from drive class
    }

}