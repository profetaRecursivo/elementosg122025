import java.util.Scanner;
public class Graficador
{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();
        for(int filas = 1; filas<=n; filas++){
            int valor = filas;//por cada fila, el primer elemento 
            //a imprimir es justamente el valor de la fila
            for(int cant = 1; cant <=filas; cant++){
                System.out.print(valor + " ");
                valor+=filas;
                //la siguiente iteracion debemos imprimir filas + filas, 
                //filas + filas + filas y asi sucesivamente
            }
            System.out.println();
        }
    }
}