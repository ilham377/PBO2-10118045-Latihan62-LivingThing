/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan62livingthing;

/**
 *
 * @author Ilham
 */
public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void walk(String nama){
        System.out.println(getNama()+" sedang Berjalan");
    }
    
    
}
