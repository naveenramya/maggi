import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          if(n>0)
          {
            while(n%2==0)
            {
              n/=2;
            }
          if(n==1)
          {
            
	System.out.println("number is power of 2");
      }
    }
   if(n==0 || n!=1)
   {
      System.out.println("number is not power of 2");
   }
   }
}
