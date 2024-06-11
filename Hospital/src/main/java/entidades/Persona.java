package entidades;

public abstract class Persona {
    int CI;
    String Nombre;

    public Persona(int CI, String nombre) {
        this.CI = CI;
        Nombre = nombre;
    }

    public abstract void ObtenerDatosPersonales();
}
