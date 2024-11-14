package Package;

public class Hamster extends Mascotas{
    //Atributos
    int cantidadComidaDia;
    double longitud;
    public Hamster() {}
    //Mpstrar datos
    public void datosHamster(){
        System.out.println("Cantidad de Comidas: " + cantidadComidaDia);
        System.out.println("Longitud: " + longitud);
    }
}
