package TECHMASTER;

import java.util.ArrayList;

public class TTTechmaster {
    private String quanLy;
    private String giangVien;
    private ArrayList<Lophoc> lophoc1 = new ArrayList<>();

    public String getQuanLy() {
        return this.quanLy;
    }

    public void setQuanLy(String quanLy) {
        this.quanLy = quanLy;
    }

    public String getGiangVien() {
        return this.giangVien;
    }

    public void setGiangVien(String giangVien) {
        this.giangVien = giangVien;
    }

    public ArrayList<Lophoc> getLophoc1() {
        return this.lophoc1;
    }

    @Override
    public String toString() {
        return "{" +
                " quanLy='" + getQuanLy() + "'" +
                ", giangVien='" + getGiangVien() + "'" +
                ", lophoc1='" + getLophoc1() + "'" +
                "}";
    }

    public void setLophoc1(ArrayList<Lophoc> lophoc1) {
        this.lophoc1 = lophoc1;
    }

}
