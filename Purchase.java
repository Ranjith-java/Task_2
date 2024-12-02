package Task_2;

import java.util.Scanner;
public class Purchase {
    public int highprice(int[] p1){     //this method is used calcualte the highest value among product price
        int max=Integer.MIN_VALUE;
        for(int i=0;i<5;i++){
            if(p1[i]>max){
                max=p1[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] pid= new int[5];
        int[] price=new int[5];
        int[] bought=new int[5];
        Scanner s=new Scanner(System.in);
        //get the product id
        System.out.println("Enter the Product ID");
        for(int i=0;i<5;i++){
            pid[i]=s.nextInt();
        }
        //get the product price
        System.out.println("Enter the Product Price");
        for(int j=0;j<5;j++){
            price[j]=s.nextInt();
        }
        System.out.println("Entered the Product ID and Price");
        for(int i=0;i<5;i++){
            System.out.println(pid[i]+" "+price[i]);
        }
        Purchase m=new Purchase();
        int max=m.highprice(price);// method to fing highest product value
        //System.out.println("Highest value is:"+max);
        //for loop to find the product id
        for(int i=0;i<price.length;i++){
            if(price[i]==max){
                System.out.println("The Pid and Price is: "+pid[i]+" "+price[i]);
            }
        }
        System.out.println("Enter the quantity of each product");
        for(int i=0;i<5;i++){
            bought[i]=s.nextInt();
        }
        Product p=new Product(pid,price,bought);// calling constructor
        System.out.println("Total purchase ammount"+p.sum);
    }
}
