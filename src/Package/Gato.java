package Package;

public class Gato extends Mascotas{
    //Atributos
    String raza;
    String colorPelaje;
    //Constructor
    public Gato(int edad, double peso, String raza, String colorPelaje) {
        super(edad, peso);
        this.raza = raza;
        this.colorPelaje = colorPelaje;
    }
    //Metodo personalizado
    public void mostrarDatos(){
        System.out.println("Raza: " + raza);
        System.out.println("Color pelaje: " + colorPelaje);
    }
}
