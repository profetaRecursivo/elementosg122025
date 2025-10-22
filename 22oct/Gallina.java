import java.util.ArrayList;

public class Gallina
{
    public ArrayList<Posicion> conseguirAsientos(char[][] graderia, int pollos){
        ArrayList<Posicion> asientos = new ArrayList<Posicion>();
        boolean visitado[][] = new boolean[graderia.length][graderia[0].length];
        for(int i = 0; i<graderia.length; i++){
            for(int j = 0; j<graderia[i].length; j++){
                if(graderia[i][j] == 'L' && !visitado[i][j]){
                    //aqui busco un conjunto de asientos
                    ArrayList<Posicion> posible = conseguirAsientos(graderia, visitado, i, j);
                    if(posible.size() >= pollos + 1){
                        asientos = posible;
                    }
                }
            }
        }
        return asientos;
    } 
    private boolean esValida(int x, int y, int filas, int columnas){
        return x>=0 && x < filas && y >=0 && y<columnas;
    }
    private ArrayList<Posicion> conseguirAsientos(char[][] graderia, boolean[][] visitado, int x, int y){
        ArrayList<Posicion> posiciones = new ArrayList<Posicion>();
        if(esValida(x, y, graderia.length, graderia[0].length)){
            if(!visitado[x][y] && graderia[x][y] == 'L'){
                visitado[x][y] = true;
                //hay un nuevo asiento
                posiciones.add(new Posicion(x + 1 , y+1));
                posiciones.addAll(conseguirAsientos(graderia, visitado, x-1, y));
                posiciones.addAll(conseguirAsientos(graderia, visitado, x, y-1));
                posiciones.addAll(conseguirAsientos(graderia, visitado, x, y+1));
                posiciones.addAll(conseguirAsientos(graderia, visitado, x+1, y));
            }
        }
        return posiciones;
    }
}
