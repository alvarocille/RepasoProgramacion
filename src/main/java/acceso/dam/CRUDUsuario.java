package acceso.dam;

import java.util.ArrayList;

public class CRUDUsuario {

    public static ArrayList insertarUsuario(ArrayList lista, Usuario usuario) {
        lista.add(usuario);
        return lista;
    };

    /* public static void buscarUsuario(ArrayList lista, String email) {
        for (Object Usuario: lista) {
            if (Usuario.getEmail().equals(email)) {
                String password = Usuario.getPassword();
                double descuento = Usuario.getDescuento();
                boolean premium = Usuario.isPremium();
                System.out.printf("El usuario");
                break;
            }
        }
    } */

    public static void totalIngresos(ArrayList lista, Usuario usuario) {

    }
}
