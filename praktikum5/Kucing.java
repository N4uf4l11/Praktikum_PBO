/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author ASV
 */
public class Kucing extends Hewan{
    private String suara = "miaw miaw";
    
    @Override
    public void informasiHewan(){
        super.informasiHewan();
        System.out.println("Suara: " + suara);
    }
}
