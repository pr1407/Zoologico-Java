package hijas;
import padre.Animal;

public class Vicunia extends Animal {

    public Vicunia() {
        super("Urpi", "Marron claro", 50.0 , 5 );
    }
    
    @Override
    public void hacerRuido(){
        String mensaje = "La vicunia " + nombre +" hace ruido.\n"; 
    }

    @Override
    public void comer() {
        System.out.printf("La vicunia " + nombre +" esta comiendo.\n");
    }
}