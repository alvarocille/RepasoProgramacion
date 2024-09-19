package acceso.dam;

public abstract class Cliente {
    private String email;
    private String password;
    private double descuento;

    public Cliente() {
    }

    public Cliente(String email, String password, double descuento) {
        this.email = email;
        this.password = password;
        this.descuento = descuento;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public double getDescuento() {
        return descuento;
    }
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
}
