import java.util.ArrayList;

public class Colocador
{
    int cantReinas = 0;
    ArrayList<boolean[][]> reinas(){
        ArrayList<boolean[][]> res = new ArrayList<>();
        boolean tablero[][] = new boolean[8][8];
        res = reinas(0, 0, tablero, res);
        return res;
    }
    private boolean esValida(int x, int y){
        //estoy en los limites del tablero
        return x>=0 && x < 8 && y>=0 && y < 8; 
    }
    ArrayList<boolean[][]> reinas(int x, int y, boolean tablero[][], ArrayList<boolean[][]> res){
        if(esValida(x, y)){
            if(puedoColocar(x, y, tablero)){
                tablero[x][y] = true;
                cantReinas++;
                if(cantReinas == 8){
                    //ya tengo una solucion
                    res.add(copiar(tablero));
                }else{
                    reinas(x+1, 0, tablero, res);
                }
                //quitar, no tomar
                tablero[x][y] = false;
                cantReinas--;
                reinas(x, y+1, tablero, res);
            }else{
                reinas(x, y+1, tablero, res);
            }
        }else{
            if(x + 1 < 8){
                //no estoy en la ultima fila
                reinas(x+1, 0, tablero, res);
            }
        }
        return res;
    }
    private boolean puedoColocar(int x, int y, boolean tablero[][]){
        //de manera vertical
        boolean sePuede = true;
        int nx = 0;
        int ny = y;
        while(esValida(nx, ny)){
            if(tablero[nx][ny]){
                sePuede = false;
            }
            nx++;
        }
        //de manera horizontal
        nx = x;
        ny = 0;
        while(esValida(nx, ny)){
            if(tablero[nx][ny]){
                sePuede = false;
            }
            ny++;
        }
        //arriba izquierda
        nx = x;
        ny = y;
        while(esValida(nx, ny)){
            if(tablero[nx][ny]){
                sePuede = false;
            }
            nx--;
            ny--;
        }
        //arriba derecha
        nx = x;
        ny = y;
        while(esValida(nx, ny)){
            if(tablero[nx][ny]){
                sePuede = false;
            }
            nx--;
            ny++;
        }
        //abajo derecha
        nx = x;
        ny = y;
        while(esValida(nx, ny)){
            if(tablero[nx][ny]){
                sePuede = false;
            }
            nx++;
            ny++;
        }
        //abajo izquierda
        nx = x;
        ny = y;
        while(esValida(nx, ny)){
            if(tablero[nx][ny]){
                sePuede = false;
            }
            nx++;
            ny--;
        }
        return sePuede;
    }
    
    private boolean[][] copiar(boolean[][] original){
        boolean[][] copia = new boolean[8][8];
        for(int i = 0; i<8; i++){
            for(int j = 0; j<8; j++){
                copia[i][j] = original[i][j];
            }
        }
        return copia;
    }
}
