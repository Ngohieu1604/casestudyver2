package view;

import model.Hotel;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Login LG = new Login();
        LG.run();
//        Scanner scanner = new Scanner(System.in);
//        int n;  // số khách trọ
//        Hotel hotel;
//
//        // tạo 1 ArrayList lưu thông tin khách trọ
//        ArrayList<Hotel> arrKhachSan = new ArrayList<>();
//
//        System.out.println("Nhập số lượng khách trọ: ");
//        n = Integer.parseInt(scanner.nextLine());
//
//        for (int i = 0; i < n; i++) {
//            hotel = new Hotel();
//            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
//                hotel.Entertheinformationtobemanaged();
//            arrKhachSan.add(hotel);
//        }
//
//        // hiển thị danh sách khách trọ
//        for (int i = 0; i < arrKhachSan.size(); i++) {
//            System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
//            arrKhachSan.get(i).displayinformationtobemanaged();
//        }
//
//        // tính tiền phòng khi khách hàng trả phòng
//        System.out.println("\nNhập số chứng minh nhân dân của khách trả phòng: ");
//        String tim = scanner.nextLine();
//        for (int i = 0; i < arrKhachSan.size(); i++) {
//            if (arrKhachSan.get(i).getHuman().getIdentity().equalsIgnoreCase(tim)) {
//                System.out.println("Số tiền phòng = " + arrKhachSan.get(i).Pay());
//            }
//        }
    }
}
