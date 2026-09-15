/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASV
 */
public class Kendaraan {
    private String nama;
    private int kecepatanMaks;
    private String jenisMesin;
    
    // Constructor
    public Kendaraan(String nama, int kecepatanMaks, String jenisMesin){
        this.nama = nama;
        this.kecepatanMaks = kecepatanMaks;
        this.jenisMesin = jenisMesin;
    }
    
    //Getter dan Setter untuk nama
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    //Getter dan Setter untuk jenis mesin kendaraan
    public String getJenisMesin(){
        return jenisMesin;
    }
    public void setJenisMesin(String jenisMesin){
        this.jenisMesin = jenisMesin;
    }
    
    //Getter dan Setter untuk kecepatan kendaraan
    public int getKecepatanMaks(){
        return kecepatanMaks;
    }
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    
    //Method public untuk menampilkan informasi kendaraan
    public void tampilkanInfokendaraan(){
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Nama Kendaraan: " + kecepatanMaks + "Km/h");
        System.out.println("Nama Kendaraan: " + jenisMesin);
    }
}
