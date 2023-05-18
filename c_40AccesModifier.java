
class Empolyee {

    private int id;
    private String name;

    public void setId(int i) {
        id = i;
    }

    public void setName(String str) {
        name = str;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}

public class c_40AccesModifier {
    public static void main(String[] args) {

        //for first employee
        Empolyee em1 = new Empolyee();
        em1.setId(435);
        em1.setName("Harry");

        System.out.println(em1.getId());
        System.out.println(em1.getName());




        // for second employee
        Empolyee em2=new Empolyee();
        em2.setId(545);
        em2.setName("CodeWithHArry");

        int em1ID=em2.getId();
        System.out.println(em1ID);

       String em1N= em2.getName();
       System.out.println(em1N);

    }
}
