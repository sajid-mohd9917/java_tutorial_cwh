import java.util.Scanner;

public class Cwh_05TakingInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // to create an object for scanner (sc -- is a varaible name)

        System.out.println("Taking input from the user :");

        // System.out.println("Enter the first number :");
        // float a = sc.nextFloat();
        // System.out.println("Enter the second number :");
        // float b = sc.nextFloat();
        // float sum = a + b;
        // System.out.println("The sum of two number is :");
        // System.out.println(sum);

        // System.out.println("Enter the first integer  number :");
        // int a = sc.nextInt();
        // System.out.println("Enter the second integer number :");
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("The sum of two number is :");
        // System.out.println(sum);

        // System.out.println("Ente the any string :");
        // String str = sc.nextLine();
        // System.out.println(str);

        // boolean b= sc.hasNextInt();
        // System.out.println(b);

        // boolean b =sc.hasNextFloat();
        // System.out.println(b);
        
        boolean c =sc.hasNext();
        System.out.println(c);
    }

}
