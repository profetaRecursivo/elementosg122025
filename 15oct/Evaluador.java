import java.util.Scanner;
public class Evaluador
{
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        int x = lector.nextInt();
        double res = 0;
        double numerador = 1;
        double denominador = 1;
        int indice = 0;
        double ultimoSumando = numerador/denominador;
        while(ultimoSumando > 0.00001){
            res+=ultimoSumando;
            indice++;//el indice del factorial se incrementa, 
            //de ser 0! pasa a 1! luego 2! y asi sucesivamente
            numerador*=x;
            denominador*=indice;
            ultimoSumando = numerador/denominador;
        }
        System.out.println("La evaluacion de e^x: "+res);
    }
}