
public class Palabra
{
    private String palabra;
    private int fila;
    private int columna;
    private char direccion;
    
    public Palabra(String palabra, int fila, int columna, char direccion){
        this.palabra = palabra;
        this.fila = fila;
        this.columna = columna;
        this.direccion = direccion;
    }
    
    public String getPalabra(){
        return palabra;
    }
    
    public int getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;   
    }
    
    public char getDireccion(){
        return direccion;
    }
}