package hijas;
import padre.Animal;

public class Vicunia extends Animal {

    public Vicunia() {
        super("Urpi", "Marron claro",50.0,5);
    }
    
    @Override
    public String hacerRuido(){
        return "La vicunia "+ nombre + " esta haciendo ruido.";
    } 
    
    @Override
    public String comer(){
        return "La vicunia "+ nombre + " esta comiendo.";
    }

}
