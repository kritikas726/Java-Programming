import java.util.*;
  
  public class Fibonacci{
  
  public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the limit of Fibonacci series:");
      int n=s.nextInt();
      int a=0,b=1,c=1;
      System.out.println(a);
      System.out.println(b);
      for(int i=1;i<n-1;i++){
          System.out.println(c);
          a=b;
          b=c;
          c=a+b;
      }
   }
  }
