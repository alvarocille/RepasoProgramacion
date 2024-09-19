package acceso.dam;

public class Usuario extends Cliente {
    private static boolean premium;

    public Usuario() {
    }

    public Usuario(String email, String password, double descuento, boolean premium) {
        super(email, password, descuento);
        this.premium = premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public static boolean isPremium() {
        return premium;
    }
}
