package Task_2;

import java.util.Scanner;
public class Customer{
    public static void main(String[] args){
        String action;
        int amt=0;
        //int balance=100000;// intital balance is 1lakh
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the action to be performed: withdraw or deposit or balance");
        action=s.nextLine();
        //if loop is to check whether balance is alone checked or amt is going to get deposited or withdraw
        if(action.equals("balance")){
            System.out.println("wait for a moment");
        }else{
            System.out.println("Enter the amount");
            amt=s.nextInt();
            System.out.println("the amount entered is: "+amt);
        }
        // calling the constructor
        Account a=new Account(action,amt);//constructor with two argument called

    }
}
