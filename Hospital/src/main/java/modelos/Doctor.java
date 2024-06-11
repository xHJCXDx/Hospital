package modelos;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Doctor {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;

    private String nombre;
    private String especialidad;
    private int ListaPacientes;

    //Constructor
    public Doctor(int codigo, String nombre, String especialidad, int listaPacientes) {
        Codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        ListaPacientes = listaPacientes;
    }

    public Doctor() {
    }

    //Get and Set
    public int getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getListaPacientes() {
        return ListaPacientes;
    }

    public void setListaPacientes(int listaPacientes) {
        ListaPacientes = listaPacientes;
    }

    //Metodos
    public void ObtenerDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Lista de Pacientes: " + ListaPacientes);
    }
}
