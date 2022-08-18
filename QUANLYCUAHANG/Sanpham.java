package QUANLYCUAHANG;

public class Sanpham {
    private String id;
    private String name;
    private String mota;
    private int soluong;
    private Double giaban;
    private String donvi;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMota() {
        return this.mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluong() {
        return this.soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public Double getGiaban() {
        return this.giaban;
    }

    public void setGiaban(Double giaban) {
        this.giaban = giaban;
    }

    public String getDonvi() {
        return this.donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }



    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", mota='" + getMota() + "'" +
            ", soluong='" + getSoluong() + "'" +
            ", giaban='" + getGiaban() + "'" +
            ", donvi='" + getDonvi() + "'" +
            "}";
    }
}