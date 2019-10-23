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
public abstract class LivingThing {
    public abstract void walk(String nama);
    public void breath(String nama){
        Human human = new Human();
        human.setNama("Rizaki Adam Kurniawan");
        System.out.println(human.getNama()+" Bernafas");
    }
    public void eat(String nama){
        Human human = new Human();
        human.setNama("Rizaki Adam Kurniawan");
        System.out.println(human.getNama()+" Makan");
    }
}
