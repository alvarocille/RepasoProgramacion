package acceso.dam;

import java.util.ArrayList;

public class CRUDUsuario {

    public static ArrayList insertarUsuario(ArrayList lista, Usuario usuario) {
        lista.add(usuario);
        return lista;
    };

    public static void buscarUsuario(ArrayList<Usuario> lista, String email) {
        try {
            for (Usuario usuario: lista) {
                if (usuario.getEmail().equals(email)) {
                    String password = usuario.getPassword();
                    double descuento = usuario.getDescuento();
                    boolean premium = usuario.isPremium();
                    double cuota = usuario.getCuota();
                    System.out.printf("El usuario con correo %s tiene por contraseña %s y paga una cuota de %.2f.%n", email, password, cuota);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al buscar al usuario:" + e.getMessage());
        }
    }

    public static void totalIngresos(ArrayList<Usuario> lista) {
        try {
            double ingresos = 0;
            for (Usuario usuario : lista) {
                ingresos = ingresos + usuario.getCuota();
            }
            System.out.printf("Los ingresos totales llegan a la cifra de %.2f€.%n", ingresos);
        } catch (Exception e) {
            System.out.println("Error al calcular los ingresos:" + e.getMessage());
        }
    }

}
