package Package;

public class Perro extends Mascotas {
    //Atributos
    String nombre;
    double tamanio;
    //Constructor
    public Perro(int edad, double peso, String nombre, double tamanio) {
        super(edad, peso);
        this.nombre = nombre;
        this.tamanio = tamanio;
    }
    //Constructor vacio
    public Perro() {}
    //Getter
    public String getNombre() {
        return nombre;
    }
    public double getTamanio() {
        return tamanio;
    }
    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }
    //Metodo personalizado
    public void imprimirDatos(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Longitud: " + getTamanio());
    }
}
