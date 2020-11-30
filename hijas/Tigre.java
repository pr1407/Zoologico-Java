package hijas;

import padre.Animal;

public class Tigre extends Animal{
    boolean ruido ; 
    public Tigre(String nombre, int edad) {
        super(nombre,"Blanco", 250.0 , edad);
    }

    public void hacerRuido(boolean ruido){
        if(ruido == true){
            System.out.print("El tigre "+ nombre + " esta haciendo ruido.\n");
        }
        else{
            System.out.print("El tigre "+ nombre + " no esta haciendo ruido.\n");
        }
    }
    
    @Override
    public void comer() {
        System.out.printf("El tigre "+ nombre + " esta comiendo.\n");
    }
    
    @Override
    public void hacerRuido(){
        hacerRuido(ruido);
    }
    
    
    
}
