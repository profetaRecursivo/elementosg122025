class Perro extends Animal {
    private String raza;
    private int nivelEntrenamiento;
    public Perro(String nombre, String raza, int nivelEntrenamiento){
        //super(nombre, edad, peso, domestico, activo);
        super.setNombre(nombre);
        this.raza = raza;
        this.nivelEntrenamiento = nivelEntrenamiento;
    }
    //, int edad, double peso, boolean domestico, boolean activo,
                    
    public double necesidadEnergetica(){
        return 0.0;
    }
}