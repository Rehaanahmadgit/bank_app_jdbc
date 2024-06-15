package org.example;

public class encapsulation {
    private int accno;
    private String name;
    private String password;
    private String balance;

    public encapsulation(int accno, String name, String password, String balance) {
        this.accno = accno;
        this.name = name;
        this.password = password;
        this.balance = balance;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }


    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBalance()
    {
        return balance;
    }
    public void setBalance(String balance)
    {
        this.balance = balance;
    }

    public void setAccno(int accno) {
        this.accno = accno;
    }

    public int getAccno() {
        return accno;
    }
}
