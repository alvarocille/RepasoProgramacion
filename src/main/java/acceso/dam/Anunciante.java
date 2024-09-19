package acceso.dam;

public class Anunciante extends Cliente {
    public int anunciosContratados;

    public Anunciante() {}

    public Anunciante(String email, String password, double descuento, int anunciosContratados) {
        super(email, password, descuento);
        this.anunciosContratados = anunciosContratados;
    }
}
