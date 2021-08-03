package bank.display;
import bank.customer.Customer;

import java.util.Iterator;
import java.util.Scanner;

public class ShowData {
    Scanner scan = new Scanner(System.in);

    public void show(){
        System.out.println("Enter your id");
        int id = scan.nextInt();
        System.out.println(Customer.data.get(id));
        Iterator<Integer> i = Customer.data.keySet().iterator();

        while(i.hasNext()){
            Integer temp = i.next();

                System.out.println("Duplicate "+ Customer.data.get(temp));



        }
    }
}
