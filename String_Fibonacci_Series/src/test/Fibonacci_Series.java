package test;
import java.util.*;
public class Fibonacci_Series 
{
	public static void main(String[] args)
	{
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number");
      int num=s.nextInt();
      
      int firstnum=0,secondnum=1;
      int temp=num;
      System.out.println("Fibonacci Series.");
      
      for(int i=0;i<num;i++)
      {
    	  System.out.print(firstnum +" ");
    	  int nextnum=firstnum+secondnum;
    	  firstnum=secondnum;
    	  secondnum=nextnum;
      }
      
	}

}
