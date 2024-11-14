package Package;

public class Mascotas {
    //Atributos
    int edad;
    double peso;
    //Constructor
    public Mascotas(int edad, double peso){
        this.edad = edad;
        this.peso = peso;
    }
    //Constructor vacio
    public Mascotas(){}
    //Get
    public int getEdad() {
        return edad;
    }
    public double getPeso() {
        return peso;
    }
    //Set
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    //Metodos personalizados
    public void mostrarInformacion(){
        System.out.println("Edad: " + edad);
        System.out.println("Peso: " + peso);
    }
}
