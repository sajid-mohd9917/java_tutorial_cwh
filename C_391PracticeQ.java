import java.util.Scanner;

class Empolyee {
    int salary;
    String name;

    public String getName() {
        return name;
    }

    public String setName(String str) {
        name = str;
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class C_391PracticeQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Empolyee em = new Empolyee();
        em.name = "harry";
        em.salary = 5000;

        String gn = em.getName();
        System.out.println(gn);

        // String sn= em.setName("sajid");
        // System.out.println(sn);

        int gs = em.getSalary();
        System.out.println(gs);

    }
}
