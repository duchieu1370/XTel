package SinhVien;

import java.io.Serializable;

public class Student implements Serializable {//sử dụng để "đánh dấu" các lớp java
    private int id;
    private String ten;
    private String gioiTinh;
    private byte tuoi;
    private String queQuan;

    public Student(int id, String ten, String gioiTinh, byte tuoi, String queQuan) {
        this.id = id;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public byte getTuoi() {
        return tuoi;
    }

    public void setTuoi(byte tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
}
