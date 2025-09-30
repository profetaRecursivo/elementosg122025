import java.util.ArrayList;

/**
 * Write a description of class Split here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Split
{
    public ArrayList<String> split(String cad){
        ArrayList<String> lista = new ArrayList<String>();
        lista = split(lista, "", cad, 0);
        return lista;
    }
    
    private ArrayList<String> split(ArrayList<String> res, String act, String cad, int i){
        if(i < cad.length()){
            if(cad.charAt(i) == ' '){
                act = "";
            }else{
                act = act + cad.charAt(i);
                if(i == cad.length()-1){
                    res.add(act);                    
                }
            }
            res = split(res, act, cad, i+1);
        }
        return res;
    }
}
