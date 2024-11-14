import Package.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hamster-Genera objeto sin parametros");
        Hamster hamster1 = new Hamster();
        hamster1.mostrarInformacion();
        hamster1.datosHamster();
        System.out.println("Canario-Genera objeto con parametros de la clase padre");
        Canario canario1 = new Canario(2,2.42);
        canario1.mostrarInformacion();
        canario1.datosCanario();
        System.out.println("Tortuga-Genera objeto con parametros de la clase hija");
        Tortuga tortuga1 = new Tortuga("Verde",12.45);
        tortuga1.imprimirDatos();
        System.out.println("Gato-Genera un objeto con parametros de la clase padre e hija");
        Gato gato1 = new Gato(3,7.5,"Calico","Negro, naranja y blanco");
        gato1.mostrarInformacion();
        gato1.mostrarDatos();

        Perro perro1 = new Perro();
        System.out.println("Ingrese el nombre de su mascota: ");
        String nombre = scanner.nextLine();
        perro1.setNombre(nombre);
        System.out.println("Ingrese la edad: ");
        int edad = scanner.nextInt();
        perro1.setEdad(edad);
        System.out.println("Ingrese el peso: ");
        double peso = scanner.nextDouble();
        perro1.setPeso(peso);
        System.out.println("Ingrese la estatura: ");
        double tamanio = scanner.nextDouble();
        perro1.setTamanio(tamanio);
        System.out.println("Perro-Genera objeto sin parametros y luego se setean");
        perro1.imprimirDatos();
        perro1.mostrarInformacion();

        scanner.close();


    }
}