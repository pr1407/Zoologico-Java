package hijas;
 
import padre.Animal;

public class Gallina extends Animal{

    public Gallina(String color, int edad) {
        super("Pio", color, 6,  edad);
    }
    
    @Override
    public void hacerRuido(){
        System.out.printf("La gallina "+ nombre + " esta haciendo ruido.\n");
    }
    
    @Override
    public void comer(){
        System.out.printf("La gallina "+ nombre + " esta comiendo.\n");
    }
}
