import greenfoot.*;
import java.text.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Expendedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Expendedor extends Actor
{
    private int cantSnacks;
    private boolean estado = true;
    private Snack[] snacks = new Snack[5];
    private Teclado teclado;
    private Pantalla pantalla;
    private String estadoMaquina = "";
    private int numSeleccion = 0;
    private String prueba = "";
    public double creditos=0.00;
    private String creditosString = "0";
    NumberFormat formatter = new DecimalFormat("0.00");  
    //Constructor del expendendor
    public Expendedor () {
      
    }
    //Comprueba si la máquina tiene algun error
     public void estadoMaquina() {
        if (estado) {
            pantalla.valorPrueba = "Maquina en servicio"+"\n\n\n\n"+
            "Creditos: "+creditosString + "€";
        }else {
            pantalla.valorPrueba = "Maquina fuera de servicio, lamentamos lo sucedido";
        }
    }
    //Cogemos la cantidad de snacks con un getter
    public int getCantSnacks () {
        return cantSnacks;
    } 
    //Getter de comprobar el numeroIntroducido 
    public void opcionUsuario() {
        numSeleccion = teclado.getNumeroIntroducido();
    }
    //Setter para introducir los datos de cada producto y mensaje de bienvenida en la clase pantalla
    public void setValorPrueba () {        
        switch(numSeleccion){
            case 0: estadoMaquina();
                break;
            case -1:  pantalla.valorPrueba = "Creditos insuficientes \n\n\n\n"+
                "Creditos: "+creditosString;
                break;
            default:pantalla.valorPrueba = 
            "Código: "+snacks[numSeleccion-1].id+ "\n" +
            " Nombre producto: "+snacks[numSeleccion-1].nombre+ "\n" +
            " Precio: "+snacks[numSeleccion-1].precio+" €"+"\n\n"+
            "Creditos: "+creditosString;
        }
    }
    public void actualizaElementos(){
        for(int i =0;i<snacks.length;i++){
            snacks[i]=getWorld().getObjects(Elemento.class).get(i).snacks[0];
        }
    }
    public void okPressed(){
        if(Greenfoot.mouseClicked(getWorld().getObjects(okButton.class).get(0))){
            Snack snack=new Snack();
                for(int i=0;i<getWorld().getObjects(Snack.class).size();i++){
                   if(getWorld().getObjects(Snack.class).get(i).id==numSeleccion){
                       snack=getWorld().getObjects(Snack.class).get(i);
                       break;
                       
                    }
            }
            if(creditos>=snack.precio){
                creditos-=snack.precio;
                getWorld().removeObject(snack);          
            }else{
               teclado.numeroIntroducido=-1;
               getWorld().getObjects(Teclado.class).get(0).clicked=true;
            }
        }
    }
    //Act
    public void act() {
        teclado = getWorld().getObjects(Teclado.class).get(0);
        pantalla = getWorld().getObjects(Pantalla.class).get(0);
        opcionUsuario();
        actualizaElementos();
        estadoMaquina();
        okPressed();
        setValorPrueba();
        creditosString = formatter.format(creditos);
    }
}
