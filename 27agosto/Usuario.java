import java.util.ArrayList;
public class Usuario
{
    private String nombre;
    private String id;
    private int monedas;
    private int cantPasos;
    private ArrayList<String> historialRecompensas;
    
    //constructor
    public Usuario(String nombre, String id){
        this.nombre = nombre;
        this.id = id;
        monedas = 0;
        cantPasos = 0;
        historialRecompensas = new ArrayList<String>();
    }
    
    public String registrarPasos(int pasos){
        String mensaje;
        cantPasos+=pasos;
        if(cantPasos  < 5000){
            mensaje = "Alto riesgo de enfermedades metabolicas y cardiovasculares";
        }else if(cantPasos >= 5000 && cantPasos <= 7499){
            mensaje = "0 monedas virtuales";
        }else if(cantPasos >= 7500 && cantPasos <= 9999){
            mensaje = "10 monedas virtuales";
            monedas+=10;
        }else if(cantPasos>=10000 && cantPasos <= 12499){
            mensaje = "100 monedas virtuales";
            monedas+=100;
        }else{
            mensaje = "500 monedas virtuales";
            monedas+=500;
        }
        return mensaje;
    }
    
    public String canjearRecompensa(){
        String recompensa = "";
        if(monedas >= 300 && monedas <= 999){
            recompensa = "2 entradas al cine";
        }else if(monedas >= 1000 && monedas <= 3000){
            recompensa = "Vale por 50 pesos en el supermercado";
        }else if(monedas >= 3001 && monedas <= 4000){
            recompensa = "Vale por 100 pesos en el supermercado";
        }else if(monedas >= 4001 && monedas <= 5000){
            recompensa = "50% de descuento en el Gimnasio";
        }else{
            recompensa = "1 mes de inscripcion libre en el Gimnasio";
        }
        
        if(!recompensa.equals("")){
            historialRecompensas.add(recompensa);
            monedas = 0;
        }
        return recompensa;
    }
    public String getId(){
        return id;
    }
}
