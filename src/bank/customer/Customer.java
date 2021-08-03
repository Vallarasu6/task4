package bank.customer;

import bank.pojo.PassData;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
    Scanner sc = new Scanner(System.in);
    public static HashMap<Integer, PassData> data = new HashMap<>();
    public static PassData pd = new PassData();
    public void create() {

        System.out.println("Enter your id");
        int id = sc.nextInt();
        System.out.println("Enter your name");
        String Name = sc.next();
        System.out.println("Enter your Bank Name");
        String BankName = sc.next();
        System.out.println("Enter your Balance");
        Long Balance = sc.nextLong();
        //Integer=id;
        pd.setId(id);
        pd.setName(Name);
        pd.setBankName(BankName);
        pd.setBalance(Balance);
        data.put(id, pd);
    }
}