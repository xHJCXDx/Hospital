package controladores;

import entidades.Doctor;
import entidades.Especialidad;
import herramientas.Funciones;
import modelo.ModDoctor;
import modelo.ModEspecialidad;

public class contEspecialidad {
    Especialidad e = new Especialidad();
    public void crearEspecialidad(){
        //crear doctor
        String lector = Funciones.InputDialogNoVacio("Ingrese Nombre del doctor:");
        e.setNombre(lector);

        ModEspecialidad controladorE = new ModEspecialidad();

        controladorE.crearEspecialidad(e);
    }

    public void leerEspecialidad(){

    }

    public void actualizarEspecialidad(){

    }

    public void eliminarEspecialidad(){

    }

    public void listarEspecialidad(){

    }
}
