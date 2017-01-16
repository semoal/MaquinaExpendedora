import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Teclado here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teclado extends Actor
{   
    private static final String mensajeBienvenida = "Hola, introduce el numero y las monedas";
    public int numeroIntroducido = 0;
    private Tecla[] tecla = new Tecla[11];
    private int timeClick;
    private int currentTime;
    boolean clicked;
    public Teclado () {

    }
    //Detecta si ha hecho click en cualquier de los 5 botones
    public void introduceNumero () {
        for(int i = 0; i < 5;i++){
            if (Greenfoot.mouseClicked(tecla[i])) {
               numeroIntroducido = i+1;
               timeClick=(int)(System.currentTimeMillis()/1000);
               clicked=true;
            }  
        }
    }
    //Obtiene cada tecla
    public void getTeclas(){
        for(int i = 0;i<9;i++){
            tecla[i]=getWorld().getObjects(Tecla.class).get(i);
        }
    }
    //Getter para coger el numero que introduce el usuario
    public int getNumeroIntroducido () {
        return numeroIntroducido;
    }
    public void timer(){
        currentTime=(int)(System.currentTimeMillis()/1000);
        if(timeClick+6==currentTime){
            numeroIntroducido=0;
            clicked=false;
        }
    }
    public void act() {
        if(clicked){
            timer();
        }
        introduceNumero();
        getTeclas();
    }
}
