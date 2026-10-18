/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASV
 */
public class Main {
    
    public static void main(String[] args){
        Kendaraan mobilku = new Kendaraan("Avanza", 76, "P7L756");
        Mobil toyota = new Mobil("Innova", 220, "Diesel", 4);
        Pekerja karyawan = new Pekerja("Andi", 22, "Karyawan", 5000000);
        
        System.out.println("Informasi Pekerja");
        System.out.println(karyawan.toString());
        
        karyawan.setNama("Dito");
        
        System.out.println("\nInformasi Pekerja setelah diubah");
        System.out.println(karyawan.toString());
        
        System.out.println("\nDetail Informasi Pekerja:");
        System.out.println("Informasi Nama Pekerja");
        System.out.println(karyawan.getNama());
        System.out.println("Informasi Usia Pekerja");
        System.out.println(karyawan.usia);
        System.out.println("Informasi Pekerjaan Pekerja");
        System.out.println(karyawan.pekerjaan);
        System.out.println("Informasi Gaji Pekerja");
        System.out.println(karyawan.getGaji());
        System.out.println("\nInformasi Kendaraan");
        mobilku.tampilkanInfokendaraan();
        System.out.println("\nInformasi Detail Mobil");
        toyota.tampilkanInfoMobil();
    }
}
