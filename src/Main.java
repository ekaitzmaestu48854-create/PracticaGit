import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cad = "";
        int n1;
        do {

            System.out.println("------MENU------");
            System.out.println("1.Solicitar cadena:");
            System.out.println("2.Visualizar-posicion");
            System.out.println("3.Convertir-numero-entero");
            System.out.println("4.Convertir-fecha(dd/MM/yyyy)");
            System.out.println("5.Salir");
            System.out.print("Selecciona 1 opcion para continuar: ");
            n1 = sc.nextInt();
            switch (n1) {
                case 1:
                    cad = solicitarcadena(cad);
                    break;
                case 2:
                    Visualizar_posicion(cad);
                    break;
                case 3:
                    Comvertir_numentero(cad);
                    break;
                case 4:
                    Convertir_fecha(cad);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("valor no reconocido");
                    break;
            }
        }while (n1 != 5);
    }
    public static String solicitarcadena(String cad){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres:");
        cad = sc.nextLine();
        return cad;
    }

}
