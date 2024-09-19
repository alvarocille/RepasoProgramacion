package acceso.dam;

public class Usuario extends Cliente {
    private boolean premium;

    public Usuario() {
    }

    public Usuario(String email, String password, double descuento, boolean premium) {
        super(email, password, descuento);
        this.premium = premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public boolean isPremium() {
        return premium;
    }

    public double getCuota() {
        double extra = 0;
        if (this.premium == true) { extra = 15; }
        return 20.5 - this.getDescuento() + extra;
    }
}
