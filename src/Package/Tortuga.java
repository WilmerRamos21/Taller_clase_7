package Package;

public class Tortuga {
    //Atributos
    String colorCaparazon ;
    double longitudCaparazon ;
    //Constructor
    public Tortuga(String colorCaparazon, double longitudCaparazon) {
        this.colorCaparazon = colorCaparazon;
        this.longitudCaparazon = longitudCaparazon;
    }
    //Metodo personalizado
    public void imprimirDatos(){
        System.out.println("Color caparazon:" + colorCaparazon);
        System.out.println("Longitud caparazon:" + longitudCaparazon);
    }

}
