package acceso.dam;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;
        ArrayList<Usuario> listaUsuarios = new ArrayList<>();
        while (!salir) {
            System.out.println("Elige opción:");
            System.out.println("1.- Añadir usuario");
            System.out.println("2.- Buscar usuario");
            System.out.println("3.- Total ingresos");
            System.out.println("0.- Salir");
            Scanner sc = new Scanner(System.in);
            try {
                int menu = sc.nextInt();
                switch (menu) {
                    case 1:
                        try {
                            System.out.println("Ingrese el email del usuario:");
                            String email = sc.next();
                            System.out.println("Ingrese una contraseña segura:");
                            String password = sc.next();
                            System.out.println("Ingrese el descuento a aplicar:");
                            double descuento = sc.nextDouble();
                            System.out.println("Indique PREMIUM si el usuario desea acceder a los servicios especiales:");
                            boolean premium = false;
                            try {
                                String plan = sc.next();
                                String planMayus = plan.toUpperCase();
                                if (planMayus.equals("PREMIUM")) {
                                    premium = true;
                                }
                            } catch (Exception e) {
                                System.out.println("Indique una opción válida.");
                            }
                            try {
                                Usuario usuario = new Usuario(email, password, descuento, premium);
                                listaUsuarios = CRUDUsuario.insertarUsuario(listaUsuarios, usuario);
                                double cuota = usuario.getCuota();
                                System.out.printf("Ha sio registrado el usuario con correo %s, contraseña %s y cuota de %.2f.%n", email, password, cuota);
                            } catch (Exception e) {
                                System.out.println("Error al añadir el usuario:" + e.getMessage());
                            }
                        } catch (Exception e) {
                            System.out.println("Introduzca los campos correctamente.");
                        }
                        break;
                    case 2:
                        System.out.println("Ingrese el email del usuario que desea buscar:");
                        String email = sc.next();
                        CRUDUsuario.buscarUsuario(listaUsuarios, email);
                        break;
                    case 3:
                        CRUDUsuario.totalIngresos(listaUsuarios);
                        break;
                    case 0:
                        salir = true;
                        break;
                    default:
                        System.out.println("Ingrese una opción válida.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un dígito correctamente.");
            }
        }
        System.out.println("Programa finalizado.");
    }
}