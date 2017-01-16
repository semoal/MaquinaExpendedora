import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Snack[] snacks=new Snack[5];
    public MyWorld() {    
        super(1000, 600, 1); 
        GreenfootImage pic = new GreenfootImage("images/fondo.png");
        setBackground(pic);
        //Añadimos los objectos
        snacksDisenyo();
        creaElemento();
        addObject(new Expendedor(),0,0);
        addObject(new Teclado(),0,0);
        addObject(new Pantalla(),75,100);
        addObject(new Monedero(),0,0);
        tecladoDisenyo();
        creaOk();
        monedasMonedero();
    }
    //Crea los snackss
    public void creaElemento(){
        for(int i=1;i<6;i++){
            addObject(new Elemento(i),0,0);
        }
    }
    //Posiciona y da datos
    public void snacksDisenyo(){
        int y=225;     
        filaSnack(1,"Doritos",0.95,"images/doritos.png",250);
        filaSnack(2,"Font Vella",0.50,"images/agua.png",400);
        filaSnack(3,"Milka Oreo",1.00,"images/milka.png",525);
        filaSnack(4,"Cheetos Chili",0.25,"images/cheetos.png",725);
        filaSnack(5,"Parera Rosquilletas",1.50,"images/rosquis.png",875);
    }
    //Duplica segun la cantidad de snacks
    public void filaSnack(int id, String nombre, double precio, String imagen,int x){
        int y=125;
        for(int i=0; i<3;i++){
            addObject(new Snack(id,nombre,precio,imagen),x,y);
            y+=50;
        }
    }
    //Diseño de los snacks
    public void tecladoDisenyo(){
        int x=40;
        int y=419;
        int col=0;
        for(int i=1;i<10;i++){
            addObject(new Tecla("images/number"+i+".png"),x,y);
            x+=37;
            col++;
            if(col==3){
                y+=40;
                x=40;
                col=0;
            }
        }
    }
    public void creaOk() {
        addObject(new okButton(),75,545);
    }
    //Creamos monedas a partir del monedero
     public void monedasMonedero(){
        int x=700;
        int y=500;
        for(int i=1;i<5;i++){
            addObject(new Monedas("images/moneda"+i+".png"),x,y);
            x+=60;
        }
    }
    //Act
    public void act(){
       for(int i=1;i<4;i++){
            snacks[i]=getObjects(Snack.class).get(i);
       }
    }
}
