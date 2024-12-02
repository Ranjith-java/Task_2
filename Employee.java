package Task_2;

import java.util.Scanner;
public class Employee extends Person1{ //Employee is the child of person1 class
    public Employee(){

    }
    public Employee(String name,int age){   //parameterised constructor
        super.name=name; // using parent class attributes using super keyword
        super.age=age;
        System.out.println(super.name+" "+super.age);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String n;
        int a;
        n=s.nextLine();
        a=s.nextInt();
        Employee e=new Employee(n,a);
    }
}
