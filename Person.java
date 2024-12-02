package Task_2;

import java.util.Scanner;
public class Person{
    String name;
    public int age=18;// default age declared and initialised
    public String printing(String n,int a){ //method created to print name and aage
        this.name=n;
        age=a;
        System.out.println("Person name:"+ name+" "+"Person age:"+ age);
        return name;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String name1;
        int age1;
        name1=s.nextLine();
        age1=s.nextInt();
        Person m=new Person();
        System.out.println("Default age is: "+ m.age);
        m.printing(name1,age1);// person object is passed value
    }
}
