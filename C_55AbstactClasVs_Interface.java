interface bycycle {
    int a = 45; // attribute or property, it's final ,can't modifies

    void applyBrake(int decrement);         //interface k andar method public h by default

    void speepUp(int incremebt);
}

interface hornBycycle { // ek s jayada inteface bana sakte
    void blowHornk3g();

    void blowHornMHN();
}

class AoneCycle implements bycycle, hornBycycle {    // ek s jayada interface implement kar sakte
    void blowHorn() {                                // not public
        System.out.println("pee peeep, peee-peeep");
    }

    public void applyBrake(int decrement) // method ko public banaya due to interface
    {
        System.out.println("applying Brack!" + decrement);
    }

    public void speepUp(int incremebt) { // method ko public banaya due to interface
        System.out.println("Applying speedup!");
    }

    public void blowHornk3g() {
        System.out.println("kabhi kushi khabi gum");
    }

    public void blowHornMHN() {
        System.out.println("mai hoon naaa");
    }

}

public class C_55AbstactClasVs_Interface {
    public static void main(String[] args) {
        AoneCycle aoc = new AoneCycle();
        aoc.applyBrake(5);

        System.out.println(aoc.a); // you can create property in interfaces and access(print) but can't modifies

        // aoc.a=345; cannot assign a value to final variable a (can't modifies)
        // System.out.println(aoc.a);

        aoc.blowHornk3g();
        aoc.blowHornMHN();

        aoc.blowHorn();
    }

}
