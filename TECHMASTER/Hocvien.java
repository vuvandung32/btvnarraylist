package TECHMASTER;

public class Hocvien {
    private String name;
    private String id;
    private int tuoi;
    private String hocluc;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTuoi() {
        return this.tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getHocluc() {
        return this.hocluc;
    }

    public void setHocluc(String hocluc) {
        this.hocluc = hocluc;
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                ", id='" + getId() + "'" +
                ", tuoi='" + getTuoi() + "'" +
                ", hocluc='" + getHocluc() + "'" +
                "}";
    }

}
