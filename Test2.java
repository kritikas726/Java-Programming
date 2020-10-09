package com.mycompany.foobar;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args){
        int choice;
        System.out.println("Pick one: \n1.Hi\n2.Hello\n3.Hey\nEnter your choice:");
        Scanner s= new Scanner(System.in);
        choice= s.nextInt();
        switch(choice){
            case 1 : System.out.println("You said Hi.");
                     break;
            case 2 : System.out.println("You said Hello.");
                     break;
            case 3 : System.out.println("You said Hey.");
                     break;
            default : System.out.println("Invalid Choice.");
                     break;
        }
    }
}
