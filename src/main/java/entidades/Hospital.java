package entidades;
import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class Hospital {
    //Atributos>
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToMany(mappedBy = "hospital")
    private ArrayList<Doctor> D = new ArrayList<Doctor>();
    private ArrayList<Paciente> P = new ArrayList<Paciente>();

    //Constructor
    public Hospital(int id, ArrayList<Doctor> d, ArrayList<Paciente> p) {
        this.id = id;
        D = d;
        P = p;
    }

    public Hospital() {
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public ArrayList<Doctor> getD() {
        return D;
    }

    public void setD(ArrayList<Doctor> d) {
        D = d;
    }

    public ArrayList<Paciente> getP() {
        return P;
    }

    public void setP(ArrayList<Paciente> p) {
        P = p;
    }


    //Metodos
    public void AniadirRevisionMedica(){

    }

    public void BuscarRegistro(){

    }
    public void ListarRegistro(){

    }

    public void RegistrarPaciente(){

    }

    public void SolicitarHistorialMeidco(){

    }
}
