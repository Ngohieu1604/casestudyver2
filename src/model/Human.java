package model;

import java.io.Serializable;

public class Human implements Serializable {
    //Serializable là một Interface (giao diện) đánh dấu không có các dữ liệu và phương thức
    private String name;
    private String dateOfBirth;
    private String identity;
    private String phoneNumber;

    public Human(String name, String dateOfBirth, String identity, String phoneNumber) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.identity = identity;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Họ tên: " + name + ", Ngày sinh: " + dateOfBirth + ", CCCD: " + identity + ", SDT:" + phoneNumber;
    }

}