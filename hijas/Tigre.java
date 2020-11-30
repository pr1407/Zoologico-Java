package hijas;
import padre.Animal;

public class Tigre extends Animal{
    public boolean ruido ; 
    public Tigre(String nombre, int edad ) {
        super(nombre,"Blanco", 250.0 , edad );
    }

    public String hacerRuido(boolean ruido){
        if(ruido == true){
            return "El tigre "+ nombre + " esta haciendo ruido.";
        }
        else{
            return "El tigre "+ nombre + " no esta haciendo ruido.";
        }
    }

    @Override
    public String comer() {
       return "El tigre "+ nombre + " esta comiendo.";
    } 

    @Override
    public String hacerRuido() {
        String msj = hacerRuido(ruido);
        return msj;
    }
}