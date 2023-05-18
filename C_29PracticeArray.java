
import java.util.Scanner;

public class C_29PracticeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // float sum=0;
        // float A[]={2.1f,4.9f,5.5f,8.5f,6.4f,9.2f,2.8f};
        // for(int i=0;i<A.length;i++)
        // {
        // sum= sum + A[i];
        // }
        // System.out.println(sum);




        // int num = 8;
        // int arr[] = { 1, 14, 5, 8, 9, 4, 3 };
        // for (int i = 0; i < arr.length; i++) 
        // {
        //     if (num == arr[i]) {
        //         System.out.printf("number %d is found in arr",num);
        //         break;
        //     }
        // }




        // float A[]={34.0f,56.0f,67.0f,87.0f};
        // float s=0;
        // float avg;
        // for(int i=0;i<A.length;i++)
        // {
        //     s=s+A[i];
        // }
        // avg= s/(A.length);
        // System.out.println(avg);





            // int A[][]={{1,3,5},
            //             {5,7,8}};

            //  int B[][]={{2,5,4},
            //             {3,6,9}};
                
            //  int D[][]={{0,0,0},
            //             {0,0,0}};
                        
            //   for(int i=0; i<A.length; i++)
            //   {
            //     for(int j=0; j<B[i].length;j++)
            //     {
            //         D[i][j]=A[i][j]+B[i][j];
            //     }
            //   }      
              
            //   for(int i=0; i<A.length; i++)
            //   {
            //     for(int j=0; j<B[i].length;j++)
            //     {
            //         System.out.printf("%d ",D[i][j]);
            //         D[i][j]=A[i][j]+B[i][j];
            //     }
            //     System.out.println("");
            //   } 
            
            

            // int arr[]={3,6,9,12,15,18};
            // int l=arr.length;
            // int j= Math.floorDiv(l,2);
            
            // int temp;
            // for(int i=0; i<j;i++)
            // {
            //     temp=arr[i];
            //     arr[i]=arr[l-1-i];
            //     arr[l-1-i]=temp;
            
            // }
            // for(int e:arr)
            // {
            //     System.out.print(e +" ");
            // }



                // int arr[]={2,4,6,8,15,10,7};
                // int h=arr[0];
                // for(int i=0;i<arr.length-1;i++)
                // {
                //     if(arr[i+1]>h)
                //     {
                //     h=arr[i+1];
                //     }
                // }
                // System.out.println(h);


                    
                // int A[]={13,16,9,12,8,17};
                // int h=A[0];
                // for(int i=0;i<A.length-1;i++)
                // {
                //     if(A[i+1]<h)
                //     {
                //         h=A[i+1];
                //     }
                // }
                // System.out.println("minmum Element is ="+h);


                    
                    int B[]={2,4,6,8,9,12};
                    int a=0;
                    for(int  i=0; i<B.length-1;i++)
                    {
                        if(B[i]>B[i+1])
                        {
                           a=1;
                           break;
                            
                        }
                        
                    }
                    if(a==1)
                    {
                    System.out.println("arr is not sorted");
                    }
                    else
                    {
                        System.out.println("arr is sorted");
                    }

    }
}