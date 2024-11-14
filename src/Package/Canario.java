package Package;

public class Canario extends Mascotas{
    //Atributos
    int cantosPorDia;
    String color;
    //Constructor con parametros de la clase padre
    public Canario(int edad, double peso) {
        super(edad, peso);
    }
    //Metodos personalizados
    public void datosCanario(){
        System.out.println("Cantos por dia: " + cantosPorDia);
        System.out.println("Color: " + color);
    }
}
