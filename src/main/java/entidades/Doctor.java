package entidades;
import javax.persistence.*;
import javax.swing.*;

@Entity
public class Doctor {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Codigo;
    private String nombre;
    private int ListaPacientes;

    @OneToOne
    private Especialidad especialidad = new Especialidad();

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }


    //Constructor


    public Doctor(int codigo, String nombre, Especialidad especialidad, int listaPacientes) {
        Codigo = codigo;
        this.nombre = nombre;
        this.especialidad = especialidad;
        ListaPacientes = listaPacientes;
    }

    public Doctor() {
    }

    //Get and Set

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre+"\nEspecialidad: " + especialidad+"\nLista de Pacientes: " + ListaPacientes);
    }
}
