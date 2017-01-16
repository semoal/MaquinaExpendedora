import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elemento here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elemento extends Actor
{
    int cantidad=0;
    Snack snacks[];
    int id_snack;
    /**
     * Act - do whatever the Elemento wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Elemento(int id){
        id_snack = id;
    }
    public void recibeSnacks(){
        int a=0;
        for(int i=0;i<getWorld().getObjects(Snack.class).size();i++){               
               if(getWorld().getObjects(Snack.class).get(i).id==id_snack){                 
                   a++;
                }
        }
        snacks = new Snack[a];
        a = 0;
        for(int i=0;i<getWorld().getObjects(Snack.class).size();i++){
               if(getWorld().getObjects(Snack.class).get(i).id==id_snack){
                   snacks[a]=getWorld().getObjects(Snack.class).get(i);
                   a++;
                }
        }
    }
    public void act() {
        recibeSnacks();
    }    
}
