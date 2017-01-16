import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monedas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monedas extends Actor {
    public Monedas (String rutaMoneda) {
       GreenfootImage moneda = new GreenfootImage(rutaMoneda);
       moneda.scale(40,40);
       setImage(moneda);
    }
    public void act() {
        // Add your action code here.
    }    
}
