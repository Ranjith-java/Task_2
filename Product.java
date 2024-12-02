package Task_2;

import java.util.Scanner;
public class Product {
    public int sum;
    public Product() {

    }

    public Product(int[] id, int[] price, int[] quantity) { // paratmeter constructor
        int[] ptotal = new int[5];
        for (int i = 0; i < 5; i++) {
            ptotal[i] = price[i] * quantity[i];
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("Pid: " + id[j] + "Total:" + ptotal[j]);
        }
       // int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum = sum + ptotal[i];
        }
        //System.out.println("Total purchase ammount"+sum);
    }
}