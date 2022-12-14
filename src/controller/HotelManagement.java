package controller;

import model.Hotel;
import storage.readfile;
import storage.writefile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelManagement implements GeneralManagement<Hotel>, writefile, readfile {
    private List<Hotel> hotels = new ArrayList<>();
    public int size(){
        return hotels.size();
    }

    public HotelManagement() {
    }

    public Hotel getHotel(int index){
        return hotels.get(index);
    }
    public int findHotelRoomsByID(String id) {
        int index = -1;
        for (int i = 0; i < hotels.size(); i++) {
            if (hotels.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void displayAll() {
        for (Hotel hotelRoom : hotels) {
            System.out.println(hotelRoom);
        }
    }

    @Override
    public void addNew(Hotel hotel) {
        hotels.add(hotel);
    }

    @Override
    public boolean updateById(String id, Hotel hotel) {
        int index = findHotelRoomsByID(id);
        hotels.set(index, hotel);
        return true;
    }

    @Override
    public boolean deleteById(String id) {
        int index = findHotelRoomsByID(id);
        if (index != -1) {
            hotels.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public Hotel getById(String id) {
        int index = findHotelRoomsByID(id);
        if (index == -1) {
            return null;
        }
        return hotels.get(index);
    }

    @Override
    public void readFile(String path) throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(is);
        this.hotels = (List<Hotel>) ois.readObject();

    }

    @Override
    public void writeFile(String path) throws IOException {

    }

    @Override
    public void WriteFile(String path) throws IOException {
        OutputStream os = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(os);
        oos.writeObject(this.hotels);

    }
}
