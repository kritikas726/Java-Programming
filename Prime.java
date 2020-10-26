import java.util.*;
  
  public class Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Please insert any number:");
      int n= scn.nextInt();
      int flag=0;
      for(int i=2;i*i<=n;i++){
          if(n%i==0){
              flag=1;
              break;
          }
      }
      if(flag==1){
          System.out.println(n+" is not a prime number.");
      }
      else{
          System.out.println(n+" is a prime number.");
      }
  }
  }
