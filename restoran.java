1.Buat sistem manajemen restoran berbasis web
import java.util.Scanner;
 
public class Restoran {
 public static void main (String[] args) {
 
 String nasiG="",nasiR="",nasiGu="",JusJ="";
 int ng, nr, n, jj;
 double total = 0;
 
 System.out.println("Menu Restoran :");
 System.out.print("1.Nasi goreng ");
 System.out.print("2.Nasi Rawon ");
 System.out.print("3.Nasi Gudeg ");
 System.out.println("4.Jus Jeruk ");
 System.out.print("5.Hitung Total ");
 System.out.println("6.Keluar aplikasi ");
 System.out.println("Pilih Menu : ");
 
 boolean menu =true;
 while(true)
 {
 
 Scanner input = new Scanner(System.in);
 int pilihan = input.nextInt();
 System.out.println("pilinan : "+pilihan);
 switch(pilihan)
 {
 case 1 :
 nasiG = "Nasi Goreng";
 System.out.println("1. "+nasiG);
 ng = 15000;
 total = total + ng;
 pilihan = input.nextInt();
 break;
 case 2 :
 nasiR = "Nasi Rawon";
 System.out.println("2. "+nasiR);
 nr = 15000;
 total = total + nr;
 pilihan = input.nextInt();
 break;
 case 3 :
 nasiGu = "Nasi Gudeg";
 System.out.println("3. "+nasiGu);
 n = 15000;
 total = total + n;
 pilihan = input.nextInt();
 break;
 case 4 :
 JusJ = "Jus Jeruk";
 System.out.println("4. "+JusJ);
 n = 15000;
 total = total +n;
 pilihan = input.nextInt();
 break;
 case 5 :
 System.out.println("Pilihan menu adalah "+ nasiG +" "
 +nasiGu+" "+nasiR+" "+JusJ);
 System.out.println("Total yang harus di bayar adalah : "+total);
 System.out.print("Uang yang dibayarkan Rp. ");
 double bayar = input.nextDouble();
 if (bayar <= total){
 System.out.println("anda mau ngutang? ooo tidak bisa!");
 }else{
 double kembali = bayar - total;
 System.out.println("Uang yang harus dikembalikan : Rp. " +kembali);
 }
 pilihan = input.nextInt();
 break;
 case 6 :
 System.exit(0);
 break;
 }
 }
 }
}
HASIL TAMPILANNYA
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class restoran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
