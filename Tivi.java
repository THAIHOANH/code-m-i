/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class Tivi implements Serializable {
    String mativi;
    String kieumanhinh;
    String hangsanxuat;
    String ngaynhap;
    String ngayxuat;
    double kichthuoctivi;
    double dongia;
    int soluong;
    int namphathanh;

    public Tivi() {}

    public Tivi(String mativi, String kieumanhinh,String hangsanxuat,String ngaynhap, String ngayxuat,double kichthuoctivi, double dongia, int soluong, int nampphathanh) {
        this.mativi = mativi;
        this.kieumanhinh = kieumanhinh;
        this.hangsanxuat = hangsanxuat;
        this.ngaynhap = ngaynhap;
        this.ngayxuat = ngayxuat;
        this.kichthuoctivi = kichthuoctivi;
        this.dongia = dongia;
        this.soluong = soluong;
        this.namphathanh = namphathanh;
    }

    public String getMativi() {
       return mativi;
    }

    public void setMativi(String mativi) {
        this.mativi = mativi;
    }

    public String getkieumanhinh() {
        return kieumanhinh;
    }

    public void setkieumahinh(String kieumanhinh) {
        this.kieumanhinh = kieumanhinh;
    }

    public double getkichthuoctivi() {
        return kichthuoctivi;
    }

    public void setkichthuoctivi(double kichthuoctivi) {
        this.kichthuoctivi = kichthuoctivi;
    }
    
    public String gethangsanxuat() {
        return hangsanxuat;
    }
    public void sethangsanxuat(String hangsanxuat){
        this.hangsanxuat = hangsanxuat;
    }

    public double getdongia() {
        return dongia;
    }

    public void setdongia(double dongia) {
        this.dongia = dongia;
    }

    public int getsoluong() {
        return soluong;
    }

    public void setsoluong(int soluong) {
        this.soluong = soluong;
    }
    public String getngaynhap(){
        return ngaynhap;
    }
    public void setngaynhap(String ngaynhap){
        this.ngaynhap = ngaynhap;
    }
    public String getngayxuat(){
        return ngayxuat;
    }
    public void setngayxuat(String ngayxuat){
        this.ngayxuat = ngayxuat;
    }
    public int getnamphathanh(){
        return namphathanh;
    }
    public void setnamphathanh(int namphathanh){
        this.namphathanh = namphathanh;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
         System.out.println("Nhập mã Tivi:");
        mativi = scanner.nextLine();
        System.out.println("Nhập kiểu màn hình:");
        kieumanhinh = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất:");
        hangsanxuat = scanner.nextLine();
        System.out.println("Ngày nhập: ");
        ngaynhap = scanner.nextLine();
        System.out.println("Ngày Xuất: ");
        ngayxuat = scanner.nextLine();
        System.out.println("Nhập kích thước Tivi:");
        kichthuoctivi = scanner.nextDouble();
        System.out.println("Nhập đơn giá:");
        dongia = scanner.nextDouble();
        System.out.println("Nhập số lượng:");
        soluong = scanner.nextInt();
        System.out.println("Năm Phát Hành: ");
        namphathanh = scanner.nextInt();
    
    }
       public void xuat(){
        System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+", Hãng sản xuất : "+gethangsanxuat()+", ngày nhập: "+getngaynhap()+", ngày xuất: "+getngayxuat()+" ,Kích thước tivi : "+getkichthuoctivi()+", Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+", năm phát hành: "+getnamphathanh()+"}");
       }
}
