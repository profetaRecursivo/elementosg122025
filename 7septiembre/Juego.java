import java.util.ArrayList;

/**
 * Write a description of class Juego here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Juego
{
    private int filas;
    private int columnas;
    private char[][] crucigrama;
    
    public Juego(ArrayList<Palabra> palabras){
        generarJuego(palabras);
    }
    
    public void generarJuego(ArrayList<Palabra> palabras){
        filas = tamMaxFilas(palabras);
        //columnas = tamMaxColumnas(palabras);
        crucigrama = new char[filas][columnas];
        for(Palabra actual:palabras){
            //if(sePuedeColocar(actual)){
            //    colocarPalabra(actual);
            //}
        }
    }
    
    public int tamMaxFilas(ArrayList<Palabra> palabras){
        int tam = 0;
        for(Palabra actual:palabras){
            if(actual.getDireccion() == 'V'){
                if(actual.getFila() + actual.getPalabra().length() > tam){
                    tam = actual.getFila() + actual.getPalabra().length();
                }
            }else{
                if(actual.getFila() + 1 > tam){
                    tam = actual.getFila() + 1;
                }
            }
        }
        return tam;
    }
    
}