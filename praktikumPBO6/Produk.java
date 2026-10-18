/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumPBO6;

/**
 *
 * @author ASV
 */
public class Produk {
    private String nama;
    double harga;
    
    public Produk (String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    
    public String getNama() {
        return nama;
    }
    
    public double getHarga() {
        return harga;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public double hitungDiskon(){
        return 0;
    }
        
}
