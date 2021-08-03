package bank.display;
import bank.customer.Customer;
import bank.pojo.PassData;

import java.util.Scanner;

public class ShowData {
    Scanner sc = new Scanner(System.in);

    public void show(){
        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println(Customer.data.get(id));

    }
}
