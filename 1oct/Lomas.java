import java.util.ArrayList;

public class Lomas
{
    public int lomaMaxima(int[] secuencia, int p){
        ArrayList<ArrayList<Integer>> todasLasLomas = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> actual = new ArrayList<Integer>();
        todasLasLomas = conseguirLomas(1, 1, secuencia.length, secuencia, todasLasLomas, actual);
        ArrayList<ArrayList<Integer>> lasQueCumplen = new ArrayList<ArrayList<Integer>>();
        lasQueCumplen = filtrar(todasLasLomas, p, 0, todasLasLomas.size(), lasQueCumplen);
        int superficieMaxima = 0;
        if(lasQueCumplen.size() >= 1){
            superficieMaxima = conseguirMejorLoma(lasQueCumplen, 0, lasQueCumplen.size(), lasQueCumplen.get(0).size());
        }
        return superficieMaxima;
    }
    private int conseguirMejorLoma(ArrayList<ArrayList<Integer>> lasQueCumplen, int i, int n, int maximo){
        if(i < n){
            if(lasQueCumplen.get(i).size() > maximo){
                maximo = lasQueCumplen.get(i).size();
            }
            maximo = conseguirMejorLoma(lasQueCumplen, i + 1, n, maximo);
        }
        return maximo;
    }
    //estado = 1 -> subiendo
    //estado = 2 -> bajando
    private ArrayList<ArrayList<Integer>> filtrar(ArrayList<ArrayList<Integer>> todasLasLomas, int p, int i, int n, ArrayList<ArrayList<Integer>> lasQueCumplen){
        if(i < n){
            if(cumple(todasLasLomas.get(i), p, 1, todasLasLomas.get(i).size() )){
                lasQueCumplen.add(todasLasLomas.get(i));
            }
            lasQueCumplen =  filtrar(todasLasLomas, p, i + 1, n, lasQueCumplen);
        }
        return lasQueCumplen;
    }
    
    private boolean cumple(ArrayList<Integer> loma, int p, int i, int n){
        boolean res;
        if(i < n){
            int diff = Math.abs(loma.get(i) - loma.get(i-1));
            if(diff <= p){
                res = true;
            }else{
                res = false;
            }
            res = res && cumple(loma, p, i + 1, n);
        }else{
            res = true;
        }
        return res;
    }
    private ArrayList<ArrayList<Integer>> conseguirLomas(int estado, int i, 
    int n, int[] secuencia, ArrayList<ArrayList<Integer>> lomas, 
    ArrayList<Integer> lomaActual){
        if(i < n){
            if(estado == 1){
                if(secuencia[i] >= secuencia[i-1]){
                    lomaActual.add(secuencia[i-1]);
                }else{
                    estado = 2;
                    lomaActual.add(secuencia[i-1]);
                }
            }else{
                //bajando
                if(secuencia[i] <= secuencia[i-1]){
                    lomaActual.add(secuencia[i-1]);
                }else{
                    lomaActual.add(secuencia[i-1]);
                    lomas.add(  lomaActual   );
                    lomaActual = new ArrayList<Integer>();
                    lomaActual.add(secuencia[i-1]);
                    estado = 1;
                }
            }
            lomas = conseguirLomas(estado, i + 1, n, secuencia, lomas, lomaActual);
        }else{
            lomaActual.add(secuencia[i-1]);
            lomas.add(lomaActual);
        }
        return lomas;
    }
}
