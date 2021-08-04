package bank.main;

import bank.database.DbStore;

import java.sql.SQLException;
import java.util.Scanner;

public class TestRunner {
    public static void main(String args[]) throws SQLException {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice\n1.Create Account\n2.Display\n3.Exit");
            int choice = scan.nextInt();

            switch (choice) {
                case 1: {
//
                    DbStore db = new DbStore();
                    db.insertToAccountTable();
                    break;
                }
                case 2:{
//                    ShowData sd = new ShowData();
//                    sd.show();
                    DbStore db1 = new DbStore();
                    db1.showFromTable();

                    break;
                }
                case 3:{
                    DbStore db2 = new DbStore();
                    db2.exit();
                    break;
                }
            }
        }
    }
}
