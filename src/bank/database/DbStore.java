package bank.database;

import bank.pojo.PassData;

import java.sql.*;
import java.util.HashMap;
import java.util.Scanner;

public class DbStore {
    Scanner scan = new Scanner(System.in);
  static Connection con = null;
    public DbStore() {
        try {
            if(con==null) {
                Class.forName("com.mysql.jdbc.Driver");
               con = DriverManager.getConnection("jdbc:mysql://localhost/hash", "root", "");
               System.out.println("connection established");
            }
        } catch (Exception e) {
            System.out.println("not established");
        }
    }
    public void showFromTable() throws SQLException {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT * from account");
        PassData pd;
        HashMap<Integer,PassData> map = new HashMap<Integer,PassData>();
        System.out.println("Enter the id you want to see");
        int id = scan.nextInt();
        while(rs.next()){

            Integer cid = rs.getInt("id");
            String cname = rs.getString("name");
            String cbank = rs.getString("bankName");
            Long cbalance = rs.getLong("balance");
            pd = new PassData(cid,cname,cbank,cbalance);
            map.put(cid,pd);


        }
        System.out.println(map.get(id));
        st.close();
        rs.close();
    }
    public void insertToTable() throws SQLException{
        PassData pd = new PassData();
        int id = pd.getId();
        String name = pd.getName();
        String bankName = pd.getBankName();
        long balance= pd.getBalance();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("INSERT INTO table_name (id, name, bankName)\n" +
                "VALUES (id, name, bankName, balance");
        st.close();
        rs.close();
    }
    public void exit() throws SQLException {
        con.close();
    }

}