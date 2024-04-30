class Persona{

    private String nombre, apellido;
    private int edad;
    private double estatura;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if(edad<0){
            System.out.println("Error: Edad invalida");
        } 
        else{
        this.edad = edad;
        }
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        if(estatura<0){
            System.out.println("Error: Estatura invalida");
        }
        else{
        this.estatura = estatura;
        }
    }
    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad + ", Estatura: " + estatura
                + "]";
    }

    

    
}