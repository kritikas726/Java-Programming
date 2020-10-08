import java.util.Scanner;
public class Test1 {
    static int m,y,d;
    public static void main(String[] args){
        System.out.println("Input the number of minutes: ");
        Scanner s=new Scanner(System.in);
        m=s.nextInt();
        y=m/525600;
        d=m%525600;
        d=d/1440;
        System.out.println(m+" minutes is approximately "+y+" years and "+d+" days.");
    }
}
