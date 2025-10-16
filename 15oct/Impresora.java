import java.util.ArrayList;

/**
 * Write a description of class Impresora here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Impresora
{
    public void imprimir(ArrayList<ArrayList<Integer>> lista){
        System.out.println(lista);
    }
    
    public ArrayList<ArrayList<Integer>> lista(){
        ArrayList<ArrayList<Integer>> lista = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        lista.add(a);
        lista.add(b);
        return lista;    
    }
}
