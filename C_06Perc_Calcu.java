import java.util.Scanner;
public class Cwh_06Perc_Calcu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of subject 1 :");
        float s1 = sc.nextFloat();

        System.out.println("Enter the marks of subject 2 :");
        float s2 = sc.nextFloat();

        System.out.println("Enter the marks of subject 3 :");
        float s3 = sc.nextFloat();

        System.out.println("Enter the marks of subject 4 :");
        float s4 = sc.nextFloat();

        System.out.println("Enter the marks of subject 5 :");
        float s5 = sc.nextFloat();

        System.out.print("enter maximum marks =");
        int maxMarks= sc.nextInt();
 
        float obtainMarks = s1+s2+s3+s4+s5;
        float per= (obtainMarks*100)/maxMarks;

        System.out.print("per centage is = " + per + " have a nice day!" );
        // System.out.print(per);

    }
}


