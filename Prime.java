import java.lang.*;
//To print all prime numbers between 1 to 50
public class Prime
{
   public static void main (String[] args)
   {
		int i =0;
		int num =0;
		String  primeNo = "";
		for (i = 1; i <= 50; i++)         
	      { 		  	  
          int count=0; 	  
          for(num =1; num<=i; num++)
	  {
             if(i%num==0)
	     {
 		count++;
	     }
	  }
	  if (count ==2)
	  {
	     primeNo = primeNo + i + " ";
	  }	
       }	
       System.out.print("Prime numbers from 1 to 50 are : " + primeNo);
   }
}
