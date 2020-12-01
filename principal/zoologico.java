package principal;
import padre.Animal;
import hijas.Vicunia;
import hijas.Gallina;
import hijas.Tigre;

public class zoologico {
    public static void main (String[] args ){
         infoVicunia();
         infoTigre();
         infoGallina();
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
    
    public static void infoTigre(){
        Animal tigre = new Tigre("Scar" ,10);
        System.out.print("Nombre Vicunia: "+ tigre.getNombre()+"\n");
        System.out.print("Edad: " + tigre.getEdad()+" anios\n");
        System.out.print("Color: "+ tigre.getColor()+"\n");
        System.out.print("Peso: "+ tigre.getPeso()+" kg \n");
        System.out.print(tigre.comer());
        System.out.print(tigre.hacerRuido());
        System.out.print("-------------------------------------- \n");        
    }
    public static void infoGallina(){
        Animal gallina = new Gallina("Marron" , 6);
        System.out.print("Nombre Vicunia: "+ gallina.getNombre()+"\n");
        System.out.print("Edad: " + gallina.getEdad()+" anios\n");
        System.out.print("Color: "+ gallina.getColor()+"\n");
        System.out.print("Peso: "+ gallina.getPeso()+" kg \n");
        System.out.print(gallina.comer());
        System.out.print(gallina.hacerRuido());
        System.out.print("-------------------------------------- \n");        
    }
}