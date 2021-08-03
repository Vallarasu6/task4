package bank.pojo;

import java.util.Scanner;

public class PassData {
    Scanner scan = new Scanner(System.in);
    public PassData(){}
    private int id;
    private String Name;
    private String BankName;
    private long Balance;

    public PassData(Integer cid, String cname, String cbank, Long cbalance) {
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String Name){
        this.Name = Name;
    }
    public String getName(){
        return this.Name;
    }
    public void setBankName(String BankName){
        this.BankName = BankName;
    }
    public String getBankName(){
        return this.BankName;
    }
    public void setBalance(long Balance){
        this.Balance = Balance;
    }
    public long getBalance(){

        return this.Balance;
    }
    @Override
    public String toString(){
        String output = this.Balance+" "+this.BankName+" "+this.Name+" "+this.id;
        return output;
    }
}
