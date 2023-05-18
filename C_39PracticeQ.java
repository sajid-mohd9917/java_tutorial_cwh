
class Empolyee
{
    int id;
    int salary;
    String name;

    void printDetail()
    {
    System.out.printf(" id = %d\nsalary=%s\n name=%s \n",id,salary,name );
    
   }

}
public class C_39PracticeQ
{
    
    public static void main(String[] args)
    {
    Empolyee em=new Empolyee();

    em.id=45;
    em.name = "harry";
    em.salary=4500;
    em.printDetail();

    Empolyee em1=new Empolyee();

    em1.id= 46;
    em1.name="johny";
    em1.salary=5500;
    em1.printDetail();




    




   
    }
}
