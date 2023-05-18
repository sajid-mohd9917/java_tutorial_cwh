import java.util.Scanner;

public class C_311method2
{
    int sumOfnumber(int x, int y)
    {
        
        int c=x+y;
        return c;
    }
    public static void main(String[] args)
    {
    Scanner sc =new Scanner(System.in);
    
        int x=4, y=9;
        int sum;
        C_311method2 obj= new C_311method2();
        sum=obj.sumOfnumber(x,y);
    System.out.println("sum of number is = "+sum);
    }
}
