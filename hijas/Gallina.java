package hijas;
import padre.Animal;

public class Gallina extends Animal{

    public Gallina(String color, int edad) {
        super("Pio", color, 6,  edad);
    }
    
    @Override
    public String hacerRuido(){
        return "La gallina "+ nombre + " esta haciendo ruido." ;
    }
    
    @Override
    public String comer(){
        return "La gallina "+ nombre + " esta comiendo.";
    }
}
