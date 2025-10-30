public class Reordenador
{
    public String reordenar(String cad){
        String nueva = "";
        int [] frecuencias = conseguirFrecuencias(cad);
        if(sePuedeReordenar(frecuencias)){
            int posImpar = conseguirPosImpar(frecuencias, 0);
            if(posImpar != -1){
                frecuencias[posImpar]--;
            }
            nueva = reordenar(frecuencias, 0);
            if(posImpar != -1){
                int mid = nueva.length()/2;
                String izq = nueva.substring(0, mid);
                String der = nueva.substring(mid, nueva.length());
                char letra = (char)(posImpar + 'A');
                nueva = izq + letra + der;
            }
    }
        return nueva;
    }

    private int conseguirPosImpar(int[] arr, int i){
        int pos;
        if(i < arr.length){
            if(arr[i] % 2 != 0){
                pos = i;
            }else{
                pos = conseguirPosImpar(arr, i+1);
            }    
        }else{
            pos = -1;        
        }
        return pos;
    }

    private int[] conseguirFrecuencias(String cad){
        int[] frecuencias = new int[26];
        frecuencias = conseguirFrecuencias(cad, frecuencias, 0);
        return frecuencias;
    }

    private int[] conseguirFrecuencias(String cad, int[] frecuencias, int pos){
        if(pos < cad.length()){
            char letra = cad.charAt(pos);
            int posicion = letra - 'A';
            frecuencias[posicion]++;
            frecuencias = conseguirFrecuencias(cad, frecuencias, pos+1);
        }
        return frecuencias;
    }

    private boolean sePuedeReordenar(int[] frecuencias){
        int cantImpares = conseguirImpares(frecuencias, 0);
        boolean sePuede = (cantImpares <= 1);
        return sePuede;
    }

    public int conseguirImpares(int[] arr, int pos){
        int res;
        if(pos < arr.length){
            if(arr[pos] % 2 != 0){
                res = 1 + conseguirImpares(arr, pos+1);
            }else{
                res = conseguirImpares(arr, pos+1);
            }
        }else{
            res = 0;
        }
        return res;
    }

    private String reordenar(int[] frecuencias, int pos){
        String res;
        if(pos < frecuencias.length){
            if(frecuencias[pos] == 0){
                res = reordenar(frecuencias, pos+1);
            }else{
                frecuencias[pos]-=2;
                char letra = (char)(pos + 'A');
                res = letra + reordenar(frecuencias, pos) + letra;
            }
        }else{
            res = "";
        }
        return res;
    }
}