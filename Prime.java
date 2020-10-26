import java.util.*;
  
  public class Prime{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter a value:");
      int n= scn.nextInt();
      int flag=0;
      for(int i=2;i*i<=n;i++){
          if(n%i==0){
              flag=1;
              break;
          }
      }
      if(flag==1){
          System.out.println("not prime");
      }
      else{
          System.out.println("prime");
      }
  }
  }
