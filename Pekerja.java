/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum3;

/**
 *
 * @author ASV
 */
public class Pekerja extends Manusia{
    private int gaji;
    
    //Constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji){
        super(nama, usia, pekerjaan);
        this.gaji = gaji;
    }
    public int getGaji(){
        return gaji;
    }
    public void setGaji(int gaji){
        this.gaji = gaji;
    }
    
    public String toString(){
        return "Nama: " + getNama() +
               "\nUsia: " + usia +
               "\nPekerjaan: " + pekerjaan +
               "\nGaji: " + getGaji();
    }
}
