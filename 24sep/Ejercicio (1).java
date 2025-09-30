
public class Ejercicio
{
    
    public int cantDigitos(int n){
        int res;
        if(n <= 9){
            res = 1;
        }else{
            res = 1 + cantDigitos(n/10);    
        }
        return res;
    }
    
    public long factorial(long n){
        long res;
        if(n == 0){
            res = 1;
        }else{
            res = n*factorial(n-1);
        }
        return res;
    }
    
    public int poligono(int nivel){
        int res;
        if(nivel == 1){
            res = 1;
        }else{
            res = 3*nivel -2 + poligono(nivel - 1);
        }
        return res;
    }
}
