package com.bilgeadam.melih.atm;

public class UserInfo {
    private String userName;
    private String password;
    private double accountValue;

    public UserInfo() {
    }

    public UserInfo(String userName, String password, double accountValue) {
        this.userName = userName;
        this.password = password;
        this.accountValue = accountValue;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", accountValue=" + accountValue +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(double accountValue) {
        this.accountValue = accountValue;
    }
}
