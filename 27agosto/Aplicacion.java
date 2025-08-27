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
        //for(int i = 0; i<usuarios.size(); i++){
        //    Usuario actual = usuarios.get(i);
        //    if(actual.getId().equals(id)){
        //        buscado = actual;
        //    }
        //}
        
        for(Usuario actual:usuarios){
            
        }
        return buscado;
    }
}
