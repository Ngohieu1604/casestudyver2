package view;

import controller.HotelManagement;
import model.Hotel;
import model.Human;

import java.util.Scanner;

public class HotelMenu {
    Scanner scanner = new Scanner(System.in);



    public void run() {
        HotelManagement hotelManagement = new HotelManagement();
        int choice = -1;
      a:  do {
            menuHotel();
            System.out.println("");
            System.out.println("Nhập lựa chọn của bạn");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    showAllRooms(hotelManagement);
                    break;
                case 2:
                    createRoom(hotelManagement);
                    break;
                case 3:
                    updateRoom(hotelManagement);
                    break;
                case 4:
                    deleteRoom(hotelManagement);
                    break;
                case 5:
                    findRoom(hotelManagement);
                    break;
                case 6:
                    bookingRoom(hotelManagement);
                    break;
                case 7:
                    payment(hotelManagement);
                    break;
                case 8 :
                    new Login().menuLogin();
                    break a;
            }
        } while (choice != 0);
    }

    private void payment(HotelManagement hotelManagement) {
        System.out.println("Nhập số phòng cần thanh toán");
        String id = scanner.nextLine();
        Hotel hotel = hotelManagement.getById(id);
        if(hotel != null) {
            System.out.println("Số tiền quý khách cần thanh toán là " + hotel.pay() + " VND");
            hotel.setPerson(null);
            hotel.setRentDays(0);
            hotel.setStatus(Hotel.AVAILABLE);
            hotelManagement.updateById(id,hotel);
            System.out.println("Đã trả phòng thành công");
        } else {
            System.out.println("Nhập sai số phòng");
        }
    }

    private void bookingRoom(HotelManagement hotelManagement) {
        showAllRooms(hotelManagement);
        System.out.println("Nhập số phòng thuê");
        String id = scanner.nextLine();
        System.out.println("Nhập số ngày thuê");
        int day = Integer.parseInt(scanner.nextLine());
        Hotel hotel = hotelManagement.getById(id);
        if (hotel.getStatus().equals(Hotel.AVAILABLE)) {
            Human human = getHuman(hotelManagement);
            hotel.setRentDays(day);
            hotel.setPerson(human);
            hotel.setStatus(Hotel.BOOKED);
            hotelManagement.updateById(id, hotel);
            System.out.println("Khách đã thuê phòng thành công");
        } else {
            System.out.println("Phòng đã có người thuê");
        }
    }

    private void findRoom(HotelManagement hotelManagement) {
        System.out.println("---Tìm kiếm thông tin phòng---");
        System.out.println("Nhập số phòng cần tìm");
        String id = scanner.nextLine();
        Hotel hotel = hotelManagement.getById(id);
        if (hotel != null) {
            System.out.println("Thông tin phòng cần tìm cần tìm: " + hotel);
        } else {
            System.out.println("Mã phòng không tồn tại");
        }
    }


    private void deleteRoom(HotelManagement hotelManagement) {
        System.out.println("Xóa thông tin khách sạn");
        System.out.println("Nhập số phòng cần xóa thông tin");
        String id = scanner.nextLine();
        boolean isDeleted = hotelManagement.deleteById(id);
        if (isDeleted) {
            System.out.println("Xóa thành công!");
        } else {
            System.out.println("Xóa không thành công");
        }
    }

    private void updateRoom(HotelManagement hotelManagement) {
        System.out.println("Chỉnh sửa thông tin khách sạn");
        System.out.println("Nhập số phòng cần chỉnh sửa thông tin");
        String id = scanner.nextLine();
        int index = hotelManagement.findHotelRoomsByID(id);
        if (index != -1) {
            Hotel hotelRoom = setInfoRoom(hotelManagement);
            hotelManagement.updateById(id, hotelRoom);
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Cập nhật bị lỗi do không tồn tại phòng cần tìm!");
        }
    }

    private void createRoom(HotelManagement hotelManagement) {
        System.out.println("Thêm thông tin phòng khách sạn");
        Hotel hotelRoom = setInfoRoom(hotelManagement);
        hotelManagement.addNew(hotelRoom);
    }

    private void showAllRooms(HotelManagement hotelManagement) {
        int size = hotelManagement.size();
        if (size == 0) {
            System.out.println("Danh sách rỗng");
        } else {
            System.out.println("Danh sách khách sạn");
            hotelManagement.displayAll();
        }
    }

    private Hotel setInfoRoom(HotelManagement hotelManagement) {
        System.out.println("Nhập số phòng tạo mới : ");
        String id = scanner.nextLine();
        System.out.println("Nhập loại phòng tạo mới");
        String type = scanner.nextLine();
        System.out.println("Nhập giá phòng tạo mới");
        double price = Double.parseDouble(scanner.nextLine());
        return new Hotel(id, type, price);
    }

    private Human getHuman(HotelManagement hotelManagement) {
        System.out.println("Nhập họ tên khách trọ: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập căn cước: ");
        String identity = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        return new Human(name, dateOfBirth, identity, phoneNumber);
    }


    public void menuHotel() {
        System.out.println("1. Hiển thị danh sách phòng");
        System.out.println("2. Thêm thông tin khách sạn");
        System.out.println("3. Sửa thông tin khách sạn");
        System.out.println("4. Xóa thông tin khách sạn");
        System.out.println("5. Tìm kiếm thông tin khách sạn ");
        System.out.println("6. Đặt thuê phòng");
        System.out.println("7. Thanh toán phòng");
        System.out.println("8. Đăng xuất");
    }

}
