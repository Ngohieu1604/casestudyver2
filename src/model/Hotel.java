package model;

import java.io.Serializable;
import java.util.Scanner;


public class Hotel implements Serializable {
        private String id;
        private String type;
        private int rentDays;
        private String status;
        private double price;
        private Human human;
        //Trong lớp hotel  có dòng code private model.Human human;, công dụng của dòng này sẽ tạo ra 1 thuộc tính của lớp hotel có kiểu human
        // (tức là thuộc tính này có thể sử dụng được các phương thức được khai báo là public có trong lớp human đó là
        // các phương thức nhập và hiển thị thông tin của 1 người).


        public Hotel(String id, String type, int rentDays, String status, double price, Human human) {
            this.id = id;
            this.type = type;
            this.rentDays = rentDays;
            this.status = status;
            this.price = price;
            this.human = human;
        }

    public Hotel(String s, String vip, String s1, String s2, String đã_thuê) {
    }

    public Hotel() {
        
    }

    public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getRentDays() {
            return rentDays;
        }

        public void setRentDays(int rentDays) {
            this.rentDays = rentDays;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Human getHuman() {
            return human;
        }

        public void setPerson(Human human) {
            this.human = human;
        }

        @Override
        public String toString() {
            return human + ",  " + "Phòng: " +  id + ", Loại: " + type + ", Số ngày thuê: " + rentDays + ", Giá: " + price + ", trạng thái: " + status;
        }

    public void add(Hotel hotel) {
    }
    public void Entertheinformationtobemanaged() {
        Scanner scanner = new Scanner(System.in);

        // nhập thông tin khách trọ
        human = new Human();
        human.EnterCustomerInformation();

        System.out.print("Nhập số ngày trọ: ");
        rentDays = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập loại phòng: ");
        type = scanner.nextLine();
        System.out.print("Nhập giá phòng: ");
        price = scanner.nextDouble();
    }

    public void displayinformationtobemanaged() {
        human.ShowCustomerInformation();
        System.out.println("Số ngày trọ: " + rentDays);
        System.out.println("Loại phòng: " + type);
        System.out.println("Giá phòng: " + price);
    }
    public double Pay() {
        return rentDays * price;
    }
}