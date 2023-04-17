/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da;

import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class TVOLED extends Tivi {
    public TVOLED(){
        super();
    }
    public TVOLED(String mativi, String kieumanhinh,String hangsanxuat,String ngaynhap, String ngayxuat,double kichthuoctivi,double dongia, int soluong , int namphathanh){
        super (mativi, kieumanhinh,hangsanxuat,ngaynhap,ngayxuat,kichthuoctivi,dongia,soluong,namphathanh);
    }
    @Override
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
@Override
       public void xuat(){
                  System.out.println("{Mã Tivi : "+getMativi()+", Kiểu màn hình: "+getkieumanhinh()+", Hãng sản xuất : "+gethangsanxuat()+", ngày nhập: "+getngaynhap()+", ngày xuất: "+getngayxuat()+" ,Kích thước tivi : "+getkichthuoctivi()+", Đơn giá: "+getdongia()+", Số lượng: "+getsoluong()+", năm phát hành: "+getnamphathanh()+"}");

       }
}
    
    

