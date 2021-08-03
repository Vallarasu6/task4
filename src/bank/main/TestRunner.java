package bank.main;

import bank.customer.Customer;
import bank.display.ShowData;

import java.util.Scanner;

public class TestRunner {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice\n1.Create Account\n2.Display\n3.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    Customer cust = new Customer();
                    cust.create();
                    break;
                }
                case 2:{
                    ShowData sd = new ShowData();
                    sd.show();
                    break;
                }
                case 3:{
                    break;
                }
            }
        }
    }
}