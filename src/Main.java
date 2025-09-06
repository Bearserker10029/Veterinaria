import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ControlMascota controlMascota = new ControlMascota();
        ControlServicio controlServicio = new ControlServicio();
        ArrayList<Servicio> servicios = new ArrayList<>();
        ArrayList<Mascota> mascotas = new ArrayList<>();
        boolean estado = true;
        while (estado) {
            System.out.println("-----------------------------");
            System.out.println("MENU PRINCIPAL");
            System.out.println("(1) Registrar Mascota");
            System.out.println("(2) Registrar Servicios Generales ");
            System.out.println("(3) Registrar Servicio de Mascota ");
            System.out.println("(4) Total de mascotas en la veterinaria  ");
            System.out.println("(5) Salir ");
            System.out.println("-----------------------------");
            System.out.println("Ingrese la opción: ");

            String opcion = scan.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("\n Registrar Mascota");
                    System.out.println("************************");
                    controlMascota.registraMascota(mascotas);
                    break;

                case "2":
                    System.out.println("\n Registrar Servicios Generales ");
                    System.out.println("************************");
                    controlServicio.RegistrarServicio(servicios);
                    break;
                case "3":
                    System.out.println("\n Registrar Servicio de Mascota ");
                    System.out.println("************************");
                    break;
                case "4":
                    System.out.println("\n Total de mascotas en la veterinaria  ");
                    System.out.println("************************");
                    System.out.println("Total de mascotas registradas: " + mascotas.size());
                    break;
                case "5":
                    estado = false;
                    System.out.println("----Cerrando el programa----");
                default:
                    System.out.println("La opción NO es valida, ingrese nuevamente:");
                    break;

            }
        }
    }

}