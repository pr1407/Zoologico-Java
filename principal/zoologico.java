package principal;
import padre.Animal;
import hijas.Vicunia;
import hijas.Gallina;
import hijas.Tigre;

public class zoologico {
    public static void main (String[] args ){
         infoVicunia();
         infoGallina();
         infoTigre();
    }
    
    public static void infoVicunia(){
        Animal vicunia = new Vicunia();
        System.out.print("Nombre Vicunia: "+ vicunia.getNombre()+"\n");
        System.out.print("Edad: " + vicunia.getEdad()+" anios\n");
        System.out.print("Color: "+ vicunia.getColor()+"\n");
        System.out.print("Peso: "+ vicunia.getPeso()+" kg \n");
        vicunia.comer();
        vicunia.hacerRuido();
        System.out.print("-------------------------------------- \n");
    }
    
    public static void infoGallina(){
        Animal gallina = new Gallina("rojo",7);
        System.out.print("Nombre Gallina: "+ gallina.getNombre()+"\n");
        System.out.print("Edad: " + gallina.getEdad()+" anios\n");
        System.out.print("Color: "+ gallina.getColor()+"\n");
        System.out.print("Peso: "+ gallina.getPeso()+" kg \n");
        gallina.comer();
        gallina.hacerRuido();
        System.out.print("-------------------------------------- \n");
    }
        
    public static void infoTigre(){
        Animal tigre = new Tigre("Manolo", 11);
        boolean valor = true;
        System.out.print("Nombre Tigre: "+ tigre.getNombre()+"\n");
        System.out.print("Edad: " + tigre.getEdad()+" anios\n");
        System.out.print("Color: "+ tigre.getColor()+"\n");
        System.out.print("Peso: "+ tigre.getPeso()+" kg \n");
        tigre.comer();
        tigre.hacerRuido();
    }
}