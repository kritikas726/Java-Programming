package com.mycompany.foobar;
public class Employee {
    String name=new String();
    int yoj;
    int sal;
    String add=new String();
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();
        e1.name="Robert";
        e2.name="Sam";
        e3.name="John";
        e1.yoj=1994;
        e2.yoj=2000;
        e3.yoj=1999;
        e1.sal=20000;
        e2.sal=50000;
        e3.sal=60000;
        e1.add="64C- WallsStreet";
        e2.add="68D- WallsStreet";
        e3.add="26B- WallsStreet";
        System.out.println("Name, Year of joining, Salary, Addresses of Employees:");
        System.out.println(e1.name+" "+e1.yoj+" "+e1.sal+" "+e1.add);
        System.out.println(e2.name+" "+e2.yoj+" "+e2.sal+" "+e2.add);
        System.out.println(e2.name+" "+e3.yoj+" "+e3.sal+" "+e3.add);
    }
}
