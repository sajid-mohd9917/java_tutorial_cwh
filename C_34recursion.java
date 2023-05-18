import java.util.Scanner;

public class C_34recursion {

    static int sumN1(int n) { 
        
    
 
        if (n == 1) {
            return 1;
        }

        return n + sumN1(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number - ");
        int n = sc.nextInt();
        int sm = sumN1(n);

        System.out.println(sm);
    }
}
