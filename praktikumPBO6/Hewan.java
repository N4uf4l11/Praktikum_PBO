/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumPBO6;

/**
 *
 * @author ASV
 */
public class Hewan {
//    public void suara() {
//        System.out.println("Hewan bersuara");
//    }
    public void bersuara() {
        System.out.println("Hewan bersuara");
    }
    public void makan(String makanan) {
        System.out.println("Hewan makan " + makanan);
    }
    public void makan(String makanan, int jumlah) {
        System.out.println("Hewan makan " + jumlah + "porsi " + makanan);
    }
    
    public static class Kucing extends Hewan {
        @Override
        public void bersuara() {
            System.out.println("Meow");
        }
    }
    public static class Anjing extends Hewan {
        @Override
        public void bersuara() {
            System.out.println("Woof");
        } 
    }
}

