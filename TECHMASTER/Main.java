package TECHMASTER;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo
        Hocvien hocvien = new Hocvien();
        hocvien.setId("113");
        hocvien.setName("vu manh tan ");
        hocvien.setTuoi(19);
        hocvien.setHocluc("kha");

        Hocvien hocvien2 = new Hocvien();
        hocvien2.setId("114");
        hocvien2.setName("tran van manh");
        hocvien2.setTuoi(20);
        hocvien2.setHocluc("gioi");

        Hocvien hocvien3 = new Hocvien();
        hocvien3.setId("117");
        hocvien3.setName("tran van minh");
        hocvien3.setTuoi(31);
        hocvien3.setHocluc("kha");

        Hocvien hocvien4 = new Hocvien();
        hocvien4.setId("119");
        hocvien4.setName("tran minh phuoc");
        hocvien4.setTuoi(25);
        hocvien4.setHocluc("gioi");

        Hocvien hocvien5 = new Hocvien();
        hocvien5.setId("115");
        hocvien5.setName("pham van tuan");
        hocvien5.setTuoi(22);
        hocvien5.setHocluc("kha");
        // tạo mảng
        ArrayList<Hocvien> hocviens = new ArrayList<>();
        // thêm giá trị vào mảng
        hocviens.add(hocvien);
        hocviens.add(hocvien2);
        hocviens.add(hocvien3);
        hocviens.add(hocvien4);
        hocviens.add(hocvien5);

        Lophoc Lophoc = new Lophoc();
        Lophoc.setMonHoc("javacore");
        Lophoc.setTtHocvien(hocviens);
        ArrayList<Lophoc> lophocs = new ArrayList<>();
        lophocs.add(Lophoc);

        TTTechmaster techmaster = new TTTechmaster();
        techmaster.setQuanLy("thu huong");
        techmaster.setGiangVien("thay dat");
        techmaster.setLophoc1(lophocs);

        System.out.println(techmaster.toString());

        // them hoc vien
        System.out.println("thêm học viên");
        Hocvien hocvien6 = new Hocvien();
        hocvien6.setId("110");
        hocvien6.setName("ma van thang");
        hocvien6.setTuoi(30);
        hocvien6.setHocluc("kha");
        hocviens.add(hocvien6);
        System.out.println(techmaster.toString());
        // xoa hoc vien
        System.out.println("xóa học viên");

        hocviens.remove(hocvien2);
        System.out.println(techmaster.toString());

        // tìm id để cập nhật học lực
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap id");
        String nhapid = scanner.next();

        for (Hocvien hocvienn : hocviens) {
            if (hocvienn.getId().equals(nhapid)) {
                System.out.println("ban muon doi thanh hoc luc");
                String hocLucmoi = scanner.next();

                hocvienn.setHocluc(hocLucmoi);
                System.out.println(hocvienn.toString());
                break;

            } else {
                System.out.println("khong co hoc vien mang id :" + nhapid);
                break;
            }

        }

    }

}
