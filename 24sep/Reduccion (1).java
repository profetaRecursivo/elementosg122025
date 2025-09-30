
public class Reduccion
{
    public int red(int n, int k){
        int res;
        if(n == 0){
            res = 0;
        }else{
            int pot = buscarExponente(n, k, 0);
            res = 1 + red(n - (int)Math.pow(k, pot), k);
        }
        return res;
    }    
    //n = 3, k = 10
    /*private int buscarPotenciaIt(int n, int k){
        int res = 0;
        while((int)Math.pow(k, res) <= n){
            res++;           
        }
        int valor = (int)Math.pow(k, res-1);
        return valor;
    }*/
    
    public int buscarExponente(int n, int k, int i){
        int res = 0;
        if((int)Math.pow(k, i) <= n){
            res = 1 + buscarExponente(n, k, i+1);
        }else{
            res--;
        }
        return res;
    }
}
