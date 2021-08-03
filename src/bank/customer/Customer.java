package bank.customer;

import bank.pojo.PassData;

import java.util.HashMap;
import java.util.Scanner;

public class Customer {
    Scanner scan = new Scanner(System.in);
    public static HashMap<Integer, PassData> data = new HashMap<>();
    public static HashMap<Integer, HashMap> accountData = new HashMap<>();
    PassData pd = new PassData();
    //PassData pd1 = new PassData();
    public void create() {

        System.out.println("Enter your id");
        int id = scan.nextInt();
        System.out.println("Enter your name");
        String Name = scan.next();
        System.out.println("Enter your Bank Name");
        String BankName = scan.next();
        System.out.println("Enter your Balance");
        Long Balance = scan.nextLong();
        //Integer=id;
        pd.setId(id);
        pd.setName(Name);
        pd.setBankName(BankName);
        pd.setBalance(Balance);
        data.put(id, pd);
        accountData.put(id,data);
    }
}