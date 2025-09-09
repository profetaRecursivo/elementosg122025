import java.util.ArrayList;

public class Aplicacion
{
    private ArrayList<Usuario> usuarios;
    
    public Aplicacion(){
        usuarios = new ArrayList<Usuario>();
    }
    
    public boolean registrarPasos(String id, int pasos){
        boolean registro = false;
        Usuario u = buscarUsuario(id);
        if(u != null){
            u.registrarPasos(pasos);
            registro = true;
        }
        return registro;
    }
    
    private Usuario buscarUsuario(String id){
        Usuario buscado = null;
        for(int i = 0; i<usuarios.size(); i++){
            Usuario actual = usuarios.get(i);
            if(actual.getId().equals(id)){
                buscado = actual;
            }
        }
        return buscado;
    }
    
    public void nuevoMes(){
        for(Usuario actual:usuarios){
            actual.setMonedas(0);
            actual.setCantidadDePasos(0);
        }
    }
    
    public String generarReporte(){
        String reporte = "";
        for(Usuario actual:usuarios){
            reporte += "El usuario con id " + actual.getId() + "\n";
            if(!actual.getHistorial().isEmpty()){
                reporte += "\tCanjeo:\n";
                reporte += historialPorUsuario(actual);
            }
            if(actual.getCantidadMonedas() > 0){
                reporte += "Le sobran " + actual.getCantidadMonedas() +"\n";
            }else{
                reporte+= "No le sobran monedas para canjear\n";
            }
        }
        return reporte;
    }
    
    private String historialPorUsuario(Usuario actual){
        String historial = "";
        for(String recompensa:actual.getHistorial()){
            historial+="\t\t" + recompensa + "\n";
        }
        return historial;
    }
    
    public String canjearRecompensa(String id){
        String recompensa = "";
        Usuario buscado = buscarUsuario(id);
        if(buscado != null){
            recompensa = buscado.canjearRecompensa();
        }
        return recompensa;
    }
    
    public void crearUsuario(String nombre, Fecha fechaNacimiento){
        Usuario nuevo = new Usuario(nombre, nombre+fechaNacimiento.toString(), fechaNacimiento);
        usuarios.add(nuevo);
    }
}
