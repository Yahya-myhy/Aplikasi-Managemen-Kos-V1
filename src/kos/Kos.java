/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kos;

import java.util.Scanner;

/**
 *
 * @author Yahya
 */
public class Kos {

    /**
     * @param args the command line arguments
     */
    Scanner scan = new Scanner(System.in);
    jumlahbayaran jml = new jumlahbayaran();
    Transaksi tns = new Transaksi();
    private String pilihan;
    public static void main(String[] args) throws InterruptedException {
         Kos ks = new Kos(); 
         ks.menuUtama();
   }
         public void menuUtama() throws InterruptedException{
         System.out.print("username : ");
            String user = scan.next();
            System.out.print("passsword : ");
            int pass = scan.nextInt(); 
             System.out.print("Welcome ");
             for(int i = 0; i<user.length(); i++){
             Thread.sleep(500);
             System.out.print(user.charAt(i));
            }
                if(pass == 01 && user.equals("doni")){
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Nama Doni");
                   System.out.println("Kamar No1");
                   System.out.println("Tanngal Masuk 02 - 01 - 2017");
                   System.out.println("Letak/Tipe Kamar = Atas");
                   System.out.println("Harga Perbulan = Rp.400.000"); 
                   System.out.println("Bayar Setiap Tangal 02");
                   System.out.println("");  
                   jml.listrik();
                do {
                   System.out.println("1.Cek Total Harga ");
                   System.out.println("2.Transaksi ");
                   System.out.println("3.LogOut");
                   System.out.println("4.Keluar Program");
                   int pill = scan.nextInt();
                   if(pill == 1){
                      System.out.print("Total Anda Saat Ini = Rp." + jml.Jumlah(400.000));
                   }else if(pill == 2){
                       tns.bayarAtas(jml.Jumlah(400.000));
                   }else if (pill == 3){
                      menuUtama(); 
                   }
                      else if (pill == 4){
                       System.out.println("Terimaksih Sudah melakkan Transaksi");
                       System.exit(0);
                   } else {
                          System.out.println("Inputan Salah ");
                      }
                   System.out.println("\nApakah anda ingin mengulang kembali ? [y/t] : ");
                       pilihan = scan.next();
                }while("y".equals(pilihan)||"Y".equals(pilihan));
                   
                     
                }else if(pass == 02 && user.equals("albab")){
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Nama Albab");
                   System.out.println("Kamar No2"); 
                   System.out.println("Tanngal Masuk 07 - 02 - 2017");
                   System.out.println("Letak/Tipe Kamar = Bawah");
                   System.out.println("Harga Perbulan = Rp.452.500 "); 
                   System.out.println("Bayar Setiap Tangal 12");
                   System.out.println("");  
                   jml.listrik();
                do{
                   System.out.println("1.Cek Total Harga ");
                   System.out.println("2.Transaksi ");
                   System.out.println("3.LogOut");
                   System.out.println("4.Keluar Program");
                   int pill = scan.nextInt();
                   if(pill == 1){
                      System.out.print("Total Anda Saat Ini = Rp." + jml.Jumlah(452.500));
                   }else if(pill == 2){
                       tns.bayarAtas(jml.Jumlah(450.500));
                   }else if (pill == 3){
                      menuUtama(); 
                   }
                      else if (pill == 4){
                       System.out.println("Terimaksih Sudah melakkan Transaksi");
                       System.exit(0);
                   } else {
                          System.out.println("Inputan Salah ");
                          
                      }System.out.println("\nApakah anda ingin mengulang kembali ? [y/t] : ");
                       pilihan = scan.next();
                }while ("y".equals(pilihan)||"Y".equals(pilihan));
                     
                }  
                else if(pass == 03 && user.equals("sugik")){
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Nama Sugik");
                   System.out.println("Kamar No3");
                   System.out.println("Tanngal Masuk 02 - 01 - 2017");
                   System.out.println("Letak/Tipe Kamar = Atas");
                   System.out.println("Harga Perbulan = Rp.400.000"); 
                   System.out.println("Bayar Setiap Tangal 02");
                   System.out.println("");  
                   jml.listrik();
                do {
                   System.out.println("1.Cek Total Harga ");
                   System.out.println("2.Transaksi ");
                   System.out.println("3.LogOut");
                   System.out.println("4.Keluar Program");
                   int pill = scan.nextInt();
                   if(pill == 1){
                      System.out.print("Total Anda Saat Ini = Rp."+ jml.Jumlah(400.000));
                   }else if(pill == 2){
                       tns.bayarAtas(jml.Jumlah(400.000));
                   }else if (pill == 3){
                      menuUtama(); 
                   }
                      else if (pill == 4){
                       System.out.println("Terimaksih Sudah melakkan Transaksi");
                       System.exit(0);
                   } else {
                          System.out.println("Inputan Salah ");
                      }
                   System.out.println("\nApakah anda ingin mengulang kembali ? [y/t] : ");
                       pilihan = scan.next();
                }while("y".equals(pilihan)||"Y".equals(pilihan));
                   
                     
                }else if(pass == 04 && user.equals("yahya")){
                   System.out.println("");
                   System.out.println("");
                   System.out.println("Nama Yahya");
                   System.out.println("Kamar No4"); 
                   System.out.println("Tanngal Masuk 17 - 11 - 2017");
                   System.out.println("Letak/Tipe Kamar = Bawah");
                   System.out.println("Harga Perbulan = Rp.452.500 "); 
                   System.out.println("Bayar Setiap Tangal 17");
                   System.out.println("");  
                   jml.listrik();
                do{
                   System.out.println("1.Cek Total Harga ");
                   System.out.println("2.Transaksi ");
                   System.out.println("3.LogOut");
                   System.out.println("4.Keluar Program");
                   int pill = scan.nextInt();
                   if(pill == 1){
                      System.out.print("Total Anda Saat Ini = Rp." + jml.Jumlah(452.500));
                   }else if(pill == 2){
                       tns.bayarAtas(jml.Jumlah(452.500));
                   }else if (pill == 3){
                      menuUtama(); 
                   }
                      else if (pill == 4){
                       System.out.println("Terimaksih Sudah melakkan Transaksi");
                       System.exit(0);
                   } else {
                          System.out.println("Inputan Salah ");
                          
                      }System.out.println("\nApakah anda ingin mengulang kembali ? [y/t] : ");
                       pilihan = scan.next();
                }while ("y".equals(pilihan)||"Y".equals(pilihan));
                     
                }
                else {
                 System.out.println("");
                 System.out.println("Data Yang Anda Masukkan Salah");
                menuUtama(); 
           }
       

    
       }  

 
}
