/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package da;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class QuanLy {
    Scanner sc = new Scanner(System.in);
    ArrayList<Tivi>tv;
    public QuanLy(){
        tv = new ArrayList<>();
    }
    public void themDSTivi(Tivi a){
        System.out.println("Nhập số lượng cần thêm:");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("Lần nhập thứ "+ (i+1)+":");
            if(a instanceof TVOLED){
                a=new TVOLED();
                a.nhap();
            }
            else if (a instanceof TV4K){
                a = new TV4K();
                a.nhap();
            }
            tv.add(a);
            System.out.println("Thêm Tivi Thành Công!");
        }
    }
        public void XuatDSTVOLED() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Tivi x: tv) {
            if(x instanceof TVOLED) {
                x.xuat();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    
    public void XuatDSTV4K() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(Tivi x: tv) {
            if(x instanceof TV4K) {
                x.xuat();
            }
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public void menuSuaDoi(){
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("0: Kết Thúc");
        System.out.println("1: Sửa Thông Tin TVOLED");
        System.out.println("2: Xóa TVOLED");
        System.out.println("3: Sửa Thông Tin TV4K");
        System.out.println("4: Xóa TV4K");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Chọn chức năng: "); 
    }
    public void SuaDoi() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            menuSuaDoi();
            System.out.println("Lựa chọn ");
            n=sc.nextInt();
            switch(n) {
                case 0: System.out.println("Kết thúc sửa đổi"); break;
                case 1: {
                    String mativi;
                    System.out.println("Nhập mã TVOLED cần sửa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    suaTVOLED(mativi);
                    break;
                }
                case 2: {
                    String mativi;
                    System.out.println("Nhập mã TVOLED cần xóa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    xoaTVOLED(mativi);  
                    System.out.println("Xóa Tivi thành công.");
                    break;
                }
                case 3: {
                    String mativi;
                    System.out.println("Nhập mã TV4k cần sửa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    suaTV4K(mativi);
                    break;
                }
                case 4: {
                    String mativi;
                    System.out.println("Nhập mã TV4K cần xóa: ");
                    sc.nextLine();
                    mativi=sc.nextLine();
                    xoaTV4K(mativi);
                    System.out.println("Xóa Tivi thành công.");
                    break;
                }
                default: 
                    System.out.println("\nXin lỗi, Không có lựa chọn này\n"); 
                    break;
            }
        } while(n!=0);
    }
public void suaTVOLED(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TVOLED) {
                if(((TVOLED)x).getMativi().compareTo(mativi)==0) {
                    x.nhap();
                }
            }
        }
    }
    
    public void xoaTVOLED(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TVOLED) {
                if(((TVOLED)x).getMativi().compareTo(mativi)==0) {
                    tv.remove(x);
                }
            }
        }
    }
    
    public void suaTV4K(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TV4K) {
                if(((TV4K)x).getMativi().compareTo(mativi)==0) {
                    x.nhap();
                }
            }
        }
    }
    
    public void xoaTV4K(String mativi) {
        for(Tivi x: tv) {
            if(x instanceof TV4K) {
                if(((TV4K)x).getMativi().compareTo(mativi)==0) {
                    tv.remove(x);
                }
            }
        }
    }
    public void SapXepTheoDonGia()
{
     Collections.sort(tv, new Comparator<Tivi>() {
     @Override
     public int compare(Tivi t1, Tivi t2) {
            return Double.compare(t1.getdongia(), t2.getdongia());
        }
    });
       System.out.println("Danh sách tivi sau khi sắp xếp: ");
       XuatDSTVOLED();
       XuatDSTV4K();

}
    public void hienCacTiviSamsung() {
for (Tivi x : tv) {
if (x instanceof Tivi && ((Tivi)
x).gethangsanxuat().equalsIgnoreCase("Sam sung") == true) {
x.xuat();
}
}
}
    public void hien2DSTV(){
         if (tv.isEmpty()) {
        System.out.println("Danh sách trống.");
    } else {
        System.out.println("Danh sách Tivi:");
        for (Tivi tivi : tv) {
            tivi.xuat();
    }
    }
    }
 
    public void menuChinh() {
System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ KHO TIVI------");
System.out.println("1. Nhập danh sách TVOLED ");
System.out.println("2. Nhập danh sách TV4K");
System.out.println("3. Hiển thị danh sách TVOLED");
System.out.println("4. Hiển thị danh sách TV4K");
System.out.println("5. Chỉnh sửa thông tin (TVOLED,TV4K)");
System.out.println("6. Sắp xếp danh sách Tivi theo đơn giá ");
System.out.println("7. Thống kê các tivi Samsung ");
System.out.println("8. Hiển thị cả 2 danh sách ");
System.out.println("-----Nhấn phím 0 để thoát chương trình, xin cảm ơn!-----");
}
    
}






