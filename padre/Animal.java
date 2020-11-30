package padre;

public abstract class Animal {
    protected String nombre;
    protected String color;
    protected double peso;
    protected int edad;

    public Animal(String nombre, String color, double peso, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.edad = edad;
    }

    public abstract String hacerRuido();
    
    public abstract String comer();
    
    //get and set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
