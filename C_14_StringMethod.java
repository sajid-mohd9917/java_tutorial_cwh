import java.util.Scanner;
import java.lang.String;
import java.util.*;

public class C_14_StringMethod {
   public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // System.out.println("Entwr any String : ");
      // String str = sc.nextLine();

      String str = "MohdSajid";

      // System.out.println("I am escape sequence \'double quote\'");
      // System.out.println(str.length());

      // System.out.println(str.toLowerCase());
      // System.out.println(str.toUpperCase());
      System.out.println(str.substring(1,3));// (L,R+1);
      
      // System.out.println(str.replace('j' , 'z'));
      // System.out.println(str.replace("jid", "diq"));
      // System.out.println(str.charAt(4));
      // System.out.println(str.indexOf("S"));

      // System.out.println("\"Dear Harry this java course is nice, thanks!\"");

// int num =sc.nextInt();
      // String str = ""+num;
      // String str= "1008";
      // str.replace('0',5);
      // System.out.println( str.replace('0','5'));
      // System.out.println(str);

   }
}




/*
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   

// String str = "abc123zyx";
// str=str.toLowerCase();
// str=str.toUpperCase();
// str=str.replace('D','B');

// str=str.replace("AD","FN");
//str=str.replace(" ","");

// System.out.println(str);

//add two string
// String s1="abc";
// String s2="123";
// String s3=s1+s2;
// System.out.println(s3);

//Reverse two string

// String str2="";
// int n=str.length();
// for(int i=0; i<str.length(); i++)
// {
//     char val=str.charAt(n-1-i);
//     str2=str2+val;
    
// }
// System.out.println(str2);

String str = "Geeks";
String str2="";
for(int i=0; i<str.length(); i++)
{
   if(i%2 == 0){
    str2=str2+ str.charAt(i);
   }
    
}
System.out.println(str2);


	}
} */