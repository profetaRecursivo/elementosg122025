
public abstract class Animal
{
    private String nombre;
    private int edad;
    private double peso;
    private boolean domestico;
    private boolean activo;
    
    /*public Animal(String nombre, int edad, double peso, boolean domestico, boolean activo){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.domestico = domestico;
        this.activo = activo;
    }*/
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getPeso(){
        return peso;
    }
    public boolean esDomestico(){
        return domestico;
    }
    //cuantas calorias necesita ese animal en un dia.
    //depende del animal 
    public abstract double necesidadEnergetica();
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}