import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monedero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monedero extends Actor{
    private Monedas [] Moneda = new Monedas[5];
    public Monedero () {
        
    }
    public void setCredito() {
        if (Greenfoot.mouseClicked(getWorld().getObjects(Monedas.class).get(0))) {
           getWorld().getObjects(Expendedor.class).get(0).creditos += 1;
        }  
        if (Greenfoot.mouseClicked(getWorld().getObjects(Monedas.class).get(1))) {
           getWorld().getObjects(Expendedor.class).get(0).creditos += 0.10;
        }
        if (Greenfoot.mouseClicked(getWorld().getObjects(Monedas.class).get(2))) {
           getWorld().getObjects(Expendedor.class).get(0).creditos += 0.20;
        }
        if (Greenfoot.mouseClicked(getWorld().getObjects(Monedas.class).get(3))) {
           getWorld().getObjects(Expendedor.class).get(0).creditos += 0.05;
        }
    }
    public void act() {
       setCredito();
    }    
}
