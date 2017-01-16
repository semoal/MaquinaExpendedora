import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snack extends Actor
{
    
    public String nombre="";
    public int id=0;
    public double precio=0.0; 
    public String rutaImagen = "";
    GreenfootImage snack;
    
    public Snack(int ID, String NOMBRE, double PRECIO, String image) {
        id = ID;
        nombre = NOMBRE;
        precio = PRECIO;
        rutaImagen = image;
        snack = new GreenfootImage(image);
        setImage(snack);
    }
    public Snack() {
        id=0;
        //Mensaje de bienvenida
    }
    //Método que quita uno cada vez que saca un producto
   
    public void act() {
    }    
}
