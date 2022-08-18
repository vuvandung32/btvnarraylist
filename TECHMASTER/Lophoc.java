package TECHMASTER;

import java.util.ArrayList;

public class Lophoc {
    private String monHoc;
    private ArrayList<Hocvien> ttHocvien = new ArrayList<>();

    public String getMonHoc() {
        return this.monHoc;
    }

    public void setMonHoc(String monHoc) {
        this.monHoc = monHoc;
    }

    public ArrayList<Hocvien> getTtHocvien() {
        return this.ttHocvien;
    }

    public void setTtHocvien(ArrayList<Hocvien> ttHocvien) {
        this.ttHocvien = ttHocvien;
    }

    @Override
    public String toString() {
        return "{" +
                " monHoc='" + getMonHoc() + "'" +
                ", ttHocvien='" + getTtHocvien() + "'" +
                "}";
    }
}