/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASV
 */
public class Anjing extends Hewan{
    private String suara = "guk guk guk";
    
    @Override
    public void informasiHewan(){
        super.informasiHewan();
        System.out.println("Suara Anjing: " + suara);
    }
}
