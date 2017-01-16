import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class okButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class okButton extends Actor
{
    /**
     * Act - do whatever the okButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public okButton () {
       GreenfootImage buttonOk = new GreenfootImage("images/okbutton.png");
       buttonOk.scale(110,40);
       setImage(buttonOk);
    }
    public void act() {

    }    
}
