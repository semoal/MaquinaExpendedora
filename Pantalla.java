import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class Pantalla here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pantalla extends Actor {
    public String valorPrueba = "";
    Color t=new Color(0,0,0,0);
    public String valorInicial = "Hola bienvenido";
    public Pantalla() {
       setImage(new GreenfootImage(valorInicial, 10, Color.WHITE,t));
    }
    public void act() {
       setImage(new GreenfootImage(valorPrueba, 10, Color.WHITE,t));
    }    
}
