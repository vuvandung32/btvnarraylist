package QUANLYCUAHANG;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class Main {
  public static void main(String[] args) {
    // khai bao san pham
    Sanpham sanpham1 = new Sanpham();
    sanpham1.setId("111");
    sanpham1.setName("mi tom");
    sanpham1.setMota("do kho");
    sanpham1.setSoluong(100);
    sanpham1.setGiaban(3.500);
    sanpham1.setDonvi("gam");

    Sanpham sanpham2 = new Sanpham();
    sanpham2.setId("222");
    sanpham2.setName("bot giat");
    sanpham2.setMota("do gia dung");
    sanpham2.setSoluong(49);
    sanpham2.setGiaban(170000.4);
    sanpham2.setDonvi("kg");

    Sanpham sanpham3 = new Sanpham();
    sanpham3.setId("333");
    sanpham3.setName("nuoc ngot");
    sanpham3.setMota("do uot");
    sanpham3.setSoluong(4);
    sanpham3.setGiaban(7.500);
    sanpham3.setDonvi("lit");

    Sanpham sanpham4 = new Sanpham();
    sanpham4.setId("444");
    sanpham4.setName("dau an");
    sanpham4.setMota("do gia dung");
    sanpham4.setSoluong(2);
    sanpham4.setGiaban(130000.500);
    sanpham4.setDonvi("lit");

    Sanpham sanpham5 = new Sanpham();
    sanpham5.setId("555");
    sanpham5.setName("ban chai danh rang");
    sanpham5.setMota("do gia dung");
    sanpham5.setSoluong(1300);
    sanpham5.setGiaban(30.500);
    sanpham5.setDonvi("gam");

    ArrayList<Sanpham> sanpham10 = new ArrayList<>();
    ArrayList<Sanpham> sanpham11 = new ArrayList<>();
    ArrayList<Sanpham> sanpham12 = new ArrayList<>();
    ArrayList<Sanpham> sanpham13 = new ArrayList<>();
    ArrayList<Sanpham> sanpham14 = new ArrayList<>();
    ArrayList<Sanpham> sanphamsList = new ArrayList<>();

    sanpham10.add(sanpham1);
    sanpham11.add(sanpham2);
    sanpham12.add(sanpham3);
    sanpham13.add(sanpham4);
    sanpham14.add(sanpham5);
    sanphamsList.add(sanpham1);
    sanphamsList.add(sanpham2);
    sanphamsList.add(sanpham3);
    sanphamsList.add(sanpham4);
    sanphamsList.add(sanpham5);

    // in ra danh sach san pham

    System.out.println(sanpham10.toString());
    System.out.println(sanpham11.toString());
    System.out.println(sanpham12.toString());
    System.out.println(sanpham13.toString());
    System.out.println(sanpham14.toString());
    // System.out.println(sanphamsList.toString());
    // System.out.println(sanphamsList.toString());

    // tim theo ten sản phẩm
    Scanner scanner = new Scanner(System.in);
    System.out.println("moi ban nhap ten san pham ");
    String nhapTen = scanner.next();

    for (Sanpham sanphamsList1 : sanphamsList) {
      if (sanphamsList1.getName().contains(nhapTen)) {
        System.out.println(sanphamsList1.toString());
      }

    }

    // tim id để xóa sản phẩm
    System.out.println("moi ban nhap id san pham de xoa ");
    String nhapid = scanner.next();
    for (int i = 0; i < sanphamsList.size(); i++) {
      if (sanphamsList.get(i).getId().equals(nhapid)) {
        System.out.println(sanphamsList.get(i).toString());
        sanphamsList.remove(sanphamsList.get(i));
      }
    }

    // tim id để cập nhật số lượng
    System.out.println(sanphamsList.toString());
    System.out.println("moi ban nhap id san pham de cap nhat so luong ");
    String nhapidCapNhat = scanner.next();
    for (int i = 0; i < sanphamsList.size(); i++) {
      if (sanphamsList.get(i).getId().equals(nhapidCapNhat)) {

        System.out.println("moi nhap so luong san pham");
        int soLuongMoi = scanner.nextInt();
        sanphamsList.get(i).setSoluong(soLuongMoi);
      }

    }
    System.out.println(sanphamsList.toString());
    // tìm sản phẩm có số lượng dưới 5
    System.out.println("san pham con so luon duoi 5");
    for (int i = 0; i < sanphamsList.size(); i++) {
      if (sanphamsList.get(i).getSoluong() < 5) {
        System.out.println(sanphamsList.get(i).getName());
      }
    }
    // tìm sản phẩm theo khoảng giá
    System.out.println("san pham gia duoi 50k");

    for (int i = 0; i < sanphamsList.size(); i++) {
      if (sanphamsList.get(i).getGiaban() < 50000) {
        System.out.println(sanphamsList.get(i).getName());
      }

    }
    System.out.println("san pham gia tren 150k");
    for (int i = 0; i < sanphamsList.size(); i++) {
      if (sanphamsList.get(i).getGiaban() > 50000) {
        System.out.println(sanphamsList.get(i).getName());
      }

    }
    System.out.println("san pham gia tu 50k toi 150k");
    for (int i = 0; i < sanphamsList.size(); i++) {
      if (sanphamsList.get(i).getGiaban() > 50000 && sanphamsList.get(i).getGiaban() < 150000) {
        System.out.println(sanphamsList.get(i).getName());

      }

    }
  }
}
