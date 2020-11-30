package principal;
import padre.Animal;
import hijas.Vicunia;
import hijas.Gallina;
import hijas.Tigre;

public class zoologico {
    public static void main (String[] args ){
         infoVicunia();
    }
    
    public static void infoVicunia(){
        Animal vicunia = new Vicunia();
        System.out.print("Nombre Vicunia: "+ vicunia.getNombre()+"\n");
        System.out.print("Edad: " + vicunia.getEdad()+" anios\n");
        System.out.print("Color: "+ vicunia.getColor()+"\n");
        System.out.print("Peso: "+ vicunia.getPeso()+" kg \n");
        System.out.print(vicunia.comer());
        System.out.print(vicunia.hacerRuido());
        System.out.print("-------------------------------------- \n");
    }
}