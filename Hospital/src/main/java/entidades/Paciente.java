package entidades;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Paciente extends Persona{
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;

    private Date Nombre;

    //Constructor


    public Paciente(int CI, String nombre, int codigo, Date nombre1) {
        super(CI, nombre);
        Codigo = codigo;
        Nombre = nombre1;
    }

    public Paciente(int CI, String nombre) {
        super(CI, nombre);
    }

    //Getters and Setters
    public int getCodigo() {
        return Codigo;
    }

    public Date getNombre() {
        return Nombre;
    }

    public void setNombre(Date nombre) {
        Nombre = nombre;
    }

    //Metodos
    @Override
    public void ObtenerDatosPersonales() {

    }

    public void CrearRegistroMedio() {

    }

    public void ObetenerDatos(){

    }

    public void RegistroMedico() {

    }
}
