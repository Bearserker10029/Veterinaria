import java.util.ArrayList;
import java.util.Scanner;

public class ControlServicio {
    public void RegistrarServicio(ArrayList<Servicio> servicios) {
        Scanner sc = new Scanner(System.in);
        Servicio servicio = new Servicio();
        System.out.println("Ingrese tipo de servicio: ");
        servicio.setTipo(sc.nextLine());
        System.out.println("Ingrese tiempo estimado: ");
        servicio.setTiempo_estimado(sc.nextInt());
        sc.nextLine();
        System.out.println("Ingrese costo Base (PEN): ");
        servicio.setCosto_Base(sc.nextInt());
        sc.nextLine();
    }
}
