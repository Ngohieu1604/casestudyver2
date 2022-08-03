package model;

import java.io.Serializable;

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

        public void setPerson(Human person) {
            this.human = human;
        }

        @Override
        public String toString() {
            return human + ",  " + "Phòng: " +  id + ", Loại: " + type + ", Số ngày thuê: " + rentDays + ", Giá: " + price + ", trạng thái: " + status;
        }

        public void add(Hotel hotel) {
        }
    }
