package Task_2;

import java.util.Scanner;
public class Account{
    public int balance=100000; //data member balance created
    public Account(){   //default constructor

    }
    public Account(String action,int amt){ //parameterised constructor
        //if is used to check whether deposit or withdraw option is choosen
        if(action.equals("deposit")){
            this.balance=balance+amt; //deposit is calculated
        }else if(action.equals("withdraw")){
            this.balance=balance-amt; //withdraw is calculated
        }else{
            this.balance=balance;
        }
        System.out.println("The Total Balance"+this.balance);
    }
}
