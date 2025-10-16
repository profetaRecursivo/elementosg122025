import java.util.ArrayList;
public class Clausura
{
    public ArrayList<ArrayList<Integer>> clausura(int [] arr){
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        res = clausura(res, actual, 0, arr);
        return res;
    }

    private ArrayList<ArrayList<Integer>> clausura(ArrayList<ArrayList<Integer>> res,
    ArrayList<Integer> actual, int i, int[] arr){
        if(i == arr.length){
            //aqui ya tengo acumulado un elemento de mi conjunto clasura
            //para otros ejercicios, verificar si actual cumple una condicion
            res.add(clonar(actual));
        }else{
            //TOMAR
            actual.add(arr[i]);
            res = clausura(res, actual, i+1, arr);
            //NO TOMAR
            actual.remove(actual.size()-1);
            res = clausura(res, actual, i+1, arr);
        }
        return res;
    }

    /*
    void posicionesCaballo(int x, int y){
    if(esValida(x, y)){
    if(!visitado[x][y]){
    //nueva posicion
    res.add(new Posicion(x, y));
    posicionesCaballo(x-1, y-2);
    posicionesCaballo(x+1, y-2);
    posicionesCaballo(x+2, y-1);
    }
    }
    }*/

    private ArrayList<Integer> clonar(ArrayList<Integer> original){
        ArrayList<Integer> clon = new ArrayList<Integer>();
        for(int x:original){
            clon.add(x);
        }
        return clon;
    }
}