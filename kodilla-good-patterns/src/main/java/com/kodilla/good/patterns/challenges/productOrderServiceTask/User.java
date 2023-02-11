package com.kodilla.good.patterns.challenges.productOrderServiceTask;

public class User {
    private String userName;
    private String realName;
    private int userId;
    private String userDeliveryAdress;
    private String userEmailAdress;
    private int userPhoneNumber;

    public User(String userName, int userId, String userDeliveryAdress, String userEmailAdress) {
        this.userName = userName;
        this.userId = userId;
        this.userDeliveryAdress = userDeliveryAdress;
        this.userEmailAdress = userEmailAdress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserDeliveryAdress() {
        return userDeliveryAdress;
    }

    public void setUserDeliveryAdress(String userDeliveryAdress) {
        this.userDeliveryAdress = userDeliveryAdress;
    }

    public String getUserEmailAdress() {
        return userEmailAdress;
    }

    public void setUserEmailAdress(String userEmailAdress) {
        this.userEmailAdress = userEmailAdress;
    }

    public int getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(int userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", userId=" + userId +
                ", userDeliveryAdress='" + userDeliveryAdress + '\'' +
                ", userEmailAdress='" + userEmailAdress + '\'' +
                ", userPhoneNumber=" + userPhoneNumber +
                '}';
    }
}
