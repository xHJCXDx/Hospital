package controladores;

import entidades.Doctor;
import entidades.Especialidad;
import herramientas.Funciones;
import modelo.ModDoctor;

public class contDoctor {
    public void crearDoctor(){
        //crear doctor
        Doctor d = new Doctor();
        String lector = Funciones.InputDialogNoVacio("Ingrese Nombre del doctor:");
        d.setNombre(lector);
        int numero = Funciones.LimitacionNumericaInt("Ingrese numero de Lista de Paciente","Lista de Paciente",9999,1);
        d.setListaPacientes(numero);

        Especialidad especialidad = new Especialidad();
        lector = Funciones.InputDialogNoVacio("Ingrese Especialidad:");
        especialidad.setNombre(lector);

        d.setEspecialidad(especialidad);

        ModDoctor controladorD = new ModDoctor();

        controladorD.crearDoctor(d);
    }

    public void leerDoctor(){

    }

    public void actualizarDoctor(){

    }

    public void eliminarDoctor(){

    }

    public void listarDoctor(){

    }
}
