/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASV
 */
public class Main {
    public static void main(String[] args){
        Mobil mobil = new Mobil();
        mobil.nama = "Toyota";
        mobil.kecepatan = 180;
        mobil.jumlahPintu = 4;
        mobil.jumlahRoda = 4;
        mobil.tampilkanInfo();
        
        sepedaMotor motor = new sepedaMotor();
        motor.nama = "Yamaha";
        motor.kecepatan = 120;
        motor.jenisMesin = "2-tak";
        motor.jumlahRoda = 3;
        motor.tampilkanInfo();

//        Anjing anjing = new Anjing();
//        anjing.nama = "Edo";
//        anjing.jenis = "Mamalia";
//        anjing.informasiHewan();
//        
//        Kucing kucing = new Kucing();
//        kucing.nama = "Rendi";
//        kucing.jenis = "Mamalia";
//        kucing.informasiHewan();
    }
}
