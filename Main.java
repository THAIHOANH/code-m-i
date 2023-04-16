/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package da;

import java.util.Scanner;

/**
 *
 * @author thaih
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        QuanLy a= new QuanLy();
        Tivi b;
                
        int n;
       Scanner sc= new Scanner(System.in);
       do
      {
      a.menuChinh();
      System.out.print("Lựa chọn: ");
     n= sc.nextInt();
     switch(n)
    {
    case 1:
    {

     b= new TVOLED();
     a.themDSTivi(b);
   break;
    }
    case 2:
    {

   b= new TV4K();
     a.themDSTivi(b);
   break;
   }
   case 3:
    {
    a.XuatDSTVOLED();
     break;
    }
   case 4:
   {

   a.XuatDSTV4K();
   break;
    }
   case 5:
     {
   a.SuaDoi();
   break;
   }
   case 6:
       {
     System.out.println("-------------------------------");
     a.SapXepTheoDonGia();
      break;
    }
       case 7:
{
a.hienCacTiviSamsung();
break;
}
       case 8:
       {
        a.hien2DSTV();
        break;
       }
    
       
 default:
break;
    }
     
}
while(n!=0);
}
}      

