/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumPBO6;

/**
 *
 * @author ASV
 */
public class mainCode {
    public static void main(String[] args) {
//        Kalkulator kalkulator = new Kalkulator();
//        int hasil1 = kalkulator.jumlahkan(5,3);
//        double hasil2 = kalkulator.jumlahkan(2.5,3.7);
//        int hasil3 = kalkulator.jumlahkan(1,2,3);
//        System.out.println(hasil1); // Output: 8
//        System.out.println(hasil2); // Output: 6.2
//        System.out.println(hasil3); // Output

//          Hewan hewan = new Hewan.Kucing(); 
//          hewan.suara(); // Output: Meow
//          Hewan hewan = new Hewan.Kucing();
//          hewan.bersuara();
//          Hewan kucing = new Hewan.Kucing();
//          kucing.makan("ikan");
//          kucing.makan("ikan", 2);
//          
//          Hewan anjing = new Hewan.Anjing();
//          anjing.bersuara();
//          anjing.makan("daging", 3);
          
          KeranjangBelanja keranjang = new KeranjangBelanja();
          
          Produk buku = new Buku("Buku Algoritma Pemrograman", 150000);
          Produk laptop = new Elektronik("Axus", 3000000);
          Produk baju = new Pakaian("Kaos", 75000);
          
          keranjang.tambahProduk(buku);
          keranjang.tambahProduk(laptop);
          keranjang.tambahProduk(baju);
          
          keranjang.cetakStruk();
    }  
}
