/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan62livingthing;

/**
 *
 *  Nama              : Muhammad Ilham Apriyadi
 *  Kelas             : IF2
 *  NIM               : 10118045
 *  Deskripsi Program : Program LivingThing
 */
public class PBO10118045Latihan62LivingThing {

    /**
     * @param args
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Rizaki Adam Kurniawan");
        human.walk(human.getNama());   
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}
