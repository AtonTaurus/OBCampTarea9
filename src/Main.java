public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        cliente.nombre = "David";
        cliente.edad = 21;
        cliente.telefono = 3832922;
        cliente.credito = 2384.98;
        System.out.println("Soy " + cliente.nombre + ", y tengo " + cliente.edad + " años de edad y mi numero telefonico es " + cliente.telefono
                + " y mi credito disponible es " + cliente.credito + "€");

        trabajador.nombre = "Anna";
        trabajador.edad = 32;
        trabajador.telefono = 3712376;
        trabajador.salario = 4500.00;
        System.out.println("Soy " + trabajador.nombre + ",  y tengo " + trabajador.edad + " años de edad y mi numero telefonico es " + trabajador.telefono
                + " y mi salario es de " + trabajador.salario + "€");

    }
}
class Persona{
    int edad;
    int telefono;
    String nombre;
}

class Cliente extends Persona{
    double credito;
}

class Trabajador extends Persona{
    double salario;
}