
import java.util.Scanner;

public class C_28MutiD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B[][] = new int[2][3];
        
        B[0][0] = 20;
        B[0][1] = 10;
        B[0][2] = 5;
        B[1][0] = 40;
        B[1][1] = 50;
        B[1][2] = 60;

        for (int i = 0; i < B.length; i++)
         {
            for (int j = 0; j < B[i].length; j++)
             {
                System.out.print(B[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }

    }
}
