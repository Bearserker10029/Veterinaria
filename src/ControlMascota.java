import java.util.ArrayList;
import java.util.Scanner;

public class ControlMascota {


    public void registraMascota(ArrayList<Mascota> mascotas) {
        Scanner sc = new Scanner(System.in);
        Mascota mascota = new Mascota();

        System.out.println("Ingrese el nombre del mascota: ");
        mascota.setNombre(sc.nextLine());
        System.out.println("Ingrese Raza: ");
        mascota.setRaza(sc.nextLine());
        System.out.println("Ingrese Edad: ");
        mascota.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese Genero: ");
        mascota.setGenero(sc.nextLine());
        System.out.println("Ingrese Peso: ");
        mascota.setPeso(sc.nextInt()) ;
        sc.nextLine();
        System.out.println("Ingrese tamano al mascota: ");
        mascota.setTamano(sc.nextLine());
        System.out.println("Ingrese Nombre del dueño: ");
        mascota.setNombre_Dueno(sc.nextLine());
        System.out.println("Ingrese Correo: ");
        mascota.setCorreo(sc.nextLine());
    }
}
