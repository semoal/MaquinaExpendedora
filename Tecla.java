import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tecla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tecla extends Actor
{
    /**
     * Act - do whatever the Tecla wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tecla(String ruta){
        GreenfootImage button1 = new GreenfootImage(ruta);
            button1.scale(30,30);
            setImage(button1);
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
