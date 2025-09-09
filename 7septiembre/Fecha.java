
public class Fecha extends Object
{
    private int dia;
    private int mes;
    private int anio;
    public Fecha(int dia, int mes, int anio){
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public String toString(){
        String fecha = "" + dia + "" + mes + "" + anio;
        return fecha;
    }
}