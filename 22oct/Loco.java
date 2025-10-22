import java.util.ArrayList;

/**
 * Write a description of class Loco here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loco
{
    public void imprimir(ArrayList<boolean[][]> lista){
        for(boolean[][] mat:lista){
            for(int i = 0;i<8;i++){
                for(int j = 0; j<8;j++){
                    if(mat[i][j]){
                        System.out.print("R");
                    }else{
                        System.out.print("-");
                    }
                }
                System.out.println();
            }
            System.out.println("=======================================\n");
        }
    }
    
    public void imprimir2(ArrayList<Posicion> lista){
        for(Posicion p:lista){
            System.out.println(p.getX() + " "+ p.getY());
        }
    }
}
